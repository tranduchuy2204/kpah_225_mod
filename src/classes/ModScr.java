/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import game.GameMidlet;
import utility.ResUtils;
import utility.StringUtils;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;


/**
 *
 * @author ASUS
 */
public class ModScr extends Debug {

	public static final String VERSION = "2.2.5";

	public static String[] focusList = new String[5];

	public static String[] focusText = { "không", "người đồ sát", "vận tiêu", "trấn yêu trận", "người giao thẻ",
			"chỉ vào người", "né người" };
	public static byte focusIndex;
	public static String chatContent = "Khi Phach Anh Hung MOD by Tran Duc Huy";
	public static boolean isAutoChat;
	public static String blockContent = "abc,xyz,123";
	public static byte isBlockNoti = 0;
//    public static int onMap = -1;

	public static boolean isPointUserGiaoThe = false;
	public static boolean isPointUserPhaThe = false;
	public static boolean isPointUserUpLan = false;
	public static boolean isPointBossAndPepper = false;
	public static boolean isPointUser = false;
	public static boolean isSkipUser = false;

	public static short idItemKimDuoc;

	public static String locationInfo = "chưa có";

	public static String[] pointList = { "", "", "", "", "", "" };

	public static long timeCheck = 0;

	public static void pauseAllPointOption() {
		isPointUserGiaoThe = isPointUserPhaThe = isPointUserUpLan = isPointBossAndPepper = isPointUser = false;
	}

	public ModScr() {
		Debug.log("Class này được tạo ra để chứa những hàm, biến để thực hiện mục đích mod");
	}

	public static String getMapNameAndPosition() {
		return class_abj.a + "  " + class_acv.s.q.cK / 16 + ":" + class_acv.s.q.cL / 16;
	}

	public static void update() {
		class_abj.as = 100;
		if (isPointUserGiaoThe && (class_acv.s.r != null) && (!isPointed(ModScr.pointList[0]))) {
			class_acv.s.a(true);
		}
		if (isPointUserPhaThe && (class_acv.s.r != null) && (!isPointed(ModScr.pointList[1]))) {
			class_acv.s.a(true);
		}
		if (isPointUserUpLan && (class_acv.s.r != null) && (!isPointed(ModScr.pointList[2]))) {
			class_acv.s.a(true);
		}
		if (isPointBossAndPepper && (class_acv.s.r != null)
				&& ((!isPointed(ModScr.focusList[0])) && (!isPointed(ModScr.focusList[1])))) {
			class_acv.s.a(true);
		}
		if (isSkipUser && (class_acv.s.r != null) && (isPointed(ModScr.pointList[5]))) {
			class_acv.s.a(true);
		}
	}

	public static void comeBackHome() {
		Debug.log("Về nhà nhanh");
	}

	public static void xaPhu() {
		Debug.log("Xa phu");
		new class_om(class_acv.s).perform();
	}

	public static void doDownHorse() {
		Debug.log("Xuống ngựa");
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

	public static boolean isPointed(String listName) {
		String[] strings = StringUtils.split(listName, ",");
		for (int i = 0; i < strings.length; i++) {
			String string = strings[i];
			if (VNCharacterUtils.removeAccent(class_acv.s.r.a_()).equalsIgnoreCase(string)) {
				return true;
			}
		}
		return false;
	}

	public static boolean isExistedId(String arr, String id) {
		String[] strings = StringUtils.split(arr, ",");
		for (int i = 0; i < strings.length; i++) {
			String string = strings[i];
			if (VNCharacterUtils.removeAccent(class_acv.s.r.a_())
					.equalsIgnoreCase(VNCharacterUtils.removeAccent(string))) {
				return true;
			}
		}
		return false;
	}

	public static void generateArray() {

	}

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
		ConfigMod.loadConfig();
		AccountManager.getInstance().loadByRecord();
		final byte[] bs;
		if ((bs = ResUtils.loadRecordBytes("data_focus")) != null) {
			try {
				ByteArrayInputStream bais = new ByteArrayInputStream(bs);
				DataInputStream dis = new DataInputStream(bais);
				pointList[0] = dis.readUTF();
				pointList[1] = dis.readUTF();
				pointList[2] = dis.readUTF();
//                pointList[4] = dis.readUTF();
				pointList[5] = dis.readUTF();
				dis.close();
				bais.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		final String s;
		if ((s = ResUtils.getRecordText("block_noti")) != null) {
			ModScr.blockContent = s;
		}
	}

}
