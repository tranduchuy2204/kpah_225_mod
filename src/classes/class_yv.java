// Decompiled with: Procyon 0.6.0
// Class Version: 1
package classes;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Vector;

import javax.microedition.lcdui.Graphics;

import game.GameMidlet;
import utility.HttpUtils;

public final class class_yv extends class_aae {

	private static class_yv h;
	private int i;
	private int j;
	private int k;
	private int l;
	private int m;
	private int n;
	private static int o;
	private static int p;
	private static int q;
	private static int r;
	private static int s;
	public static int a;
	static String[] b;
	public static String[] e;
	public static short[] f;
	public static byte[] g;
	private boolean t;
	private int u;

	static {
		class_yv.b = new String[] { "Thăng Long (mới)", "Hoa Lư", "Kinh Môn", "Hoàng Vương", "Mỹ Sơn", "Tràng An",
				"Tiên La" };
		class_yv.e = new String[] { "112.213.84.163", "27.0.12.112", "112.213.94.124", "112.213.94.124",
				"112.213.94.124", "112.213.94.124", "112.213.94.124" };
		class_yv.f = new short[] { 19129, 19129, 19129, 19129, 19129, 19129, 19129 };
		class_yv.g = new byte[] { 0, 0, 0, 3, 4, 1, 2 };
	}

	public static class_yv a() {
		if (class_yv.h == null) {
			return class_yv.h = new class_yv();
		}
		return class_yv.h;
	}

	public final void d() {
		super.d();
		class_acv.s.f();
		this.h();
		this.e();
	}

	public class_yv() {
		this.l = 200;
		this.m = 135;
		this.n = 91;
		final byte[] a;
		if ((a = class_aai.a("ipnqsh")) != null) {
			final DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(a));
			try {
				final byte byte1;
				class_yv.b = new String[byte1 = dataInputStream.readByte()];
				class_yv.e = new String[byte1];
				class_yv.f = new short[byte1];
				class_yv.g = new byte[byte1];
				for (byte b = 0; b < byte1; ++b) {
					class_yv.b[b] = dataInputStream.readUTF();
					class_yv.e[b] = dataInputStream.readUTF();
					class_yv.f[b] = dataInputStream.readShort();
					class_yv.g[b] = dataInputStream.readByte();
				}
				dataInputStream.close();
			} catch (final IOException ex) {
				final Throwable t;
				ex.printStackTrace();
			}
		}
		super.ba = new class_s("Chọn server", new IAction() {
			public void perform() {
				Vector localVector;
				localVector = new Vector();
				localVector.addElement(new class_s("Global", new IAction() {
					public void perform() {
						fetchServers("https://kpahteamobi.000webhostapp.com/servers.php?sv=global");
					}
				}));
				localVector.addElement(new class_s("KPAH2", new IAction() {
					public void perform() {
						fetchServers("https://kpahteamobi.000webhostapp.com/servers.php?sv=kpah2");
					}
				}));
				class_acv.u.a(localVector, 0);
			}
		});
		super.bc = new class_s("Thoát", new class_rz(this));
		super.bb = new class_s("Chọn", new class_sb(this));
	}

	private void saveServer() {
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		final DataOutputStream dataOutputStream = new DataOutputStream(out);
		try {
			dataOutputStream.writeByte(class_yv.b.length);
			for (int j = 0; j < class_yv.b.length; ++j) {
				dataOutputStream.writeUTF(class_yv.b[j]);
				dataOutputStream.writeUTF(class_yv.e[j]);
				dataOutputStream.writeShort(class_yv.f[j]);
				dataOutputStream.writeByte(class_yv.g[j]);
			}
			class_aai.a("ipnqsh", out.toByteArray());
			dataOutputStream.close();
		} catch (final Exception ex) {
			final Throwable t;
			ex.printStackTrace();
		}
		this.e();
		class_acv.g();
	}

	public final void e() {
		class_abj.j = class_abj.h;
		class_abj.k = class_abj.i;
		class_yv.p = (class_yv.o = 0);
		class_yv.a = 0;
		if ((class_yv.s = (class_yv.b.length << 4) - (this.n - 10)) < 0) {
			class_yv.s = 0;
		}
	}

	private void fetchServers(String url) {
		class_acv.h();
		final String a;
		if ((a = HttpUtils.getResponse(url)) == null) {
			class_acv.a("Không thể kết nối, xin kiểm tra lại GPRS/3G/Wifi.");
			return;
		}
		System.out.println("response: " + a);
		final String[] a2;
		class_yv.b = new String[(a2 = class_d.a(a, ",")).length];
		class_yv.e = new String[a2.length];
		class_yv.f = new short[a2.length];
		class_yv.g = new byte[a2.length];
		for (int i = 0; i < a2.length; ++i) {
			final String[] a3 = class_d.a(a2[i], ":");
			class_yv.b[i] = a3[0];
			class_yv.e[i] = a3[1];
			class_yv.f[i] = Short.parseShort(a3[2].trim());
			class_yv.g[i] = Byte.parseByte(a3[3].trim());
		}
		saveServer();
	}

	public final void f() {
		class_acv.h();
		final String a;
		if ((a = GameMidlet.a("http://teamobi.com/srvips/NQSH2.txt")) == null) {
			class_acv.a("Không thể kết nối, xin kiểm tra lại GPRS/3G/Wifi.");
			return;
		}
		final String[] a2;
		class_yv.b = new String[(a2 = class_d.a(a, ",")).length];
		class_yv.e = new String[a2.length];
		class_yv.f = new short[a2.length];
		class_yv.g = new byte[a2.length];
		for (int i = 0; i < a2.length; ++i) {
			final String[] a3 = class_d.a(a2[i], ":");
			class_yv.b[i] = a3[0];
			class_yv.e[i] = a3[1];
			class_yv.f[i] = Short.parseShort(a3[2].trim());
			class_yv.g[i] = Byte.parseByte(a3[3].trim());
		}
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		final DataOutputStream dataOutputStream = new DataOutputStream(out);
		try {
			dataOutputStream.writeByte(class_yv.b.length);
			for (int j = 0; j < class_yv.b.length; ++j) {
				dataOutputStream.writeUTF(class_yv.b[j]);
				dataOutputStream.writeUTF(class_yv.e[j]);
				dataOutputStream.writeShort(class_yv.f[j]);
				dataOutputStream.writeByte(class_yv.g[j]);
			}
			class_aai.a("ipnqsh", out.toByteArray());
			dataOutputStream.close();
		} catch (final Exception ex) {
			final Throwable t;
			ex.printStackTrace();
		}
		this.e();
		class_acv.g();
	}

	public final void b() {
		if (class_yv.p != class_yv.o) {
			class_yv.r = class_yv.o - class_yv.p << 2;
			class_yv.q += class_yv.r;
			class_yv.p += class_yv.q >> 4;
			class_yv.q &= 0xF;
		}
		this.h();
	}

	public final void c() {
		boolean b = false;
		if (class_acv.b(2)) {
			if (--class_yv.a < 0) {
				class_yv.a = class_yv.b.length - 1;
			}
			b = true;
		} else if (class_acv.b(8)) {
			if (++class_yv.a >= class_yv.b.length) {
				class_yv.a = 0;
			}
			b = true;
		}
		if (b) {
			if ((class_yv.o = (class_yv.a << 4) - (this.n - 10) / 2) < 0) {
				class_yv.o = 0;
			}
			if (class_yv.o > class_yv.s) {
				class_yv.o = class_yv.s;
			}
		}
		super.c();
		if (class_acv.f && class_acv.a(class_acv.o - 61, class_acv.p - 19, 120, 100)) {
			if (!this.t) {
				this.u = class_yv.p;
				this.t = true;
			}
			int a;
			if ((a = (class_yv.o + class_acv.k - (class_acv.p - 20)) / 16) < 0) {
				a = 0;
			}
			if (a > class_yv.b.length - 1) {
				a = class_yv.b.length - 1;
			}
			class_yv.a = a;
			if (Math.abs(class_acv.D - class_acv.k) != 0) {
				if ((class_yv.o = this.u + (class_acv.D - class_acv.k)) < 0) {
					class_yv.o = 0;
				}
				if (class_yv.o > class_yv.s) {
					class_yv.o = class_yv.s;
				}
				class_yv.a = -1;
			}
		}
		if (class_acv.g) {
			this.t = false;
			class_acv.g = false;
			final int n = class_acv.o - 61;
			final int n2 = class_acv.p - 19;
			final int n3 = n;
			if (class_acv.j >= n3 && class_acv.j <= n3 + 120 && class_acv.k >= n2 && class_acv.k <= n2 + 100) {
				int a2;
				if ((a2 = (class_yv.o + class_acv.k - (class_acv.p - 20)) / 16) < 0) {
					a2 = 0;
				}
				if (a2 > class_yv.b.length - 1) {
					a2 = class_yv.b.length - 1;
				}
				if (Math.abs(class_acv.D - class_acv.k) < 10) {
					class_yv.a = a2;
					if (class_yv.p == class_yv.o && class_yv.a != -1 && super.bb != null) {
						super.bb.b.perform();
					}
				}
			}
		}
	}

	private void h() {
		++this.i;
		if (this.i > 360) {
			this.i = 0;
		}
		this.j = class_yg.b(this.i) * this.l >> 10;
		this.k = class_yg.a(this.i) * this.l >> 10;
		class_abj.h = this.j + 380;
		class_abj.i = this.k + 380;
		class_acv.s.g();
	}

	public static void b(final Graphics graphics) {
		class_acv.a(graphics);
		graphics.translate(-class_abj.j, -class_abj.k);
		class_ls.a(graphics);
		class_ls.b(graphics);
	}

	public final void a(final Graphics graphics) {
		b(graphics);
		class_acv.a(graphics);
		graphics.drawImage(class_acv.a(), class_acv.o, class_acv.p - 70, 3);
		class_yi.c(graphics, class_acv.o - 70, class_acv.p - 50 + 20, 140, 100);
		graphics.setClip(class_acv.o - 69, class_acv.p - 28, this.m, this.n);
		graphics.translate(0, -class_yv.p);
		if (class_yv.a != -1) {
			graphics.setColor(11908790);
			graphics.fillRect(class_acv.o - 61, class_acv.p - 21 + (class_yv.a << 4), 122, 18);
			graphics.setColor(34949);
			graphics.fillRect(class_acv.o - 60, class_acv.p - 20 + (class_yv.a << 4), 120, 16);
		}
		for (int i = 0; i < class_yv.b.length; ++i) {
			class_d.j[0].a(graphics, class_yv.b[i], class_acv.o, class_acv.p - 19 + (i << 4), 2);
		}
		super.a(graphics);
	}

	public static void g() {
		class_yv.h = null;
	}
}
