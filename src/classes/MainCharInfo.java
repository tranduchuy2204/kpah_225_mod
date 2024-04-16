package classes;

public class MainCharInfo {

	private static long initialCoins = -1;
	public static long expPlus = 0; // kinh nghiệm được cộng

	public static String getPlayerName() {
		return class_acv.s.q.a_();
	}

	/**
	 * Hàm lấy độ bền vũ khí
	 * 
	 * @return -> độ bền vũ khí
	 */
	public static final int getDoBen() {
		for (int i1 = 0; i1 < ((class_hw) class_acv.s.q).aT.size(); i1++) {
			class_ql localclass_ql = (class_ql) ((class_hw) class_acv.s.q).aT.elementAt(i1);
			class_yc localclass_yc = class_yi.b((int) localclass_ql.r);
			if (((localclass_yc.c == 3) || (localclass_yc.c == 4) || (localclass_yc.c == 5) || (localclass_yc.c == 6)
					|| (localclass_yc.c == 7)) && (localclass_ql.v > 0)) {
				return localclass_ql.u;
			}
		}
		return 0;
	}

	public static long getCurrentCoin() {
		return class_acv.s.q.br;
	}

	public static int getCurrentGold() {
		return class_acv.s.q.aV;
	}

	public static int getCurrentLockGold() {
		return class_acv.s.q.aW;
	}

	// lấy điểm tấn công của tài khoản
	public static int getAttackPoints() {
		return ((class_hw) class_acv.s.q).G();
	}

	/*
	 * Lấy xu up được
	 */
	public static long getCoinsEarned() {
		// Khởi tạo số xu ban đầu của tài khoản, điều kiện này chỉ chạy 1 lần.
		if (initialCoins == -1) {
			initialCoins = getCurrentCoin();
		}
		if (initialCoins == -1) {
			return 0;
		}
		// Khi đã có số xu ban đầu rồi thì việc tính xu up được bằng cách lấy xu hiện
		// tại trừ cho số xu lúc đầu có
		return getCurrentCoin() - initialCoins;
	}

}
