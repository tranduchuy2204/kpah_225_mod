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
			// Toạ độ cần in phải ở dưới logo 13+
			int xPos = class_abj.O.getHeight() - 9 + 12;
			class_d.b.a(_graphics, "ID: " + MainCharInfo.getPlayerName(), 1, xPos, 0);
			xPos += 12;
			class_d.b.a(_graphics, "Xu: " + StringUtils.formatMoney(MainCharInfo.getCurrentCoin()), 1, xPos, 0);
			xPos += 12;
			class_d.b.a(_graphics, "Lượng: " + StringUtils.formatMoney(MainCharInfo.getCurrentGold()) + "L - "
					+ StringUtils.formatMoney(MainCharInfo.getCurrentLockGold()) + "LK", 1, xPos, 0);
			xPos += 12;
			class_d.b.a(_graphics, "Đồ bền: " + MainCharInfo.getDoBen(), 1, xPos, 0);
			xPos += 12;
		}
	}

}
