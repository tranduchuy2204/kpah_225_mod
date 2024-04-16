/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import config.Config;

/**
 *
 * @author ASUS
 */
public class ModController {

	public static final String VERSION = "2.2.5";

	public static Config globalConfig = Config.loadConfig();

	protected static boolean isActiveAutoChat;

	public static long refeshTime = 0;

	public static void update() {
		class_abj.as = 100;
		doAutoGame();
	}

	private static void doAutoGame() {
		if (ModHelpers.leftTime(refeshTime) > 180) {
			refeshTime = ModHelpers.currentTime();
			if (globalConfig.isAutoCayThan) {
				for (int i = 0; i < 8; i++) {
					class_go.a().n(i, 2);
					class_go.a().n(i, 3);
				}
			}
			if (globalConfig.isAutoRemoveDa) {
				doRemoveStone();
			}
			if (globalConfig.isAutoRemoveTranh) {
				doRemoveTranh();
			}
		}
	}

	/*
	 * Bỏ Đá
	 */
	private static void doRemoveStone() {
		for (int i = 159; i <= 174; i++) {
			class_go.a().a((short) i, 0, (byte) 0);
		}
		for (int i = 179; i <= 226; i++) {
			class_go.a().a((short) i, 0, (byte) 0);
		}
	}

	private static void doRemoveTranh() {
		for (int i = 15; i <= 23; i++) {
			class_go.a().a((short) i, 0, (byte) 0);
		}
		for (int i = 28; i <= 45; i++) {
			class_go.a().a((short) i, 0, (byte) 0);
		}
		class_go.a().a((short) 12, 0, (byte) 0);
		class_go.a().a((short) 13, 0, (byte) 0);
		class_go.a().a((short) 58, 0, (byte) 0);
		class_go.a().a((short) 59, 0, (byte) 0);
	}

	public void calCharactorLevelUp() {

	}

	public static void xaPhu() {
		new class_om(class_acv.s).perform();
	}

	public static void doDownHorse() {
		new class_qo(class_acv.s).perform();
	}

	public static void setNoti(String s) {
		class_acv.a(s);
	}

	public static void doSaveCurrentLocation() {
		// Lưu toạ độ đang đứng vào record
		String currentLocation = ModHelpers.getMapNameAndPosition();
		ModController.globalConfig.savedPostion = currentLocation;
		ModController.globalConfig.saveConfig();
		class_acv.a("Đã lưu vị trí " + currentLocation + " vào ổ lưu trữ!");
	}

	public static void logOut() {
		class_acv.g();
		class_acv.a.c();
		class_aco.a().c();
		class_ls.a(0, null);
		class_yv.a().d();
	}

	public static void onStartGame() {
		AccountManager.getInstance().loadByRecord();
	}
}
