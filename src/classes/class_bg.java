package classes;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public abstract class class_bg {

	public class_s ba;
	public class_s bb;
	public class_s bc;
	public static Image bd;
	boolean be = false;

	public void a(Graphics paramGraphics) {
		class_acv.a(paramGraphics);
		if (this.ba != null) {
			class_d.b.a(paramGraphics, this.ba.a, 5, class_acv.n - class_aae.c, 0);
		}
		if (this.bb != null) {
			class_d.b.a(paramGraphics, this.bb.a, class_acv.o, class_acv.n - class_aae.c, 2);
		}
		if (this.bc != null) {
			class_d.b.a(paramGraphics, this.bc.a, class_acv.m - 5, class_acv.n - class_aae.c, 1);
		}
		if (class_act.b > 0) {
			paramGraphics.drawImage(class_yi.G, class_acv.m - 7, 7, 3);
		}
		if ((class_abj.al.size() <= 0) && (bd != null)) {
			paramGraphics.drawImage(bd, class_acv.o, 0, 17);
		}

		if (class_acv.q == class_acv.s) {
			int xPos = class_abj.O.getHeight() - 9 + 12;
//            class_d.b.a(paramGraphics, "Lv " + class_acv.s.q.N + "+" + class_acv.s.q.Q(), 37, xPos, 0);
			class_d.b.a(paramGraphics, "ID: " + class_acv.s.q.a_(), 1, xPos, 0);
			xPos += 12;
			class_d.b.a(paramGraphics, "Xu: " + class_acv.a(class_acv.s.q.br), 1, xPos, 0);
			xPos += 12;
			class_d.b.a(paramGraphics,
					"Lượng: " + class_acv.a(class_acv.s.q.aV) + "L - " + class_acv.a(class_acv.s.q.aW) + "LK", 1, xPos,
					0);
			xPos += 12;
			class_d.b.a(paramGraphics, "Đồ bền: " + ModScr.getDoBen(), 1, xPos, 0);
			xPos += 12;
		}
	}

	public void c() {
		if (class_acv.g) {
			if ((bd != null) && (class_acv.a(class_acv.o - 40, 0, 80, 20))) {
				if (class_acv.q == class_acv.s) {
					if (!class_acv.G) {
						Vector localVector;
						localVector = new Vector();
						localVector.addElement(new class_s("Bàn phím", new class_cr(this)));
						localVector.addElement(new class_s("Thay đồ", new class_cp(this)));
						localVector.addElement(new class_s("Tìm bạn", new class_cq(this)));
						class_acv.u.a(localVector, 3);
					} else {
						if (this.be) {
							class_bz.f = true;
						}
						class_acv.G = !class_acv.G;
						class_acv.a.sizeChanged(0, 0);
						class_acv.g = false;
					}
				} else {
					if (!class_acv.G) {
						if (class_bz.f) {
							this.be = true;
							class_bz.f = false;
						}
					} else if (this.be) {
						class_bz.f = true;
					}
					class_acv.G = !class_acv.G;
					class_acv.a.sizeChanged(0, 0);
					class_acv.g = false;
				}
			}
			if ((Math.abs(class_acv.D - class_acv.k) <= 10) && (Math.abs(class_acv.E - class_acv.j) <= 10)) {
				switch (class_acv.i()) {
				case 0:
					if ((this.ba != null) && (this.ba.b != null)) {
						this.ba.b.perform();
						class_acv.g = false;
					}
					break;
				case 1:
					if ((this.bb != null) && (this.bb.b != null)) {
						class_acv.g();
						this.bb.b.perform();
						class_acv.g = false;
					}
					break;
				case 2:
					if ((this.bc != null) && (this.bc.b != null)) {
						this.bc.b.perform();
						class_acv.g = false;
					}
					break;
				}
			}
		}
		ModScr.update();
		if (class_acv.c[5]) {
			if ((this.bb != null) && (this.bb.b != null)) {
				this.bb.b.perform();
				class_acv.c[5] = false;
			}
		} else if (class_acv.c[12]) {
			if ((this.ba != null) && (this.ba.b != null)) {
				this.ba.b.perform();
				class_acv.c[12] = false;
			}
		} else if (class_acv.A) {
			if ((class_acv.d[13]) && (this.bc != null) && (this.bc.b != null)) {
				this.bc.b.perform();
				class_acv.d[13] = false;
			}
		} else if ((class_acv.c[13]) && (this.bc != null) && (this.bc.b != null)) {
			this.bc.b.perform();
			class_acv.c[13] = false;
		}
	}
}
