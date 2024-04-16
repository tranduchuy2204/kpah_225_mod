/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;

/**
 *
 * @author Noverify
 */
public class ModHelpers {

	public static String getMapNameAndPosition() {
		return class_abj.a + "  " + class_acv.s.q.cK / 16 + ":" + class_acv.s.q.cL / 16;
	}

	public static String getOnOffStatus(boolean boo) {
		return boo ? "Bật" : "Tắt";
	}

	public static long currentTime() {
		return System.currentTimeMillis() / 1000;
	}

	public static long leftTime(long time) {
		return currentTime() - time;
	}

	public static void setCurrentScreen(Displayable dsplayable) {
		Display.getDisplay(game.GameMidlet.a).setCurrent(dsplayable);
	}
}
