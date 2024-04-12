
package classes;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

import javax.microedition.lcdui.Graphics;

import game.GameMidlet;
import utility.AccountUtils;

public final class class_xw extends class_aae {

	public class_bz a;
	public class_bz b;
	int e;
	private int g;
	private int h;
	private boolean i;
	private class_s j;
	private class_s k;
	public static String f;
	private int l;
	private int m;
	private int n;
	private int o;
	private int p;
	private int q;
	private int r;
	private int s;
	private static boolean isFirstStart = true;

	static {
		class_xw.f = "19006610";
	}

	public final void e() {
		this.h = 110;
		this.g = class_acv.o - this.h / 2;
		this.a.c = this.h;
		this.a.b = class_acv.p - 13;
		this.b.b = class_acv.p + 23;
		this.b.c = this.h;
		this.a.a = this.g;
		this.b.a = this.g;
	}

	public class_xw() {
		this.n = 160;
		this.o = 160;
		this.p = 128;
		this.q = 0;
		this.r = 0;
		this.s = 0;
		this.a = new class_bz();
		this.a.d = class_aae.d + 2;
		this.a.e = true;
		this.a.c(3);
		this.a.a("");
		this.b = new class_bz();
		this.b.d = class_aae.d + 2;
		this.b.e = false;
		this.b.c(2);
		this.b.a("");
		if (isFirstStart) {
			this.onLoadData();
			this.getCurrentAccount();
		} else {
			this.a.a(AccountUtils.currentUserName);
			this.a.b();
			this.b.a(AccountUtils.currentPassword);
			this.b.b();
			this.i = AccountUtils.isRememberAccount;
		}
		this.e();
		this.k = new class_s((class_acv.m > 200) ? "Đăng nhập" : "Đ.Nhập", new class_jm(this));
		super.bb = this.k;
		this.j = new class_s("Nhớ", new class_jj(this));
		final class_s class_s = new class_s((class_acv.m > 200) ? "Đăng ký" : "Đ.Ký", new class_jk(this));
		if (class_acv.A) {
			if (class_aai.c("wifi") == 1) {
				class_acv.B = true;
			}
			super.ba = new class_s("Menu", new class_jb(this, class_s));
		} else {
			super.ba = new class_s("Menu", new class_jd(this, class_s));
		}
		super.bc = this.a.i;
		final String b;
		class_xw.f = (((b = class_aai.b("numbersupport")) == null) ? class_xw.f : b);
	}

	private void onLoadData() {
		
	}

	public void getCurrentAccount() {
		final byte[] a;
		if ((a = class_aai.a("nqshlogin")) != null) {
			final DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(a));
			try {
				this.i = dataInputStream.readBoolean();
				if (this.i) {
					this.a.a(dataInputStream.readUTF());
					this.a.b();
					this.b.a(dataInputStream.readUTF());
					this.b.b();
				}
				dataInputStream.close();
			} catch (final Exception ex) {
				final Throwable t;
				ex.printStackTrace();
			}
		}
	}

	protected final void a() {
		final String trim = this.a.e().toLowerCase().trim();
		final String e = this.b.e();
		if (trim.equals("showagentpro")) {
			class_acv.a("Agent: " + GameMidlet.e + " Pro: " + GameMidlet.d + " ClinenPro: " + GameMidlet.c
					+ " Ban thuong " + GameMidlet.h);
			return;
		}
		if (trim.equals("")) {
			return;
		}
		if (e.equals("")) {
			this.e = 1;
			this.a.e = false;
			this.b.e = true;
			super.bc = this.b.i;
			return;
		}
		new Thread(new class_cz(this, trim, e)).start();
		class_acv.b("Đang kết nối", true);
	}

	protected final void f() {
		final String trim = this.a.e().toLowerCase().trim();
		final String e = this.b.e();
		if (trim.equals("")) {
			class_acv.a("Vui lòng nhập Game ID muốn đăng ký vào ô trên.");
			return;
		}
		if (e.equals("")) {
			class_acv.x.a("Bạn phải nhập password đăng ký.", null, new class_s("OK", new class_db(this)), null);
			class_acv.w = class_acv.x;
			return;
		}
		class_acv.x.a = false;
		class_acv.x.a("Bạn có muốn đăng ký tài khoản: " + trim + " không?", new class_s("Có", new class_da(this)), null,
				new class_s("Không", new class_dc(this)));
		class_acv.w = class_acv.x;
	}

	protected final void g() {
		if (!class_aco.a().c) {
			class_acv.b("Đang kết nối", true);
			class_acv.b();
		} else {
			class_acv.b("Đang đăng ký", true);
		}
		class_go.a().a(this.a.e().toLowerCase(), this.b.e());
	}

	public final boolean a(final int n) {
		if (this.a.e) {
			if (this.a.a(n)) {
				return true;
			}
		} else {
			final boolean a;
			if (this.b.e && (a = this.b.a(n))) {
				return true;
			}
		}
		return super.a(n);
	}

	public final void a(Graphics graphics) {
		class_yv.a();
		class_yv.b(graphics);
		class_acv.a(graphics);
		graphics.drawImage(class_acv.C, class_acv.o, class_acv.p - 70, 3);
		final class_xw class_xw = this;
		graphics = graphics;
		class_yi.c(graphics, class_acv.o - 70, class_acv.p - 50 + 15, 140, 100);
		class_d.j[0].a(graphics, "Game ID:", this.g + 5, class_acv.p - 26, 0);
		class_d.j[0].a(graphics, "Password:", this.g + 5, class_acv.p + 10, 0);
		this.a.a(graphics);
		graphics.setClip(0, 0, class_acv.m, class_acv.n);
		this.b.a(graphics);
		graphics.setClip(0, 0, class_acv.m, class_acv.n);
		class_yi.J.a((this.e == 2) ? 1 : 0, this.g + 12, class_acv.p + 54, 0, 3, graphics);
		if (this.i) {
			class_yi.J.a(2, this.g + 12, class_acv.p + 54, 0, 3, graphics);
		}
		class_d.j[0].a(graphics, "Nhớ mật khẩu", this.g + 23, class_acv.p + 47, 0);
		class_d.b.a(graphics, "Hotline: " + classes.class_xw.f, this.g + 5, class_acv.p + 70, 0);
		super.a(graphics);
	}

	public final void d() {
		super.d();
		this.e();
	}

	public final void b() {
		this.a.d();
		this.b.d();
		if (this.s < 20) {
			++this.s;
			if (this.s == 20) {
				class_acv.s.G.a = 2;
				class_acv.s.G.b = class_acv.n - 40;
			}
		}
		if (class_acv.c[2]) {
			++this.r;
			if (this.r >= 52) {
				this.r = 0;
			}
		}
		boolean b = false;
		if (class_acv.b(2)) {
			--this.e;
			if (this.e < 0) {
				this.e = 2;
			}
			b = true;
		} else if (class_acv.b(8)) {
			++this.e;
			if (this.e > 2) {
				this.e = 0;
			}
			b = true;
		}
		if (b) {
			if (this.e == 1) {
				this.a.e = false;
				this.b.e = true;
				super.bb = this.k;
			} else if (this.e == 0) {
				this.a.e = true;
				this.b.e = false;
				super.bb = this.k;
			} else {
				this.a.e = false;
				this.b.e = false;
				super.bc = null;
				super.bb = this.j;
			}
		}
		if (this.a.e) {
			super.bc = this.a.i;
		} else if (this.b.e) {
			super.bc = this.b.i;
		}
		this.h();
		super.b();
	}

	public final void h() {
		++this.q;
		if (this.q > 360) {
			this.q = 0;
		}
		this.l = class_yg.b(this.q) * this.p >> 10;
		this.m = class_yg.a(this.q) * this.p >> 10;
		class_abj.h = this.l + this.n;
		class_abj.i = this.m + this.o;
		class_acv.s.g();
	}

	public final void i() {
		System.out.println("Save user and password to record");
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		final DataOutputStream dataOutputStream = new DataOutputStream(out);
		AccountUtils.currentUserName = this.a.e();
		AccountUtils.currentPassword = this.b.e();
		AccountUtils.isRememberAccount = this.i;
		isFirstStart = false;

		try {
			dataOutputStream.writeBoolean(AccountUtils.isRememberAccount = this.i);
			if (this.i) {
				dataOutputStream.writeUTF(AccountUtils.currentUserName = this.a.e());
				dataOutputStream.writeUTF(AccountUtils.currentPassword = this.b.e());
			}
			class_aai.a("nqshlogin", out.toByteArray());
			dataOutputStream.close();
		} catch (final Exception ex) {
			final Throwable t;
			ex.printStackTrace();
		}
	}

	static boolean a(final class_xw class_xw) {
		return class_xw.i;
	}

	static void a(final class_xw class_xw, final boolean i) {
		class_xw.i = i;
	}
}
