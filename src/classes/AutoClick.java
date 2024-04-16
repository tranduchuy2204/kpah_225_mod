/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;

import config.Config;
import utility.StringUtils;

/**
 *
 * @author ASUS
 */
public class AutoClick implements IAction, Runnable {

	public static boolean isAutoClick;
	private static boolean isRunning;
	static Config _config = ModController.globalConfig;

	public static boolean getKeyPressed(int code) {
		if (code == _config.autoClickConfig.activeKey) {
			startAuto();
			return true;
		}
		return false;
	}

	static void startAuto() {
		if (!_config.autoClickConfig.keyBoardCodes.equals("")) {
			isAutoClick = !isAutoClick;
			if (isAutoClick) {
				new Thread(new AutoClick()).start();
			}
		} else {
		}
	}

	public static void getKeyRepeated(int code) {
		if (isRunning) {
			return;
		}
		if (code == _config.autoClickConfig.activeKey) {
			isRunning = true;
			isAutoClick = false;
			new AutoClick().perform();
		}
	}

	public void perform() {
		Form form = new Form("Cài đặt Auto Click");
		final TextField keyBoardCodesTF = new TextField("Mã phím", _config.autoClickConfig.keyBoardCodes, 500, 0);
		final TextField activeKeyTF = new TextField("Phím kích hoạt", String.valueOf(_config.autoClickConfig.activeKey),
				5, TextField.NUMERIC);
		final TextField delayTF = new TextField("Quảng nghỉ", String.valueOf(_config.autoClickConfig.delay), 500,
				TextField.NUMERIC);
		form.append(keyBoardCodesTF);
		form.append(activeKeyTF);
		form.append(delayTF);

		form.append("HDSD: Mỗi lệnh nhấn phím sẽ được cách nhau bởi dấu phẩy (,)\n"
				+ "Dấu hai chấm (:) là khoảng cách giữ mã phím và thời gian nghỉ sau khi nhấn(tính băng giây)\n"
				+ "Ví dụ tôi tự nhấn vào button đăng xuất game:\n" + "-6:1,-5:1,-1:1,-1:1,-5:1");
		form.addCommand(new Command("Lưu", 4, 0));
		form.addCommand(new Command("Quay lại", 7, 0));
		form.setCommandListener(new CommandListener() {

			public void commandAction(Command cmd, Displayable arg1) {
				if (cmd.getCommandType() == 4) {
					String[] keyboardCodes = StringUtils.split(keyBoardCodesTF.getString(), ",");
					for (int i = 0; i < keyboardCodes.length; i++) {
						String[] clickCode = StringUtils.split(keyboardCodes[i], ":");
						for (int j = 0; j < clickCode.length; j++) {
							if (!isNumber(clickCode[j]) || keyboardCodes[i].indexOf(":") == -1) {
								Display.getDisplay(game.GameMidlet.a).setCurrent(
										new Alert("Cảnh báo", "Mã phím không hợp lệ", null, AlertType.ERROR));
								return;
							}
						}
					}
					if (!isNumber(activeKeyTF.getString())) {
						Display.getDisplay(game.GameMidlet.a).setCurrent(
								new Alert("Cảnh báo", "Phím kích hoạt không hợp lệ", null, AlertType.ERROR));
						return;
					}
					_config.autoClickConfig.keyBoardCodes = keyBoardCodesTF.getString();
					_config.autoClickConfig.activeKey = Integer.parseInt(activeKeyTF.getString());
					_config.autoClickConfig.delay = Integer.parseInt(delayTF.getString());
					_config.saveConfig();
				}
				isRunning = false;
				Display.getDisplay(game.GameMidlet.a).setCurrent(class_acv.a);
			}
		});
		Display.getDisplay(game.GameMidlet.a).setCurrent(form);
	}

	public static boolean isNumber(String s) {
		try {
			int i = Integer.parseInt(s);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void run() {
		do {
			String[] keyboardCodes = StringUtils.split(_config.autoClickConfig.keyBoardCodes, ",");
			for (int i = 0; i < keyboardCodes.length && isAutoClick; i++) {
				String[] clickCode = StringUtils.split(keyboardCodes[i], ":");
				class_acv.a.keyPressed(Integer.parseInt(clickCode[0]));
				class_acv.a.keyReleased(Integer.parseInt(clickCode[0]));
				delay(Math.abs(Integer.parseInt(clickCode[1]) * 1000));
				delay(_config.autoClickConfig.delay);
			}
			delay(Math.abs(50));
		} while (isAutoClick);
	}

	static void delay(long l) {
		try {
			Thread.sleep(l);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}

}
