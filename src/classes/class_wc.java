package classes;

import java.util.Vector;

import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;
import javax.microedition.midlet.MIDlet;

import game.GameMidlet;

public final class class_wc extends class_aae {
	public static class_wc a;
	private String[][] k;
	int b;
	int e;
	int f;
	public int g;
	private int l;
	private int m;
	private int n;
	public int h;
	private int o;
	private int p;
	private int q;
	public int i;
	public int j;
	private boolean r;
	private int s;

	public static class_wc a() {
		if (class_wc.a == null) {
			return class_wc.a = new class_wc();
		}
		return class_wc.a;
	}

	public final void f() {
		if (((class_vh) class_acv.s.q).cH == -1) {
			this.k[7] = new String[] { "Bang hội", "Top bang hội", "Đăng ký bang hội" };
			return;
		}
		if (((class_hw) class_acv.s.q).ae == 0) {
			this.k[7] = new String[] { "Bang hội", "Top bang hội", "Nhiệm vụ", "Thành viên bang hội",
					"Thông tin bang hội", "Tin nhắn bang hội", "Kỹ năng", "Chat toàn bang", "Quyên góp",
					"Giải tán bang hội" };
			if (class_hw.ad) {
				this.k[7][9] = "Phục hồi bang hội";
			}
		} else {
			this.k[7] = new String[] { "Bang hội", "Top bang hội", "Nhiệm vụ", "Thành viên bang hội",
					"Thông tin bang hội", "Tin nhắn bang hội", "Kỹ năng", "Chat toàn bang", "Quyên góp", "Rời bang" };
		}
	}

	public final void e() {
		this.q = 128;
		this.i = 83;
		this.j = 18;
		if (((Canvas) class_acv.a).hasPointerEvents()) {
			this.q = 170;
			this.i = 130;
			this.j = 24;
		}
		this.o = (class_acv.m - this.q) / 2;
		this.p = (class_acv.n - this.i) / 2;
		this.l = 0;
		this.h = this.k.length * this.j - this.i;
	}

	private class_wc() {
		this.k = new String[][] {
				{ "Menu Premium", "Special", "Config Mod", "Lưu vị trí hiện tại", "Xuống Ngựa", "Auto Chat", "Khác", "Đăng Xuất" },
				{ "Cài đặt", "Cấu hình", "Bản đồ lớn", "Bật/tắt giao diện", "Hướng dẫn", "âm thanh", "Bật/tắt lời mời",
						"Bật/tắt auto đánh", "Chế độ focus" },
				{ "Bản thân", "Hành trang", "Kỹ năng", "Tiềm năng", "Trang bị", "Thông tin", "Trang bị thú", "Cây thần",
						"Cổ vật", "Khác" },
				{ "Nap Xu" },
				{ "Nhiệm vụ" },
				{ "Đồ sát" },
				{ "Khác", "Tin nhắn", "Nhóm", "Bạn bè", "Top cao thủ", "Top đại gia", "Bảng Top", "Kênh thế giới", "Diễn đàn", "Rời bang" },
				{ "" },
				{ "Cửa hàng" }, 
				{ "Thoát" } };
		this.b = 0;
		this.e = -1;
		this.r = false;
		this.s = 0;
		this.e();
		((class_bg) this).bb = new class_s("Chọn", (IAction) new class_ti(this));
		((class_bg) this).bc = new class_s("Đóng", (IAction) new class_tk(this));
	}

	public final void a(final Graphics graphics) {
		class_acv.s.a(graphics);
		class_acv.s.b(graphics);
		class_yi.c(graphics, this.o - 5, this.p - 10, this.q + 10, this.i + 20);
		graphics.setClip(this.o, this.p - 2, this.q + 2, this.i + 4);
		int p = this.p;
		graphics.translate(0, -this.l);
		for (int i = 0; i < this.f; ++i) {
			if (i == this.b) {
				class_yi.b(graphics, this.o, p, this.q, this.j);
				class_d.j[0].a(graphics, (this.e == -1) ? this.k[i][0] : this.k[this.e][i + 1], class_acv.o,
						p + this.j / 2 - class_d.j[0].b() / 2, 2);
			} else {
				class_d.h.a(graphics, (this.e == -1) ? this.k[i][0] : this.k[this.e][i + 1], class_acv.o,
						p + this.j / 2 - class_d.j[0].b() / 2, 2);
			}
			p += this.j;
		}
		super.a(graphics);
	}

	public final void b() {
		class_acv.s.b();
		if (this.l != this.g) {
			this.n = this.g - this.l << 2;
			this.m += this.n;
			this.l += this.m >> 4;
			this.m &= 0xF;
		}
		if (Math.abs(this.g - this.l) < 15 && this.l < 0) {
			this.g = 0;
		}
		if (Math.abs(this.g - this.l) < 10 && this.l > this.h) {
			this.g = this.h;
		}
	}

	public final void c() {
		if (class_acv.a(this.o, this.p, this.q, this.i)) {
			final int a = class_acv.D - class_acv.k;
			if (class_acv.f) {
				if (!this.r) {
					this.s = this.l;
					this.r = true;
					final int b;
					if ((b = (this.g + class_acv.k - this.p) / this.j) == this.b) {
						this.g();
					}
					this.b = b;
					if (this.b < 0) {
						this.b = 0;
					}
					if (this.b >= this.k.length) {
						this.b = this.k.length - 1;
					}
					this.g = this.b * this.j - this.i / 2;
					if (this.g < 0) {
						this.g = 0;
					}
				}
				this.g = this.s + (class_acv.D - class_acv.k);
				if (this.g < -10) {
					this.g = -10;
				}
				if (this.g > this.h + 10) {
					this.g = this.h + 10;
				}
			}
			if (class_acv.g) {
				class_acv.g = false;
				this.r = false;
				final int n;
				if (Math.abs(a) < 5 && (n = (this.g + this.p) / this.j) == this.b) {
					this.g();
				}
			}
		}
		if (class_acv.b(8)) {
			++this.b;
			if (this.b >= this.f) {
				this.b = 0;
			}
			this.g = this.b * this.j - this.i / 2;
			if (this.g < 0) {
				this.g = 0;
			}
			if (this.g > this.h) {
				this.g = this.h;
			}
		}
		if (class_acv.b(2)) {
			--this.b;
			if (this.b < 0) {
				this.b = this.f - 1;
			}
			this.g = this.b * this.j - this.i / 2;
			if (this.g < 0) {
				this.g = 0;
			}
			if (this.g > this.h) {
				this.g = this.h;
			}
		}
		super.c();
	}

	private void showStore() {
		int n = 0;
		for (int i = 0; i < class_yi.f.size(); ++i) {
			final class_xv class_xv;
			if ((class_xv = (class_xv) class_yi.f.elementAt(i)).g + 1 > n) {
				n = class_xv.g + 1;
			}
		}
		final byte[] array = new byte[n];
		for (int j = 0; j < array.length; ++j) {
			array[j] = 20;
		}
		class_nu.a().a(0, true, array);
		class_nu.a().d();
	}

	private void g() {
		if (this.e == -1) {
			if (this.k[this.b].length == 1) {
				switch (this.b) {
				case 0: {
					return;
				}
				case 3: {
					class_acv.s.i();
					((class_bg) this).bc.b.perform();
					break;
				}
				case 4: {
					b(6);
					return;
				}
				case 5: {
					class_acv.s.d();
					class_acv.s.D.c();
					return;
				}
				case 9: {
					GameMidlet.a.notifyDestroyed();
					return;
				}
				case 8: {
					this.showStore();
					return;
				}
				}
			}
			this.e = this.b;
			this.f = this.k[this.b].length - 1;
			this.h = this.k[this.b].length * this.j - this.i;
			if (this.h < 0) {
				this.h = 0;
			}
			final class_wc class_wc = this;
			final class_wc class_wc2 = this;
			final class_wc class_wc3 = this;
			final int l = 0;
			class_wc3.b = l;
			class_wc2.g = l;
			class_wc.l = l;
			return;
		}
		switch (this.b) {
		case 0: {
			if (this.e == 0) {
				Menu.gI().specialMenu();
				return;
			}
			if (this.e == 1) {
				class_acv.s.u();
				class_acv.s.d();
				return;
			}
			if (this.e == 2) {
				b(0);
				return;
			}
			if (this.e == 6) {
				class_acv.s.d();
				class_act.a().d();
				return;
			}
			if (this.e == 7) {
				class_acv.s.d();
				class_go.a().l(5, 0);
				return;
			}
			break;
		}
		case 1: {
			if (this.e == 0) {
				Menu.showConfigMenu();
				return;
			}

			if (this.e == 1) {
				class_acv.s.d();
				final short[][] array2 = { { 28, 105 }, { 55, 100 }, { 24, 138 }, { 61, 148 }, { 105, 76 }, { 80, 128 },
						{ 112, 132 }, { 136, 111 }, { 76, 60 }, { 129, 158 }, { 173, 155 }, { 153, 160 }, { 145, 60 },
						{ 127, 87 }, { 126, 62 }, { 35, 60 }, { 35, 60 } };
				final short[] array3 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 110, 111, 112, 202, 104 };
				int n2 = 0;
				for (int k = 0; k < array3.length; ++k) {
					if (class_acv.s.aG == array3[k]) {
						n2 = k;
						break;
					}
				}
				final int n3 = n2;
				class_px.a().a(class_acv.o - 94, class_acv.p - 84 - class_aae.c, 197, 168, class_yi.ae[n3],
						(class_s) null);
				class_px.a().e = 1;
				((class_bg) class_px.a()).ba = new class_s("Trở lại", (IAction) new class_sn(this));
				class_px.a().b = (class_dy) new class_sp(this, array2, n3);
				class_px.a().d();
				return;
			}
			if (this.e == 2) {
				b(3);
				return;
			}
			if (this.e == 6) {
				b(5);
				return;
			}
			if (this.e != 7) {
				break;
			}
			class_acv.s.d();
			class_acv.h();
			if (((class_vh) class_acv.s.q).cH == -1) {
				class_go.a().k();
				return;
			}
			class_go.a().t(0);
			class_abj.a(0, false, new byte[] { 27 });
			class_acv.h();
			return;
		}
		case 2: {
			if (this.e == 0) {
//				Menu.gI().showPointerMenu();

				ModController.doSaveCurrentLocation();
				return;
			}
			if (this.e == 1) {
				class_acv.s.d();
				final class_abj s = class_acv.s;
				++s.p;
				if (class_acv.s.p > 2) {
					class_acv.s.p = 0;
					return;
				}
				break;
			} else {
				if (this.e == 2) {
					b(2);
					return;
				}
				if (this.e == 6) {
					class_acv.s.d();
					if (class_na.a().b == null || class_na.a().b.size() == 0) {
						class_acv.a("Chưa có bạn");
						return;
					}
					final Vector vector = new Vector();
					for (int index = 0; index < class_na.a().b.size(); ++index) {
						vector.addElement(class_na.a().b.elementAt(index));
					}
					class_na.a().a(vector, 0, "BẠN BÈ");
					class_na.a().d();
					return;
				} else {
					if (this.e == 7) {
						class_acv.h();
						class_go.a().b((int) ((class_vh) class_acv.s.q).cH, (byte) 0);
						return;
					}
					break;
				}
			}

		}
		case 3: {
			if (this.e == 0) {
				ModController.doDownHorse();
				return;
			}
			if (this.e == 1) {
				class_acv.s.d();
				class_bs.a().d();
				return;
			}
			if (this.e == 2) {
				b(1);
				return;
			}
			if (this.e == 6) {
				class_go.a().l(4, 0);
				return;
			}
			if (this.e == 7) {
				class_acv.h();
				class_go.a().n((int) ((class_vh) class_acv.s.q).cH);
				return;
			}
			break;
		}
		case 4: {
			if (this.e == 0) {
				// show menu setting auto chat
				Menu.gI().showOptionChat();
				return;
			}
			if (this.e == 1) {
				if (class_cy.a == null) {
					break;
				}
				if (class_cy.a.b != 0) {
					class_cy.a.b = 0;
					class_acv.s.d();
					return;
				}
				class_cy.a.b = 1;
				class_acv.s.d();
				return;
			} else {
				if (this.e == 2) {
					b(4);
					return;
				}
				if (this.e == 6) {
					class_acv.s.d();
					class_go.a().l(3, 0);
					return;
				}
				if (this.e == 7) {
					class_acv.s.d();
					class_go.a().a((String) null, (byte) 1, 0);
					return;
				}
				break;
			}

		}
		case 5: {
			if (this.e == 0) {
				Menu.showOtherMenu();
				return;
			}
			if (this.e == 7) {
				class_abj.a(0, true, new byte[] { 29, 30 });
				return;
			}
			if (this.e == 2) {
				b(7);
				return;
			}
			if (this.e == 6) {
				class_go.a().l(7, 0);
				return;
			}
			if (this.e == 1) {
				class_acv.s.t = !class_acv.s.t;
				class_go.a().a(class_acv.s.t ? 5 : 4);
				class_acv.s.d();
				class_acv.a(class_acv.s.t ? "Đã tắt chức năng nhận lời mời." : "Đã bật chức năng nhận lời mời.");
				return;
			}
			break;
		}
		case 6: {
			if (this.e == 0) {
				// do logout game
				ModController.logOut();
				return;
			}
			if (this.e == 7) {
				class_acv.s.d();
				class_act.a().a("", "Bang hội");
				class_act.a().a("Bang hội");
				class_act.a().d();
				return;
			}
			if (this.e == 1) {
				class_acv.I.d();
				return;
			}
			if (this.e == 6) {
				((class_b.a == null) ? (class_b.a = new class_b()) : class_b.a).d();
				return;
			}
			if (this.e == 2) {
				class_gv.a().a((class_aae) class_acv.s);
				return;
			}
			break;
		}
		case 7: {
			if (this.e == 7) {
				class_acv.y.a("Số lượng", (IAction) new class_tn(this), 1, 100, false);
				class_acv.w = (class_hc) class_acv.y;
				return;
			}
			if (this.e == 6) {
				try {
					if (GameMidlet.f != "") {
						((MIDlet) GameMidlet.a).platformRequest(GameMidlet.f);
						return;
					}
					break;
				} catch (final Exception ex) {
					ex.printStackTrace();
					return;
				}
			}
			if (this.e == 2) {
				class_hx.a().a((class_aae) class_acv.s);
				return;
			}
			if (this.e == 1) {
				class_acv.I.d();
				class_acv.I.g = true;
				class_acv.I.l = class_abj.ao;
				class_acv.I.f();
				return;
			}
			break;
		}
		case 8: {
			if (this.e == 2) {
				class_go.a().h();
				return;
			}
			if (((class_vh) class_acv.s.q).cH == -1) {
				class_acv.a("Bạn chưa có bang");
				return;
			}
			if (((class_hw) class_acv.s.q).ae == 0) {
				class_acv.b(class_hw.ad ? "Bạn có chắc muốn phục hồi lại bang hội không ?"
						: "Bạn có chắc muốn giải tán bang hội không ?", (IAction) new class_tq(this));
				return;
			}
			class_acv.b("Bạn có chắc muốn rời bang không ?", (IAction) new class_tt(this));
			break;
		}
		}
	}

	public static void b(final int n) {
		class_nu.a().d();
		class_nu.a().a(n, class_nu.a().q, class_nu.a().q ? class_nu.a().X : new byte[] { 0, 1, 2, 3, 4, 5, 6, 31 });
		class_nu.O = (class_hw) class_acv.s.q;
		class_nu.a().j();
	}

	public final void d() {
		this.f = this.k.length;
		this.b = 0;
		this.e = -1;
		this.h = this.f * 18 - this.i;
		final int n = 0;
		this.l = n;
		this.g = n;
		if (class_cy.a != null) {
			if (class_cy.a.b == 1) {
				this.k[1][5] = "Tất âm thanh";
			} else {
				this.k[1][5] = "Bật âm thanh";
			}
		}
		super.d();
		this.e();
	}

	static void a(final class_wc class_wc) {
		class_wc.g();
	}

	static String[][] b(final class_wc class_wc) {
		return class_wc.k;
	}
}