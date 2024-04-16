package classes;

import javax.microedition.lcdui.Graphics;

import utility.StringUtils;

/*
 * Class này để in ấn , hiển thị các thông tin
 */
public class Paint {

	public static void onPaint(Graphics _graphics) {
		// Kiểm tra màn hình, nếu ở màn hình GameScreen thì mới hiện thị
		if (class_acv.q == class_acv.s) {
			int xPos = class_abj.O.getHeight() - 9 + 12;
			if (ModController.globalConfig.paintConfig.isPaintID) {
				class_d.b.a(_graphics, "ID: " + MainCharInfo.getPlayerName(), 1, xPos += 12, 0);
			}
			if (ModController.globalConfig.paintConfig.isPaintBalance) {
				class_d.b.a(_graphics, "Xu: " + StringUtils.formatMoney(MainCharInfo.getCurrentCoin()), 1, xPos += 12,
						0);
				class_d.b.a(_graphics, "Lượng: " + StringUtils.formatMoney(MainCharInfo.getCurrentGold()) + "L - "
						+ StringUtils.formatMoney(MainCharInfo.getCurrentLockGold()) + "LK", 1, xPos += 12, 0);
			}
			if (ModController.globalConfig.paintConfig.isPaintDoBen) {
				class_d.b.a(_graphics, "Độ bền: " + MainCharInfo.getDoBen(), 1, xPos += 12, 0);
			}
			if (ModController.globalConfig.paintConfig.isPaintAttackPoint) {
				class_d.b.a(_graphics, "Tấn công: " + MainCharInfo.getAttackPoints(), 1, xPos += 12, 0);
			}
			if (ModController.globalConfig.paintConfig.isPaintCurrentPosition) {
				class_d.b.a(_graphics, "Toạ độ: " + ModHelpers.getMapNameAndPosition(), 1, xPos += 12, 0);
			}
			class_d.b.a(_graphics, "Xu kiếm được: " + MainCharInfo.getCoinsEarned(), 1, xPos += 12, 0);
		}
	}
}
