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

	public ModController() {
	}

	public static String getMapNameAndPosition() {
		return class_abj.a + "  " + class_acv.s.q.cK / 16 + ":" + class_acv.s.q.cL / 16;
	}

	public static void update() {
		// move speed
		class_abj.as = 100;
	}

	public static void comeBackHome() {
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

	public static void logOut() {
		class_acv.g();
		class_acv.a.c();
		class_aco.a().c();
		class_ls.a(0, null);
		class_yv.a().d();
	}

//	public static boolean isPointed(String listName) {
//		String[] strings = StringUtils.split(listName, ",");
//		for (int i = 0; i < strings.length; i++) {
//			String string = strings[i];
//			if (VNCharacterUtils.removeAccent(class_acv.s.r.a_()).equalsIgnoreCase(string)) {
//				return true;
//			}
//		}
//		return false;
//	}
//
//	public static boolean isExistedId(String arr, String id) {
//		String[] strings = StringUtils.split(arr, ",");
//		for (int i = 0; i < strings.length; i++) {
//			String string = strings[i];
//			if (VNCharacterUtils.removeAccent(class_acv.s.r.a_())
//					.equalsIgnoreCase(VNCharacterUtils.removeAccent(string))) {
//				return true;
//			}
//		}
//		return false;
//	}

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

	public static void onStartGame() {

		AccountManager.getInstance().loadByRecord();
	}
}
