package classes;

public class MainCharInfo {

	private static long initialCoins = -1;

	public static String getPlayerName() {
		return class_acv.s.q.a_();
	}

	public static int getDoBen() {
		return ModController.getDoBen();
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
		if (initialCoins == -1) {
			return 0;
		}

		// Khởi tạo số xu ban đầu của tài khoản, điều kiện này chỉ chạy 1 lần.
		if (initialCoins == -1 && class_acv.q == class_acv.s) {
			initialCoins = getCoinsEarned();
		}
		// Khi đã có số xu ban đầu rồi thì việc tính xu up được bằng cách lấy xu hiện
		// tại trừ cho số xu lúc đầu có
		return getCurrentCoin() - initialCoins;
	}

}
