package classes;

import game.GameMidlet;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Vector;

public final class class_go extends class_kr {

	public class_aco a;
	private static class_go b;

	public static class_go a() {
		if (b == null) {
			b = new class_go();
		}

		return b;
	}

	private static class_abs b(byte cmd) {
		if (cmd != 4 && cmd != 90 && cmd != 60 && cmd != 70 && cmd != 27 && cmd != 15 && cmd != 47 && cmd != 8
				&& cmd != -51 && cmd != 5 && cmd != -48 && cmd != 17 && cmd != 7) {
			System.out.println("send cmd=" + cmd);
		}
		return new class_abs(cmd);
	}

	public final void a(int var1, int var2) {
		class_abs var3 = b((byte) -25);

		try {
			var3.c().writeByte(var1);
			var3.c().writeByte(var2);
			this.a.a(var3);
		} catch (Exception var4) {
			;
		}
	}

	public final void b(int var1, int var2) {
		class_abs var3 = b((byte) 109);

		try {
			var3.c().writeByte(var1);
			var3.c().writeByte(var2);
			this.a.a(var3);
		} catch (Exception var4) {
			;
		}
	}

	public final void a(byte var1, byte var2) {
		class_abs var3 = b((byte) -62);

		try {
			var3.c().writeByte(var1);
			if (var2 != 100) {
				var3.c().writeByte(var2);
			}

			this.a.a(var3);
		} catch (Exception var4) {
			;
		}
	}

	public final void a(byte var1) {
		class_abs var2 = b((byte) 108);

		try {
			var2.c().writeByte(var1);
			this.a.a(var2);
		} catch (Exception var3) {
			var3.printStackTrace();
		}
	}

	public final void a(int var1) {
		class_abs var2 = b((byte) 104);

		try {
			var2.c().writeByte(var1);
			this.a.a(var2);
		} catch (Exception var3) {
			;
		}
	}

	public final void a(int var1, String var2, String var3, String var4) {
		class_abs var5 = b((byte) 107);

		try {
			var5.c().writeByte(var1);
			var5.c().writeUTF(var2);
			var5.c().writeUTF(var3);
			var5.c().writeUTF(var4);
			this.a.a(var5);
		} catch (Exception var6) {
			;
		}
	}

	public final void c(int var1, int var2) {
		class_abs var3 = b((byte) 94);

		try {
			var3.c().writeByte(0);
			var3.c().writeByte(var1);
			var3.c().writeByte(var2);
			this.a.a(var3);
			var3.d();
		} catch (Exception var4) {
			;
		}
	}

	public final void a(int var1, int var2, int var3) {
		class_abs var4 = b((byte) 94);

		try {
			var4.c().writeByte(1);
			var4.c().writeByte(var1);
			var4.c().writeByte(var2);
			var4.c().writeShort(var3);
			this.a.a(var4);
			var4.d();
		} catch (Exception var5) {
			;
		}
	}

	public final void a(int var1, int var2, class_ql var3, short var4, int var5, boolean var6) {
		class_abs var7 = b((byte) 92);

		try {
			var7.c().writeBoolean(var6);
			var7.c().writeByte(var1);
			var7.c().writeByte(var2);
			if (var3 != null) {
				var7.c().writeShort(var3.i);
			} else {
				var7.c().writeShort(var4);
			}

			var7.c().writeInt(var5);
			if (var3 != null) {
				var7.c().writeByte(0);
			} else {
				var7.c().writeByte(1);
			}

			this.a.a(var7);
			var7.d();
		} catch (Exception var8) {
			;
		}
	}

	public final void a(int var1, int var2, int var3, int var4, int var5) {
		class_abs var6 = b((byte) 95);

		try {
			var6.c().writeByte(var2);
			var6.c().writeByte(var3);
			var6.c().writeShort(var1);
			var6.c().writeShort(var4);
			var6.c().writeByte(var5);
			this.a.a(var6);
			var6.d();
		} catch (Exception var7) {
			;
		}
	}

	public final void d(int var1, int var2) {
		class_abs var4 = b((byte) 100);

		try {
			var4.c().writeByte(0);
			var4.c().writeShort(var2);
			this.a.a(var4);
			var4.d();
		} catch (Exception var3) {
			;
		}
	}

	public final void b(int var1) {
		class_abs var2 = b((byte) 86);

		try {
			var2.c().writeShort(var1);
			this.a.a(var2);
			var2.d();
		} catch (Exception var3) {
			;
		}
	}

	public final void c(int var1) {
		class_abs var2 = b((byte) 85);

		try {
			var2.c().writeByte(var1);
			this.a.a(var2);
			var2.d();
		} catch (Exception var3) {
			;
		}
	}

	public final void b() {
		class_abs var1 = b((byte) 82);

		try {
			this.a.a(var1);
		} catch (Exception var2) {
			;
		}
	}

	public final void a(byte var1, int var2) {
		class_abs var3 = b((byte) 79);

		try {
			var3.c().writeByte(var1);
			var3.c().writeShort(var2);
			this.a.a(var3);
		} catch (Exception var4) {
			;
		}
	}

	public final void a(short var1) {
		class_abs var2 = b((byte) 75);

		try {
			var2.c().writeShort(var1);
			this.a.a(var2);
		} catch (Exception var3) {
			;
		}
	}

	public final void a(short var1, byte var2) {

		class_abs var3 = b((byte) 76);

		try {
			var3.c().writeShort(var1);
			var3.c().writeByte(var2);
			this.a.a(var3);
		} catch (Exception var4) {
			var4.printStackTrace();
		}
		ModScr.idItemKimDuoc = var1;
		System.out.println(var1 + " - " + var2);
	}

	public final void d(int var1) {
		class_abs var2 = b((byte) 72);

		try {
			var2.c().writeByte(var1);
			this.a.a(var2);
		} catch (Exception var3) {
			;
		}
	}

	public final void e(int var1) {
		class_abs var3 = b((byte) 71);

		try {
			var3.c().writeByte(0);
			this.a.a(var3);
			var3.d();
		} catch (IOException var2) {
			;
		}
	}

	public final void f(int var1) {
		class_abs var2 = b((byte) 77);

		try {
			var2.c().writeByte(var1);
			this.a.a(var2);
			var2.d();
		} catch (Exception var3) {
			;
		}
		System.out.println(">>>>>>>>" + var1);
	}

	public final void a(String var1, String var2, String var3) {
		class_abs var4 = b((byte) 1);

		try {
			var4.c().writeUTF(var1);
			var4.c().writeUTF(var2);
			var4.c().writeUTF(var3);
			var4.c().writeUTF(System.getProperty("microedition.platform"));
			GameMidlet.c.trim();
			var4.c().writeUTF(GameMidlet.c);
			var4.c().writeUTF(GameMidlet.d);
			var4.c().writeUTF(GameMidlet.e);
			var4.c().writeByte(0);
			var4.c().writeShort(class_acv.m);
			var4.c().writeByte(class_acv.b ? -1 : 0);
			DataOutputStream var10000 = var4.c();
			int var6 = class_yv.a;
			var10000.writeByte(class_yv.a > class_yv.g.length - 1 ? 0 : class_yv.g[var6]);
			this.a.a(var4);
			var4.d();
		} catch (IOException var5) {
			;
		}
	}

	public final void c() {
		class_abs var1 = b((byte) 67);

		try {
			var1.c().writeByte(1);
			this.a.a(var1);
			var1.d();
		} catch (Exception var2) {
			;
		}
	}

	public final void g(int var1) {
		class_abs var2 = b((byte) 48);

		try {
			var2.c().writeInt(var1);
			this.a.a(var2);
			var2.d();
		} catch (Exception var3) {
			;
		}
	}

	public final void e(int var1, int var2) {
		class_abs var3 = b((byte) 49);

		try {
			var3.c().writeByte(var2);
			var3.c().writeShort(var1);
			this.a.a(var3);
			var3.d();
		} catch (Exception var4) {
			;
		}
	}

	public final void h(int var1) {
		class_abs var2 = b((byte) 66);

		try {
			var2.c().writeByte(0);
			var2.c().writeShort(var1);
			this.a.a(var2);
			var2.d();
		} catch (Exception var3) {
			;
		}
	}

	public final void f(int var1, int var2) {
		class_abs var3 = b((byte) 101);

		try {
			var3.c().writeShort(var1);
			var3.c().writeByte(var2);
			this.a.a(var3);
		} catch (Exception var4) {
			;
		}
	}

	public final void g(int var1, int var2) {
		class_abs var3 = b((byte) 66);

		try {
			var3.c().writeByte(var2);
			var3.c().writeShort(var1);
			this.a.a(var3);
			var3.d();
		} catch (Exception var4) {
			;
		}
	}

	public final void i(int var1) {
		class_abs var2 = b((byte) 66);

		try {
			var2.c().writeByte(4);
			var2.c().writeShort(var1);
			this.a.a(var2);
			var2.d();
		} catch (Exception var3) {
			;
		}
	}

	public final void j(int var1) {
		class_abs var2 = b((byte) 66);

		try {
			var2.c().writeByte(3);
			var2.c().writeShort(var1);
			this.a.a(var2);
			var2.d();
		} catch (Exception var3) {
			;
		}
	}

	public final void a(short var1, int var2, int var3) {
		class_abs var4 = b((byte) 66);

		try {
			var4.c().writeByte(2);
			var4.c().writeByte(var2);
			if (var2 == 0) {
				var4.c().writeShort(var1);
			} else if (var2 == 1) {
				var4.c().writeByte(var1);
				var4.c().writeShort(var3);
			} else if (var2 == 2) {
				var4.c().writeByte(var1);
			}

			this.a.a(var4);
			var4.d();
		} catch (Exception var5) {
			;
		}
	}

	public final void a(int var1, byte var2) {
		class_abs var3 = b((byte) 50);

		try {
			var3.c().writeByte(var2);
			var3.c().writeShort(var1);
			this.a.a(var3);
			var3.d();
		} catch (Exception var4) {
			;
		}
	}

	public final void h(int var1, int var2) {
		if (!class_ls.m) {
			if (!class_ls.a(var1, var2, 2) && var2 / 16 * class_ls.a + var1 / 16 < class_ls.g.length) {
				class_abs var3 = b((byte) 4);

				try {
					var3.c().writeShort(var1);
					var3.c().writeShort(var2);
				} catch (Exception var4) {
					;
				}

				this.a.a(var3);
				var3.d();
			}
		}
	}

	public final void b(short var1) {
		class_abs var2 = b((byte) 5);

		try {
			var2.c().writeShort(var1);
		} catch (Exception var3) {
			;
		}

		this.a.a(var2);
		var2.d();
	}

	public final void b(short var1, byte var2) {
		class_abs var3 = b((byte) 9);

		try {
			var3.c().writeShort(var1);
			var3.c().writeByte(var2);
		} catch (Exception var4) {
			;
		}

		this.a.a(var3);
		var3.d();
	}

	public final void a(byte var1, Vector var2) {
		class_abs var3 = b((byte) 106);

		try {
			var3.c().writeByte(var1);
			var3.c().writeByte(var2.size());

			for (int var5 = 0; var5 < var2.size(); ++var5) {
				var3.c().writeShort(((class_vh) var2.elementAt(var5)).cG);
			}
		} catch (Exception var4) {
			;
		}

		this.a.a(var3);
		var3.d();
	}

	public final void c(short var1, byte var2) {
		class_abs var3 = b((byte) 6);

		try {
			var3.c().writeShort(var1);
			var3.c().writeByte(var2);
		} catch (Exception var4) {
			;
		}

		this.a.a(var3);
		var3.d();
	}

	public final void a(short var1, byte var2, byte var3, short var4) {
		class_abs var6 = b((byte) 51);

		try {
			var6.c().writeByte(1);
			var6.c().writeShort(var1);
			var6.c().writeByte(0);
			var6.c().writeByte(var3);
			var6.c().writeShort(0);
		} catch (Exception var5) {
			;
		}

		this.a.a(var6);
		var6.d();
	}

	public final void c(short var1) {
		class_abs var2 = b((byte) 7);

		try {
			var2.c().writeShort(var1);
		} catch (Exception var3) {
			;
		}

		this.a.a(var2);
		var2.d();
	}

	public final void d() {
		b((byte) 11).d();
	}

	public final void i(int var1, int var2) {
		try {
			class_abs var3;
			(var3 = b((byte) 13)).c().writeByte(var2);
			var3.c().writeInt(var1);
			this.a.a(var3);
			var3.d();
		} catch (IOException var4) {
			;
		}
	}

	public final void a(String var1, int var2, int var3, int var4, int var5) {
		class_abs var6 = b((byte) 14);

		try {
			var6.c().writeUTF(var1);
			var6.c().writeByte(var2);
			var6.c().writeByte(var3);
			var6.c().writeByte(var4);
			var6.c().writeByte(var5);
			var6.c().writeByte(class_yv.g[class_yv.a]);
			this.a.a(var6);
			var6.d();
		} catch (IOException var7) {
			;
		}
	}

	public final void e() {
		class_abs var1 = b((byte) -1);

		try {
			var1.c().writeByte(2);
		} catch (Exception var2) {
			;
		}

		this.a.a(var1);
		var1.d();
	}

	public final void a(byte var1, short var2) {
		try {
			class_abs var3;
			if (var1 == 3) {
				(var3 = b((byte) 18)).c().writeShort(var2);
				this.a.a(var3);
				var3.d();
				return;
			}

			if (var1 == 4) {
				(var3 = b((byte) 19)).c().writeShort(var2);
				this.a.a(var3);
				var3.d();
				return;
			}

			if (var1 == 7 || var1 == 6) {
				(var3 = b((byte) -41)).c().writeByte(var1);
				var3.c().writeShort(var2);
				this.a.a(var3);
				var3.d();
				return;
			}

			if (var1 == 14) {
				(var3 = b((byte) -65)).c().writeShort(var2);
				this.a.a(var3);
				return;
			}
		} catch (IOException var4) {
			;
		}

	}

	public final void f() {
		class_abs var1 = b((byte) 88);

		try {
			this.a.a(var1);
		} catch (Exception var2) {
			;
		}

		var1.d();
	}

	public final void g() {
		class_abs var1 = b((byte) 81);

		try {
			this.a.a(var1);
			var1.d();
		} catch (Exception var2) {
			;
		}
	}

	public final void a(short var1, short var2) {
		class_abs var3 = b((byte) 21);

		try {
			var3.c().writeShort(var1);
			var3.c().writeShort(var2);
			this.a.a(var3);
			var3.d();
		} catch (IOException var4) {
			;
		}
	}

	public final void k(int var1) {
		class_abs var2 = b((byte) 22);

		try {
			var2.c().writeByte(var1);
			this.a.a(var2);
			var2.d();
		} catch (IOException var3) {
			;
		}
	}

	public final void b(int var1, int var2, int var3) {
		System.out.println("go to map " + var1 + " - " + var2 + " - " + var3);
		class_gm.a().b(var1, var2, var3);
		class_acv.s.y = null;
		class_abs var4 = b((byte) 12);

		try {
			var4.c().writeShort(var1);
			var4.c().writeShort(var2);
			var4.c().writeShort(var3);
			this.a.a(var4);
			var4.d();
		} catch (IOException var5) {
			;
		}
	}

	public final void c(int var1, int var2, int var3) {
		class_abs var5 = b((byte) 12);

		try {
			var5.c().writeShort(-500);
			var5.c().writeShort(0);
			var5.c().writeShort(0);
			this.a.a(var5);
			var5.d();
		} catch (IOException var4) {
			;
		}
	}

	public final void l(int var1) {
		class_abs var2 = b((byte) 23);

		try {
			var2.c().writeByte(var1);
			this.a.a(var2);
			var2.d();
		} catch (IOException var3) {
			;
		}
	}

	public final void j(int var1, int var2) {
		class_abs var3 = b((byte) 23);

		try {
			var3.c().writeByte(var1);
			var3.c().writeByte(var2);
			this.a.a(var3);
			var3.d();
		} catch (IOException var4) {
			;
		}
	}

	public final void a(Vector var1) {
		class_abs var2 = b((byte) 74);

		try {
			int var3 = 0;

			int var4;
			class_xv var5;
			for (var4 = 0; var4 < var1.size(); ++var4) {
				var5 = (class_xv) var1.elementAt(var4);
				var3 += var5.n;
			}

			var2.c().writeShort(var3);

			for (var4 = 0; var4 < var1.size(); ++var4) {
				var5 = (class_xv) var1.elementAt(var4);

				for (var3 = 0; var3 < var5.n; ++var3) {
					var2.c().writeShort(var5.o);
				}
			}

			this.a.a(var2);
			var2.d();
		} catch (Exception var6) {
			var6.printStackTrace();
		}
	}

	public final void b(byte var1, short var2) {
		class_abs var3 = b((byte) -76);

		try {
			var3.c().writeShort(var2);
			var3.c().writeByte(var1);
			this.a.a(var3);
			var3.d();
		} catch (Exception var4) {
			;
		}
	}

	public final void h() {
		class_abs var1 = b((byte) -76);

		try {
			var1.c().writeShort(-10000);
			this.a.a(var1);
			var1.d();
		} catch (Exception var2) {
			;
		}
	}

	public final void b(Vector var1) {
		class_abs var2 = b((byte) 24);

		try {
			var2.c().writeByte(var1.size());

			for (int var3 = 0; var3 < var1.size(); ++var3) {
				class_ql var4;
				class_yc var5 = class_yi.b((int) (var4 = (class_ql) var1.elementAt(var3)).r);
				var2.c().writeByte(var4.g);
				var2.c().writeShort(var5.m);
				var2.c().writeShort(1);
				if (var4.g == 3) {
					if (class_nu.a().y >= 0) {
						var2.c().writeByte(class_nu.a().y);
					} else {
						var2.c().writeByte(var5.l);
					}
				}
			}

			this.a.a(var2);
			var2.d();
		} catch (IOException var6) {
			;
		}
	}

	public final void c(Vector var1) {
		class_abs var2 = b((byte) 24);

		try {
			var2.c().writeByte(var1.size());

			for (int var3 = 0; var3 < var1.size(); ++var3) {
				class_ql var4 = (class_ql) var1.elementAt(var3);
				var2.c().writeByte(4);
				var2.c().writeShort(var4.l);
				var2.c().writeShort(var4.j);
			}

			this.a.a(var2);
			var2.d();
		} catch (IOException var5) {
			;
		}
	}

	public final void a(String var1) {
		class_abs var2 = b((byte) 27);

		try {
			var2.c().writeUTF(var1);
			this.a.a(var2);
			var2.d();
		} catch (IOException var3) {
			;
		}
	}

	public final void i() {
		class_abs var1 = b((byte) 70);

		try {
			this.a.a(var1);
			var1.d();
		} catch (Exception var2) {
			;
		}
	}

	public final void d(short var1) {
		class_abs var2 = b((byte) 68);

		try {
			var2.c().writeShort(var1);
			this.a.a(var2);
			var2.d();
		} catch (IOException var3) {
			;
		}
	}

	public final void e(short var1) {
		class_abs var2 = b((byte) 69);

		try {
			var2.c().writeShort(var1);
			this.a.a(var2);
			var2.d();
		} catch (IOException var3) {
			;
		}
	}

	public final void f(short var1) {
		class_abs var2 = b((byte) 28);

		try {
			var2.c().writeShort(var1);
			this.a.a(var2);
			var2.d();
		} catch (IOException var3) {
			;
		}
	}

	public final void d(short var1, byte var2) {
		class_abs var3 = b((byte) 78);

		try {
			var3.c().writeShort(var1);
			var3.c().writeByte(var2);
			this.a.a(var3);
			var3.d();
		} catch (IOException var4) {
			;
		}
	}

	public final void g(short var1) {
		class_abs var2 = b((byte) 29);

		try {
			var2.c().writeShort(var1);
			this.a.a(var2);
			var2.d();
		} catch (IOException var3) {
			;
		}
	}

	public final void h(short var1) {
		class_abs var2 = b((byte) 61);

		try {
			var2.c().writeShort(var1);
			this.a.a(var2);
			var2.d();
		} catch (IOException var3) {
			;
		}
	}

	public final void j() {
		class_abs var1 = b((byte) 31);
		this.a.a(var1);
		var1.d();
	}

	public final void k(int var1, int var2) {
		class_abs var3 = b((byte) 34);

		try {
			var3.c().writeByte(var1);
			var3.c().writeShort(var2);
			this.a.a(var3);
			var3.d();
		} catch (IOException var4) {
			;
		}
	}

	public final void m(int var1) {
		class_abs var2 = b((byte) 36);

		try {
			var2.c().writeByte(var1);
			this.a.a(var2);
			var2.d();
		} catch (IOException var3) {
			;
		}
	}

	public final void a(String var1, String var2) {
		class_abs var3 = b((byte) 39);

		try {
			var3.c().writeUTF(var1);
			var3.c().writeUTF(var2);
			GameMidlet.c.trim();
			var3.c().writeUTF(GameMidlet.c);
			var3.c().writeUTF(GameMidlet.d);
			var3.c().writeUTF(GameMidlet.e);
		} catch (IOException var4) {
			;
		}

		this.a.a(var3);
		var3.d();
	}

	public final void a(short var1, byte var2, boolean var3) {
		class_abs var4 = b((byte) -11);

		try {
			var4.c().writeByte(var2);
			var4.c().writeShort(var1);
			if (var2 == 1) {
				var4.c().writeBoolean(var3);
			}
		} catch (IOException var5) {
			;
		}

		this.a.a(var4);
	}

	public final void b(String var1, String var2) {
		class_abs var3 = b((byte) -5);

		try {
			var3.c().writeUTF(var1);
			var3.c().writeUTF(var2);
		} catch (IOException var4) {
			;
		}

		this.a.a(var3);
	}

	public final void b(String var1) {
		class_abs var2 = b((byte) -6);

		try {
			var2.c().writeUTF(var1);
		} catch (IOException var3) {
			;
		}

		this.a.a(var2);
	}

	public final void b(int var1, byte var2) {
		class_abs var3 = b((byte) -7);

		try {
			var3.c().writeByte(var2);
			var3.c().writeShort(var1);
		} catch (IOException var4) {
			;
		}

		this.a.a(var3);
	}

	public final void b(byte var1, int var2) {
		class_abs var3 = b((byte) -8);

		try {
			var3.c().writeByte(var1);
			var3.c().writeByte(var2);
		} catch (IOException var4) {
			;
		}

		this.a.a(var3);
	}

	public final void k() {
		class_abs var1 = b((byte) -9);
		this.a.a(var1);
	}

	public final void a(short var1, String var2) {
		class_abs var3 = b((byte) -10);

		try {
			var3.c().writeShort(var1);
			var3.c().writeUTF(var2);
		} catch (IOException var4) {
			;
		}

		this.a.a(var3);
	}

	public final void n(int var1) {
		class_acv.h();
		class_abs var2 = b((byte) -12);
		try {
			var2.c().writeShort(var1);
		} catch (IOException var3) {
			;
		}

		this.a.a(var2);
	}

	public final void c(String var1) {
		class_abs var2 = b((byte) -13);

		try {
			var2.c().writeUTF(var1);
		} catch (IOException var3) {
			;
		}

		this.a.a(var2);
	}

	public final void l() {
		class_abs var1 = b((byte) -14);
		this.a.a(var1);
	}

	public final void m() {
		class_abs var1 = b((byte) -15);
		this.a.a(var1);
	}

	public final void d(String var1) {
		class_abs var2 = b((byte) -16);

		try {
			var2.c().writeUTF(var1);
		} catch (IOException var3) {
			;
		}

		this.a.a(var2);
	}

	public final void a(String var1, byte var2, int var3) {
		class_abs var4 = b((byte) -17);

		try {
			var4.c().writeByte(var2);
			if (var2 == 0) {
				var4.c().writeUTF(var1);
			} else if (var2 == 2) {
				var4.c().writeInt(var3);
			}
		} catch (IOException var5) {
			;
		}

		this.a.a(var4);
	}

	public final void e(String var1) {
		class_abs var2 = b((byte) -18);

		try {
			var2.c().writeUTF(var1);
		} catch (IOException var3) {
			;
		}

		this.a.a(var2);
	}

	public final void l(int var1, int var2) {
		class_acv.h();
		class_abs var3 = b((byte) -19);

		try {
			var3.c().writeByte(var1);
			var3.c().writeByte(var2);
		} catch (IOException var4) {
			;
		}

		this.a.a(var3);
	}

	public final void o(int var1) {
		class_abs var2 = b((byte) -20);

		try {
			var2.c().writeInt(var1);
		} catch (IOException var3) {
			;
		}

		this.a.a(var2);
	}

	public final void p(int var1) {
		class_abs var2 = b((byte) -21);

		try {
			var2.c().writeShort(var1);
		} catch (IOException var3) {
			;
		}

		this.a.a(var2);
	}

	public final void e(short var1, byte var2) {
		class_abs var3 = b((byte) -22);

		try {
			var3.c().writeShort(var1);
			var3.c().writeByte(var2);
		} catch (IOException var4) {
			;
		}

		this.a.a(var3);
	}

	public final void a(short var1, int var2, byte var3) {
		class_abs var4 = b((byte) -23);

		try {
			var4.c().writeByte(var2);
			var4.c().writeShort(var1);
			if (var2 == 0) {
				var4.c().writeByte(var3);
			}
		} catch (IOException var5) {
			;
		}

		this.a.a(var4);
	}

	public final void q(int var1) {
		class_abs var3 = b((byte) -24);

		try {
			var3.c().writeByte(0);
		} catch (Exception var2) {
			;
		}

		this.a.a(var3);
	}

	public final void a(int var1, int var2, int var3, byte var4) {
		class_abs var5 = b((byte) -27);

		try {
			var5.c().writeByte(var1);
			var5.c().writeByte(var2);
			var5.c().writeByte(var3);
			var5.c().writeByte(var4);
		} catch (Exception var6) {
			;
		}

		this.a.a(var5);
	}

	public final void f(String var1) {
		class_abs var2 = b((byte) -28);

		try {
			var2.c().writeUTF(var1);
		} catch (IOException var3) {
			var3.printStackTrace();
		}

		this.a.a(var2);
	}

	public final void a(int var1, byte var2, int var3) {
		System.out.println("doChangeArea " + var1 + " " + var2 + " " + var3);
		class_abs var4 = b((byte) -30);
		try {
			var4.c().writeShort(var1);
			var4.c().writeByte(var2);
			var4.c().writeByte(var3);
		} catch (IOException var5) {
			;
		}

		this.a.a(var4);
	}

	public final void a(int var1, byte var2, String var3) {
		class_abs var4 = b((byte) -31);

		try {
			var4.c().writeShort(var1);
			var4.c().writeByte(var2);
			var4.c().writeUTF(var3);
		} catch (IOException var5) {
			;
		}

		this.a.a(var4);
	}

	public final void a(int var1, byte var2, String var3, int var4) {
		class_abs var5 = b((byte) -32);

		try {
			var5.c().writeShort(var1);
			var5.c().writeByte(var2);
			var5.c().writeUTF(var3);
			var5.c().writeByte(var4);
		} catch (Exception var6) {
			;
		}

		this.a.a(var5);
	}

	public final void a(int var1, int var2, short var3) {
		class_abs var4 = b((byte) -33);

		try {
			var4.c().writeByte(var1 / 16);
			var4.c().writeByte(var2 / 16);
			var4.c().writeShort(var3);
		} catch (Exception var5) {
			;
		}

		this.a.a(var4);
	}

	public final void r(int var1) {
		class_abs var3 = b((byte) -34);

		try {
			var3.c().writeByte(0);
		} catch (Exception var2) {
			;
		}

		this.a.a(var3);
	}

	public final void s(int var1) {
		class_abs var2 = b((byte) -35);

		try {
			var2.c().writeByte(var1);
		} catch (Exception var3) {
			;
		}

		this.a.a(var2);
	}

	public final void a(int var1, Vector var2) {
		class_abs var3 = b((byte) -36);

		try {
			var3.c().writeByte(var1);
			if (var1 == 1) {
				var3.c().writeByte(var2.size());

				for (var1 = 0; var1 < var2.size(); ++var1) {
					class_dq var4 = (class_dq) var2.elementAt(var1);
					var3.c().writeShort(var4.a);
				}
			}
		} catch (IOException var5) {
			;
		}

		this.a.a(var3);
	}

	public final void a(Vector var1, byte[] var2) {
		class_abs var3 = b((byte) -61);

		try {
			var3.c().writeByte(var1.size());

			int var4;
			for (var4 = 0; var4 < var1.size(); ++var4) {
				class_ql var5 = (class_ql) var1.elementAt(var4);
				var3.c().writeShort(var5.i);
			}

			for (var4 = 0; var4 < var2.length; ++var4) {
				var3.c().writeByte(var2[var4]);
			}
		} catch (IOException var6) {
			;
		}

		this.a.a(var3);
	}

	public final void t(int var1) {
		class_abs var2 = b((byte) -37);

		try {
			var2.c().writeByte(var1);
		} catch (Exception var3) {
			;
		}

		this.a.a(var2);
	}

	public final void f(short var1, byte var2) {
		class_abs var3 = b((byte) -45);

		try {
			var3.c().writeByte(var2);
			var3.c().writeShort(var1);
		} catch (Exception var4) {
			;
		}

		this.a.a(var3);
	}

	public final void d(int var1, int var2, int var3) {
		class_abs var4 = new class_abs((byte) -48);

		try {
			if (var1 == -1) {
				var4.c().writeByte(var1);
				var4.c().writeByte(var2);
				var4.c().writeByte(var3);
			} else {
				var4.c().writeByte(var1);
			}
		} catch (Exception var5) {
			;
		}

		this.a.a(var4);
	}

	public final void i(short var1) {
		class_abs var2 = new class_abs((byte) -49);

		try {
			var2.c().writeByte(var1);
		} catch (Exception var3) {
			var3.printStackTrace();
		}

		this.a.a(var2);
	}

	public final void a(short var1, short var2, byte[][] var3) {
		class_abs var4 = new class_abs((byte) -52);

		try {
			var4.c().writeByte(class_nu.aa);
			var4.c().writeShort(var2);

			for (int var7 = 0; var7 < var1; ++var7) {
				for (int var5 = 0; var5 < var3[var7].length; ++var5) {
					var4.c().writeByte(var3[var7][var5]);
				}
			}
		} catch (Exception var6) {
			var6.printStackTrace();
		}

		this.a.a(var4);
	}

	public final void a(short var1, int var2, int var3, int var4) {
		class_abs var5 = new class_abs((byte) -68);

		try {
			var5.c().writeByte(var2);
			var5.c().writeShort(var1);
			var5.c().writeShort(var3);
			var5.c().writeByte(var4);
		} catch (Exception var6) {
			var6.printStackTrace();
		}

		this.a.a(var5);
	}

	public final void a(int var1, short var2) {
		class_abs var3 = new class_abs((byte) -52);

		try {
			var3.c().writeByte(var1);
			var3.c().writeShort(var2);
		} catch (Exception var4) {
			var4.printStackTrace();
		}

		this.a.a(var3);
	}

	public final void j(short var1) {
		class_abs var2 = new class_abs((byte) -51);

		try {
			var2.c().writeShort(var1);
		} catch (Exception var3) {
			var3.printStackTrace();
		}

		this.a.a(var2);
	}

	public final void m(int var1, int var2) {
		class_abs var3 = new class_abs((byte) -57);

		try {
			var3.c().writeByte(var1);
			var3.c().writeShort(var2);
		} catch (Exception var4) {
			var4.printStackTrace();
		}

		this.a.a(var3);
	}

	public final void u(int var1) {
		class_abs var2 = new class_abs((byte) -57);

		try {
			var2.c().writeByte(-1);
			var2.c().writeShort(var1);
		} catch (Exception var3) {
			var3.printStackTrace();
		}

		this.a.a(var2);
	}

	public final void b(byte var1, byte var2) {
		class_abs var3 = new class_abs((byte) -59);

		try {
			var3.c().writeByte(var1);
			var3.c().writeByte(var2);
		} catch (Exception var4) {
			var4.printStackTrace();
		}

		this.a.a(var3);
	}

	public final void v(int var1) {
		class_abs var2 = new class_abs((byte) 87);

		try {
			var2.c().writeByte(var1);
		} catch (Exception var3) {
			var3.printStackTrace();
		}

		this.a.a(var2);
	}

	public final void e(int var1, int var2, int var3) {
		class_abs var4 = new class_abs((byte) -64);

		try {
			var4.c().writeByte(var1);
			var4.c().writeShort(var2);
			var4.c().writeByte(var3);
		} catch (Exception var5) {
			var5.printStackTrace();
		}

		this.a.a(var4);
	}

	public final void n() {
		class_abs var1 = b((byte) 66);

		try {
			var1.c().writeByte(5);
			this.a.a(var1);
			var1.d();
		} catch (Exception var2) {
			;
		}
	}

	public final void n(int var1, int var2) {
		class_abs var3 = b((byte) -66);

		try {
			var3.c().writeByte(var2);
			var3.c().writeByte(var1);
			this.a.a(var3);
		} catch (Exception var4) {
			;
		}
	}

	public final void c(int var1, byte var2) {
		class_abs var3 = b((byte) -67);

		try {
			var3.c().writeShort(var1);
			var3.c().writeByte(var2);
			this.a.a(var3);
		} catch (Exception var4) {
			;
		}
	}

	public final void a(int var1, Vector var2, int var3, Vector var4, int var5) {
		class_abs var8 = b((byte) -69);

		try {
			var8.c().writeShort(var1);
			var8.c().writeByte(var3);
			var8.c().writeByte(var2.size());

			for (var1 = 0; var1 < var2.size(); ++var1) {
				short var7 = Short.parseShort((String) var2.elementAt(var1));
				var8.c().writeShort(var7);
				var8.c().writeByte(Byte.parseByte((String) var4.elementAt(var1)));
			}

			var8.c().writeByte(-1);
			this.a.a(var8);
		} catch (Exception var6) {
			;
		}
	}

	public final void a(int var1, int var2, int var3, int var4) {
		class_abs var6 = b((byte) 62);

		try {
			var6.c().writeByte(0);
			var6.c().writeShort(var2);
			var6.c().writeInt(var3);
			var6.c().writeInt(var4);
			this.a.a(var6);
		} catch (Exception var5) {
			;
		}
	}

	public final void o(int var1, int var2) {
		class_abs var3 = b((byte) 62);

		try {
			var3.c().writeByte(3);
			var3.c().writeByte(var2);
			var3.c().writeShort(var1);
			this.a.a(var3);
		} catch (Exception var4) {
			;
		}
	}

	public final void f(int var1, int var2, int var3) {
		class_abs var4 = b((byte) 62);

		try {
			var4.c().writeByte(6);
			var4.c().writeByte(var2);
			var4.c().writeShort(var1);
			var4.c().writeInt(var3);
			this.a.a(var4);
		} catch (Exception var5) {
			;
		}
	}

	public final void w(int var1) {
		class_abs var2 = b((byte) 62);

		try {
			var2.c().writeByte(4);
			var2.c().writeByte(var1);
			this.a.a(var2);
		} catch (Exception var3) {
			;
		}
	}

	public final void o() {
		class_abs var1 = b((byte) 62);

		try {
			var1.c().writeByte(5);
			this.a.a(var1);
		} catch (Exception var2) {
			;
		}
	}

	public final void b(int var1, int var2, int var3, int var4, int var5) {
		class_abs var6 = b((byte) 62);

		try {
			var6.c().writeByte(2);
			var6.c().writeByte(var1);
			var6.c().writeByte(var2);
			var6.c().writeByte(var3);
			var6.c().writeByte(var4);
			var6.c().writeByte(var5);
			this.a.a(var6);
		} catch (Exception var7) {
			;
		}
	}

	public final void g(String var1) {
		class_abs var2 = b((byte) 62);

		try {
			var2.c().writeByte(7);
			var2.c().writeUTF(var1);
			this.a.a(var2);
		} catch (Exception var3) {
			;
		}
	}
}
