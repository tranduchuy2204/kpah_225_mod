// Decompiled with: Procyon 0.5.36
// Class Version: 1
package classes;

import java.io.IOException;
import java.util.Random;

import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class class_acv extends Canvas implements Runnable, CommandListener {

	public static class_acv a;
	private static boolean N;
	public static boolean b;
	public static boolean[] c;
	public static boolean[] d;
	public static boolean[] e;
	public static boolean f;
	public static boolean g;
	public static boolean h;
	public static boolean i;
	public static int j;
	public static int k;
	public static int l;
	public static int m;
	public static int n;
	public static int o;
	public static int p;
	private static boolean O;
	public static class_aae q;
	public static boolean r;
	public static class_abj s;
	public static Random t;
	public static class_dp u;
	public static class_xw v;
	public static class_hc w;
	public static class_pp x;
	private static class_we P;
	public static class_gy y;
	public static boolean z;
	public static boolean A;
	public static boolean B;
	public static Image C;
	private static Command Q;
	private static Object R;
	public static int D;
	public static int E;
	public static boolean F;
	public static boolean G;
	public static boolean H;
	public static class_ju I;
	public static class_kj J;
	private static boolean S;
	public static boolean K;
	private int T;
	public static class_s L;
	public static String[] M;
	private static class_pp U;
	private static int V;

	static {
		class_acv.c = new boolean[14];
		class_acv.d = new boolean[14];
		class_acv.e = new boolean[14];
		class_acv.t = new Random(System.currentTimeMillis());
		class_acv.u = new class_dp();
		class_acv.x = new class_pp();
		class_acv.z = false;
		class_acv.B = false;
		class_acv.R = new Object();
		class_acv.G = false;
		class_acv.S = false;
		class_acv.M = new String[] { "t_hang", "t_thanh" };
		class_acv.U = new class_pp();
		class_acv.V = 0;
	}

	public class_acv() {
		class_acv.z = true;
		class_acv.a = this;
		this.T = class_aai.c("loadClearRMS");
		if (this.T == -1) {
			class_aai.a();
			class_aai.a("loadClearRMS", 1);
		}
		this.setFullScreenMode(true);
		System.gc();
		class_acv.O = (this.getKeyCode(8) == -20);
		k();
		new Thread(class_yi.S).start();
		a();
		if (class_acv.A = (System.getProperty("microedition.platform").indexOf("RIM") == 0)) {
			this.setCommandListener(this);
			this.addCommand(class_acv.Q = new Command("Menu", 1, 1));
		}
		class_acv.I = new class_ju();
		if (class_acv.m * class_acv.n >= 70400) {
			class_acv.K = this.hasPointerEvents();
		}
		if (class_acv.m < 200) {
			class_acv.r = true;
		}
		if (class_aai.a(class_acv.M[0]) == null) {
			class_acv.b = true;
		}

	}

	public static Image a() {
		if (class_acv.C == null) {
			try {
				class_acv.C = Image.createImage("/logo.png");
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return class_acv.C;
	}

	public static void b() {
		String obj = "socket://" + class_yv.e[class_yv.a] + ":" + class_yv.f[class_yv.a];
		System.out.println("ket noi " + obj);
		if (class_acv.A) {
			if (class_acv.B) {
				obj = String.valueOf(obj) + ";interface=wifi";
			} else {
				obj = String.valueOf(obj) + ";deviceside=true";
			}
		}
		class_aco.a().a(obj);
	}

	public final void c() {
		class_acv.s = new class_abj();
		class_acv.v = new class_xw();
		class_acv.y = new class_gy();
		class_acv.J = new class_kj();
		class_acv.L = new class_s("", new class_wb(this));
	}

	private static void k() {
		class_acv.m = class_acv.a.getWidth();
		class_acv.n = class_acv.a.getHeight();
	}

	public final void sizeChanged(final int n, final int n2) {
		k();
		if (this.hasPointerEvents()) {
			if (class_bg.bd == null) {
				class_acf.b("/main.sh");
				class_bg.bd = class_acf.a("bpa");
				class_we.b = class_aab.a("ar2", 4, 6);
			}
			class_acv.P = new class_we();
			class_acv.F = false;
		}
		class_acv.o = class_acv.m / 2;
		class_acv.p = class_acv.n / 2;
		if (class_acv.q != null) {
			if (class_acv.q == class_acv.v) {
				class_acv.v.e();
			}
			class_acv.s.e();
			if (class_acv.q == class_nu.a) {
				class_nu.a().e();
			}
			if (class_acv.q == class_na.a) {
				class_na.a().e();
			}
			if (class_acv.q == class_wc.a) {
				class_wc.a().e();
			}
			if (class_acv.q == class_act.a) {
				class_act.a().e();
			}
			if (class_acv.q == class_g.a) {
				class_g.a().e();
			}
			class_acv.q.e();
			class_yi.a();
			if (class_acv.w == class_acv.y) {
				class_acv.y.a();
			}
		}
	}

	public final void d() {
		if (!class_acv.S) {
			new Thread(this).start();
		}
		class_acv.S = true;
	}

	public final void run() {
		class_acv.N = true;
		while (class_acv.N) {
			try {
				final long currentTimeMillis = System.currentTimeMillis();
				if (++class_acv.l > 10000) {
					class_acv.l = 0;
				}
				if (class_acv.G) {
					class_acv.P.a();
				}
				if (class_acv.u.a) {
					class_acv.u.b();
					class_acv.u.d();
				}
				if (class_acv.w != null) {
					class_acv.w.b();
				}
				if (class_acv.q != null) {
					class_acv.q.b();
					if (!class_acv.u.a && class_acv.w == null) {
						class_acv.q.c();
					}
				}
				if (class_acv.V > 0 && --class_acv.V == 0 && class_acv.w == null) {
					class_acv.w = class_acv.U;
				}
				f();
				this.repaint();
				Label_0189: {
					if (class_acv.A) {
						synchronized (class_acv.R) {
							try {
								class_acv.R.wait(1000L);
							} catch (InterruptedException ex) {
								ex.printStackTrace();
							}
//                             monitorexit(class_acv.R)
							break Label_0189;
						}
					}
					this.serviceRepaints();
				}
				final long n = System.currentTimeMillis() - currentTimeMillis;
				try {
					if (n < ModController.globalConfig.gameSpeed) {
						Thread.sleep(ModController.globalConfig.gameSpeed - n);
					} else {
						Thread.sleep(1L);
					}
				} catch (InterruptedException ex3) {
				}
			} catch (Exception ex2) {
				ex2.printStackTrace();
			}
		}
	}

	public final void keyPressed(int var1) {
		try {
			if (AutoClick.getKeyPressed(var1)) {
				return;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (!z) {
			if (O) {
				switch (var1) {
				case -23:
					var1 = -8;
					break;
				case -22:
				case 22:
					var1 = -7;
					break;
				case -21:
				case 21:
					var1 = -6;
					break;
				case -20:
					var1 = -5;
					break;
				case -6:
					var1 = -2;
					break;
				case -5:
					var1 = -4;
					break;
				case -2:
					var1 = -3;
				}
			} else if (A) {
				switch (var1) {
				case -8:
					e[5] = c[5] = true;
					return;
				case 1:
					e[2] = c[2] = true;
					return;
				case 2:
					e[4] = c[4] = true;
					return;
				case 5:
					e[6] = c[6] = true;
					return;
				case 6:
					e[8] = c[8] = true;
					return;
				default:
					if (q == s) {
						switch (var1) {
						case 101:
							e[2] = c[2] = true;
							return;
						case 102:
							e[6] = c[6] = true;
							return;
						case 115:
							e[4] = c[4] = true;
							return;
						case 120:
							e[8] = c[8] = true;
							return;
						}
					}
				}
			}

			if (var1 == 10) {
				var1 = -5;
			}

			if (!q.a(var1)) {
				switch (var1) {
				case -22:
				case -7:
					e[13] = c[13] = true;
					break;
				case -21:
				case -6:
					e[12] = c[12] = true;
					break;
				case -5:
					e[5] = c[5] = true;
					break;
				case 35:
					e[11] = c[11] = true;
					break;
				case 42:
					e[10] = c[10] = true;
					break;
				case 48:
				case 49:
				case 50:
				case 51:
				case 52:
				case 53:
				case 54:
				case 55:
				case 56:
				case 57:
					if (w == null && q == s && !A && (!G || !class_we.a)) {
						e[var1 - 48] = true;
						c[var1 - 48] = true;
					}
					break;
				default:
					if (var1 < 65 || var1 > 122) {
						switch (this.getGameAction(var1)) {
						case 1:
							e[2] = c[2] = true;
							break;
						case 2:
							e[4] = c[4] = true;
						case 3:
						case 4:
						case 7:
						default:
							break;
						case 5:
							e[6] = c[6] = true;
							break;
						case 6:
							e[8] = c[8] = true;
							break;
						case 8:
							e[5] = c[5] = true;
						}
					}
				}
			}

			if (w != null) {
				w.a(var1);
			}
		}
	}

	public final void keyReleased(int var1) {
		if (!z) {
			if (O) {
				switch (var1) {
				case -23:
					var1 = -8;
					break;
				case -22:
				case 22:
					var1 = -7;
					break;
				case -21:
				case 21:
					var1 = -6;
					break;
				case -20:
					var1 = -5;
					break;
				case -6:
					var1 = -2;
					break;
				case -5:
					var1 = -4;
					break;
				case -2:
					var1 = -3;
				}
			} else if (A) {
				if (var1 == 27) {
					var1 = -7;
				}

				if (q == s) {
					switch (var1) {
					case 101:
						e[2] = c[2] = false;
						d[2] = true;
						return;
					case 102:
						e[6] = c[6] = false;
						d[6] = true;
						return;
					case 115:
						e[4] = c[4] = false;
						d[4] = true;
						return;
					case 120:
						e[8] = c[8] = false;
						d[8] = true;
						return;
					}
				}
			}

			switch (var1) {
			case -22:
			case -7:
				e[13] = false;
				d[13] = true;
				return;
			case -21:
			case -6:
				e[12] = false;
				d[12] = true;
				return;
			case -5:
			case 10:
				e[5] = false;
				d[5] = true;
				return;
			case 35:
				e[11] = false;
				d[11] = true;
				return;
			case 42:
				e[10] = false;
				d[10] = true;
				return;
			case 48:
			case 49:
			case 50:
			case 51:
			case 52:
			case 53:
			case 54:
			case 55:
			case 56:
			case 57:
				e[var1 - 48] = false;
				d[var1 - 48] = true;
				return;
			default:
				switch (this.getGameAction(var1)) {
				case 1:
					e[2] = false;
					d[2] = true;
					return;
				case 2:
					e[4] = false;
					d[4] = true;
					return;
				case 5:
					e[6] = false;
					d[6] = true;
					return;
				case 6:
					e[8] = false;
					d[8] = true;
					return;
				case 8:
					e[5] = false;
					d[5] = true;
				case 3:
				case 4:
				case 7:
				default:
				}
			}
		}

	}

	protected void keyRepeated(int keyCode) {
		try {
			AutoClick.getKeyRepeated(keyCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		super.keyRepeated(keyCode);
	}

	protected final void pointerDragged(final int j, final int k) {
		class_acv.j = j;
		class_acv.k = k;
	}

	protected final void pointerPressed(final int n, final int n2) {
		class_acv.f = true;
		class_acv.h = true;
		class_acv.j = n;
		class_acv.k = n2;
		class_acv.E = n;
		class_acv.D = n2;
	}

	protected final void pointerReleased(final int j, final int k) {
		class_acv.f = false;
		class_acv.g = true;
		class_acv.H = true;
		class_acv.h = false;
		class_acv.i = true;
		class_acv.j = j;
		class_acv.k = k;
	}

	public static void e() {
		for (int i = 0; i < 14; ++i) {
			class_acv.e[i] = false;
		}
	}

	public static void f() {
		class_acv.g = false;
		class_acv.H = false;
		class_acv.i = false;
		for (int i = 0; i < 14; ++i) {
			class_acv.c[i] = false;
		}
	}

	public static void a(final Graphics graphics) {
		graphics.translate(-graphics.getTranslateX(), -graphics.getTranslateY());
		graphics.setClip(0, 0, class_acv.m, class_acv.n);
	}

	protected final void paint(final Graphics graphics) {
		try {
			if (class_acv.q != null) {
				class_acv.q.a(graphics);
			}
			if (class_acv.w != null) {
				class_acv.w.a(graphics);
			}
			if (class_acv.u.a) {
				class_acv.u.b(graphics);
			}
			if (class_acv.z) {
				a(graphics);
				graphics.setColor(0);
				graphics.fillRect(0, 0, this.getWidth(), this.getHeight());
				graphics.drawImage(class_acv.C, this.getWidth() >> 1, this.getHeight() >> 1, 3);
			}
			if (class_acv.G) {
				class_acv.P.a(graphics);
			}
			if (class_acv.A) {
				synchronized (class_acv.R) {
					class_acv.R.notify();
				}
				// monitorexit(class_acv.R)
			}
			class_abj.c(graphics);
		} catch (Exception ex) {
		}
		a(graphics);
	}

	public static int a(final int n) {
		if (n > 0) {
			return n;
		}
		return -n;
	}

	public static void g() {
		class_acv.w = null;
	}

	public static void a(final String s, final String[] array, final IAction IAction, final IAction IAction2) {
		class_acv.x.a = false;
		class_acv.x.a(s, array, new class_s("Có", IAction), new class_s("", IAction), new class_s("Không", IAction2));
		class_acv.w = class_acv.x;
	}

	public static void a(final String s, final boolean a) {
		class_acv.x.a = a;
		class_acv.x.a(s, new class_s("OK", new class_wf()), null, null);
		class_acv.w = class_acv.x;
	}

	public static void a(String[] array) {
		array = array;
		class_acv.x.a = false;
		class_acv.x.a(array, new class_s("OK", new class_wd()), null, null);
		class_acv.w = class_acv.x;
	}

	public static void a(final String s) {
		a(s, false);
	}

	public static void a(final String s, final IAction IAction, final IAction IAction2) {
		class_acv.x.a = false;
		class_acv.x.a(s, new class_s("Có", IAction), new class_s("", IAction), new class_s("Không", IAction2));
		class_acv.w = class_acv.x;
	}

	public static void b(final String s, final boolean a) {
		class_acv.x.a = a;
		class_acv.x.a(s, null, new class_s("Cancel", new class_wh()), null);
		class_acv.w = class_acv.x;
	}

	public static void h() {
		class_acv.x.a = false;
		class_acv.x.a("Xin chờ...", null, new class_s("Cancel", new class_wg()), null);
		class_acv.w = class_acv.x;
	}

	public static void a(final String s, final boolean b, final int v) {
		class_acv.U.a = false;
		class_acv.U.a(s, null, new class_s("OK", new class_wj()), null);
		class_acv.V = v;
	}

	public static void a(final String s, final IAction IAction) {
		class_acv.x.a = false;
		class_acv.x.a(s, null, new class_s("OK", IAction), null);
		class_acv.w = class_acv.x;
	}

	public static void b(final String s, final IAction IAction) {
		class_acv.x.a = false;
		class_acv.x.a(s, new class_s("Có", IAction), new class_s("", IAction), new class_s("Không", new class_wi()));
		class_acv.w = class_acv.x;
	}

	public static boolean b(final int n) {
		if (class_acv.c[n]) {
			class_acv.c[n] = false;
			return true;
		}
		return false;
	}

	public static String a(long l) {
		String str = "";
		final long n = l / 1000L + 1L;
		for (int n2 = 0; n2 < n; ++n2) {
			if (l < 1000L) {
				str = String.valueOf(l) + str;
				break;
			}
			final long lng;
			if ((lng = l % 1000L) == 0L) {
				str = ".000" + str;
			} else if (lng < 10L) {
				str = ".00" + lng + str;
			} else if (lng < 100L) {
				str = ".0" + lng + str;
			} else {
				str = "." + lng + str;
			}
			l /= 1000L;
		}
		return str;
	}

	public static int i() {
		if (a(0, class_acv.n - (class_aae.c << 1), 50, class_aae.c << 1)) {
			return 0;
		}
		if (a(class_acv.o - 25, class_acv.n - (class_aae.c << 1), 50, class_aae.c << 1)) {
			return 1;
		}
		if (a(class_acv.m - 50, class_acv.n - (class_aae.c << 1), 50, class_aae.c << 1)) {
			return 2;
		}
		return -1;
	}

	public static boolean a(final int n, final int n2, final int n3, final int n4) {
		return (class_acv.f || class_acv.g)
				&& (class_acv.j >= n && class_acv.j <= n + n3 && class_acv.k >= n2 && class_acv.k <= n2 + n4);
	}

	public static String a(final long n, final int n2) {
		String obj = "";
		if (n > 0L) {
			obj = String.valueOf(obj) + a(n) + "Xu";
		}
		if (n2 > 0) {
			if (n > 0L) {
				obj = String.valueOf(obj) + " - ";
			}
			obj = String.valueOf(obj) + a((long) n2) + "Luong";
		}
		return obj;
	}

	public final void commandAction(final Command command, final Displayable displayable) {
		if (command == class_acv.Q) {
			class_acv.c[12] = true;
		}
	}

	public static boolean b(final int n, final int n2, final int n3, final int n4) {
		return (class_acv.h || class_acv.i)
				&& (class_acv.j >= n && class_acv.j <= n + n3 && class_acv.k >= n2 && class_acv.k <= n2 + n4);
	}

	public static int a(final int n, final int n2) {
		return n + class_acv.t.nextInt(n2 - n);
	}

	public static boolean j() {
		return Math.abs(class_acv.j - class_acv.E) < 10 && Math.abs(class_acv.k - class_acv.D) < 10;
	}
}
