/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Noverify
 */
public class ModHelpers {

	public static String[] getMapName(int index, int id) {
		return class_yi.e(index, id);
	}

	public static short[] getLocation(int index, int id) {
		return class_yi.f(index, id);
	}

	public static String getOnOffStatus(boolean boo) {
		return boo ? "Bật" : "Tắt";
	}

	public static void move(int x, int y) {
		// removed
	}
}
