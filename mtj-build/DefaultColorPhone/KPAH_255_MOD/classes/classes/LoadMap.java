/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Vector;

/**
 *
 * @author ASUS
 */
public class LoadMap {

    String[] mapNames = {" ", "Cẩm Khê", "Trả Tiêu", "Đổ Đông", "Bảo Thái", "Rừng Già", "Trấn Danh", "Trường",
        "Trấn Danh", "Lộc trĩ", "Bình lục", "Sơn lâm", "Phong châu", "Bảo thái", "Siêu loại", "Hồi hồ",
        "Tế Giang", "Bạch hạc", "Hầm tối", "Tây Trường", "Trấn Danh", "Đỗ đông", "Cẩm khê"};
    short[][] mapDatas = {new short[1], {23, 43, 6, 761, 54, 66, 762, 54, 66, 763, 54, 66, 764, 54, 66},
        {118, 54, 20}, {24, 28, 3}, {15, 68, 4}, {26, 48, 46}, {9, 35, 1}, {201, 40, 15}, {9, 35, 1},
        {10, 23, 58, 501, 23, 58, 502, 23, 58, 503, 23, 58, 504, 23, 58},
        {14, 72, 29, 581, 72, 29, 582, 72, 29, 583, 72, 29, 584, 72, 29},
        {11, 77, 67, 521, 77, 67, 522, 77, 67, 523, 77, 67, 524, 77, 67},
        {13, 3, 50, 561, 3, 50, 562, 3, 50, 563, 3, 50, 564, 3, 50},
        {15, 6, 22, 601, 6, 22, 602, 6, 22, 603, 6, 22, 604, 6, 22},
        {10, 25, 10, 701, 25, 10, 702, 25, 10, 703, 25, 10, 704, 25, 10},
        {114, 3, 77, 2581, 3, 77, 2582, 3, 77, 2583, 3, 77, 2584, 3, 77},
        {19, 43, 58, 681, 43, 58, 682, 43, 58, 683, 43, 58, 684, 43, 58},
        {18, 33, 58, 661, 33, 58, 662, 33, 58, 663, 33, 58, 664, 33, 58},
        {113, 94, 10, 2561, 94, 10, 2562, 94, 10, 2563, 94, 10, 2564, 94, 10},
        {201, 17, 45}, {9, 35, 1}, {24, 9, 67, 781, 9, 67, 782, 9, 67, 783, 9, 67, 784, 9, 67},
        {23, 57, 66, 761, 57, 66, 762, 57, 66, 763, 57, 66, 764, 57, 66}};
    String[] areaNames = {"Sơn nam", "Dương đông", "Lâm tây"};
    short[][] maps = {{0, 19, 32, 301, 19, 32},
    {70, 21, 31, 1701, 21, 31},
    {80, 33, 31, 1901, 33, 31}};

    public void a() {
        Vector localVector = new Vector();
        int i = getIndexMap();
        if (i == -1) {
            class_acv.a("Không thể chuyển!");
            return;
        }
        final int[] arrayOfInt = getMaps(i);
        for (int j = 0; j < arrayOfInt.length; j++) {
            final int k = j;
            localVector.addElement(new class_s(this.mapNames[arrayOfInt[j]], new IAction() {
                final String[] a = {new String(), "Đông ", "Tây ", "Nam ", "Bắc "};

                public void perform() {
                    Vector localVector = new Vector();
                    for (int i = 0; i < mapDatas[arrayOfInt[k]].length / 3; i++) {
                        final String str = String.valueOf(this.a[i]).concat(String.valueOf(a[arrayOfInt[k]]));
                        localVector.addElement(new class_s(str, new IAction() {
                            short[] data = mapDatas[arrayOfInt[k]];

                            public void perform() {
                                int i1 = class_acv.u.c;
                                class_go.a().b(this.data[(i1 * 3)], this.data[(i1 * 3 + 1)], this.data[(i1 * 3 + 2)]);
                                class_gm.a().d();
                                class_yi.g();
                                class_abj.a = str;
                            }
                        }));
                    }
                    class_acv.u.a(localVector, 3);
                }
            }));
        }
        class_acv.u.a(localVector, 3);
    }

    public int getIndexMap() {
        for (int i = 0; i < this.areaNames.length; i++) {
            if (class_yi.aa[1][0][0].toLowerCase().indexOf(this.areaNames[i].toLowerCase()) == -1) {
                this.mapNames[0] = this.areaNames[i];
                this.mapDatas[0] = this.maps[i];
            }
        }
        for (int i = 0; i < this.mapNames.length; i++) {
            if (class_abj.a.toLowerCase().indexOf(this.mapNames[i].toLowerCase()) == -1) {
                return i;
            }
        }
        return -1;
    }

    public int[] getMaps(int index) {
        int[] maps = null;
        switch (index) {
            case 0:
                maps = new int[]{1, 2, 3, 4, 5};
                break;
            case 1:
                maps = new int[]{2};
                break;
            case 2:
                maps = new int[]{3, 1};
                break;
            case 3:
                maps = new int[]{4, 2};
                break;
            case 4:
                maps = new int[]{5, 3};
                break;
            case 5:
                maps = new int[]{6, 4};
                break;
            case 6:
                maps = new int[]{7, 5, 19};
                break;
            case 7:
                maps = new int[]{8, 6, 20};
                break;
            case 8:
                maps = new int[]{7};
                break;
            case 9:
                maps = new int[]{10, 11, 12};
                break;
            case 10:
                maps = new int[]{17, 9};
                break;
            case 11:
                maps = new int[]{13, 18, 15, 9};
                break;
            case 12:
                maps = new int[]{14, 9};
                break;
            case 13:
                maps = new int[]{16, 11};
                break;
            case 14:
                maps = new int[]{12};
                break;
            case 15:
                maps = new int[]{11};
                break;
            case 16:
                maps = new int[]{13};
                break;
            case 17:
                maps = new int[]{10};
                break;
            case 18:
                maps = new int[]{11};
                break;
            case 19:
                maps = new int[1];
                break;
            case 20:
                maps = new int[]{21, 22};
                break;
            case 21:
                maps = new int[]{13};
                break;
            case 22:
                maps = new int[]{10};
        }
        return maps;
    }
}
