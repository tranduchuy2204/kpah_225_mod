/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import javax.microedition.lcdui.Graphics;

import utility.StringUtils;
import utility.VNCharacterUtils;

/**
 *
 * @author ASUS
 */
public final class class_pp extends class_hc {

	private String[] b;
	private static final int[] c = { 0, 7, 3, 6 };
	private int d = 0;
	public boolean a = true;
	private int e;
	private int f;
	private int g;
	private int h;
	private int i;
	private static int j;
	private static int k;
	private static int l;
	private static int m;
	private static int n;
	private static int o = 0;
	private String[] p;
	private boolean q;
	private int r;
	private String notiContent;

	public final void a(String paramString, class_s paramclass_s1, class_s paramclass_s2, class_s paramclass_s3) {
		this.notiContent = paramString;
		System.out.println(paramString + " - " + ModScr.blockMode);
		if (paramString.indexOf("chỉ có thể vào lại game sau") != -1) {
			paramclass_s1 = new class_s("OK", new class_aaw(class_acv.s));
		}
		this.b = class_d.h.a(paramString, 100);
		this.ba = paramclass_s1;
		this.bb = paramclass_s2;
		this.bc = paramclass_s3;
		a();
		this.g = o;
		this.q = false;

	}

	public final void a(String[] paramArrayOfString, class_s paramclass_s1, class_s paramclass_s2,
			class_s paramclass_s3) {
		this.b = paramArrayOfString;
		this.ba = paramclass_s1;
		this.bb = null;
		this.bc = null;
		a();
		this.g = o;
		this.q = false;
	}

	public final void a(String paramString, String[] paramArrayOfString, class_s paramclass_s1, class_s paramclass_s2,
			class_s paramclass_s3) {
		this.b = class_d.h.a(paramString, class_acv.m - 60);
		this.ba = paramclass_s1;
		this.bb = paramclass_s2;
		this.bc = paramclass_s3;
		this.p = paramArrayOfString;
		a();
		this.g = o;
		this.r = (paramArrayOfString.length * 20 + 20 * this.b.length);
		this.q = true;
	}

	private void a() {
		this.h = 90;
		this.f = (class_acv.p - 42);
		this.e = 15;
		if (this.a) {
			this.h -= 50;
			this.e += 50;
		}
		this.i = this.h;
		if (this.b.length * 13 < this.h) {
			this.e += this.h / 2 - this.b.length * 13 / 2;
			this.i -= this.h - this.b.length * 13;
		}
		if ((n = this.b.length * 13 - this.h) < 0) {
			n = 0;
		}
		o = this.h / 2 / 13;
	}

	public final void a(Graphics paramGraphics) {
		class_acv.a(paramGraphics);
		paramGraphics.translate(0, this.f);
		if (this.q) {
			Graphics localGraphics = paramGraphics;
			class_pp localclass_pp = this;
			class_acv.a(localGraphics);
			int i2;
			if ((i2 = class_acv.p - localclass_pp.r / 2 - 20) <= 10) {
				i2 = 10;
			}
			class_yi.c(localGraphics, 20, i2, class_acv.m - 40, localclass_pp.r + 20);
			for (int i3 = 0; i3 < localclass_pp.p.length; i3++) {
				class_d.h.a(localGraphics, localclass_pp.p[i3], class_acv.o, i3 * 20 + 10 + i2, 2);
			}
			for (int i3 = 0; i3 < localclass_pp.b.length; i3++) {
				class_d.j[0].a(localGraphics, localclass_pp.b[i3], class_acv.o,
						i3 * 20 + (localclass_pp.p.length - 1) * 20 + 42 + i2 - 4, 2);
			}
			localGraphics.translate(0, localclass_pp.f);
		} else {
			class_yi.c(paramGraphics, class_acv.o - 70, 12, 140, 100);
			if (this.a) {
				paramGraphics.drawRegion(class_yi.z, 0, 0, 25, 25, c[this.d], class_acv.o, 47, 3);
			}
			paramGraphics.translate(0, this.e);
			paramGraphics.setClip(0, 0, class_acv.m, this.i);
			paramGraphics.translate(0, -k);
			for (int i1 = 0; i1 < this.b.length; i1++) {
				class_d.h.a(paramGraphics, this.b[i1], class_acv.o, i1 * 13, 2);
			}
		}
		super.a(paramGraphics);
	}

	public final void b() {
		if (ModScr.blockMode > (byte) 0) {
			if (ModScr.blockMode == (byte) 1) {
				class_acv.w = null;
			}
			String[] strings = StringUtils.split(ModScr.blockContent, ",");
			System.out.println(this.notiContent.toLowerCase());

			for (int s = 0; s < strings.length; s++) {
				String string = strings[s];
				if (VNCharacterUtils.removeAccent(this.notiContent.toLowerCase()).indexOf(string) != -1) {
					class_acv.w = null;
				}
			}
		}
		this.d += 1;
		if (this.d > 3) {
			this.d = 0;
		}
		int i1 = 0;
		if (class_acv.e[2]) {
			this.g -= 1;
			if (this.g < o) {
				this.g = o;
			}
			i1 = 1;
		} else if (class_acv.e[8]) {
			i1 = 1;
			if (k < n) {
				this.g += 1;
			}
			if (this.g > this.b.length - o) {
				this.g = (this.b.length - o);
			}
		}
		if (i1 != 0) {
			if ((j = this.g * 13 - this.h / 2) < 0) {
				j = 0;
			}
			if (j > n) {
				j = n;
			}
		}
		if (k != j) {
			m = j - k << 2;
			l += m;
			k += (l >> 4);
			l &= 0xF;
		}
		super.b();
	}
}
