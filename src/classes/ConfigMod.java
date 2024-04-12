/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;

import utility.ResUtils;

/**
 *
 * @author ASUS
 */
public class ConfigMod {

	public static boolean[] paintSetting = { false, true, true, true, false, true };
	public Form configForm;

	public void generalFormConfig() {
		configForm = new Form("Config Form");
		final ChoiceGroup choiceSpeed = new ChoiceGroup("Tốc độ", ChoiceGroup.EXCLUSIVE);
		choiceSpeed.append("Nhanh", null);
		choiceSpeed.append("Gốc", null);
		choiceSpeed.append("Chậm", null);
		int index = 0;
		switch ((int) class_acv.speedMod) {
		case 25:
			index = 0;
			break;
		case 40:
			index = 1;
			break;
		case 70:
			index = 2;
			break;
		default:
			break;
		}
		choiceSpeed.setSelectedIndex(index, true);
		final ChoiceGroup choiceGroupPaint = new ChoiceGroup("Hiển thị thông tin", ChoiceGroup.MULTIPLE);
		choiceGroupPaint.append("Version", null);
		choiceGroupPaint.append("Xu", null);
		choiceGroupPaint.append("Lượng", null);
		choiceGroupPaint.append("Tấn công", null);
		choiceGroupPaint.append("Độ bền", null);
		choiceGroupPaint.append("Tọa độ", null);
		choiceGroupPaint.setSelectedFlags(paintSetting);
		configForm.append(choiceSpeed);
		configForm.append(choiceGroupPaint);
		configForm.addCommand(new Command("Lưu", Command.OK, 1));
		configForm.addCommand(new Command("Exit", Command.CANCEL, 1));
		configForm.setCommandListener(new CommandListener() {
			public void commandAction(Command c, Displayable d) {
				if (c.getCommandType() == 4) {
					int selectedIndex = choiceSpeed.getSelectedIndex();
					switch (selectedIndex) {
					case 0:
						class_acv.speedMod = 25;
						break;
					case 1:
						class_acv.speedMod = 40;
						break;
					default:
						class_acv.speedMod = 70;
						break;
					}
					choiceGroupPaint.getSelectedFlags(paintSetting);
					saveConfig();
				}
				Display.getDisplay(game.GameMidlet.a).setCurrent(class_acv.a);
			}
		});
		Display.getDisplay(game.GameMidlet.a).setCurrent(configForm);
	}

	public static void saveConfig() {
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			DataOutputStream dos = new DataOutputStream(baos);
			dos.writeLong(class_acv.speedMod);
			for (int i = 0; i < paintSetting.length; i++) {
				dos.writeBoolean(paintSetting[i]);
			}
			ResUtils.saveRecordBytes("configMod", baos.toByteArray());
			dos.flush();
			dos.close();
			baos.flush();
			baos.close();
		} catch (IOException e) {
		}
	}

	public static void loadConfig() {
		final byte[] bs;
		if ((bs = ResUtils.loadRecordBytes("configMod")) != null) {
			try {
				ByteArrayInputStream bais = new ByteArrayInputStream(bs);
				DataInputStream dis = new DataInputStream(bais);
				class_acv.speedMod = dis.readLong();
				for (int i = 0; i < paintSetting.length; i++) {
					paintSetting[i] = dis.readBoolean();
				}
				dis.close();
				bais.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
