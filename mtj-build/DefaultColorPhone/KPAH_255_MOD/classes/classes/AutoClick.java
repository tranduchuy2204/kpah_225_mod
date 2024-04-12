/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Vector;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;

import utility.ResUtils;

/**
 *
 * @author ASUS
 */
public class AutoClick implements IAction, CommandListener, Runnable {

	public static String codes;
	public static String key;
	public static String time;
	public static boolean isAutoClick;
	private static boolean isRunning;
	public static String[] autoClick = { "Auto click", "Cài đặt", "Đã kích hoạt auto click", "Auto click đã dừng lại",
			"Bạn chưa cài đặt auto click", "Mã phím", "Phím khởi động", "Quảng nghỉ (milis giây)",
			"HDSD: Mỗi lệnh nhấn phím sẽ được cách nhau bởi dấu phẩy (,)\nDấu hai chấm (:) là khoảng cách giữ mã phím và thời gian nghỉ sau khi nhấn(tính băng giây)\nVí dụ tôi tự nhấn vào button đăng xuất game:\n-6:1,-5:1,-1:1,-1:1,-5:1",
			"Trần Đức Huy", "Mã phím không hợp lệ", "Phím khởi động phải là một số", "35", "", "200" };
	public static String[] ortherText = { "\n", "|", ",", ":" };
	Form settingAuto;
	TextField textField;
	TextField textField2;
	TextField textField3;
	Command save;
	Command cancel;
	private Alert warringAlert;

	public static boolean getKeyPressed(int code) {
		System.out.println(code);
		if (code == Integer.parseInt(key)) {
			startAuto();
			return true;
		}
		return false;
	}

	static void startAuto() {
		if (!codes.equals(autoClick[13])) {
			isAutoClick = !isAutoClick;
			if (isAutoClick) {
				System.out.println("On auto click");
				new Thread(new AutoClick()).start();
			}
		} else {
		}
	}

	public static void getKeyRepeated(int code) {
		if (isRunning) {
			return;
		}
		if (code == Integer.parseInt(key)) {
			isRunning = true;
			isAutoClick = false;
			new AutoClick().perform();
		}
	}

	public void perform() {
		this.settingAuto = new Form("Cài đặt" + " " + autoClick[0]);
		this.settingAuto.append(this.textField = new TextField(autoClick[5], codes, 500, 0));
		this.settingAuto.append(this.textField2 = new TextField(autoClick[6], key, 50, 0));
		this.settingAuto.append(this.textField3 = new TextField(autoClick[7], time, 50, 2));
		this.settingAuto.append(autoClick[8]);
		this.settingAuto.addCommand(this.save = new Command("Lưu", 4, 1));
		this.settingAuto.addCommand(this.cancel = new Command("Quay lại", 2, 1));
		this.settingAuto.setCommandListener(this);
		Display.getDisplay(game.GameMidlet.a).setCurrent(this.settingAuto);
	}

	public void commandAction(Command arg0, Displayable arg1) {
		if (arg0 == this.save) {
			String[] l = split(this.textField.getString(), ortherText[2]);
			for (int i = 0; i < l.length; i++) {
				String[] l2 = split(l[i], ortherText[3]);
				for (int j = 0; j < l2.length; j++) {
					if (!isNumber(l2[j]) || l[i].indexOf(ortherText[3]) == -1) {
						(this.warringAlert = new Alert("Cảnh báo", autoClick[10], null, AlertType.ERROR))
								.setTimeout(-2);
						Display.getDisplay(game.GameMidlet.a).setCurrent(warringAlert);
						return;
					}
				}
			}
			if (!isNumber(this.textField2.getString())) {
				(this.warringAlert = new Alert("Cảnh báo", autoClick[11], null, AlertType.ERROR)).setTimeout(-2);
				Display.getDisplay(game.GameMidlet.a).setCurrent(this.warringAlert);
				return;
			}
			codes = this.textField.getString();
			key = this.textField2.getString();
			time = this.textField3.getString();
			ResUtils.saveRecordText("autoclick", codes + ortherText[1] + key + ortherText[1] + time);
		}
		isRunning = false;
		Display.getDisplay(game.GameMidlet.a).setCurrent(class_acv.a);
	}

	static void showAlert(String s) {
		Alert alert = new Alert("Thông báo");
		alert.setString(s);
		alert.setTimeout(-2);
		Displayable displayable;
		if ((displayable = Display.getDisplay(game.GameMidlet.a).getCurrent()) instanceof Alert) {
			((Alert) displayable).setString(s);
			return;
		}
		Display.getDisplay(game.GameMidlet.a).setCurrent(alert, class_acv.a);
	}

	public static boolean isNumber(String s) {
		try {
			int i = Integer.parseInt(s);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static String[] split(String regex, String limit) {
		Vector var2 = new Vector();
		if (!regex.endsWith(limit)) {
			regex = String.valueOf(regex) + limit;
		}
		int var4;
		for (int var3 = 0; (var4 = regex.indexOf(limit, var3)) != -1; var3 = var4 + limit.length()) {
			var2.addElement(regex.substring(var3, var4));
		}
		String[] var5 = new String[var2.size()];
		var2.copyInto(var5);
		return var5;
	}

	public void run() {
		do {
			String[] l = split(codes, ortherText[2]);
			for (int i = 0; i < l.length && isAutoClick; i++) {
				String[] l2 = split(l[i], ortherText[3]);
				class_acv.a.keyPressed(Integer.parseInt(l2[0]));
				class_acv.a.keyReleased(Integer.parseInt(l2[0]));
				delay(Math.abs(Integer.parseInt(l2[1]) * 1000));
				delay(Math.abs(Integer.parseInt(time)));
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

	static {
		key = autoClick[12];
		codes = autoClick[13];
		time = autoClick[14];
		String b;
		try {
			if ((b = ResUtils.getRecordText("autoclick")) != null) {
				codes = split(b, ortherText[1])[0];
				key = split(b, ortherText[1])[1];
				time = split(b, ortherText[1])[2];
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
