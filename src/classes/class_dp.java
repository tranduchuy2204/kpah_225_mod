package classes;

import java.util.Vector;

import javax.microedition.lcdui.Graphics;

public final class class_dp extends class_bg {

	public boolean a;
	public Vector b;
	public int c;
	private int d;
	private int e;
	private int f;
	private int g;
	private int h;
	private int i = 0;
	private boolean j;
	private int k;
	private int l;
	private int m;
	private int n = 0;
	private int o = 0;

	public class_dp() {
		this.ba = new class_s("Chọn", new class_ij(this));
		this.bb = new class_s("", this.ba.b);
		this.bc = new class_s("Đóng", new class_ik(this));
	}

	public final void a() {
		if (this.b != null) {
			this.c = class_abj.ap.nextInt(this.b.size());
			this.m = (this.c * class_aae.d - (class_aae.d << 1));
			if (this.m < 0) {
				this.m = 0;
			}
			if (this.m > this.o) {
				this.m = this.o;
			}
		}
	}

	public final void a(Vector paramVector, int paramInt) {
		if (paramVector.size() <= 0) {
			return;
		}

		for (int i = 0; i < paramVector.size(); i++) {
			class_s class_s = (class_s) paramVector.elementAt(i);
			System.out.println(class_s.a);
			if (class_s.a.equalsIgnoreCase("Mời party")) {
				final class_abj class_abj = class_acv.s;
//				paramVector.insertElementAt(new class_s("Advanced", new IAction() {
//					public void perform() {
//						Vector vector = new Vector();
//						vector.addElement(new class_s("Push d.s giao thẻ", new IAction() {
//							public void perform() {
//								if (ModController.isExistedId(ModController.pointList[0], class_abj.r.a_())) {
//									class_acv.a("Đã có id này trong danh sách");
//									return;
//								}
//								String temp = "";
//								if (ModController.pointList[0].length() != 0) {
//									temp += ",";
//								}
//								temp += class_abj.r.a_().toLowerCase();
//								ModController.pointList[0] += temp;
//								class_acv.a("Đã thêm " + class_abj.r.a_() + " vào danh sách người giao thẻ");
//								Menu.gI().saveFocusList();
//							}
//						}));
//						vector.addElement(new class_s("Push d.s phá thẻ", new IAction() {
//							public void perform() {
//								if (ModController.isExistedId(ModController.pointList[1], class_abj.r.a_())) {
//									class_acv.a("Đã có id này trong danh sách");
//									return;
//								}
//								String temp = "";
//								if (ModController.pointList[1].length() != 0) {
//									temp += ",";
//								}
//								temp += class_abj.r.a_().toLowerCase();
//								ModController.pointList[1] += temp;
//								class_acv.a("Đã thêm " + class_abj.r.a_() + " vào danh sách người phá thẻ");
//								Menu.gI().saveFocusList();
//							}
//						}));
//						vector.addElement(new class_s("Push d.s up lan", new IAction() {
//							public void perform() {
//								if (ModController.isExistedId(ModController.pointList[2], class_abj.r.a_())) {
//									class_acv.a("Đã có id này trong danh sách");
//									return;
//								}
//								String temp = "";
//								if (ModController.pointList[2].length() != 0) {
//									temp += ",";
//								}
//								temp += class_abj.r.a_().toLowerCase();
//								ModController.pointList[2] += temp;
//								class_acv.a("Đã thêm " + class_abj.r.a_() + " vào danh sách người up lan");
//								Menu.gI().saveFocusList();
//							}
//						}));
//						vector.addElement(new class_s("Push d.s né", new IAction() {
//							public void perform() {
//								if (ModController.isExistedId(ModController.pointList[5], class_abj.r.a_())) {
//									class_acv.a("Đã có id này trong danh sách");
//									return;
//								}
//								String temp = "";
//								if (ModController.pointList[5].length() != 0) {
//									temp += ",";
//								}
//								temp += class_abj.r.a_().toLowerCase();
//								ModController.pointList[5] += temp;
//								class_acv.a("Đã thêm " + class_abj.r.a_() + " vào danh sách người chơi cần né");
//								Menu.gI().saveFocusList();
//							}
//						}));
//
//						class_acv.u.a(vector, 2);
//					}
//				}), 1);
				break;
			}
		}
		this.b = paramVector;
		this.f = 0;
		this.g = 0;
		for (int i1 = 0; i1 < paramVector.size(); i1++) {
			class_s localclass_s = (class_s) paramVector.elementAt(i1);
			int i2;
			if ((i2 = class_d.j[0].a(localclass_s.a)) > this.f) {
				this.f = i2;
			}
			this.g += class_aae.d;
		}
		this.f += 10;
		if (this.f < 100) {
			this.f = 100;
		}
		if (this.g > class_aae.d << 2) {
			this.g = (class_aae.d << 2);
		}
		this.g += 4;
		this.e = (class_acv.n - 27 - this.g);
		if (paramInt == 0) {
			this.d = 2;
		} else if (paramInt == 1) {
			this.d = (class_acv.m - this.f - 2);
		} else if (paramInt == 2) {
			this.d = ((class_acv.m >> 1) - (this.f >> 1));
			this.e = (class_acv.n - this.g >> 1);
		} else {
			this.d = ((class_acv.m >> 1) - (this.f >> 1));
		}
		if (class_acv.n < 200) {
			this.e += 10;
		}
		this.h = (class_acv.n - class_aae.d);
		this.a = true;
		this.c = 0;
		this.o = ((this.b.size() - 4) * class_aae.d);
		if (this.o < 0) {
			this.o = 0;
		}
		this.c = 0;
		this.n = 0;
		this.m = 0;
		if (class_acv.A) {
			class_acv.f();
		}
	}

	public void setPos(int paramInt) {
		this.c = paramInt;
		if (this.c < 0) {
			this.c = (this.b.size() - 1);
		}
		if (this.c > this.b.size() - 1) {
			this.c = 0;
		}
		this.m = (this.c * class_aae.d - (class_aae.d << 1));
		if (this.m < 0) {
			this.m = 0;
		}
		if (this.m > this.o) {
			this.m = this.o;
		}
	}

	public void a(int paramInt) {
		this.c += paramInt;
		if (this.c < 0) {
			this.c = (this.b.size() - 1);
		}
		if (this.c > this.b.size() - 1) {
			this.c = 0;
		}
		this.m = (this.c * class_aae.d - (class_aae.d << 1));
		if (this.m < 0) {
			this.m = 0;
		}
		if (this.m > this.o) {
			this.m = this.o;
		}
	}

	public final void b() {
		if (class_acv.b(2)) {
			a(-1);
		} else if (class_acv.b(8)) {
			a(1);
		}
		int i1;
		if ((class_acv.f) && (class_acv.a(this.d, this.e, this.f, this.g))) {
			if (!this.j) {
				this.i = this.n;
				this.j = true;
				this.n = this.m;
			}
			i1 = this.h + 2;
			if ((i1 = (this.m + class_acv.k - i1) / class_aae.d) < 0) {
				i1 = 0;
			}
			if (i1 > this.b.size() - 1) {
				i1 = this.b.size() - 1;
			}
			this.c = i1;
			if (Math.abs(class_acv.D - class_acv.k) != 0) {
				this.m = (this.i + (class_acv.D - class_acv.k));
				if (this.m < 0) {
					this.m = 0;
				}
				if (this.m > this.o) {
					this.m = this.o;
				}
				this.c = -1;
			}
		}
		if (class_acv.g) {
			this.j = false;
			if (class_acv.a(this.d, this.e, this.f, this.g)) {
				class_acv.g = false;
				i1 = this.h + 2;
				if ((i1 = (this.m + class_acv.k - i1) / class_aae.d) < 0) {
					i1 = 0;
				}
				if (i1 > this.b.size() - 1) {
					i1 = this.b.size() - 1;
				}
				if ((Math.abs(class_acv.D - class_acv.k) <= 10) && (this.n == this.m)) {
					this.c = i1;
					if ((this.c != -1) && (this.bb != null)) {
						this.bb.b.perform();
					}
				}
			}
		}
		super.c();
	}

	public final void b(Graphics paramGraphics) {
		class_acv.a(paramGraphics);
		if (this.n != this.m) {
			this.k = (this.m - this.n << 2);
			this.l += this.k;
			this.n += (this.l >> 4);
			this.l &= 0xF;
			if (this.n < 0) {
				this.n = 0;
			}
		}
		paramGraphics.setColor(11908533);
		paramGraphics.fillRect(this.d - 2, this.e - 2, this.f + 4, this.g + 5);
		paramGraphics.setColor(2181450);
		paramGraphics.fillRect(this.d, this.h, this.f, this.g);
		paramGraphics.setClip(this.d - 2, this.e, this.f + 5, this.g + 3);
		paramGraphics.translate(this.d + 5, this.h + 2);
		for (int i1 = 0; i1 < this.b.size(); i1++) {
			class_d localclass_d = class_d.h;
			if ((this.c != -1) && (i1 == this.c)) {
				paramGraphics.setColor(11495168);
				paramGraphics.fillRect(-3, i1 * class_aae.d - this.n, this.f - 4, class_aae.d);
				localclass_d = class_d.j[0];
			}
			if (class_acv.A) {
				class_d.b.a(paramGraphics, ((class_s) this.b.elementAt(i1)).a, class_acv.o,
						3 + i1 * class_aae.d - this.n, 2);
			} else {
				localclass_d.a(paramGraphics, ((class_s) this.b.elementAt(i1)).a, 0, 3 + i1 * class_aae.d - this.n, 0);
			}
		}
		super.a(paramGraphics);
	}

	public final void d() {
		if (this.h > this.e) {
			int i1;
			if ((i1 = this.h - this.e >> 1) < 1) {
				i1 = 1;
			}
			this.h -= i1;
		}
		this.h = this.e;
	}
}
