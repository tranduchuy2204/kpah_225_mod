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
public class FunctionUtils {

    public static short getIndexArrMap() {
        class_abj gameScr = class_acv.s;
        int num = gameScr.aJ.length;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < gameScr.aJ[i].length; j++) {
                if (gameScr.aG == gameScr.aJ[i][j]) {
                    return class_abj.aI[i];
                }
            }
        }
        return -1;
    }

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
//        class_acv.s.d(x * 16, y * 16);
    }
}
