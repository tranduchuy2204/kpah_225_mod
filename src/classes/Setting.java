/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;

import config.Config.PaintConfig;

/**
 *
 * @author ASUS
 */
public class Setting {

	public Form configForm;

	int getIndexSpeedChoice(long speed) {
		int[] speeds = { 30, 40, 70 };
		for (int i = 0; i < speeds.length; i++) {
			if (ModController.globalConfig.gameSpeed == speeds[i]) {
				return i;
			}
		}
		return 1;
	}

	void setGameSpeed(int index) {
		int[] speeds = { 30, 40, 70 };
		for (int i = 0; i < speeds.length; i++) {
			if (i == index) {
				ModController.globalConfig.gameSpeed = speeds[i];
			}
		}
	}

	void setPaintOption(ChoiceGroup cg) {
		PaintConfig paintCf = ModController.globalConfig.paintConfig;
		if (paintCf.isPaintID) {
			cg.setSelectedIndex(0, true);
		}
		if (paintCf.isPaintAttackPoint) {
			cg.setSelectedIndex(1, true);
		}
		if (paintCf.isPaintBalance) {
			cg.setSelectedIndex(2, true);
		}
		if (paintCf.isPaintDoBen) {
			cg.setSelectedIndex(3, true);
		}
		if (paintCf.isPaintCurrentPosition) {
			cg.setSelectedIndex(4, true);
		}
		if (paintCf.isPaintSavedPosition) {
			cg.setSelectedIndex(5, true);
		}
		if (paintCf.isPaintExpPlus) {
			cg.setSelectedIndex(6, true);
		}
	}

	void readPaintOption(ChoiceGroup cg) {
		PaintConfig paintCf = ModController.globalConfig.paintConfig;
		paintCf.isPaintID = cg.isSelected(0);
		paintCf.isPaintAttackPoint = cg.isSelected(1);
		paintCf.isPaintBalance = cg.isSelected(2);
		paintCf.isPaintDoBen = cg.isSelected(3);
		paintCf.isPaintCurrentPosition = cg.isSelected(4);
		paintCf.isPaintSavedPosition = cg.isSelected(5);
		paintCf.isPaintExpPlus = cg.isSelected(6);
	}

	public void generalFormConfig() {
		configForm = new Form("Config Form");

		final ChoiceGroup choiceSpeed = new ChoiceGroup("Tốc độ", ChoiceGroup.EXCLUSIVE);

		choiceSpeed.append("Nhanh", null);
		choiceSpeed.append("Gốc", null);
		choiceSpeed.append("Chậm", null);
		choiceSpeed.setSelectedIndex(getIndexSpeedChoice(ModController.globalConfig.gameSpeed), true);

		final ChoiceGroup choiceGroupPaint = new ChoiceGroup("Thông tin muốn hiển thị", ChoiceGroup.MULTIPLE);

		choiceGroupPaint.append("Tên nhân vật", null);
		choiceGroupPaint.append("Tấn công", null);
		choiceGroupPaint.append("Xu lượng", null);
		choiceGroupPaint.append("Độ bền", null);
		choiceGroupPaint.append("Tọa độ hiện tại", null);
		choiceGroupPaint.append("Tọa độ đã được lưu", null);
		choiceGroupPaint.append("Exp nhận được", null);
		setPaintOption(choiceGroupPaint);

		configForm.append(choiceSpeed);
		configForm.append(choiceGroupPaint);
		configForm.addCommand(new Command("Lưu", Command.OK, 1));
		configForm.addCommand(new Command("Exit", Command.CANCEL, 1));

		configForm.setCommandListener(new CommandListener() {
			public void commandAction(Command c, Displayable d) {
				if (c.getCommandType() == 4) {
					int selectedIndex = choiceSpeed.getSelectedIndex();
					setGameSpeed(selectedIndex);
					readPaintOption(choiceGroupPaint);
					ModController.globalConfig.saveConfig();
				}
				Display.getDisplay(game.GameMidlet.a).setCurrent(class_acv.a);
			}
		});
		Display.getDisplay(game.GameMidlet.a).setCurrent(configForm);
	}

}
