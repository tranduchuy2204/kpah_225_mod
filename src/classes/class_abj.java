package classes;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Random;
import java.util.Vector;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class class_abj extends class_aae {

	public static String a = "";
	public int b;
	public int e;
	private int bf;
	private int bg;
	public int f;
	public int g;
	private int[] bh = new int[] { -1, 2, 1, -2 };
	private int[] bi = new int[] { -3, 2, -1, 1 };
	private int bj = -1;
	public static int h;
	public static int i;
	private static int bk;
	private static int bl;
	private static int bm;
	private static int bn;
	public static int j;
	public static int k;
	private static int bo;
	private static int bp;
	private static boolean bq;
	private static boolean br;
	public Vector l = new Vector();
	public Vector m = new Vector();
	public static Vector n = new Vector();
	public Vector o = new Vector();
	public int p = 0;
	public class_sc q = new class_sc();
	public class_vh r;
	public boolean s = true;
	public boolean t;
	public boolean u = false;
	public static boolean v;
	public Vector w = new Vector();
	public static Vector x = new Vector();
	public MoveObj y;
	public int z;
	public static int A;
	public static int B;
	private static int bs;
	private static int bt;
	public static Vector C = new Vector();
	public class_go D;
	private String[] bu;
	private int[] bv;
	private int[] bw;
	private int[] bx;
	private int[] by;
	private int[] bz;
	private int[] bA;
	public short E;
	public boolean F;
	private boolean bB;
	public class_bz G;
	private Vector bC;
	public static int H = -1;
	public short I;
	public short J;
	private int bD;
	public short K;
	public static byte L = -1;
	public static MoveObj M;
	public boolean N;
	private String[] bE;
	public static Image O;
	public static Image P;
	public static Image[] Q;
	public static Image R;
	public static Image S;
	public MoveObj T;
	private int bF;
	private int bG;
	private static Vector bH = new Vector();
	public int U;
	private static long bI = -1L;
	public static int V = 0;
	private static int bJ = 0;
	public static int W = -1;
	public static int X = 0;
	private static class_vh bK;
	public static class_vh Y;
	public static byte Z;
	public static byte aa;
	public static byte ab;
	public static byte ac;
	public static int[] ad;
	public static int[] ae;
	public static short[] af;
	public static Image[] ag;
	public static String[] ah;
	public static String[] ai;
	private static boolean bL = false;
	private static boolean bM = false;
	private static boolean bN = false;
	public static Vector aj = new Vector();
	public static Vector ak;
	public static Vector al = new Vector();
	public static Vector am = new Vector();
	private static class_uv[] bO = new class_uv[1];
	static String[] an = new String[] { "Thanh Long", "Hắc Hổ" };
	public static byte ao = 0;
	static Random ap = new Random(System.currentTimeMillis());
	private int bP;
	private int bQ;
	private MoveObj bR;
	public static int aq;
	public static int ar;
	private MoveObj[] bS;
	private long bT;
	private int bU;
	private int[] bV;
	private int[] bW;
	private static long bX;
	public static short as = 250;
	private int[] bY;
	private int bZ;
	private int ca;
	private static int[][] cb = new int[][] { { -90, 90, -90, 90 }, { -90, 90, -90, 90 }, { -90, 90, -90, 90 },
			{ -90, 90, -90, 90 } };
	private Vector cc;
	private byte cd;
	private short ce;
	private short cf;
	public static long at;
	private int[] cg;
	public static boolean au;
	public static boolean av;
	private static boolean ch;
	private static boolean ci;
	private static boolean cj;
	public static boolean aw;
	private boolean ck;
	public static long ax;
	public static class_do ay;
	private int cl;
	private long cm;
	public static int az;
	private byte[] cn;
	private byte[] co;
	public static boolean aA;
	private int[] cp;
	private boolean cq;
	public static int aB;
	private int cr;
	private int[] cs;
	private static int[] ct;
	public class_oc aC;
	public static byte aD;
	public static byte aE;
	public static byte aF;
	private static int[] cu;
	public short aG;
	public boolean aH;
	public static short[] aI;
	public static short[][] aJ;
	private static short[] cv;
	public static int cw;
	public short aK;
	public short aL;
	public short aM;
	public short aN;
	private static int cx;
	public static int aO;
	private Vector cy;
	private Vector cz;
	private Vector cA;
	public static int aP;
	private static int cB;
	private static int cC;
	private static int cD;
	private static int cE;
	private static int cF;
	private static int cG;
	private static int cH;
	private static int cI;
	public MoveObj cJ;
	private class_aap cK;
	public static byte[][] aQ;
	public static byte aR;
	public static byte aS;
	private static boolean cL;
	private int cM;
	private Vector cN;
	private Vector cO;
	public class_f[] aT;
	public class_f[] aU;
	private static class_p cP;
	private Vector cQ;
	private Vector cR;
	public static class_do aV;
	public static class_do aW;
	public static class_do aX;
	private static Vector cS;
	private static Vector cT;
	public static byte[][] aY;
	public static int[][] aZ;

	static {
		byte[][] var10000 = new byte[][] { { 0, 0, -48, 48 }, { 0, 0, -32, 32 }, { 0, 0, -16, 16 }, new byte[4] };
		var10000 = new byte[][] { { 48, -48, 0, 0 }, { 32, -32, 0, 0 }, { 16, -16, 0, 0 }, new byte[4] };
		at = System.currentTimeMillis();
		au = false;
		ay = null;
		az = 50;
		aA = false;
		ct = new int[] { 6898216, 11897430, 14469298 };
		aE = 0;
		aF = 1;
		cu = new int[] { 3158321, 88080384, 2122, 2037000, 256 };
		cv = new short[] { 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 102, 103, 104, 108, 109, 260, 261, 262, 263,
				264, 265, 266, 267, 268, 269, 270, 271, 29, 30, 31, 30, 31, 72, 73, 74, 78, 79, 82, 83, 84, 88, 89 };
		cw = -1;
		cx = 0;
		aO = 1;
		aP = 1000;
		cS = new Vector();
		cT = new Vector();
		aY = new byte[2][];
		aZ = new int[2][];
	}

	public final void d() {
		class_acv.e[2] = false;
		super.d();
		this.e();
	}

	public final void a(class_kk var1) {
		if (this.bC.size() > 50) {
			this.bC.removeElementAt(0);
			this.bF -= 18;
			this.bG -= 18;
		}

		this.bC.addElement(var1);
		this.bG += 18;
	}

	private void v() {
		this.bv = new int[15];
		this.bw = new int[15];
		this.bx = new int[15];
		this.by = new int[15];
		this.bz = new int[15];
		this.bA = new int[15];
		this.bu = new String[15];

		for (int var1 = 0; var1 < 15; ++var1) {
			this.bz[var1] = -1;
		}

	}

	public final void a(String var1, int var2, int var3, int var4, int var5, int var6) {
		try {
			boolean var7 = false;
			if (Integer.parseInt(var1.substring(1)) == 2000000) {
				return;
			}
		} catch (Exception var9) {
		}

		int var10 = -1;

		for (int var8 = 0; var8 < 15; ++var8) {
			if (this.bz[var8] == -1) {
				var10 = var8;
				break;
			}
		}

		if (var10 != -1) {
			this.bu[var10] = var1.toLowerCase();
			this.bv[var10] = var3;
			this.bw[var10] = var4;
			this.bx[var10] = var5 * (ap.nextInt(2) == 1 ? -1 : 1);
			this.by[var10] = var6;
			this.bz[var10] = 0;
			this.bA[var10] = var2;
		}
	}

	private void w() {
		for (int var1 = 0; var1 < 15; ++var1) {
			if (this.bz[var1] != -1) {
				int[] var10000 = this.bz;
				var10000[var1] += class_yg.d(this.by[var1]);
				if (this.bz[var1] > 30) {
					this.bz[var1] = -1;
				}

				var10000 = this.bv;
				var10000[var1] += this.bx[var1];
				var10000 = this.bw;
				var10000[var1] += this.by[var1];
			}
		}

	}

	public final void e() {
		this.G.a = 2;
		this.G.b = class_acv.n - 40;
		this.G.c = class_acv.m - 4;
		if (this.bS == null) {
			this.bS = new MoveObj[5];

			for (int var1 = 0; var1 < 5; ++var1) {
				this.bS[var1] = new MoveObj();
			}
		}

		this.bS[0].posX = class_acv.o - 47;
		this.bS[0].posY = class_acv.n - 19;
		this.bS[1].posX = class_acv.o - 28;
		this.bS[1].posY = class_acv.n - 19;
		this.bS[2].posX = class_acv.o - 8;
		this.bS[2].posY = class_acv.n - 20;
		this.bS[3].posX = class_acv.o + 12;
		this.bS[3].posY = class_acv.n - 19;
		this.bS[4].posX = class_acv.o + 31;
		this.bS[4].posY = class_acv.n - 19;
		this.a();
		this.f();
	}

	public class_abj() {
		new Vector();
		this.D = class_go.a();
		this.E = -1;
		this.F = false;
		this.G = new class_bz();
		this.bC = new Vector();
		this.I = 1;
		this.J = -1;
		this.bD = -1;
		this.K = 5;
		this.N = false;
		this.bE = null;
		this.bF = 0;
		this.bG = -18;
		this.U = -1;
		this.bU = 10;
		this.bV = new int[] { 0, 0, -20, 20 };
		this.bW = new int[] { 20, -20, 0, 0 };
		this.bY = new int[] { 4, 0, -4 };
		this.ca = 0;
		this.cc = new Vector();
		this.cd = 0;
		this.ce = 0;
		this.cf = 0;
		this.cg = new int[] { 1, 3, 5, 7, 9 };
		this.cl = 1;
		System.currentTimeMillis();
		this.cm = 0L;
		this.cn = new byte[] { 0, 0, -17, 17 };
		this.co = new byte[] { 17, -17, 0, 0 };
		this.cp = new int[] { 0, 0, 0, 1, 0, 2, 0, 3, 0, 4 };
		this.cq = false;
		this.cs = new int[] { 16520709, 16499718, 396543, 1101907 };
		this.aC = null;
		this.aG = -1;
		this.aK = 0;
		this.aL = 0;
		this.aM = 0;
		this.aN = 0;
		this.cy = new Vector();
		this.cz = new Vector();
		this.cA = new Vector();
		this.cK = new class_aap();
		this.cN = new Vector();
		this.cQ = new Vector();
		this.cR = new Vector();
		this.G = new class_bz();
		this.G.d = class_aae.d + 2;
		this.G.e = true;
		this.G.b(80);
		this.e();
		this.bB = false;
		this.v();
		this.a();
		this.bP = 45;
		this.bQ = 50;
		if (this.bQ < 30) {
			this.bQ = 30;
		}

		super.ba = new class_s("", new class_cc(this));
		super.bc = new class_s("", new class_cb(this));
		this.ca = class_acv.m - 20;
	}

	public final void a() {
		if (class_ls.i != null) {
			if ((ar = class_acv.n / 5) > 100) {
				ar = 100;
			}

			this.bR = new MoveObj(class_acv.o + 50, class_acv.n - class_aae.c - ar);
			if ((aq = class_acv.m - this.bR.posX - 1) > 100) {
				aq = 100;
			}

			if (class_ls.i != null) {
				if (aq > class_ls.i.getWidth()) {
					aq = class_ls.i.getWidth();
				}

				if (ar > class_ls.i.getHeight()) {
					ar = class_ls.i.getHeight();
				}
			}

			this.bR.posX = class_acv.m - aq - 1;
			this.bR.posY = class_acv.n - class_aae.c - ar;
		}
	}

	public final void f() {
		A = class_acv.m;
		B = class_acv.n;
		bs = A >> 1;
		bt = B >> 1;
		this.bf = (A >> 4) + 2;
		this.bg = (B >> 4) + 2;
		if (A % 24 != 0) {
			++this.bf;
		}

		bo = (class_ls.a << 4) - A;
		bp = (class_ls.b << 4) - B;
		if (this.q != null) {
			j = h = this.q.cK - bs;
			k = i = this.q.cL - bt;
		}

		if (j < 0) {
			j = 0;
		}

		if (j > bo) {
			j = bo;
		}

		if (k < 0) {
			k = 0;
		}

		if (k > bp) {
			k = bp;
		}

		this.b = (j >> 4) - 1;
		if (this.b < 0) {
			this.b = 0;
		}

		this.e = k >> 4;
		this.f = this.b + this.bf;
		this.g = this.e + this.bg;
		if (this.e < 0) {
			this.e = 0;
		}

		if (this.g > class_ls.b - 1) {
			this.g = class_ls.b - 1;
		}

		br = false;
		bq = false;
		if (class_ls.c < A + 32) {
			bq = true;
			j = -(A - class_ls.c) >> 1;
		}

		if (class_ls.d < B) {
			br = true;
			k = -(B - class_ls.d) >> 1;
		}

	}

	public final void g() {
		if (j != h && !bq) {
			bk = h - j << 2;
			bm += bk;
			j += bm >> 4;
			bm &= 15;
			if (j < 0) {
				j = 0;
			}

			if (j > bo) {
				j = bo;
			}
		}

		if (k != i && !br) {
			bl = i - k << 2;
			bn += bl;
			k += bn >> 4;
			bn &= 15;
			if (k < 0) {
				k = 0;
			}

			if (k > bp) {
				k = bp;
			}
		}

		if (this.bj >= 0) {
			j += this.bh[this.bj];
			k += this.bi[this.bj];
			++this.bj;
			if (this.bj == 4) {
				this.bj = -1;
			}

			if (j < 0) {
				j = 0;
			}

			if (j > bo) {
				j = bo;
			}

			if (k < 0) {
				k = 0;
			}

			if (k > bp) {
				k = bp;
			}
		}

		this.b = (j >> 4) - 1;
		if (this.b < 0) {
			this.b = 0;
		}

		this.e = k >> 4;
		this.f = this.b + this.bf;
		if (this.f > class_ls.a) {
			this.f = class_ls.a;
		}

		if (this.g > class_ls.b) {
			this.g = class_ls.b;
		}

		this.g = this.e + this.bg;
		if (this.e < 0) {
			this.e = 0;
		}

		if (this.g > class_ls.b - 1) {
			this.g = class_ls.b - 1;
		}

	}

	public final void b() {
		int var1;
		class_gw var2;
		for (var1 = 0; var1 < this.cR.size(); ++var1) {
			if ((var2 = (class_gw) this.cR.elementAt(var1)) != null) {
				var2.a();
				if (var2.b) {
					this.cR.removeElementAt(var1);
				}
			}
		}

		class_abj var3 = this;

		for (var1 = 0; var1 < var3.cQ.size(); ++var1) {
			class_ht var5;
			if ((var5 = (class_ht) var3.cQ.elementAt(var1)) != null) {
				var5.a();
				if (var5.b) {
					var3.cQ.removeElement(var5);
				}
			}
		}

		if (--aB < 0) {
			aB = 0;
		}

		var1 = bH.size();

		int var6;
		for (var6 = 0; var6 < var1; ++var6) {
			((class_di) bH.elementAt(var6)).a();
			if (((class_di) bH.elementAt(var6)).j) {
				bH.removeElementAt(var6);
			}
		}

		if (this.aC != null) {
			class_oc var8;
			if ((var8 = this.aC).a + class_d.j[0].a(var8.e) + 10 < 0) {
				var8.c -= 2;
			}

			if (var8.c < -18) {
				var8.d = true;
			}

			var8.a -= 2;
			if (this.aC.d) {
				this.aC = null;
			}
		}

		if (cP != null) {
			cP.a();
			if (cP.a) {
				cP = null;
				bK = null;
			}
		}

		if (this.cK != null) {
			class_aap var9 = this.cK;
			if (class_acv.l % 2 == 0) {
				--var9.c;
				if (var9.c < 0) {
					var9.c = 8;
				}
			}
		}

		this.g();
		h = this.q.cK - bs + this.bV[this.q.D];
		i = this.q.cL - bt + this.bW[this.q.D] - 20;
		if (class_ls.a >= aq || class_ls.b >= ar) {
			if (cC != cB) {
				cE = cB - cC << 2;
				cD += cE;
				cC += cD >> 4;
				cD &= 15;
			}

			if (cG != cF) {
				cI = cF - cG << 2;
				cH += cI;
				cG += cH >> 4;
				cH &= 15;
			}
		}

		for (var6 = n.size() - 1; var6 >= 0; --var6) {
			class_acd var7;
			(var7 = (class_acd) n.elementAt(var6)).a();
			if (var7.a) {
				n.removeElementAt(var6);
			}
		}

		for (var6 = this.o.size() - 1; var6 >= 0; --var6) {
			((class_acd) this.o.elementAt(var6)).a();
		}

		for (var1 = this.m.size() - 1; var1 >= 0; --var1) {
			class_vh var14;
			if ((var14 = (class_vh) this.m.elementAt(var1)) != null && var14.cU == 1) {
				var14.a();
			}
		}

		cT.removeAllElements();
		Vector var10 = new Vector();

		class_vh var11;
		for (var6 = this.l.size() - 1; var6 >= 0; --var6) {
			if ((var11 = (class_vh) this.l.elementAt(var6)).d_()) {
				this.b(var11);
			}

			if (var11.q() && var11.cE) {
				var10.addElement(var11);
			}

			if (var11.cF != 2 && var11.cF != 10 && var11.cF != 11 && var11.cF != 12) {
				var11.a();
				if (!class_yg.a(var11, this.q) && var11 != Y && var11.cF != 127 && var11.cF != 0 && var11.dd == -1) {
					var11.cE = true;
				}

				if (var11.cE && var11.dd == -1) {
					if (this.r == var11) {
						this.r = null;
					}

					if (!bL && !bM && !bN && var11.cF != 100) {
						if (var11.cF == 0) {
							var11.dc = true;
						}

						var10.addElement(var11);
					}
				}
			} else {
				var11.a();
			}
		}

		if (Y != null) {
			Y.a();
		}

		class_yg.a(this.l);
		if (class_acv.l % 10 == 0) {
			this.r = this.z();
		}

		if (this.r != null && this.r.cF == 100) {
			this.r = null;
		}

		class_abm.a.a();
		class_abm.b.a();
		this.w();
		if (this.bU > 0) {
			--this.bU;
			if (this.bU == 0) {
				this.bT = System.currentTimeMillis();
				this.D.d();
			}
		}

		if (this.F) {
			this.G.d();
		}

		if (this.U != -1 && bI != -1L && System.currentTimeMillis() > bI) {
			this.U = -1;
			bI = -1L;
		}

		if (bJ > 0 && (bJ -= class_yi.P / 10) < 0) {
			bJ = 0;
		}

		if ((class_ls.a >= aq || class_ls.b >= ar) && System.currentTimeMillis() / 100L > 20L) {
			cF = this.q.cK / 16;
			cB = this.q.cL / 16;
			if (cF > class_ls.a - aq / 2) {
				cF = class_ls.a - aq;
			} else if (cF < aq / 2) {
				cF = 0;
			} else {
				cF -= aq / 2;
			}

			if (cB < ar / 2) {
				cB = 0;
			} else {
				cB -= ar / 2;
			}

			if (cB > class_ls.b - ar) {
				cB = class_ls.b - ar;
			}
		}

		try {
			if (this.T != null && X == 2) {
				this.D();
				class_acv.g();
			}
		} catch (Exception var4) {
			this.q.s = null;
			this.q.r = 0;
		}

		int var13;
		if (aj.size() > 0) {
			class_kl.b();
			var2 = null;

			for (var13 = 0; var13 < aj.size(); ++var13) {
				((class_kl) aj.elementAt(var13)).a();
			}
		}

		if (ak != null) {
			for (var6 = 0; var6 < ak.size(); ++var6) {
				((class_abk) ak.elementAt(var6)).a();
			}
		}

		for (var6 = 0; var6 < var10.size(); ++var6) {
			this.l.removeElement(var10.elementAt(var6));
		}

		if (this.cO != null && this.cO.size() > 0) {
			this.ca -= 4;
			String var12 = (String) this.cO.elementAt(0);
			if (this.ca + class_d.h.a(var12) < 0) {
				this.cO.removeElementAt(0);
				this.ca = class_acv.m - 20;
			}
		}

		x();
		y();
		if (this.aT != null) {
			for (var6 = 0; var6 < 1; ++var6) {
				if (this.aT[0].a > 0) {
					class_f var15 = this.aT[0];
					if (System.currentTimeMillis() / 1000L - (long) var15.b >= (long) var15.a) {
						var15.a = 0;
					}
				}
			}
		}

		if (this.z > 0) {
			--this.z;
		} else {
			this.z = 0;
		}

		if (class_ls.m && this.aG == 29) {
			if (this.q.cK >= this.aK - 16 && this.q.cK <= this.aM + 40 && this.q.cL >= this.aL - 16
					&& this.q.cL <= this.aN + 40) {
				this.r = this.a((class_ap) this.q);
			} else {
				var6 = this.l.size();
				var3 = null;

				for (var1 = 0; var1 < var6; ++var1) {
					if ((var11 = (class_vh) this.l.elementAt(var1)).cF == 10) {
						var11.cX = false;
					}
				}
			}
		}

		if (al.size() > 0) {
			((class_ck) al.elementAt(0)).a();
		}

		if (am.size() > 30) {
			am.removeElementAt(0);
		}

		if (this.q.cV != 3 && au && class_acv.q instanceof class_abj && class_acv.w != null && !this.q.dc
				&& class_ls.j != 0 && class_ls.j != 201 && class_ls.j != 70 && class_ls.j != 80) {
			class_acv.w = null;
		}

		if (!au) {
			this.ck = false;
		} else if (bX - System.currentTimeMillis() / 1000L <= 0L) {
			this.b((int) this.q.cK, (int) this.q.cL);
			bX = System.currentTimeMillis() / 1000L + 10L;
		}

		if (class_ls.j == 0 || class_ls.j == 70 || class_ls.j == 80) {
			au = false;
		}

		if (class_acv.l % 200 == 0) {
			class_hw.E();
		}

		if (cL) {
			cL = false;
			this.q.av = this.q.cK;
			this.q.aw = this.q.cL;
			this.q.p = this.q.cK;
			this.q.q = this.q.cL;
			++this.bZ;
			if (this.bZ > this.bY.length - 1) {
				this.bZ = 0;
			}

			var6 = class_ls.a / 2 + this.bY[this.bZ];
			var13 = class_ls.b / 2 + this.bY[this.bZ];
			this.q.s = this.b(this.q.cK / 16, this.q.cL / 16, var6, var13);
			this.q.r = 0;
			X = this.cM;
		}

	}

	private class_vh a(class_ap var1) {
		class_vh var2 = null;
		if (class_ls.m) {
			for (int var3 = 0; var3 < this.l.size(); ++var3) {
				class_vh var4;
				if ((var4 = (class_vh) this.l.elementAt(var3)).cF == 10) {
					if (var1.cK >= var4.cK + 2 && var1.cK <= var4.cK + 30 && var1.cL >= var4.cL
							&& var1.cL + 2 <= var4.cL + 30) {
						var4.cX = true;
						var2 = var4;
					} else {
						var4.cX = false;
					}
				}
			}
		}

		return var2;
	}

	private static void x() {
		Enumeration var0 = class_ko.c.keys();

		while (var0.hasMoreElements()) {
			String var1 = (String) var0.nextElement();
			class_dh var2;
			if (!(var2 = (class_dh) class_ko.c.get(var1)).c
					&& System.currentTimeMillis() / 1000L - (long) var2.b > 120L) {
				class_ko.c.remove(var1);
			}
		}

	}

	public static void a(byte[] var0, byte var1, byte var2) {
		class_br var4;
		if ((var4 = (class_br) ((Hashtable) class_yi.U.elementAt(var1)).get(String.valueOf(var2))) != null) {
			var4.a(var0, var1);
		}

	}

	private static void y() {
		for (int var0 = class_yi.U.size() - 1; var0 >= 0; --var0) {
			Hashtable var1;
			Enumeration var2 = (var1 = (Hashtable) class_yi.U.elementAt(var0)).keys();

			while (var2.hasMoreElements()) {
				String var3 = (String) var2.nextElement();
				class_br var4 = (class_br) var1.get(var3);
				if (System.currentTimeMillis() / 1000L - (long) var4.a > 60L) {
					var1.remove(var3);
				}
			}
		}

	}

	private class_vh z() {
		int var1 = this.q.cK + cb[this.q.D][0];
		int var2 = this.q.cK + cb[this.q.D][1];
		int var3 = this.q.cL + cb[this.q.D][2];
		int var4 = this.q.cL + cb[this.q.D][3];
		int var5 = 10000;
		int var6 = -1;
		this.cc.removeAllElements();
		int var7 = this.l.size();
		class_vh var8 = null;

		int var9;
		for (var9 = 0; var9 < var7; ++var9) {
			if ((var8 = (class_vh) this.l.elementAt(var9)).cK > var1 && var8.cK < var2 && var8.cL > var3
					&& var8.cL < var4) {
				if (var8.cF != 127 && var8.dj && (var8.cF != 0 || var8.cG != this.q.cG) && var8.cF != 10
						&& var8.cF != 11 && var8.cF != 12
						&& (!au || class_acv.I.h || class_ls.j == 0 || class_ls.j == 201 || class_ls.j == 70
								|| class_ls.j == 80 || class_ls.m
								|| !var8.e_() && var8.cF != 126 && var8.cF != 2 && var8.cF != 0)) {
					if ((var8.cF != 1 || var8.cV != 8) && (!au || var8.cV != 3 && !var8.b_())) {
						if (ao == 1) {
							boolean var10 = false;
							if (var8.cF == 0 && (!var8.cY || var8.d_()) || var8.cF != 1 && var8.cF == 0 && !var8.cY) {
								continue;
							}
						} else if (ao == 2) {
							if (!var8.d_()) {
								continue;
							}
						} else if (ao == 3) {
							if (var8.cF == 0 && var8.cH == this.q.cH || var8.d_()) {
								continue;
							}
						} else if (ao == 4 && (var8.cF == 0 && var8.cS == this.q.cS || var8.d_())) {
							continue;
						}

						this.cc.addElement(var8);
						int var11 = class_yg.d(this.q.cK - var8.cK) + class_yg.d(this.q.cL - var8.cL);
						if (var8.cF == 3 || var8.cF == 4) {
							var11 <<= 1;
						}

						if (var11 < var5) {
							var5 = var11;
							var6 = var9;
						}
					}
				} else if ((au || aw) && var8.cF == 2) {
					a((class_vh) this.q, (String) "Bạn hãy tắt auto trước khi focus", 100);
				}
			}
		}

		if (var6 == -1) {
			return null;
		} else {
			if (au && class_acv.I.h) {
				for (var9 = 0; var9 < this.cc.size(); ++var9) {
					class_vh var12;
					if ((var12 = (class_vh) this.cc.elementAt(var9)) != null && var12.cY) {
						return var12;
					}
				}
			}

			if (this.r == null && var6 < this.l.size()) {
				return (class_vh) this.l.elementAt(var6);
			} else if (!class_acv.a.hasPointerEvents() && var6 < this.l.size()) {
				if (this.cc.contains(this.r)) {
					return this.r;
				} else {
					return (class_vh) this.l.elementAt(var6);
				}
			} else {
				if (class_yg.a(this.q.cK, this.q.cL, this.r.cK, this.r.cL) > class_acv.m / 2) {
					this.r = null;
				}

				return this.r;
			}
		}
	}

	private class_vh f(int var1) {
		for (int var2 = 0; var2 < this.l.size(); ++var2) {
			class_vh var3;
			if ((var3 = (class_vh) this.l.elementAt(var2)) != null && var3.cF == 0 && var3.cG == var1) {
				return var3;
			}
		}

		return null;
	}

	public final void a(boolean var1) {
		if (this.r == null) {
			this.r = this.z();
			if (this.r != null && this.r.cF == 100) {
				this.r = null;
			}

		} else {
			if (var1 && !this.r.cY && au && ao == 1) {
				this.r = this.z();
				if (this.r != null && this.r.cY) {
					return;
				}
			}

			int var2;
			if ((var2 = this.cc.indexOf(this.r) + 1) >= this.cc.size() || var2 < 0) {
				var2 = 0;
			}

			if (this.cc.size() > 0) {
				this.r = (class_vh) this.cc.elementAt(var2);
			}

			if (this.r != null && this.r.cF == 100) {
				this.r = null;
			}

		}
	}

	public static void a(class_vh var0, String var1, int var2) {
		var0.da = new class_rx(var2, var1, 1);
		var0.da.a(var0.cK, var0.cL - var0.cM);
	}

	public final void a(short var1) {
		if (this.K != -1) {
			var1 = this.K;
		} else {
			this.J = var1;
		}

		int var2 = this.l.size();
		class_vh var3 = null;

		for (int var4 = 0; var4 < var2; ++var4) {
			if ((var3 = (class_vh) this.l.elementAt(var4)) instanceof class_gn && ((class_gn) var3).a == var1) {
				this.T = new MoveObj(var3.cK, var3.cL);
				return;
			}
		}

	}

	private void d(Graphics var1) {
		for (int var2 = 0; var2 < cT.size(); ++var2) {
			MoveObj var3 = (MoveObj) cT.elementAt(var2);
			this.a((Graphics) var1, (MoveObj) var3, var3.d);
		}

	}

	private void A() {
		class_acv.b(2);
		class_acv.b(4);
		class_acv.b(6);
		class_acv.b(8);
		boolean var1 = false;
		boolean var2 = false;
		short var3 = this.q.cK;
		short var4 = this.q.cL;
		short var5 = this.q.D;
		byte var6 = 0;
		byte var7 = 0;
		short var8 = this.q.I;
		if (class_acv.e[2]) {
			label165: {
				this.q.cD = false;
				this.B();
				au = false;
				var7 = -16;
				if (Y == null || this.q.cL > Y.cL + 40) {
					var1 = true;
					var2 = true;
				}

				this.q.D = 1;
				this.ce = this.q.cK;
				this.cf = (short) (this.q.cL - var8);

				try {
					if (!class_ls.a(this.ce, this.cf, 2) && !this.a((int) this.ce, (int) this.cf)) {
						break label165;
					}

					this.cf = this.q.cL;
					if (this.q.c(0, -8)) {
						this.q.ce = false;
						return;
					}
				} catch (Exception var12) {
					this.cf = this.q.cL;
					var12.printStackTrace();
					break label165;
				}

				var1 = false;
			}
		} else if (class_acv.e[8]) {
			label153: {
				this.q.cD = false;
				this.B();
				au = false;
				var7 = 16;
				var1 = true;
				var2 = true;
				this.q.D = 0;
				this.ce = this.q.cK;
				this.cf = (short) (this.q.cL + var8);

				try {
					if (!class_ls.a(this.ce, this.cf, 2) && !this.a((int) this.ce, (int) this.cf)) {
						break label153;
					}

					this.cf = this.q.cL;
					if (this.q.c(0, 8)) {
						this.q.ce = false;
						return;
					}
				} catch (Exception var11) {
					this.cf = this.q.cL;
					var11.printStackTrace();
					break label153;
				}

				var1 = false;
			}
		} else if (class_acv.e[4]) {
			label155: {
				this.q.cD = false;
				this.B();
				au = false;
				var6 = -16;
				var1 = true;
				var2 = true;
				this.q.D = 2;
				this.ce = (short) (this.q.cK - var8);
				this.cf = this.q.cL;

				try {
					if (!class_ls.a(this.ce, this.cf, 2) && !this.a((int) this.ce, (int) this.cf)) {
						break label155;
					}

					this.ce = this.q.cK;
					if (this.q.c(-8, 0)) {
						this.q.ce = false;
						return;
					}
				} catch (Exception var10) {
					this.ce = this.q.cK;
					var10.printStackTrace();
					break label155;
				}

				var1 = false;
			}
		} else if (class_acv.e[6]) {
			label157: {
				this.q.cD = false;
				this.B();
				au = false;
				var6 = 16;
				var1 = true;
				var2 = true;
				this.q.D = 3;
				this.cf = this.q.cL;
				this.ce = (short) (this.q.cK + var8);

				try {
					if (!class_ls.a(this.ce, this.cf, 2) && !this.a((int) this.ce, (int) this.cf)) {
						break label157;
					}

					this.ce = this.q.cK;
					if (this.q.c(8, 0)) {
						this.q.ce = false;
						return;
					}
				} catch (Exception var9) {
					this.ce = this.q.cK;
					var9.printStackTrace();
					break label157;
				}

				var1 = false;
			}
		}

		if (this.q.g()) {
			if (!var2 || !this.b((int) (var3 + var6), (int) (var4 + var7), (int) var5)) {
				if (var1) {
					if (this.ce < 0) {
						this.ce = this.q.cK;
					}

					if (this.cf < 0) {
						this.cf = this.q.cL;
					}

					if (this.ce > class_ls.a << 4) {
						this.ce = this.q.cK;
					}

					if (this.cf > class_ls.b << 4) {
						this.ce = this.q.cL;
					}

					this.q.b(this.ce, this.cf);
					if (av && ao == 1) {
						class_acv.s.q.ag = this.ce;
						class_acv.s.q.ah = this.cf;
					}

					this.q.ce = false;
					++this.cd;
				}

				if (System.currentTimeMillis() - at >= 0L && !this.q.cD) {
					at = System.currentTimeMillis() + (long) as;
					this.D.h(this.ce, this.cf);
				}

			}
		}
	}

	public final boolean a(int var1, int var2) {
		if (this.m.size() == 0) {
			return false;
		} else {
			int var3 = this.m.size();
			class_vh var4 = null;

			for (int var5 = 0; var5 < var3; ++var5) {
				if ((var4 = (class_vh) this.m.elementAt(var5)) != null) {
					class_xn var7 = (class_xn) var4;
					if (var1 >= var7.cK - var7.cN / 2 + 10 && var1 <= var7.cK + var7.cN / 2 - 10
							&& var2 >= var7.cL - var7.cM * 3 / 4 - 30 && var2 <= var7.cL - 40) {
						return true;
					}
				}
			}

			return false;
		}
	}

	private void B() {
		if (this.aG == 17 && this.q.bK) {
			this.r = null;
			this.cr = 0;
		}

	}

	public final void c() {
		if (this.F && class_acv.g) {
			switch (class_acv.i()) {
			case 0:
				class_acv.e();
				class_acv.f();
				this.F = false;
				class_acv.g = false;
				return;
			case 1:
				String var1 = this.G.e();
				this.G.a("");
				this.h(var1);
				class_acv.g = false;
				return;
			case 2:
				this.G.a();
				class_acv.g = false;
				return;
			}
		}

		if (class_acv.c[11]) {
			aA = !aA;
		}

		boolean var10000;
		int var3;
		label304: {
			if (class_ls.j == 105) {
				String[] var2 = new String[] { "1Cháu của ta", "1Nay con đã lớn",
						"1đã đến lúc con phải được học hỏi nhiều hơn",
						"1phải trải nghiệm nhiều hơn từ quê hương đất nước",
						"1và có nhiều điều để con phải học hỏi nơi biết bao đấng anh hào, ẩn sỹ.",
						"1Năm xưa ta có người anh em kết nghĩa là Hai Minh",
						"1ông ấy giờ đang là trưởng làng của làng này.",
						"1con hãy đi xuống phương Nam và tìm gặp người này",
						"1ông ấy sẽ giúp con gia nhập làng nghĩa sĩ này",
						"1Con hãy cố gắng để trưởng thành, để có thể giúp được quê hương",
						"1để có được sự nghiệp riêng và để tìm được nguồn gốc và cha mẹ của con…", "1Hãy lên đường đi",
						"1..nơi đây ta luôn dõi theo bước chân của con", "0Vâng! thưa nội con đi",
						"1Uhm, chúc con lên đường bình an." };
				if (this.r != null && this.r instanceof class_gn || class_acv.w != null) {
					class_acv.e[2] = false;
					if (class_yg.d(this.q.cL - this.r.cL) <= 32) {
						if (this.bD == -1) {
							class_acv.c[5] = true;
						}

						int var4;
						if (class_acv.g) {
							class_acv.g = false;
							var3 = j + class_acv.j;
							var4 = k + class_acv.k;
							if (class_yg.d(this.r.cK - var3) < 20 && class_yg.d(this.r.cL - 20 - var4) < 40) {
								class_acv.c[5] = true;
							}
						}

						if (class_acv.b(5) && this.bD < var2.length) {
							++this.bD;
							if (this.bD >= var2.length) {
								this.q.cV = 0;
								Random var8 = new Random(System.currentTimeMillis());
								var4 = 13 + var8.nextInt() % 5;
								int var5 = 11 + var8.nextInt() % 5;
								class_go.a().b(0, var4, var5);
								class_acv.e[2] = false;
								class_acv.b("Chuyển màn..", true);
							} else {
								this.q.da = null;
								this.r.da = null;
								if (var2[this.bD].startsWith("1")) {
									a((class_vh) this.r, (String) var2[this.bD].substring(1), 500);
								} else {
									a((class_vh) this.q, (String) var2[this.bD].substring(1), 700);
								}
							}
						}

						var10000 = true;
						break label304;
					}
				}

				class_acv.e[2] = true;
				this.bD = -1;
				this.A();
			}

			var10000 = false;
		}

		if (!var10000) {
			if (!this.F) {
				if (ay != null && ay.r) {
					ay.a(this.q, this.r);
				} else {
					boolean var6 = false;
					int var7;
					if (af != null) {
						for (var7 = 0; var7 < af.length; ++var7) {
							if (af[var7] == this.q.cG
									&& (long) ad[var7] - (System.currentTimeMillis() / 1000L - (long) ae[var7]) >= 0L) {
								var6 = true;
							}
						}
					}

					if (class_acv.a.hasPointerEvents() && !var6) {
						this.H();
					}

					super.c();
					if (this.q.ai) {
						this.q.ai = false;
						this.q.cD = false;
						this.b((int) this.q.cK, (int) this.q.cL);
					}

					if (class_acv.b(10)) {
						this.E();
						class_acv.e();
					} else if (class_acv.b(11)) {
						Vector var10;
						(var10 = new Vector()).addElement(new class_s("Chat", new class_ci(this)));
						var10.addElement(new class_s("Thay đồ", new class_ch(this)));
						var10.addElement(new class_s("Tìm bạn", new class_cf(this)));
						class_acv.u.a(var10, 3);
					} else {
						if (au) {
							if (this.U != -1 && bI - System.currentTimeMillis() / 1000L > 0L) {
								ch = true;
							} else {
								ch = false;
							}
						}

						if (this.q.cV != 3 && (au || aw) && !this.q.dc && class_ls.j != 0 && class_ls.j != 201
								&& class_ls.j != 70 && class_ls.j != 80 && !class_ls.m) {
							if (aw && (class_acv.I.i || class_acv.I.j)
									&& ax - System.currentTimeMillis() / 1000L <= 0L) {
								var7 = this.q.v * 100 / this.q.w;
								var3 = this.q.bz * 100 / this.q.by;
								if (var7 < class_ju.a && this.q.v < this.q.w) {
									ci = true;
								}

								if (var3 < class_ju.b && this.q.bz < this.q.by) {
									cj = true;
								}

								if (var7 >= class_ju.a) {
									ci = false;
								}

								if (var3 >= class_ju.b) {
									cj = false;
								}

								if (ci && !this.q.cW) {
									this.d((int) 7, (int) V);
								}

								if (cj && !this.q.cW) {
									this.d((int) 9, (int) V);
								}

								ax = System.currentTimeMillis() / 1000L + 1L;
							}

							if (au && (class_acv.I.h || class_acv.I.j)
									&& (long) class_ju.e - System.currentTimeMillis() / 100L <= 0L) {
								if (this.q.bK) {
									if (this.r != null && this.r.cF != 2 && this.r.cF != 0 && this.r.cF != 126) {
										class_acv.c[5] = true;
									} else {
										this.a(false);
									}
								} else {
									if (this.r != null && this.r.cF != 2 && this.r.cF != 126) {
										boolean var9 = false;
										if (this.r.cF == 0 && !this.r.cY) {
											this.a(false);
											var9 = true;
										}

										if (!var9) {
											class_acv.c[this.cl] = true;
											this.cl += 2;
											if (this.cl > 5) {
												this.cl = 1;
											}
										}
									} else {
										this.a(false);
									}

									if (!ch) {
										if (this.q.aO != 2) {
											this.d((int) 1, (int) 1);
											this.d((int) 3, (int) 1);
											this.d((int) 5, (int) 1);
										} else if (!this.C()) {
											this.d((int) 1, (int) 1);
											this.d((int) 3, (int) 1);
											this.d((int) 5, (int) 1);
										}
									}
								}

								class_ju.e = (int) (System.currentTimeMillis() / 100L + 10L);
							}

							if (class_acv.c[7]) {
								class_acv.c[7] = false;
								this.d((int) 7, (int) V);
							}

							if (class_acv.c[9]) {
								class_acv.c[9] = false;
								this.d((int) 9, (int) V);
							}
						}

						for (var7 = 0; var7 < this.cg.length; ++var7) {
							if (class_acv.b(this.cg[var7])) {
								if (!this.q.cW) {
									this.d(this.cg[var7], V);
								}
								break;
							}
						}

						if (class_acv.u.a) {
							class_acv.c[5] = false;
						} else if ((class_acv.b(2) || class_acv.b(4) || class_acv.b(6) || class_acv.b(8))
								&& this.q.cV == 3) {
							this.q.cD = false;
						} else {
							if ((this.q.cV == 1 || this.q.cV == 0 || this.q.cV == 4) && !var6) {
								this.A();
							}

						}
					}
				}
			}
		}
	}

	private boolean C() {
		byte[] var1 = new byte[] { 1, 3, 5 };

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class_gd var3 = class_sc.a[1][this.cp[var1[var2]]];
			if (this.q.aO == 2 && var3.b() == 6) {
				return true;
			}
		}

		return false;
	}

	private void D() {
		if (this.q.s == null) {
			if (class_hw.aS[0] == 0) {
				if (this.T != null && this.T.posX / 16 == 6 && this.T.posY / 16 == 7) {
					this.T.posX = 160;
				}

				if (class_yg.a(this.q.cK, this.q.cL, this.T.posX, this.T.posY) > 32) {
					this.q.s = this.b(this.q.cK / 16, this.q.cL / 16, this.T.posX / 16, this.T.posY / 16 + 2);
					this.q.r = 0;
					return;
				}

				this.q.D = 1;
				if (System.currentTimeMillis() / 100L - this.cm > (long) az) {
					az = 3;
					class_vh var1 = null;

					for (int var2 = 0; var2 < this.l.size(); ++var2) {
						if ((var1 = (class_vh) this.l.elementAt(var2)) instanceof class_gn
								&& ((class_gn) var1).a == this.K) {
							this.r = var1;
							break;
						}
					}

					this.cm = System.currentTimeMillis() / 100L;
					if (class_acv.u.a) {
						class_acv.u.bb.b.perform();
						class_acv.u.a = false;
						return;
					}

					class_acv.c[5] = true;
					return;
				}
			} else {
				X = 0;
			}
		}

	}

	public final boolean b(int var1, int var2, int var3) {
		class_zo var6;
		if ((var6 = class_ls.a(var1 + this.cn[var3], var2 + this.co[var3])) == null) {
			return false;
		} else {
			class_gm.a().b(this.aG, var6.b, var6.c);
			this.q.cV = 0;
			if (!class_ls.m) {
				var2 = var6.a;
				var3 = cv.length;

				int var4;
				boolean var10000;
				label63: {
					for (var4 = 0; var4 < var3; ++var4) {
						if (var2 == cv[var4]) {
							var10000 = true;
							break label63;
						}
					}

					var10000 = false;
				}

				if (!var10000) {
					class_abj var8 = this;
					var3 = aJ.length;
					var4 = 0;

					short var12;
					label52: while (true) {
						if (var4 >= var3) {
							var12 = -1;
							break;
						}

						for (int var5 = 0; var5 < aJ[var4].length; ++var5) {
							if (var8.aG == aJ[var4][var5]) {
								var12 = aI[var4];
								break label52;
							}
						}

						++var4;
					}

					short var9 = var12;
					String[] var11 = class_yi.e(var12, var6.a);
					short[] var7 = class_yi.f(var9, var6.a);
					Vector var10 = new Vector();

					for (var4 = 0; var4 < var11.length; ++var4) {
						if (!var11[var4].equals("")) {
							MenuSelectMapOptn menu = new MenuSelectMapOptn(this, var7, var4, var11);
							var10.addElement(new class_s(var11[var4], menu));
						}
					}

					class_acv.u.a(var10, 3);
					class_acv.u.a();
				} else {
					cw = this.aG;
					class_go.a().b(var6.a, var6.b, var6.c);
					class_gm.a().d();
					class_yi.g();
				}
			} else {
				class_go.a().b(cw, var6.b, var6.c);
				class_gm.a().d();
				class_yi.g();
			}

			return true;
		}
	}

	private void d(int var1, int var2) {
		if (this.q.cV == 3) {
			class_acv.x.a = false;
			this.U = -1;
			bI = 0L;
			this.q.F();
			if (av) {
				au = av;
			}

			if (class_ju.k && au) {
				class_go.a().j();
				class_gm.a().d();
				class_gm.a().b(this.aG, 0, 0);
				av = false;
				au = false;
			} else {
				class_acv.x.a("Quay về làng.", new class_s("Về làng", new class_cg(this)),
						new class_s("Hồi sinh", new class_rh(this)), new class_s("Đóng", new class_ri(this)));
				class_acv.w = class_acv.x;
			}
		} else {
			this.q.cc = System.currentTimeMillis();
			if (this.q.cV == 3) {
				class_acv.x.a = false;
				this.U = -1;
				bI = 0L;
				this.q.F();
				if (av) {
					au = av;
				}

				if (class_ju.k && au) {
					class_go.a().j();
					class_gm.a().d();
					class_gm.a().b(this.aG, 0, 0);
					av = false;
					au = false;
				} else {
					class_acv.x.a("Quay về làng.", new class_s("Về làng", new class_rj(this)),
							new class_s("Hồi sinh", new class_rl(this)), new class_s("Đóng", new class_rn(this)));
					class_acv.w = class_acv.x;
				}
			} else if (this.r != null && this.r.M()) {
				Vector var10;
				if ((var10 = g(this.r.g_())).size() > 0 && this.r.M()) {
					var10.addElement(new class_s("Nói chuyện", new class_rp(this)));
					class_acv.u.a(var10, 3);
				} else {
					class_go.a().l(((class_hw) this.r).Q);
				}
			} else {
				class_gd var9;
				if ((var9 = class_sc.a[var2][this.cp[var1]]).a != 2) {
					if (var9.b && !(this.r instanceof class_gn)) {
						if (class_hw.aS[var9.b()] <= 0) {
							return;
						}

						byte var5 = class_qz.c[class_acv.s.q.aO][var9.b() - 4];
						if ((var2 = class_qz.b(var9.b(), class_hw.aS[var9.b() - 4])) > class_acv.s.q.bz) {
							if (!this.cq) {
								this.a(new class_kk("", "Không đủ MP"));
								this.cq = true;
							}

							return;
						}

						this.cq = false;
						class_sc var10000;
						if (this.r != null && this.r.cF == 0) {
							if (var9.b() == 6) {
								class_go.a().a(this.r.cG, (byte) 0, (byte) var5, (short) 0);
								var10000 = this.q;
								var10000.bz -= var2;
								return;
							}

							var10000 = this.q;
							var10000.bz -= var2;
							this.U = var9.b();
							class_nu.a().a(this.q, this.r, var5, class_qz.d[this.q.aO][var9.b() - 4] == 1);
							return;
						}

						if (var9.b() != 6) {
							var10000 = this.q;
							var10000.bz -= var2;
							if (var9.b && (class_acv.s.U == -1 || class_acv.s.U == var9.b())) {
								class_acv.s.U = var9.b();
							}

							long var7 = System.currentTimeMillis() - this.q.aq[var9.b()];
							if (au && var7 <= class_acv.s.q.at[var9.b()] && bI - System.currentTimeMillis() / 1000L < 0L
									&& this.bB) {
								var7 = class_acv.s.q.at[var9.b()] + 1L;
								this.bB = false;
							}

							if (var7 > class_acv.s.q.at[var9.b()]) {
								class_go.a().a(class_acv.s.q.cG, (byte) 0, (byte) var5, (short) 0);
								this.q.at[var9.b()] = class_qz.a(var9.b(), class_hw.aS[var9.b()]);
								this.q.aq[var9.b()] = System.currentTimeMillis();
								return;
							}
						} else {
							class_acv.a("Chỉ có thể hồi sinh cho người đã hết HP.");
						}

						return;
					}

					if (this.r != null && this.r.cF == 2 && class_hw.aS[var9.b()] >= 0) {
						this.a(var9.b());
					}

					if (this.r == null) {
						return;
					}

					long var4 = System.currentTimeMillis() - this.q.aq[var9.b()];
					if (this.r.cF != 2 && var4 > class_acv.s.q.at[var9.b()]
							&& (class_hw.aS[var9.b()] > 0 || this.r.cF == 10)) {
						this.a(var9.b());
						return;
					}
				} else if (var9.a == 2) {
					this.b(var9.c());
				}

			}
		}
	}

	public final void b(int var1) {
		if (class_acv.s.q.bq[var1] <= 0) {
			int var8 = class_sc.a[V].length;
			int[] var3 = new int[] { 94, 93, 22, 21, 3, 2, 1 };
			int[] var7 = new int[] { 96, 95, 24, 23, 6, 5, 4 };

			for (int var4 = 0; var4 < var8; ++var4) {
				if (class_sc.a[V][var4].a == 2 && class_sc.a[V][var4].c() == var1) {
					class_sc.a[V][var4].d();
					int var6;
					if (var1 == 1 || var1 == 2 || var1 == 3 || var1 == 21 || var1 == 22 || var1 == 93 || var1 == 94) {
						boolean var5 = false;

						for (var6 = 1; var6 <= 3; ++var6) {
							if (var6 != var1 && class_acv.s.q.bq[var6] > 0) {
								class_sc.a[V][var4].a(var6);
								var5 = true;
								break;
							}
						}

						if (!var5) {
							for (var6 = 0; var6 < var3.length; ++var6) {
								if (class_acv.s.q.bq[var3[var6]] > 0) {
									class_sc.a[V][var4].a(var3[var6]);
									break;
								}
							}
						}
					}

					if (var1 == 4 || var1 == 5 || var1 == 6 || var1 == 23 || var1 == 24 || var1 == 95 || var1 == 96) {
						for (var6 = 4; var6 <= 6; ++var6) {
							if (var6 != var1 && class_acv.s.q.bq[var6] > 0) {
								class_sc.a[V][var4].a(var6);
								break;
							}
						}

						for (var6 = 0; var6 < var7.length; ++var6) {
							if (class_acv.s.q.bq[var7[var6]] > 0) {
								class_sc.a[V][var4].a(var7[var6]);
								break;
							}
						}
					}
				}
			}

			class_aai.b();
		} else {
			long var2;
			if ((var2 = System.currentTimeMillis()) - this.q.bs[var1] >= class_sc.l[var1].c) {
				if (this.q.v < this.q.w || var1 != 1 && var1 != 2 && var1 != 3 && var1 != 21 && var1 != 22 && var1 != 93
						&& var1 != 94) {
					if (this.q.bz < this.q.by || var1 != 4 && var1 != 5 && var1 != 6 && var1 != 23 && var1 != 24
							&& var1 != 95 && var1 != 96) {
						if (var1 == 19) {
							if (this.aG == 0) {
								class_acv.a("Không thể sử dụng trong làng.");
								return;
							}

							class_acv.s.q.ar = System.currentTimeMillis();
							class_acv.s.q.ce = true;
							class_acv.s.q.cV = 4;
						}

						if (var1 < 10 || var1 > 20) {
							int var10002 = this.q.bq[var1]--;
							this.q.bs[var1] = var2;
						}

						if (this.q.cV != 3 && au && !this.q.dc && class_ls.j != 0 && class_ls.j != 201
								&& class_ls.j != 70 && class_ls.j != 80 && !class_ls.m) {
							class_sc var10000 = this.q;
							var10000.v += e(0, var1);
							var10000 = this.q;
							var10000.bz += e(1, var1);
							if (this.q.v >= this.q.w) {
								this.q.v = this.q.w;
							}

							if (this.q.bz >= this.q.by) {
								this.q.bz = this.q.by;
							}
						}

						class_go.a().k(var1);
					}
				}
			}
		}
	}

	private static int e(int var0, int var1) {
		for (int var2 = 0; var2 < aY[var0].length; ++var2) {
			if (aY[var0][var2] == var1) {
				return aZ[var0][var2];
			}
		}

		return 0;
	}

	private void E() {
		if (this.r == null) {
			this.h();
		} else if (this.r.cF == 0) {
			Vector var1;
			(var1 = new Vector()).addElement(new class_s("Mời party", new class_qu(this)));
			var1.addElement(new class_s("Trao đổi", new class_qv(this)));
			var1.addElement(new class_s("Mời đám cưới", new class_qx(this)));
			if (this.r instanceof class_hw) {
				var1.addElement(new class_s("Nhắn tin", new class_qy(this)));
			}

			var1.addElement(new class_s("Kết bạn", new class_qi(this)));
			if ((class_acv.s.q.ae == 0 || class_acv.s.q.ae == 1 || class_acv.s.q.ae == 2)
					&& ((class_hw) this.r).cH == -1) {
				var1.addElement(new class_s("Mời vào bang hội", new class_qj(this)));
			}

			if (((class_hw) this.r).cH != -1) {
				var1.addElement(new class_s("Xem thông tin bang hội", new class_qk(this)));
			}

			var1.addElement(new class_s("Xem thông tin", new class_qm(this)));
			var1.addElement(new class_s("Xuống ngựa", new class_qo(this)));
			class_acv.u.a(var1, 2);
		} else {
			class_acv.c[5] = false;
		}
	}

	public final void h() {
		if (this.q.ck != -1 || this.q.bb > -1) {
			class_acv.b("Ngựa sẽ bị mất nếu rương đồ không còn chỗ. Bạn có muốn xuống ngựa không ?",
					new class_qq(this));
		}

	}

	private Vector a(class_vh var1, int var2) {
		Vector var3;
		(var3 = new Vector()).addElement(var1);
		int var4 = this.l.size();
		class_vh var5 = null;

		for (int var6 = 0; var6 < var4; ++var6) {
			if ((var5 = (class_vh) this.l.elementAt(var6)).cF == 1 && var5.cV != 8 && var5.cG != var1.cG
					&& c(var5.cK - var1.cK) <= var2 && c(var5.cL - var1.cL) <= var2) {
				var3.addElement(var5);
				if (var3.size() > 10) {
					break;
				}
			}
		}

		return var3;
	}

	public static void a(String var0, class_vh var1) {
		var1.da = null;
		class_vh var10000 = var1;
		String var10001 = var0;
		boolean var2 = true;
		String var4 = var10001;
		class_vh var3 = var10000;
		var10000.da = new class_rx(50, var4, 0);
		var3.da.a(var3.cK, var3.cL);
	}

	public static void a(String var0) {
		class_ck var1 = new class_ck(var0);
		al.addElement(var1);
		am.addElement(var1);
	}

	public final void b(int var1, int var2) {
		if (System.currentTimeMillis() - at >= 0L) {
			at = System.currentTimeMillis() + (long) as;
			this.D.h(var1, var2);
			this.q.cD = true;
		}

	}

	private void a(byte var1) {
		try {
			if (this.r != null) {
				if (au && (this.r.d_() || this.r.M())) {
					return;
				}

				if (X != 2 && aB <= 0) {
					this.q.s = null;
					this.cK.a = this.cK.b = -1;
				}

				if (this.r.v() || this.q.cS != this.r.cS && this.r.N()
						|| this.r.N()
								&& (W == class_ls.j && this.q.cH != ((class_hw) this.r).cH
										|| this.r.cR > 0 && this.q.cR > 0 && this.r.cR != this.q.cR)
						|| this.q.cY && this.r.N()
						|| this.r.N() && ((this.q.cK > Z << 4 && this.q.cL > aa << 4 && this.q.cK < ab << 4
								&& this.q.cL < ac << 4 || v) && this.r.cF != 2 && class_ls.j == 201 || class_ls.j == 112
								|| class_ls.j == 2541 || class_ls.j == 2542 || class_ls.j == 2543 || class_ls.j == 2544
								|| ((class_hw) this.r).cY)
						|| this.r.N() && ((class_hw) this.r).bT || this.q.bT && (this.r.v() || this.r.N())) {
					boolean var2 = false;
					if (this.r.v() && this.r.w()) {
						var2 = true;
						var1 = 0;
					}

					if (!this.r.N() || !this.r.d_()) {
						int var3;
						if ((var3 = class_qz.b(var1, class_hw.aS[var1])) > this.q.bz) {
							if (!this.cq) {
								this.a(new class_kk("", "Không đủ MP"));
								this.cq = true;
							}

							return;
						}

						this.cq = false;
						class_ap var4;
						if (((var4 = (class_ap) this.r).t <= 0 || var4.v <= 0) && var4.cF == 0) {
							return;
						}

						int var5 = class_qz.a(var1);
						if (var2) {
							var5 = 30;
						}

						if (class_yg.a(this.q.cK, this.q.cL, var4.cK, var4.cL) > var5) {
							++this.cr;
							this.b(var4, var5);
							this.ck = true;
						} else {
							this.ck = false;
							this.cr = 0;
							if (this.q.cY && this.r.cF == 0 && ((class_hw) this.r).N < 10 && this.q.cS == this.r.cS) {
								return;
							}

							if (this.r.cF == 1 && ((class_bb) this.r).cV == 5) {
								return;
							}

							if (System.currentTimeMillis() - this.q.aq[var1] > this.q.at[var1]) {
								this.q.D = class_yg.b(this.q, var4);
								class_zp var13;
								(var13 = new class_zp()).a = 2000000;
								class_sc var10000 = this.q;
								var10000.bz -= var3;
								this.q.a(var4, var13, var1, class_hw.aS[var1]);
								var2 = class_qz.d(this.q.aO, var1);
								Vector var15 = new Vector();
								if (var2) {
									if (var4.cF == 1) {
										this.q.af.a(var15 = this.a((class_vh) var4, (int) class_qz.e(this.q.aO, var1)));
									} else if (var4.cF == 0) {
										var15.addElement(var4);
										this.q.af.a(var15);
									}
								}

								switch (var4.cF) {
								case 0:
									this.D.c(var4.cG, var1);
									this.q.I();
									return;
								case 1:
									if (!var2) {
										this.D.b(var4.cG, var1);
									} else {
										this.D.a(var1, var15);
									}

									this.q.I();
								default:
									return;
								}
							}
						}
					}
				}

				if (this.r != null && this.r.e_()) {
					class_ba var10 = (class_ba) this.r;
					if (class_yg.a(this.q.cK, this.q.cL, var10.cK, var10.cL) <= 35) {
						boolean var11 = true;
						String var14 = "";
						if (var10.cF == 4) {
							if (var10.c == 0 && this.q.br > 100000000L) {
								var11 = false;
								var14 = "Quá nhiều tiền";
							}
						} else if (var10.cF == 3 && class_acv.s.q.r()) {
							var14 = "Hành trang đã đầy";
							var11 = false;
						}

						if (!var11) {
							this.a(new class_kk("", var14));
							this.a(false);
							return;
						}

						this.q.D = class_yg.b(this.q, var10);
						this.b((int) this.q.cK, (int) this.q.cL);
						this.D.a(var10.cF, var10.cG);
						return;
					}

					this.b(var10, 35);
				}

				Vector var12;
				if (this.r.d_()) {
					if (this.r.f_() == 1) {
						class_go.a().l(this.r.g_());
						return;
					}

					if (!class_ls.m) {
						if ((var12 = g(this.r.g_())).size() > 0 && !this.r.M()) {
							if (M != null && ((class_gn) this.r).a == M.c) {
								var12.addElement(new class_s("Nhiệm vụ Bang hội", new class_qs(this)));
							}

							var12.addElement(new class_s("Nói chuyện", new class_mj(this)));
							class_acv.u.a(var12, 3);
							return;
						}

						this.r.da = null;
						if (!this.r.M() && this.r.g_() != 7 && this.r.g_() != 10 && this.r.g_() != 22
								&& this.r.g_() != 31 && this.r.g_() != 21 && this.r.g_() != 25) {
							a((class_vh) this.r, (String) class_yi.a(this.r.g_()), 500);
						} else if (!this.r.M()) {
							this.a(this.r.g_(), new Vector());
						}
					} else if (this.r.g_() != 2
							&& (this.r.g_() <= 10 || this.r.g_() == 29 || this.r.g_() == 24 || this.r.g_() == 26
									|| this.r.g_() == 30)
							&& this.r.g_() != 3 && this.r.g_() != 27 && this.r.g_() != 28) {
						class_go.a().l(this.r.g_());
					} else {
						this.a(this.r.g_(), new Vector());
					}
				}

				if (this.r.cF == 10) {
					var12 = new Vector();
					if (this.r != null) {
						if (((class_vo) this.r).b) {
							var12.addElement(new class_s("Xem thông tin", new class_mk(this)));
							var12.addElement(new class_s("Nâng cấp đất", new class_ml(this)));
							var12.addElement(new class_s("Trồng cây", new class_lt(this)));
							var12.addElement(new class_s("Thu hoạch", new class_lv(this)));
							var12.addElement(new class_s("Nhổ bỏ", new class_lx(this)));
						} else {
							var12.addElement(new class_s("Mua đất", new class_mb(this)));
						}
					}

					class_acv.u.a(var12, 3);
					return;
				}
			}
		} catch (Exception var9) {
		}

	}

	private void b(class_vh var1, int var2) {
		if (!au || ao != 1 || this.q.s == null) {
			if (this.q.s == null && (!v || this.aG != 201)) {
				int var3 = class_yg.a(var1.cK - this.q.cK, -(var1.cL - this.q.cL));
				int var5;
				int var4 = ((var5 = class_yg.a(this.q.cK, this.q.cL, var1.cK, var1.cL)) - var2)
						* class_yg.b(var3) >> 10;
				var5 = -((var5 - var2) * class_yg.a(var3)) >> 10;
				boolean var6 = false;
				if (var4 > 0) {
					if (var4 > 50) {
						var4 = 50;
					}
				} else if (var4 < 0 && var4 < -50) {
					var4 = -50;
				}

				if (var5 > 0) {
					if (var5 > 50) {
						var5 = 50;
					}
				} else if (var5 < 0 && var5 < -50) {
					var5 = -50;
				}

				if (au && ao == 1 && this.r != null && this.r.cY) {
					var6 = true;
				}

				if (this.aG == 17) {
					if (au && this.q.bK && this.cr > 10) {
						this.a(false);
						this.cr = 0;
					}
				} else if (au && !var6) {
					var5 = 0;
					var4 = 0;
					this.a(false);
				}

				if (var6 && aB <= 0
						&& (Math.abs(this.q.cK - this.q.ag) > 120 || Math.abs(this.q.cL - this.q.ah) > 120)) {
					var5 = 0;
					var4 = 0;
					this.a(true);
					this.q.ch = System.currentTimeMillis() - 1L;
					this.movePlayer(this.q.ag, this.q.ah);
				}

				this.q.b((short) (this.q.cK + var4), (short) (this.q.cL + var5));
				if (!au || var6) {
					this.b((int) ((short) (this.q.cK + var4)), (int) ((short) (this.q.cL + var5)));
				}

			}
		}
	}

	private void a(int var1, Vector var2) {
		var2 = var2;
		if (var1 != 3 && var1 != 27) {
			if (var1 != 2 && var1 != 28) {
				if (var1 == 7) {
					var2.addElement(new class_s("Đi đến", new class_om(this)));
					var2.addElement(new class_s("Giao tiếp", new class_oq(this, var1)));
				} else if (var1 == 10) {
					var2.addElement(new class_s("Lên tàu", new class_nc(this)));
					var2.addElement(new class_s("Mua vé (" + aP + " " + "xu" + ")", new class_nd(this)));
					var2.addElement(new class_s("Nói chuyện", new class_ne(this, var1)));
				} else if (var1 != 22 && var1 != 31) {
					if (var1 == 25) {
						var2.addElement(new class_s("Giao tiếp", new class_nj(this, var1)));
						var2.addElement(new class_s("Chuyển thẻ", new class_nl(this)));
					} else if (var1 == 21) {
						var2.addElement(new class_s("Học kỹ năng", new class_nn(this)));
						var2.addElement(new class_s("Nói chuyện", new class_np(this, var1)));
					} else if (var1 > 10 && var1 != 30) {
						var2.addElement(new class_s("Bán", new class_nr(this, var1)));
						var2.addElement(new class_s("Mua", new class_abn(this, var1)));
					}
				} else {
					var2.addElement(new class_s("Nạp xu", new class_nf(this)));
					var2.addElement(new class_s("Nói chuyện", new class_nh(this, var1)));
				}
			} else {
				var2.addElement(new class_s("Mua bán", new class_mf(this, var1)));
				var2.addElement(new class_s("Nghiền bột", new class_mh(this)));
				var2.addElement(new class_s("Thêm dòng", new class_lm(this)));
				var2.addElement(new class_s("Luyện đồ", new class_ln(this)));
				var2.addElement(new class_s("Luyện đồ tự động", new class_ku(this)));
				var2.addElement(new class_s("Cộng thuộc tính", new class_kw(this)));
				var2.addElement(new class_s("Khóa đồ thú", new class_ky(this)));
				var2.addElement(new class_s("Khóa trang bị", new class_la(this)));
				var2.addElement(new class_s("Sửa đồ", new class_lc(this)));
				var2.addElement(new class_s("Đục lỗ", new class_oi(this)));
				var2.addElement(new class_s("Khảm", new class_ok(this)));
				var2.addElement(new class_s("Hợp thành", new class_ol(this)));
			}
		} else {
			for (int var3 = 0; var3 < class_yi.af.length; ++var3) {
				var2.addElement(new class_s(class_yi.af[var3], new class_md(this, var1, var3)));
			}

			class_acv.u.a(var2, 3);
		}

		class_acv.u.a(var2, 3);
	}

	public final void c(int var1, int var2) {
		var1 = var1;
		int var3 = aJ.length;
		int var4 = 0;

		short var10000;
		int var5;
		label34: while (true) {
			if (var4 >= var3) {
				var10000 = -1;
				break;
			}

			for (var5 = 0; var5 < aJ[var4].length; ++var5) {
				if (var1 == aJ[var4][var5]) {
					var10000 = aI[var4];
					break label34;
				}
			}

			++var4;
		}

		short var7 = var10000;
		String[] var9 = class_yi.Z[var7];
		short[] var8 = class_yi.Y[var7];
		Vector var10 = new Vector();

		for (var5 = 0; var5 < var9.length; ++var5) {
			var10.addElement(new class_s(var9[var5], new class_abo(this, var2, var8, var5, var9)));
		}

		class_acv.u.a(var10, 3);
		class_acv.u.a();
	}

	public final void i() {
		if (this.cy.size() == 0) {
			class_acv.a("Chức năng này hiện đang tạm khóa");
		} else {
			Vector var1 = new Vector();
			int var2 = this.cy.size();

			for (int var3 = 0; var3 < var2; ++var3) {
				String var4 = (String) this.cz.elementAt(var3);
				String var5 = (String) this.cA.elementAt(var3);
				String var6 = (String) this.cy.elementAt(var3);
				if (var5.length() >= 4) {
					var1.addElement(new class_s((String) this.cy.elementAt(var3), new class_abp(this, var4, var5)));
				} else {
					var1.addElement(new class_s((String) this.cy.elementAt(var3), new class_abu(this, var4, var6)));
				}
			}

			class_acv.u.a(var1, 3);
		}
	}

	public final void b(String var1) {
		Vector var2;
		(var2 = new Vector()).addElement(new class_s("Nạp lượng", new class_aat(this, var1)));
		var2.addElement(new class_s("Nạp xu", new class_aau(this, var1)));
		class_acv.u.a(var2, 3);
	}

	private void a(Graphics var1, MoveObj var2, int var3) {
		if (var2 != null) {
			int var4 = var2.posX / 16;
			int var5 = var2.posY / 16;
			if (var4 - 4 <= cG) {
				var4 = cG + 4;
			} else if (var4 + 6 > cG + aq) {
				var4 = cG + aq - 6;
			}

			if (var5 - 4 <= cC) {
				var5 = cC + 4;
			} else if (var5 + 6 > cC + ar) {
				var5 = cC + ar - 6;
			}

			var1.setColor(this.cs[var3]);
			var1.fillRect(var4, var5, 3, 3);
			var1.setColor(16777215);
			var1.drawRect(var4 - 1, var5 - 1, 4, 4);
		}

	}

	private void e(Graphics var1) {
		if (class_ls.a >= class_acv.m / 16 || class_ls.b >= class_acv.n / 16) {
			class_acv.a(var1);
			if (this.U != -1 && bI - System.currentTimeMillis() / 1000L > 0L) {
				class_ko.a.a(this.U, class_acv.m, class_acv.n - ar - class_aae.c, 0, 40, var1);
				class_d.i[0].a(var1, String.valueOf((bI - System.currentTimeMillis()) / 1000L), class_acv.m - 10,
						class_acv.n - ar - class_aae.c - 28, 2);
			}

			var1.translate(this.bR.posX, this.bR.posY);
			int var2 = this.q.cK / 16;
			int var3 = this.q.cL / 16;

			int var4;
			for (var4 = 0; var4 < 3; ++var4) {
				var1.setColor(ct[var4]);
				var1.drawRect(var4, var4, aq - (var4 << 1), ar - (var4 << 1));
			}

			var1.setClip(3, 3, aq - 5, ar - 5);
			var1.translate(-cG, -cC);
			if (class_ls.i != null) {
				var1.drawImage(class_ls.i, 0, 0, 0);
			}

			var1.setColor(16777215);
			var1.fillRect(var2, var3 - 2, 5, 5);
			var1.setColor(255);
			var1.fillRect(var2 + 1, var3 - 1, 3, 3);
			this.d(var1);
			this.a((Graphics) var1, (MoveObj) M, 1);
			this.a((Graphics) var1, (MoveObj) this.y, 2);
			var1.setColor(16516117);
			class_xz var8 = null;
			class_vh var7 = null;

			for (var3 = 0; var3 < class_hw.bw.size(); ++var3) {
				var8 = (class_xz) class_hw.bw.elementAt(var3);
				if ((var7 = this.b((short) var8.a)) != null) {
					var1.fillRect(var7.cK / 16, var7.cL / 16, 2, 2);
				}
			}

			byte var5;
			if (this.q.s != null) {
				if (this.cJ != null) {
					var1.setColor(15198737);
					var1.fillRect(this.cJ.posX, this.cJ.posY, 3, 3);
					this.cK.a = (short) this.cJ.posX;
					this.cK.b = (short) this.cJ.posY;
				}

				var3 = this.q.s.length;

				for (var2 = 0; var2 < var3; ++var2) {
					var1.setColor(15198737);
					byte var9 = (byte) (aR + (this.q.s[var2] >> 8));
					var5 = (byte) (aS + (this.q.s[var2] & 255));
					if (var9 != -1) {
						var1.fillRect(var9 + 1, var5 + 1, 1, 1);
					}
				}
			}

			var1.setColor(16317005);
			var3 = class_ls.f.size();

			for (var2 = 0; var2 < var3; ++var2) {
				class_pw var10 = (class_pw) class_ls.f.elementAt(var2);
				var5 = 0;
				byte var6 = 0;
				if (var10.cK / 16 >= aq - 3) {
					var5 = -3;
				}

				if (var10.cK / 16 <= 3) {
					var5 = 3;
				}

				if (var10.cL / 16 <= 3) {
					var6 = 3;
				}

				if (var10.cL >= ar - 3) {
					var6 = -3;
				}

				var1.fillRect(var10.cK / 16 + var5, var10.cL / 16 + var6, 3, 3);
			}

			class_acv.a(var1);
			class_d.a.a(var1, a, 2, class_acv.n - 30, 0);
			class_d.g.a(var1, this.q.cK / 16 + "." + this.q.cL / 16, class_acv.m - 2, class_acv.n - class_aae.c - 7, 1);
			if (this.q.cS > -1) {
				class_d.a.a(var1, an[this.q.cT], 2, class_acv.n - 42, 0);
			}

			var2 = 0;
			if (this.aT != null) {
				for (var4 = 0; var4 < this.aT.length; ++var4) {
					if (this.aT[var4].a > 0) {
						class_ko.a(var1, (short) (this.aT[var4].d + 2600), class_acv.m - 9,
								this.bR.posY - 85 + var2 * 16);
						class_d.i[0].a(var1, String.valueOf(this.aT[var4].e), class_acv.m - 9 + 4,
								this.bR.posY - 85 + var2 * 16 - 2, 2);
						++var2;
					}
				}
			}

			var2 = 0;
			if (this.aU != null) {
				for (var4 = 0; var4 < this.aU.length; ++var4) {
					if (this.aU[var4].a > 0) {
						class_ko.a(var1, (short) (this.aU[var4].d + 2600), class_acv.m - 9 - 6 - 12,
								this.bR.posY - 85 + var2 * 16);
						class_d.i[0].a(var1, String.valueOf(this.aU[var4].e), class_acv.m - 9 - 6 - 12 + 4,
								this.bR.posY - 85 + var2 * 16 - 2, 2);
						++var2;
					}
				}
			}

		}
	}

	private void f(Graphics var1) {
		for (int var2 = 0; var2 < this.cQ.size(); ++var2) {
			class_ht var3;
			if ((var3 = (class_ht) this.cQ.elementAt(var2)) != null) {
				var3.a(var1, class_acv.m, ar + var2 * 18 + 16);
			}
		}

	}

	public final void a(Graphics var1) {
		if (this.s) {
			class_acv.a(var1);
			if (this.u) {
				var1.setColor(16777215);
				var1.fillRect(0, 0, class_acv.m, class_acv.n);
			} else {
				if (bq || br) {
					var1.setColor(0);
					var1.fillRect(0, 0, class_acv.m, class_acv.n);
				}

				int var2 = 0;
				if (this.z > 0) {
					var2 = ap.nextInt(2);
				}

				var1.translate(-j + var2, -k - var2);
				var1.setColor(0);
				var1.fillRect(j - 5, k - 5, class_acv.m + 10, class_acv.n + 10);

				try {
					class_ls.a(var1);
				} catch (Exception var20) {
				}

				class_aap var24;
				if (this.q.s != null && this.cJ != null && (var24 = this.cK).a != -1 && class_acv.s.q.cV == 1
						&& var24.b != -1) {
					var1.setColor(16777215);
					var1.drawArc((var24.a << 4) - 3 + 16, (var24.b << 4) - 3, 6, 6, 0, 360);
					var1.drawArc((var24.a << 4) - var24.c + 16, (var24.b << 4) - var24.c, var24.c + var24.c,
							var24.c + var24.c, 0, 360);
					var1.drawArc((var24.a << 4) - (var24.c + 2) + 16, (var24.b << 4) - (var24.c + 2),
							var24.c + 2 + var24.c + 2, var24.c + 2 + var24.c + 2, 0, 360);
				}

				class_abm.a.a(var1);

				for (var2 = 0; var2 < this.cR.size(); ++var2) {
					class_gw var3;
					if ((var3 = (class_gw) this.cR.elementAt(var2)) != null) {
						var3.b(var1);
					}
				}

				for (var2 = 0; var2 < bH.size(); ++var2) {
					class_di var25;
					if ((var25 = (class_di) bH.elementAt(var2)) != null) {
						var25.a(var1);
					}
				}

				int var26;
				class_acd var27;
				for (var26 = 0; var26 < this.o.size(); ++var26) {
					if ((var27 = (class_acd) this.o.elementAt(var26)) != null) {
						var27.a(var1);
					}
				}

				var26 = 0;
				var2 = 0;
				int var4 = 0;

				int var5;
				int var6;
				class_vh var34;
				int var37;
				try {
					if (class_ls.e != null) {
						label452: for (var5 = this.e; var5 < this.g + 5; ++var5) {
							if (cx == 1) {
								for (var6 = class_ls.e.size(); var26 < var6
										&& (class_gr) class_ls.e.elementAt(var26) != null; ++var26) {
									class_gr var7;
									if ((var7 = (class_gr) class_ls.e.elementAt(var26)).cL == var5) {
										if (var7.cK - class_yi.j(var7.a) / 32 <= this.f
												&& var7.cK + class_yi.j(var7.a) / 32 >= this.b) {
											var7.a(var1);
										}
									} else if (var7.cL > var5) {
										break;
									}
								}
							}

							for (var6 = this.m.size(); var4 < var6; ++var4) {
								class_vh var35;
								if ((var35 = (class_vh) this.m.elementAt(var4)) != null && var35.cU == 1 && a(var35)) {
									var35.a(var1);
								}
							}

							var37 = this.l.size();

							while (true) {
								do {
									do {
										do {
											do {
												if (var2 >= var37) {
													continue label452;
												}

												if ((var34 = (class_vh) this.l.elementAt(var2)).cF != 2) {
													if (var34.cL >> 4 > var5) {
														continue label452;
													}

													if (((var34.cF == 0 && aO == 1 || var34.cG == this.q.cG
															|| var34.cF != 0) && var34.cL >> 4 == var5
															&& var34.cL <= this.g << 4 && var34.cL >= this.e << 4
															|| var34.R()) && !(var34 instanceof class_ty)) {
														var34.a(var1);
													}
												} else if (var34.cF == 2 && var34.cU != 1 && a(var34)) {
													var34.a(var1);
												}

												++var2;
											} while (var34 != this.r);
										} while (this.r.cF == 10);
									} while (this.r.cF == 11);
								} while (this.r.cF == 12);

								if (!(this.r.cF == 2
										? this.T != null && var34.cK / 16 == this.T.posX / 16
												&& var34.cL / 16 == this.T.posY / 16
										: false) && !this.ck) {
									var1.drawImage(class_yi.l, var34.cK, var34.cL - var34.cM, 33);
								}
							}
						}

						class_ls.b(var1);
					}
				} catch (Exception var23) {
					var23.printStackTrace();
				}

				if (Y != null) {
					Y.a(var1);
				}

				for (var5 = 0; var5 < n.size(); ++var5) {
					if ((var27 = (class_acd) n.elementAt(var5)) != null) {
						var27.a(var1);
					}
				}

				class_vh var33 = null;
				var6 = this.l.size();

				for (var37 = 0; var37 < var6; ++var37) {
					if ((var33 = (class_vh) this.l.elementAt(var37)) != null) {
						var33.a_(var1);
					}
				}

				class_abm.b.a(var1);

				for (var37 = 0; var37 < this.cR.size(); ++var37) {
					class_gw var36;
					if ((var36 = (class_gw) this.cR.elementAt(var37)) != null) {
						var36.a(var1);
					}
				}

				try {
					Graphics var28 = var1;
					class_abj var31 = this;

					for (var4 = 0; var4 < 15; ++var4) {
						if (var31.bz[var4] != -1) {
							if (var31.bA[var4] != 0) {
								class_d.i[var31.bA[var4]].a(var28, var31.bu[var4], var31.bv[var4], var31.bw[var4], 0);
							} else {
								class_d.f.a(var28, var31.bu[var4], var31.bv[var4], var31.bw[var4], 0);
							}
						}
					}
				} catch (Exception var22) {
				}

				var37 = class_ls.f.size();

				for (var6 = 0; var6 < var37; ++var6) {
					class_pw var8;
					if ((var8 = (class_pw) class_ls.f.elementAt(var6)) != null) {
						if (class_ls.m) {
							var8.b = "thoát";
						} else {
							var8.b = "vào";
						}

						var8.a(var1);
					}
				}

				int var38;
				if (aj.size() > 0 && !class_ls.m && aj.size() > 0) {
					var34 = null;

					for (var38 = 0; var38 < aj.size(); ++var38) {
						class_kl var39;
						if ((var39 = (class_kl) aj.elementAt(var38)) != null) {
							var39.a(var1);
						}
					}
				}

				if (cP != null) {
					cP.a(var1, bK.cK - 30, bK.cL - 40 - bK.O());
				}

				String var32;
				try {
					if (this.p != 2) {
						class_acv.a(var1);
						if (!this.ck && this.r != null) {
							if (this.r.cF != 10 && this.r.cF != 11 && this.r.cF != 12) {
								class_d.a.a(var1, this.r.a_(), class_acv.m - 30, 0, 1);
								this.r.a_(var1, class_acv.m - 15, 20);
							}

							class_ap var29;
							if ((this.r.cF == 0 || this.r.cF == 1) && (var29 = (class_ap) this.r).w != 0
									&& var29.Q == -1) {
								class_acv.a(var1);
								var1.drawImage(P, class_acv.m - 80, 14, 20);
								var5 = (int) ((long) var29.v * (long) this.bQ / (long) var29.w);
								if (var29.v <= 0) {
									var5 = 0;
								}

								var1.setColor(2368805);
								var1.fillRect(class_acv.m - 79, 15, this.bQ - var5, 3);
								class_d.g.a(var1, (var29.v > 0 ? var29.v : 1) + "/" + var29.w,
										class_acv.m - 10 - (this.bQ >> 1), 22, 1);
								class_d.i[0].a(var1, "lv" + var29.N, class_acv.m - 2, 22, 1);
							}
						}
					}

					if (this.p != 2) {
						class_acv.a(var1);
						var1.drawImage(O, 0, 0, 20);
						class_yi.c(2, this.q.aJ).a(var1, (short) 20, (short) 18, 0, this.q.O);
						class_d.b.a(var1, "Lv " + this.q.N + "+" + this.q.Q(), 37, O.getHeight() - 9, 0);
						if (this.q.cQ > 0) {
							class_d.g.a(var1, String.valueOf(this.q.cQ), 5, O.getHeight() + 2, 0);
						}

						if (this.q.bP >= 0) {
							int[] var30 = this.q.C();
							class_d.j[0].a(var1, var30[0] + " : " + var30[1], 5, O.getHeight() + 10, 0);
						}

						if (!(var32 = this.q.x()).equals("")) {
							class_d.j[0].a(var1, var32, 5, O.getHeight() + 20, 0);
							class_d.i[0].a(var1, class_hw.bQ, 5, O.getHeight() + 34, 0);
						}

						int var15 = this.q.v * this.bP / this.q.w;
						int var16 = this.q.bz * this.bP / this.q.by;
						var1.setColor(0);
						var1.fillRect(var15 + 46, 8, this.bP - var15 - 1, 3);
						var1.setColor(0);
						var1.fillRect(var16 + 46, 18, this.bP - var16 - 1, 3);
						if (class_acv.l % 10 > 3) {
							if (this.q.az > 0) {
								var1.drawImage(Q[0], class_acv.m - 2, O.getHeight() + 5, 24);
							}

							if (this.q.aA > 0) {
								var1.drawImage(Q[1], class_acv.m - 2, O.getHeight() + 16, 24);
							}
						}
					}
				} catch (Exception var21) {
					var21.printStackTrace();
				}

				try {
					if (this == class_acv.q) {
						this.e(var1);
						this.i(var1);
						this.b(var1);
					}
				} catch (Exception var19) {
					var19.printStackTrace();
				}

				super.a(var1);

				try {
					if (class_ls.j == 201 && ad != null) {
						g(var1);
					}
				} catch (Exception var18) {
					var18.printStackTrace();
				}

				try {
					if (this == class_acv.q) {
						this.h(var1);
						if (class_acv.w == null && !class_acv.u.a && !this.F) {
							var1.drawImage(class_yi.i[0], 2, class_acv.n - 13, 0);
							var1.drawImage(class_yi.i[1], class_acv.m - 15, class_acv.n - 13, 0);
						}
					}
				} catch (Exception var17) {
					var17.printStackTrace();
				}

				if (this.cO != null && this.cO.size() > 0) {
					class_acv.a(var1);
					var1.drawImage(class_yi.E, 0, class_acv.n + 3, 36);
					var1.setClip(15, class_acv.n - 20, class_acv.m - 30, 20);
					var32 = (String) this.cO.elementAt(0);
					class_d.h.a(var1, var32, this.ca, class_acv.n - 10 - class_d.h.b() / 2, 0);
					var1.setClip(0, 0, class_acv.n, class_acv.m);
				}

				this.f(var1);
				if (al.size() > 0) {
					class_ck var40 = (class_ck) al.elementAt(0);

					for (var38 = 0; var38 < class_acv.m; var38 += class_yi.q.getWidth()) {
						if (var40.b.length == 1) {
							var1.drawImage(class_yi.q, var38, -1 + (this.aC == null ? 0 : 17), 0);
						} else if (var40.b.length == 2) {
							var1.drawImage(class_yi.q, var38, -1 + (this.aC == null ? 0 : 17), 0);
							var1.drawImage(class_yi.q, var38, -1 + (this.aC == null ? 17 : 34), 0);
						}
					}

					if (this.aC != null) {
						var1.setColor(16777215);
						var1.fillRect(0, 18, class_acv.m, 1);
					}

					var40.a(var1);
				}

			}
		}
	}

	private static boolean a(class_vh var0) {
		return var0.cK + var0.cN / 2 >= j && var0.cK - var0.cN / 2 <= j + class_acv.m
				&& var0.cL - var0.cM <= k + class_acv.n && var0.cL >= k;
	}

	private static void g(Graphics var0) {
		int var1 = 38;

		for (int var2 = 0; var2 < ad.length; ++var2) {
			if ((long) ad[var2] - (System.currentTimeMillis() / 1000L - (long) ae[var2]) > 0L) {
				class_d.h.a(var0,
						var2 + 1 + ": " + ah[var2] + " ("
								+ ((long) ad[var2] - (System.currentTimeMillis() / 1000L - (long) ae[var2])) + ")",
						class_acv.o + 2, var1 + 1, 3);
				class_d.e.a(var0,
						var2 + 1 + ": " + ah[var2] + " ("
								+ ((long) ad[var2] - (System.currentTimeMillis() / 1000L - (long) ae[var2])) + ")",
						class_acv.o, var1, 3);
				var1 += 10;
			} else if (!ai[var2].equals("")) {
				class_d.h.a(var0, var2 + 1 + ": " + ai[var2], class_acv.o + 2, var1 + 1, 3);
				class_d.e.a(var0, var2 + 1 + ": " + ai[var2], class_acv.o, var1, 3);
				var1 += 10;
			}
		}

	}

	public final void b(Graphics var1) {
		if (C.size() > 0 && this.aC == null) {
			this.aC = new class_oc(this, (String) C.elementAt(0), class_acv.m + 10, 2);
			C.removeElementAt(0);
		}

		if (this.aC != null) {
			var1 = var1;
			class_oc var3 = this.aC;

			for (int var2 = 0; var2 < class_acv.m; var2 += class_yi.q.getWidth()) {
				var1.drawImage(class_yi.q, var2, var3.c, 0);
			}

			class_d.j[0].a(var1, var3.e, var3.a, var3.b, 0);
		}

	}

	public final boolean a(int var1) {
		if (this.F) {
			this.G.a(var1);
			if (var1 == -7) {
				this.G.a();
			}

			if (var1 == -6) {
				class_acv.e();
				class_acv.f();
				this.F = false;
			}

			if (var1 == -5) {
				String var2 = this.G.e();
				this.G.a("");
				this.h(var2);
			}

			return true;
		} else {
			if (class_px.a != class_acv.q) {
				switch (var1) {
				case 48:
					if (V == 0) {
						V = 1;
					} else {
						V = 0;
					}

					bJ = class_yi.P;
					break;
				case 98:
					class_acv.c[8] = true;
					break;
				case 102:
					class_acv.c[4] = true;
					break;
				case 103:
					class_acv.c[5] = true;
					break;
				case 104:
					class_acv.c[6] = true;
					break;
				case 106:
					class_acv.c[11] = true;
					break;
				case 109:
					class_acv.c[0] = true;
					break;
				case 110:
					class_acv.c[9] = true;
					break;
				case 114:
					class_acv.c[1] = true;
					break;
				case 116:
					class_acv.c[2] = true;
					break;
				case 117:
					class_acv.c[10] = true;
					break;
				case 118:
					class_acv.c[7] = true;
					break;
				case 121:
					class_acv.c[3] = true;
				}
			}

			return false;
		}
	}

	private void h(String var1) {
		if (aD == 0) {
			this.q.da = null;
			a((class_vh) this.q, (String) var1, 200);
			class_act.a().a(this.q.am + ": " + var1, (String) null);
			class_go.a().a(var1);
		}

	}

	private void h(Graphics var1) {
		if ((this.p != 2 || this.F) && !class_acv.u.a) {
			if (this.p == 0) {
				var1.translate(-var1.getTranslateX(), -var1.getTranslateY());
				if (class_acv.w != null || this != class_acv.q) {
					return;
				}

				if (this.r != null && this.r.cF != 2 || this.r == null) {
					int var2 = class_d.b.a("Đóng") + 10;
					var1.setClip(var2, class_acv.n - 16, class_acv.m - var2 - 13, 20);
					if (this.bF < this.bG) {
						++this.bF;
					}

					if (this.cO != null && this.cO.size() > 0) {
						int var3 = this.bC.size();

						for (int var4 = 0; var4 < var3; ++var4) {
							class_kk var5 = (class_kk) this.bC.elementAt(var4);
							String var6 = "";
							if (!var5.a.equals("")) {
								var6 = var6 + var5.a + ": ";
							}

							var6 = var6 + var5.c;
							int var7;
							if ((var7 = class_acv.n - 16 - this.bF + var4 * 18) + 13 >= class_acv.n - 20
									&& var7 <= class_acv.n) {
								class_d.h.a(var1, var6, var2, var7, 0);
							}
						}
					}

					var1.setClip(0, 0, class_acv.m, class_acv.n);
				}
			}

			if (this.F) {
				var1.setClip(0, 0, class_acv.m, class_acv.n);
				this.G.a(var1);
				var1.setClip(0, 0, class_acv.m, class_acv.n);
				class_d.b.a(var1, "Đóng", 5, class_acv.n - class_aae.c, 0);
				class_d.b.a(var1, "Xóa", class_acv.m - 5, class_acv.n - class_aae.c, 1);
			}
		}
	}

	private void i(Graphics var1) {
		if (this.p != 2) {
			if (class_acv.w == null) {
				if (!this.F) {
					if (this.r != null && this.r.cF == 2) {
						class_d.b.a(var1, "Giao tiếp", class_acv.o, class_acv.n - class_aae.c, 2);
					} else {
						class_acv.a(var1);
						int var2 = class_yi.o.getWidth();
						int var3 = class_yi.o.getHeight();
						var1.setColor(cu[this.q.aO]);
						var1.fillRect(class_acv.o - var2 / 2 + 3, class_acv.n - 12 - var3 + bJ, var2 - 3, var3 - 5);

						for (int var4 = 0; var4 < 5; ++var4) {
							if (class_sc.a[V][var4] != null) {
								class_sc.a[V][var4].a(var1,
										class_acv.o - var2 / 2 + var4 * class_yi.P + class_yi.P / 2 - 8,
										class_acv.n - 16 - 6 + class_yi.P / 2 - var3 + bJ - (var4 == 2 ? 1 : 0));
							}

							class_d.b.a(var1, String.valueOf(1 + (var4 << 1)),
									class_acv.o - var2 / 2 + var4 * class_yi.P + class_yi.P / 2 + class_yi.P / 2 - 14,
									class_acv.n - 16 - 10 - var3 + bJ - (var4 == 2 ? 2 : 0), 2);
						}

						var1.drawImage(class_yi.o, class_acv.o - var2 / 2, class_acv.n - 16 - var3 + bJ, 0);
						if (class_acv.q == this && !this.F) {
							var1.drawImage(class_yi.i[0], 2, class_acv.n - 13, 0);
							var1.drawImage(class_yi.i[1], class_acv.m - 15, class_acv.n - 13, 0);
						}

						var1.setColor(9043835);
						var1.fillRect(class_acv.o - 50, class_acv.n - class_aae.c, this.q.aR / 10, 1);
						var1.setColor(1422592);
						var1.fillRect(class_acv.o - 50, class_acv.n - class_aae.c, this.q.aR / 10, 1);
					}
				}
			}
		}
	}

	public static void a(int var0, int var1, Vector var2) {
		for (int var3 = 0; var3 < var2.size(); ++var3) {
			class_ap var4 = (class_ap) var2.elementAt(var3);
			class_abm.b(new class_nx(var0, var1, var4.cK, var4.cL, var4));
		}

	}

	public static void b(int var0, int var1, Vector var2) {
		for (int var3 = 0; var3 < var2.size(); ++var3) {
			class_ap var4 = (class_ap) var2.elementAt(var3);
			class_abm.b(new class_ca(var0, var1, var4));
		}

	}

	public static void a(class_ap var0, class_ap var1, int var2) {
		if (var0 != null && var1 != null) {
			class_mu var3 = new class_mu(var0, var1, 30);
			n.addElement(var3);
		}

	}

	public final void a(int var1, int var2, class_ap var3, class_ap var4, int var5, boolean var6, int var7, int var8,
			int var9, int var10, boolean var11) {
		class_acb var12;
		if (var6) {
			if (var3 != null && var4 != null) {
				var12 = new class_acb(var1, 10, var3, var4, var5, var7, var8, var9, var10, var11);
				n.addElement(var12);
				return;
			}
		} else {
			var12 = new class_acb(var1, 10, var3, var4, var5, var7, var8, var9, var10, var11);
			this.o.addElement(var12);
		}

	}

	public final void a(class_ap var1, class_ap var2, int var3, int var4) {
		for (var3 = 0; var3 < 12; ++var3) {
			this.a(var3 * 30, 10, var1, var2, 0, true, 4, 52, 0, 0, var3 == 11);
		}

		this.z = 20;
	}

	public final void a(class_ap var1, class_ap var2, int var3, int var4, int var5, int var6, int var7) {
		if (var1 != null && var2 != null) {
			class_gc var8 = new class_gc(var1, var2, var3, var4, var6, var7);
			if (var5 == 1) {
				this.o.addElement(var8);
				return;
			}

			n.addElement(var8);
		}

	}

	public static void a(int var0, class_ap var1, class_ap var2, int var3, int var4, int var5, byte var6) {
		class_de var7;
		(var7 = new class_de()).a(var0, var3, var4, var5, var6, var1, var2);
		n.addElement(var7);
	}

	public static void a(int var0, class_ap var1, class_ap var2, int var3, int var4, int var5, byte var6, int var7) {
		class_de var8;
		(var8 = new class_de()).a(var0, var3, var4, var5, var6, var1, var2);
		var8.a(var7);
		n.addElement(var8);
	}

	public static void b(int var0, class_ap var1, class_ap var2, int var3, int var4, int var5, byte var6, int var7) {
		class_yb var8;
		(var8 = new class_yb(var7)).a(var0, var3, var4, var5, var6, var1, var2);
		n.addElement(var8);
	}

	public final void a(byte var1, short var2, short var3, short var4, short var5, byte var6, int var7, byte var8,
			byte var9, boolean var10) {
		if (this.s) {
			bM = true;
			class_vh var11 = null;

			for (int var12 = this.l.size() - 1; var12 >= 0; --var12) {
				var11 = (class_vh) this.l.elementAt(var12);
				if (var1 == var11.cF && var11.cG == var3) {
					var11.dj = var10;
					var11.a(var4, var5);
					if (var11.cF == 0) {
						var11.cR = var6;
						if (var11.K() <= 0 || var11.L() <= 0) {
							var11.i(3);
						}
					}

					bM = false;
					return;
				}
			}

			bM = false;
			class_vh var13 = a(var1, var2, var3, var4, var5, var8, var9);
			if (class_yg.a(this.q, var13)) {
				this.l.addElement(var13);
				var13.dj = var10;
				if (this.l.size() < 200) {
					switch (var1) {
					case 0:
						if (var9 == -1) {
							((class_hw) var13).cc = System.currentTimeMillis();
							((class_hw) var13).cR = var6;
						}

						this.D.b(var3);
						return;
					case 1:
						((class_bb) var13).f = var7;
						this.D.c(var3);
					}
				}

			}
		}
	}

	public static void a(class_hw var0) {
		if (var0.Q != -1) {
			var0.D = 0;
		}

		if (af != null) {
			int var1 = af.length;

			for (int var2 = 0; var2 < var1; ++var2) {
				if (af[var2] == var0.cG) {
					if (var0 != null) {
						var0.cm = null;
					}

					if (var0 != null && ad[var2] > 0) {
						var0.cm = new class_dm(var0.cK, var0.cL - 5, (short) 1, (byte) 1, false);
					}
				}
			}
		}

		if (var0.L > 0 || var0.M > 0) {
			boolean var3 = false;
			byte var4;
			if (var0.L > var0.M) {
				var4 = 21;
			} else {
				var4 = 36;
			}

			var0.bR = new class_di(var0.cK, var0.cL, var4);
		}

	}

	public final void a(short var1, short var2, byte var3, int var4, int var5, byte var6, byte var7, byte var8,
			byte var9) {
		if (this.s) {
			class_hw var11;
			if (var1 == this.q.cG) {
				if ((var11 = (class_hw) this.b(var2)) != null) {
					if (this.q.aL == 0) {
						this.q.aL = var4;
					}

					if (var11 != null) {
						var11.b(var5);
						if (var11.v <= 0 || var11.t <= 0) {
							var11.cV = 3;
						}

						class_zp.a(var6, var11.cK, var11.cL - 25);
						if (var8 == 0) {
							class_zp.a(var6, var11.cK, var11.cL + 35);
						}
					}

					if (var4 > 0) {
						for (int var10 = 0; var10 < var7; ++var10) {
							class_acv.s.a("-" + var4 / var7, 0, var11.cK + (var10 % 2 == 0 ? 0 : -20),
									var11.cL - (var10 % 2 == 0 ? 20 : 30), 1, -2);
						}

						return;
					}
				}
			} else {
				class_hw var13;
				if (var2 == this.q.cG) {
					if ((var11 = (class_hw) this.b(var1)) != null) {
						var11.D = class_yg.b(var11, this.q);
						var11.a(this.q, new class_zp(var4, var6), var3, class_hw.aS[var3]);
						if (class_qz.d(this.q.aO, var3 / 10)) {
							Vector var14;
							(var14 = new Vector()).addElement(this.q);
							var11.af.b(var14);
						}

						if (var8 == 0) {
							class_acv.s.a(class_zp.d[3], 0, var11.cK, var11.cL - 35, 1, -2);
						}
					}

					this.q.J();
					this.q.b(var5);
					var13 = null;

					for (int var12 = this.l.size() - 1; var12 >= 0; --var12) {
						if (((class_vh) this.l.elementAt(var12)).cG == var1) {
							return;
						}
					}

					return;
				}

				if ((var11 = (class_hw) this.b(var2)) != null) {
					var11.b(var5);
					if (var5 == 0) {
						var11.cV = 3;
					}

					if (var8 == 0) {
						class_acv.s.a(class_zp.d[3], 0, var11.cK, var11.cL - 35, 1, -2);
					}
				}

				if ((var13 = (class_hw) this.b(var1)) != null) {
					var13.D = class_yg.b(var13, var11);
					var13.a(var11, new class_zp(var4, var6), var3, var9);
				}
			}

		}
	}

	public final void a(class_abs var1) {
		try {
			short var2 = var1.b().readShort();
			byte var3 = var1.b().readByte();
			int var4 = var1.b().readInt();
			byte var5 = var1.b().readByte();
			byte var6 = var1.b().readByte();
			byte var7 = var1.b().readByte();
			class_hw var8 = (class_hw) this.b(var2);
			byte var9 = var1.b().readByte();
			Vector var10 = new Vector();

			for (int var11 = 0; var11 < var9; ++var11) {
				try {
					class_bb var12 = this.n(var1.b().readShort());
					int var13 = var1.b().readInt();
					if (var12 != null) {
						var10.addElement(var12);
						var12.b(var13);
						if (var13 <= 0) {
							var13 = 0;
							int var14 = 0;
							if (var8 != null) {
								var13 = var12.cK - var8.cK << 1;

								for (var14 = var12.cL - var8.cL << 1; var13 > 10 || var14 > 10 || var13 < -10
										|| var14 < -10; var14 >>= 1) {
									var13 >>= 1;
								}
							}

							var12.a(var13, var14);
						}

						class_zp.a(var5, var12.cK, var12.cL - 25);
						if (var4 > 0) {
							class_acv.s.a("-" + var4, 0, var12.cK, var12.cL - 15, 1, -2);
						}

						if (var7 == 0) {
							class_acv.s.a(class_zp.d[3], 0, var12.cK, var12.cL - 35, 1, -2);
						}
					}
				} catch (Exception var15) {
					(new StringBuffer("LOI TRONG HAM onAttackMultiTarget()")).append(var15.toString()).toString();
				}
			}

			if (this.q.cG == var2) {
				if (this.q.aL == 0) {
					this.q.aL = var4;
				}

				if (var4 > 0) {
					class_acv.s.a("-" + var4, 0, ((class_bb) var10.elementAt(0)).cK,
							((class_bb) var10.elementAt(0)).cL - 15, 1, -2);
				}

				return;
			}

			if (var8 != null && var8.af != null) {
				var8.a((class_bb) var10.elementAt(0), new class_zp(var4, var5), var3, var6);
				var8.af.a(var10);
				return;
			}
		} catch (Exception var16) {
		}

	}

	public final void b(short var1, short var2, byte var3, int var4, int var5, byte var6, byte var7, byte var8,
			byte var9) {
		if (this.s) {
			class_bb var13;
			if ((var13 = this.n(var2)) != null) {
				var13.b(var5);
			}

			if (this.q.cG != var1) {
				try {
					class_hw var12;
					if ((var12 = (class_hw) this.b(var1)) != null && var13 != null) {
						var12.D = class_yg.b(var12, var13);
						var12.a(var13, new class_zp(var4, var6), var3, var9);
						if (var8 == 0) {
							class_zp.a((byte) 3, var13.cK, var13.cL + 35);
							return;
						}
					}
				} catch (Exception var10) {
					var10.printStackTrace();
				}

			} else {
				if (this.q.aL == 0) {
					this.q.aL = var4;
				}

				class_zp.a(var6, var13.cK, var13.cL - 25);
				if (var8 == 0) {
					class_zp.a((byte) 3, var13.cK, var13.cL + 35);
				}

				if (var4 > 0) {
					for (int var11 = 0; var11 < var7; ++var11) {
						class_acv.s.a("-" + var4, 0, var13.cK + (var11 % 2 == 0 ? 0 : -20),
								var13.cL - (var11 % 2 == 0 ? 20 : 30), 1, -2);
					}
				}

			}
		}
	}

	public final void a(class_a var1) {
		if (this.s) {
			class_bb var2;
			if ((var2 = this.n(var1.b)) != null) {
				short var5 = var1.a;
				class_hw var3 = (class_hw) this.b((short) var5);
				if (var2 != null) {
					int var9 = 0;
					int var6 = 0;
					if (var3 != null) {
						var9 = var2.cK - var3.cK << 1;

						for (var6 = var2.cL - var3.cL << 1; var9 > 10 || var6 > 10 || var9 < -10
								|| var6 < -10; var6 >>= 1) {
							var9 >>= 1;
						}
					}

					var2.a(var9, var6);
				}

				if (this.r == var2) {
					this.r = null;
				}

				int var8;
				if (var1.d != null) {
					for (var8 = 0; var8 < var1.d.length; ++var8) {
						class_ba var4;
						(var4 = (class_ba) a((byte) var1.d[var8].a, (short) var1.d[var8].b, (short) var1.d[var8].c,
								var1.d[var8].d, (short) var1.d[var8].e, (byte) 0, (byte) -1))
								.a(var2.cK, var2.cL, var4.cK, var4.cL);
						this.l.addElement(var4);
					}
				}

				if (this.q.cG == var1.a) {
					class_zp.a(var1.f, var2.cK, var2.cL - 25);

					try {
						if (var1.e > 0) {
							if (aV != null && aV.d()) {
								if (aV.b()) {
									aV.a(var2.l, var2.a_());
								} else if (aV.c()) {
									aV.b(c(this.q.N - var2.N));
								}
							}

							if (aW != null && aW.d()) {
								if (aW.b()) {
									aW.a(var2.l, var2.a_());
								} else if (aW.c()) {
									aW.b(c(this.q.N - var2.N));
								}
							}

							if (aX != null && aX.d()) {
								if (aX.b()) {
									aX.a(var2.l, var2.a_());
								} else if (aX.c()) {
									aX.b(c(this.q.N - var2.N));
								}
							}

							if (this.q.aL == 0) {
								this.q.aL = var1.e;
							}

							if (this.q.f(var2.l)) {
								this.a(new class_kk("", "Giết " + this.q.cy + " " + var2.a_()));
								if (class_nu.G != -1) {
									if (class_nu.L + 1 >= class_nu.M) {
										class_nu.G = -1;
										this.a(new class_kk("", "Hoàn thành nhiệm vụ."));
									} else {
										this.a(new class_kk("", "Giết được " + ++class_nu.L + "/" + class_nu.M));
									}
								}
							}

							if (var1.e > 0) {
								for (var8 = 0; var8 < var1.g; ++var8) {
									class_acv.s.a("-" + var1.e, 0, var2.cK + (var8 % 2 == 0 ? 0 : -20),
											var2.cL - (var8 % 2 == 0 ? 20 : 30), 1, -2);
								}

								return;
							}
						}
					} catch (Exception var7) {
						var7.printStackTrace();
					}

				} else {
					var1.e = (short) (var1.e / var1.g);
					if ((var3 = (class_hw) this.b(var1.a)) != null && var2 != null) {
						var3.D = class_yg.b(var3, var2);
						if (!class_qz.d(var3.aO, var1.c / 10)) {
							var3.a(var2, new class_zp(var1.e, var1.f), var1.c, var1.h);
						}
					}

				}
			}
		}
	}

	public final void a(short var1, short var2) {
		this.l.addElement(new class_zq(var1, var2));
	}

	public final class_vh b(short var1) {
		bL = true;

		for (int var2 = this.l.size() - 1; var2 >= 0; --var2) {
			class_vh var3;
			if ((var3 = (class_vh) this.l.elementAt(var2)).cF == 0 && var3.cG == var1) {
				bL = false;
				return var3;
			}
		}

		bL = false;
		return null;
	}

	public final class_vh findActorByName(String name) {
		bL = true;
		for (int var2 = this.l.size() - 1; var2 >= 0; --var2) {
			class_vh var3 = (class_vh) this.l.elementAt(var2);
			if (var3.a_().equals(name)) {
				bL = false;
				return var3;
			}
		}
		bL = false;
		return null;
	}

	public final class_vh findActorNameStartWith(String name) {
		bL = true;
		for (int var2 = this.l.size() - 1; var2 >= 0; --var2) {
			class_vh var3 = (class_vh) this.l.elementAt(var2);
			if (var3.a_().startsWith(name)) {
				bL = false;
				return var3;
			}
		}
		bL = false;
		return null;
	}

	private class_bb n(short var1) {
		bN = true;
		class_vh var2 = null;

		for (int var3 = this.l.size() - 1; var3 >= 0; --var3) {
			if ((var2 = (class_vh) this.l.elementAt(var3)).cF == 1 && var2.cG == var1) {
				bN = false;
				return (class_bb) var2;
			}
		}

		bN = false;
		return null;
	}

	public final class_vh c(short var1) {
		class_vh var2 = null;

		for (int var3 = this.l.size() - 1; var3 >= 0; --var3) {
			if ((var2 = (class_vh) this.l.elementAt(var3)).cG == var1) {
				return var2;
			}
		}

		return null;
	}

	private class_vh d(short var1, byte var2) {
		class_vh var3 = null;

		for (int var4 = this.l.size() - 1; var4 >= 0; --var4) {
			if ((var3 = (class_vh) this.l.elementAt(var4)).cG == var1 && var3.cF == var2) {
				return var3;
			}
		}

		return null;
	}

	private class_ba a(short var1, int var2) {
		for (int var3 = this.l.size() - 1; var3 >= 0; --var3) {
			class_vh var4;
			if ((var4 = (class_vh) this.l.elementAt(var3)).cF == var2 && var4.cG == var1) {
				return (class_ba) var4;
			}
		}

		return null;
	}

	public final void j() {
		class_ko.a().b();
		this.q.cg = System.currentTimeMillis();
		if (this.q.ap <= 0) {
			this.q.ap = class_hw.cd[this.q.aO];
		}

		if (this.q.N == 1 && this.q.aR == 0) {
			this.cq = true;
			this.q.b = this.q.c = this.q.d = true;
		}

		if (this.q.L > 0 || this.q.M > 0) {
			boolean var1 = false;
			byte var2;
			if (this.q.L > this.q.M) {
				var2 = 21;
			} else {
				var2 = 36;
			}

			this.q.bR = new class_di(this.q.cK, this.q.cL, var2);
		}

		this.q.P();
		class_wc.a().f();
	}

	public final void a(class_by var1) {
		if (this.s) {
			class_bb var2;
			if ((var2 = this.n(var1.a)) != null) {
				var2.a(var1);
			}

		}
	}

	public final void d(short var1) {
		if (this.s) {
			class_vh var2 = null;

			for (int var3 = 0; var3 < this.l.size(); ++var3) {
				if ((var2 = (class_vh) this.l.elementAt(var3)).cF == 0 && var2.cG == var1) {
					var2.cE = true;
					return;
				}
			}

		}
	}

	public final void b(class_abs var1) {
		try {
			short var2 = var1.b().readShort();
			byte var3 = var1.b().readByte();
			class_bb var12;
			if ((var12 = this.n(var2)) != null) {
				byte var4 = var1.b().readByte();
				Vector var5 = new Vector();

				int var6;
				for (var6 = 0; var6 < var4; ++var6) {
					short var7 = var1.b().readShort();
					class_ap var8;
					if ((var8 = (class_ap) this.c(var7)) != null) {
						var8.J = var1.b().readInt();
						int var9 = var1.b().readInt();
						if (this.q.cG == var7) {
							if (this.q.ce) {
								this.q.cV = 0;
								this.q.ce = false;
							}

							this.q.t = this.q.v = var9;
							var12.D = class_yg.b(var12, this.q);
							if (this.r == null) {
								this.r = var12;
							}

							var5.addElement(this.q);
						} else {
							if (var12.l != 90) {
								var12.getClass();
							}

							if (var8 != null) {
								var8.t = var8.v = var9;
								if (var8.v <= 0) {
									((class_hw) var8).cV = 3;
								}

								var12.D = class_yg.b(var12, var8);
							}

							var5.addElement(var8);
						}
					} else {
						var1.b().readInt();
						var1.b().readInt();
					}
				}

				var12.a(var5, var3);

				try {
					var6 = var1.b().readUnsignedByte();
					var12.k(var6);
					int var13 = var1.b().readUnsignedByte();
					var12.l(var13);
					return;
				} catch (Exception var10) {
					return;
				}
			}
		} catch (Exception var11) {
			var11.printStackTrace();
		}

	}

	public final void a(short var1, short var2, int var3, int var4) {
		if (this.s) {
			class_bb var5;
			if ((var5 = this.n(var1)) != null) {
				if (var2 == 32001) {
					var5.r();
					return;
				}

				if (var5.l != 84) {
					var5.u();
				}

				Vector var7;
				if (this.q.cG == var2) {
					var5.a(this.q);
					if (this.q.ce) {
						this.q.cV = 0;
						this.q.ce = false;
					}

					this.q.t = this.q.v = var4;
					if (var5.l == 90) {
						this.a(var3 != 0 ? "-" + var3 : "MISS", var3 == 0 ? 0 : 4, this.q.cK, this.q.cL - 40, 0, -1);
						var5.a(this.q, var3, (byte) 8, (byte) 4);
						if (this.q.v <= 0) {
							this.q.cV = 3;
						}

						return;
					}

					var5.D = class_yg.b(var5, this.q);
					if (this.r == null) {
						this.r = var5;
					}

					if (class_yg.d(this.q.cK - var5.cK) + class_yg.d(this.q.cL - var5.cL) < 48) {
						this.q.l();
						this.a(var3 != 0 ? "-" + var3 : "MISS", var3 == 0 ? 0 : 4, this.q.cK, this.q.cL - 40, 0, -1);
						if (var5.l != 90) {
							class_abm.a(this.q.cK, this.q.cL - 10, 9);
						}

						if (this.q.v <= 0) {
							this.q.cV = 3;
						}
					} else if (var5.l != 90) {
						a((int) 20, (class_ap) var5, (class_ap) this.q, (int) var5.cK, var5.cL, var3, (byte) 0);
					}

					this.q.J();
					if (var5.l == 84) {
						(var7 = new Vector()).addElement(this.q);
						var5.a(var7, (byte) 0);
						return;
					}
				} else {
					class_hw var6;
					if ((var6 = (class_hw) this.b(var2)) != null) {
						var5.a(var6);
						var6.t = var6.v = var4;
						if (var6.v <= 0) {
							var6.cV = 3;
						}

						var5.D = class_yg.b(var5, var6);
						var6.l();
						this.a(var3 != 0 ? "-" + var3 : "MISS", var3 == 0 ? 0 : 4, var6.cK, var6.cL - 40, 0, -1);
						if (var5.l == 90) {
							var5.a(var6, var3, (byte) 8, (byte) 4);
							return;
						}

						class_abm.b.addElement(new class_di(var6.cK, var6.cL - 10, 9));
						if (var5.l == 84) {
							(var7 = new Vector()).addElement(var6);
							var5.a(var7, (byte) 0);
						}
					}
				}
			}

		}
	}

	public final void k() {
		System.currentTimeMillis();
		this.bU = 30;
	}

	public static void l() {
		class_acv.b("Xin chờ..", true);
	}

	public final void m() {
		class_acv.a("Không thể kết nối. Vui lòng chọn server khác", new class_aav(this));
	}

	public final void n() {
		if (class_acv.q != class_acv.v) {
			if (au) {
				au = false;
				class_acv.L.b.perform();
				return;
			}

			au = false;
			class_acv.x.a("Bị ngắt kết nối.", (class_s) null, new class_s("OK", new class_aaw(this)), (class_s) null);
			class_acv.w = class_acv.x;
		}

	}

	public final void a(short var1, short var2, short var3, short var4, String var5, byte[] var6) {
		System.out.println((new StringBuffer("onMap: ")).append(var1).toString());
		class_acv.g();
		this.q.s = null;
		this.q.cm = null;
		this.r = null;
		this.cQ.removeAllElements();
		cP = null;
		bK = null;
		this.cc.removeAllElements();
		if (ak != null) {
			ak.removeAllElements();
		}

		Y = null;
		if (var4 == -1) {
			var4 = var1;
		}

		if (var2 != -1 && var3 != -1) {
			this.q.cK = this.q.av = (short) ((var2 << 4) + 8);
			this.q.cL = this.q.aw = (short) ((var3 << 4) + 8);
			class_sc var10000;
			if (this.q.cK / 16 <= 1) {
				var10000 = this.q;
				var10000.cK = (short) (var10000.cK + 32);
			}

			if (this.q.cL / 16 <= 1) {
				var10000 = this.q;
				var10000.cL = (short) (var10000.cL + 32);
			}

			this.q.av = this.q.cK;
			this.q.aw = this.q.cL;
			if (this.q.bV != null) {
				b(this.q.bV, this.q);
			}
		}

		boolean var8 = false;
		this.l.removeAllElements();
		if (this.q != null) {
			this.l.addElement(this.q);
		}

		if (this.aG != var1) {
			var8 = true;
			this.aG = var1;
			class_yi.S.a(var4, new class_aay(this), var6);
		}

		if (var4 == 107) {
			this.q.bP = 1;
			this.q.cf = 1;
			this.q.bM = System.currentTimeMillis();
		} else if (var4 == 10) {
			this.q.bP = -1;
			this.q.cf = -1;
			if (this.q.bq[20] > 0) {
				int var10002 = this.q.bq[20]--;
			}
		}

		if (var4 != 201) {
			ad = null;
		}

		this.q.cV = 0;
		this.q.ce = false;

		try {
			if (class_acv.v != null) {
				class_acv.v = null;
				class_bq.a = null;
				class_acv.C = null;
				class_yv.g();
			}

			class_acv.w = null;
			class_acv.e();
			class_acv.f();
			class_ls.a(var4);
			a = var5;
			if (!var8) {
				class_acv.s.d();
				this.F();
				this.o();
			}
		} catch (Exception var7) {
		}

		bO[0] = new class_uv();
	}

	public final void o() {
		int var1 = this.cN.size();
		class_hn var2 = null;

		for (int var3 = 0; var3 < var1; ++var3) {
			var2 = (class_hn) this.cN.elementAt(var3);
			if (!this.l.contains(var2)) {
				this.l.addElement(var2);

				for (int var4 = 0; var4 < var2.b / 2; ++var4) {
					int var5;
					if ((var5 = var2.cL / 16 * class_ls.a + (var2.cK / 16 - var4)) < class_ls.g.length) {
						class_ls.g[var5] = 2;
					}

					if ((var5 = var2.cL / 16 * class_ls.a + var2.cK / 16 + var4) < class_ls.g.length) {
						class_ls.g[var5] = 2;
					}

					for (var5 = 0; var5 < var2.c / 2; ++var5) {
						int var6;
						if ((var6 = (var2.cL / 16 - var5) * class_ls.a + (var2.cK / 16 - var4)) < class_ls.g.length) {
							class_ls.g[var6] = 2;
						}

						if ((var6 = (var2.cL / 16 - var5) * class_ls.a + var2.cK / 16 + var4) < class_ls.g.length) {
							class_ls.g[var6] = 2;
						}
					}
				}
			}
		}

		this.cN.removeAllElements();
	}

	private void F() {
		if (class_hw.aS[0] == 0 && (class_ls.j != 0 || class_ls.j != 101) && class_ls.j != 105 && X == 0) {
			X = 1;
			class_acv.a("Bạn có muốn hệ thống tự động làm nhiệm vụ cho bạn hay không ?", new class_aba(this),
					new class_abd(this));
		}

	}

	public final void c(String var1) {
		if (var1.startsWith("1")) {
			class_acv.a(var1.substring(1), new class_abf(this));
		} else {
			class_acv.a(var1);
		}
	}

	public final void a(String var1, String[] var2, short[] var3, String[] var4) {
		class_acv.g();
		class_acv.a(var1, new class_abg(this, var2, var3, var4));
	}

	public final void a(short var1, Vector var2, byte var3, byte var4, String var5, class_af var6, short[] var7,
			byte var8) {
		if (var1 == this.q.cG) {
			this.q.aP = var3;
			this.q.a(var2);
			this.q.ak = var4;
			this.q.an = var5;
			this.q.bW = var7;
			this.q.al = var8;
			if (var6 != null) {
				var6.i = this.q.cG;
				this.a((class_af) var6, (class_hw) this.q);
				return;
			}

			if (this.q.bV != null) {
				this.q.bV.a = 3;
				this.q.bV.q = 20;
				return;
			}
		} else {
			class_hw var9;
			if ((var9 = (class_hw) this.b(var1)) != null) {
				var9.aP = var3;
				var9.a(var2);
				var9.ak = var4;
				var9.an = var5;
				var9.bW = var7;
				var9.al = var8;
				if (var6 != null) {
					var6.i = var9.cG;
					this.a(var6, var9);
					return;
				}

				if (var9.bV != null) {
					var9.bV.a = 3;
					var9.bV.q = 20;
				}
			}
		}

	}

	private void a(class_af var1, class_hw var2) {
		if (var1.l == 5) {
			this.o(var2.cG);
			class_az var7 = new class_az(var2, var1.m);
			b(var1, var2);
			this.l.addElement(var7);
		} else {
			this.o(var2.cG);
			int var3 = this.l.size();

			for (int var4 = 0; var4 < var3; ++var4) {
				class_vh var5;
				class_af var6;
				if ((var5 = (class_vh) this.l.elementAt(var4)) != null && var5.cF == var1.cF && !var5.q()
						&& (var6 = (class_af) var5).i == var1.i) {
					var6.l = var1.l;
					var6.m = var1.m;
					var6.g = var1.g;
					var6.s = var1.s;
					var6.p = var1.p;
					var6.r = var1.r;
					b(var6, var2);
					return;
				}
			}

			var1.b();
			b(var1, var2);
			this.l.addElement(var1);
		}
	}

	private void o(short var1) {
		for (int var2 = 0; var2 < this.l.size(); ++var2) {
			class_vh var3;
			if ((var3 = (class_vh) this.l.elementAt(var2)) != null && var3.cF == 12 && var3.cG == var1 && var3.q()) {
				this.l.removeElement(var3);
			}
		}

	}

	private static void b(class_af var0, class_hw var1) {
		var0.f = 1;
		var0.e = 1;
		var0.j = var1;
		var1.bV = var0;
		var0.cK = var0.c = var1.D != 2 && var1.D != 1 ? (short) (var1.cK - 20) : (short) (var1.cK + 20);
		var0.cL = var0.d = var1.cL;
		if (var0.l != 1) {
			var0.h = (short) (-var1.cM + 15);
		} else {
			var0.h = 0;
		}

		var0.k = (byte) var1.I;
		var0.a = 0;
		var0.n = var0.o = 0;
		var0.b();
	}

	public final void a(short var1, Vector var2, Image var3, byte var4, int var5, int var6, byte var7) {
		if (var1 == this.q.cG) {
			this.q.aY = var3;
			this.q.bp = var4;
			this.q.aM = var5;
			this.q.aN = var6;
			this.q.aQ = var7;
			this.q.b(var2);
		} else {
			class_hw var8;
			if ((var8 = (class_hw) this.b(var1)) != null) {
				var8.aY = var3;
				var8.bp = var4;
				var8.aM = var5;
				var8.aN = var6;
				var8.aQ = var7;
				var8.b(var2);
				class_nu.a().a(0, false, new byte[] { 31 });
				class_nu.O = var8;
				class_nu.a().d();
				class_nu.a().m = "Trang bị thú";
				class_acv.g();
			}

		}
	}

	public final void a(long var1, int[] var3, Vector var4, Vector var5, int var6) {
		this.q.a(var1, var3, var4, var5, var6);
		this.G();
		if (class_acv.q == class_nu.a() && class_nu.x[class_nu.w] == 0) {
			class_nu.a().Q = true;
			class_wc.a();
			class_wc.b(0);
			class_nu.a().Q = false;
		}

	}

	public static int c(int var0) {
		return var0 > 0 ? var0 : -var0;
	}

	public final void a(short var1, class_ql var2) {
		short var4 = var2.k;
		class_abj var3 = this;
		class_vh var5 = null;
		int var6 = this.l.size() - 1;

		class_gs var10000;
		while (true) {
			if (var6 < 0) {
				var10000 = null;
				break;
			}

			if ((var5 = (class_vh) var3.l.elementAt(var6)).cF == 3 && var5.cG == var4) {
				var10000 = (class_gs) var5;
				break;
			}

			--var6;
		}

		class_gs var7 = var10000;
		if (var10000 != null) {
			class_hw var8;
			if ((var8 = (class_hw) this.b(var1)) != null) {
				if (var8 == this.q) {
					this.a(new class_kk("", "Nhặt được " + var7.a_()));
				}

				var7.b(var8.cK, var8.cL);
			}

			var7.cE = true;
		}

		if (var1 == this.q.cG) {
			class_hw.bu.addElement(var2);
			if (this.q.b) {
				class_acv.a("Bạn vừa nhặt được một món đồ.", false, 10);
				this.q.b = false;
			}
		}

	}

	public final void a(short var1, short var2, short var3, short var4) {
		class_gb var6;
		if ((var6 = (class_gb) this.a((short) var2, (int) 4)) != null) {
			class_hw var5;
			if ((var5 = (class_hw) this.b(var1)) != null) {
				if (var5 == this.q) {
					this.a("+" + var4 + var6.e().toLowerCase(), 2, this.q.cK - 10, this.q.cL - 30, 1, -1);
					if (this.q.g(var6.c)) {
						this.a(new class_kk("", "Nhặt " + this.q.cy + " " + var6.e()));
					}
				}

				var6.b(var5.cK, var5.cL);
			} else {
				var6.cE = true;
			}
		}

		if (var1 == this.q.cG) {
			if (var3 == 0) {
				class_sc var10000 = this.q;
				var10000.br += (long) var4;
			} else {
				int[] var7 = this.q.bq;
				var7[var3] += var4;
			}

			if (var3 == 0) {
				if (this.q.c) {
					class_acv.a("Bạn vừa nhặt được xu Bạn có thể dùng xu để mua HP, MP và đồ dùng khác.", false, 1);
					this.q.c = false;
					return;
				}
			} else {
				if (L != -1 && L == var3) {
					if (++class_nu.L >= class_nu.M) {
						L = -1;
						this.a(new class_kk("", "Hoàn thành nhiệm vụ."));
					} else {
						this.a(new class_kk("", "Nhặt được: " + class_nu.L + "/" + class_nu.M));
					}
				}

				if (this.q.d) {
					class_acv.a("Bạn vừa nhặt được một vật phẩm dùng được. Xin vào mục hành trang để xem.", false, 1);
					this.q.d = false;
				}
			}
		}

	}

	public final void a(short var1, short var2, byte var3) {
		class_v var5;
		if ((var5 = (class_v) this.a((short) var2, (int) var3)) != null) {
			class_hw var4;
			if ((var4 = (class_hw) this.b(var1)) != null) {
				var5.b(var4.cK, var4.cL);
				return;
			}

			var5.cE = true;
		}

	}

	public final void b(short var1, short var2, byte var3) {
		class_aq var5;
		if ((var5 = (class_aq) this.a((short) var2, (int) 14)) != null) {
			class_hw var4;
			if ((var4 = (class_hw) this.b(var1)) != null) {
				var5.b(var4.cK, var4.cL);
			} else {
				var5.cE = true;
			}

			if (this.q.cG == var1) {
				if (aV != null && aV.d()) {
					aV.a(var3);
				}

				if (aW != null && aW.d()) {
					aW.a(var3);
				}

				if (aX != null && aX.d()) {
					aX.a(var3);
				}
			}
		}

	}

	private void a(Vector var1, class_ql var2) {
		class_ql var3;
		if ((var3 = a(var1, var2.i)) != null) {
			var3.F = true;
			var3.D = var2.D;
			var3.w = var2.w;
			var3.G = var2.G;
			var3.H = var2.H;
			var3.t = var2.t;
			var3.u = var2.u;
			var3.x = System.currentTimeMillis();
			var3.C = var2.C;
			if (var2.s > -1) {
				var3.s = var2.s;
			}
		}

	}

	public final void a(class_ql var1) {
		this.a(class_hw.bu, var1);
		if (class_nu.O != null) {
			this.a(class_nu.O.aT, var1);
			if ((class_nu.O.ck != -1 || class_nu.O.bb > -1) && class_nu.O.aU != null && class_nu.O.aU.size() > 0) {
				this.a(class_nu.O.aU, var1);
			}
		}

		this.a(this.q.j, var1);
		this.a(this.q.k, var1);
		this.a(class_hw.bx, var1);
		this.a(class_nu.a().B, var1);
		if (class_nu.a().F != null && class_nu.a().F.size() > 0) {
			this.a(class_nu.a().F, var1);
		}

		if (class_acv.q == class_nu.a()) {
			class_nu.a().s();
			if (class_nu.x[class_nu.w] != 21 && class_nu.x[class_nu.w] != 25) {
				if (class_nu.x[class_nu.w] == 32) {
					class_nu.a().r();
				} else {
					class_nu.a().bb.b.perform();
				}
			} else {
				class_nu.a().l();
			}
		} else if (class_acv.q == class_hr.a()) {
			class_hr.a().g(var1.i);
		} else {
			if (class_acv.q == class_acv.J) {
				class_acv.J.m();
			}

		}
	}

	public final void a(short var1, int var2, int var3) {
		class_hw var4;
		if ((var4 = (class_hw) this.b(var1)) != null) {
			if (var2 == 1) {
				var4.cR = (byte) var3;
			} else {
				var4.cR = 0;
			}
		}
	}

	public final void a(short var1, byte var2, short var3, int var4, int var5) {
		class_hw var6;
		if ((var6 = (class_hw) this.b(var1)) != null) {
			if (var4 <= 0) {
				var6.v = 0;
				var6.t = 0;
				var6.cV = 3;
			} else {
				switch (var2) {
				case 1:
				case 2:
				case 3:
				case 21:
				case 22:
					if (var6.v < var4) {
						var6.v = var6.t = var4;
					}

					this.a(var3 > 0 ? "hp+" : "hp" + var3, 4, var6.cK - 10, var6.cL - 30, 0, -1);
					return;
				case 4:
				case 5:
				case 6:
				case 23:
				case 24:
					if (var6.bz < var4) {
						var6.bz = var4;
					}

					this.a(var3 > 0 ? "mp+" : "mp" + var3, 3, var6.cK - 10, var6.cL - 40, 0, -1);
				case 34:
				case 82:
				case 85:
					if (var5 == 1) {
						if (var6.v < var4) {
							var6.v = var6.t = var4;
						}

						this.a(var3 > 0 ? "hp+" : "hp" + var3, 4, var6.cK - 10, var6.cL - 30, 0, -1);
						return;
					} else {
						if (var6.bz < var4) {
							var6.bz = var4;
						}

						this.a(var3 > 0 ? "mp+" : "mp" + var3, 3, var6.cK - 10, var6.cL - 40, 0, -1);
					}
				default:
				}
			}
		}
	}

	private static class_ql a(Vector var0, short var1) {
		int var2 = var0.size();

		for (int var3 = 0; var3 < var2; ++var3) {
			class_ql var4;
			if ((var4 = (class_ql) var0.elementAt(var3)).i == var1) {
				return var4;
			}
		}

		return null;
	}

	public final void e(short var1) {
		class_ql var2;
		if ((var2 = a(class_hw.bu, var1)) != null) {
			class_hw.bu.removeElement(var2);
			if (class_hw.a(class_hw.bx, var2) == -1) {
				class_hw.bx.addElement(var2);
			}

		} else {
			if (class_nu.a() == class_acv.q && class_nu.x[class_nu.w] == 22) {
				class_nu.a().b(0);
			}

		}
	}

	public final void f(short var1) {
		class_ql var2;
		if ((var2 = a(class_hw.bx, var1)) != null) {
			class_hw.bx.removeElement(var2);
			if (class_hw.a(class_hw.bu, var2) == -1) {
				class_hw.bu.addElement(var2);
			}

		}
	}

	public final void a(Vector var1) {
		class_hw.bx = var1;
		a(0, true, new byte[] { 22 });
	}

	public final void a(byte[] var1) {
		this.w.removeAllElements();
		int var2 = var1.length;
		class_ql var3 = null;

		for (int var4 = 0; var4 < var2; ++var4) {
			(var3 = new class_ql()).g = 4;
			var3.l = var1[var4];
			var3.F = true;
			var3.A = true;
			this.w.addElement(var3);
		}

		a(1, true, new byte[] { 0, 19 });
	}

	public final void p() {
		this.w.removeAllElements();
		int var1 = class_yi.e.size();
		class_xv var2 = null;

		for (int var3 = 0; var3 < var1; ++var3) {
			if ((var2 = (class_xv) class_yi.e.elementAt(var3)).q) {
				this.w.addElement(var2);
			}
		}

		a(1, true, new byte[] { 0, 10 });
	}

	public final void b(Vector var1) {
		this.w = var1;
		class_yc var2;
		if (((var2 = class_yi.b((int) ((class_ql) var1.elementAt(0)).r)).c <= 2 || var2.c >= 8)
				&& (var2.c < 14 || var2.c > 18)) {
			class_nu.a().a(0, true, new byte[] { 11, 12, 13, 14, 15, 16, 17, 18, 0 });
		} else {
			class_nu.a().a(1, true, new byte[] { 0, 9 });
		}

		class_nu.a().d();
	}

	public final void a(short var1, String var2) {
		class_vh var3;
		if ((var3 = this.c(var1)) != null) {
			var3.da = null;
			if (var3 instanceof class_hw) {
				if (((class_hw) var3).Q != -1) {
					a((class_vh) var3, (String) var2, 500);
					return;
				}

				a((class_vh) var3, (String) var2, 50);
				class_act.a().a(((class_hw) var3).am + ": " + var2, (String) null);
				return;
			}

			a((class_vh) var3, (String) var2, 50);
		}

	}

	public final void g(short var1) {
		class_ql var2;
		if ((var2 = a(class_hw.bu, var1)) != null) {
			class_hw.bu.removeElement(var2);
			class_yc var3 = class_yi.b((int) var2.r);
			class_sc var10000 = this.q;
			var10000.br += (long) (var3.j / 5);
			class_acv.a("Đã bán thành công.", false);
		}

	}

	public final void h(short var1) {
		class_gz var2;
		if ((var2 = class_gz.b(var1)) != null) {
			--var2.c;
			if (var2.c <= 0) {
				class_sc.g.removeElement(var2);
				class_xv var3 = class_yi.a(var2.a);
				class_sc var10000 = this.q;
				var10000.br += (long) (var3.r / 5);
				class_acv.a("Đã bán thành công.");
			}
		}

	}

	public final void a(short var1, short var2, class_du var3) {
		class_ql var4;
		class_ba var5;
		if ((var4 = a(class_hw.bu, var2)) != null) {
			class_hw.bu.removeElement(var4);
			(var5 = (class_ba) a((byte) var3.a, (short) var3.b, (short) var3.c, var3.d, (short) var3.e, (byte) 0,
					(byte) -1)).a(this.q.cK, this.q.cL, var5.cK, var5.cL);
			this.l.addElement(var5);
			if (this.q.cG == var1) {
				class_acv.a("Đã bỏ vật phẩm ra đất.");
			}

		} else {
			(var5 = (class_ba) a((byte) var3.a, (short) var3.b, (short) var3.c, var3.d, (short) var3.e, (byte) 0,
					(byte) -1)).a(this.q.cK, this.q.cL, var5.cK, var5.cL);
			this.l.addElement(var5);
		}
	}

	public final void a(short var1, short var2, int var3) {
		class_hw var4;
		if ((var4 = (class_hw) this.b(var1)) != null) {
			if (var4.a_().equals(class_acv.s.q.a_())) {
				MainCharInfo.expPlus += var3;
			}
			var4.aR = var2;
			this.a("+" + var3 + "xp", 2, var4.cK, var4.cL - 30, -1, -1);
		}

	}

	public final void a(short var1, class_zs[] var2) {
		class_hw var3;
		if ((var3 = (class_hw) this.b(var1)) != null) {
			for (int var4 = 0; var4 < var2.length; ++var4) {
				var3.a(var2[var4]);
			}
		}

	}

	public final void a(short var1, byte var2, int var3, int var4) {
		class_hw var5;
		if ((var5 = (class_hw) this.b(var1)) != null) {
			var5.N = var2;
			var5.bB = 30;
			var5.D = 0;
			var5.w = var3;
			var5.by = var4;
			var5.v = var3;
			var5.bz = var4;
			var5.t = var5.v;
			this.a("level-up", 3, var5.cK, var5.cL - 30, -1, 1);
			this.a("level-up", 3, var5.cK, var5.cL - 30, 1, -1);
			this.a("level-up", 3, var5.cK, var5.cL - 30, -1, -1);
			this.a("level-up", 3, var5.cK, var5.cL - 30, 1, 1);
			if (var5 != null) {
				class_abm.a(var5.cK, var5.cL - 30, 18);
			}

			if (var5 == this.q) {
				this.a(new class_kk("", "Đạt được level " + var2));
				if (var2 == 2) {
					class_acv.a("Xin chúc mừng! Bạn vừa lên cấp. Chọn menu, nhân vật để tăng điểm tiềm năng và kỹ năng",
							false, 20);
				}
			}

		}
	}

	public final void a(short var1, byte var2) {
		int var3 = this.l.size();
		class_vh var4 = null;

		for (int var5 = 0; var5 < var3; ++var5) {
			if ((var4 = (class_vh) this.l.elementAt(var5)).cF == var2 && var4.cG == var1) {
				this.l.removeElement(var4);
				return;
			}
		}

	}

	public final void i(short var1) {
		this.q.cI = var1;
		this.q.cJ = this.q.cG;
		if (H != -1) {
			this.D.e(H, 0);
			H = -1;
		}

	}

	public final void c(class_abs var1) {
		try {
			byte var2;
			byte var4;
			short var9;
			String var10;
			if ((var2 = var1.b().readByte()) == 0) {
				short var5 = var1.b().readShort();
				var9 = var1.b().readShort();
				var10 = var1.b().readUTF();
				var4 = var1.b().readByte();
				var1.b().readShort();
				class_abs var11 = new class_abs((byte) 49);
				if (au && class_acv.I.f && !this.t) {
					try {
						var11.c().writeByte(1);
						var11.c().writeShort(var9);
						this.D.a.a(var11);
						var11.d();
						class_sc.a(new class_xz(var9, var10, var4, var1.b().readByte()));
						this.q.cJ = var9;
						this.q.cI = var5;

						while (var1.b().available() > 0) {
							class_sc.a(new class_xz(var1.b().readShort(), var1.b().readUTF(), var1.b().readByte(),
									var1.b().readByte()));
						}

						this.a(new class_kk("", "Đã tham gia nhóm"));
					} catch (Exception var7) {
						var7.printStackTrace();
					}

					class_acv.w = null;
					return;
				}

				class_acv.a(var10 + " mời bạn tham gia nhóm.",
						new class_ach(this, var11, var9, var10, var4, var1, var5), new class_aci(this, var11, var9));
				return;
			}

			if (var2 == 1) {
				var9 = var1.b().readShort();
				var10 = var1.b().readUTF();
				var4 = var1.b().readByte();
				if (class_hw.bw.size() <= 0) {
					this.q.cJ = this.q.cG;
				}

				class_sc.a(new class_xz(var9, var10, var4, var1.b().readByte()));
				this.a(new class_kk("", var10 + " đã tham gia nhóm."));
				return;
			}

			if (var2 == 2) {
				class_acv.a(var1.b().readUTF() + " từ chối vào nhóm.");
				return;
			}

			if (var2 == 3) {
				int var6 = var1.b().available();

				while (var6 > 0) {
					class_xz var3 = new class_xz(var1.b().readShort(), var1.b().readUTF(), var1.b().readByte(),
							var1.b().readByte());
					this.a(new class_kk("", var3.b + " đã vào nhóm."));
					class_sc.a(var3);
				}

				return;
			}
		} catch (Exception var8) {
			var8.printStackTrace();
		}

	}

	public final void d(class_abs var1) {
		try {
			byte var2 = var1.b().readByte();
			String var3 = null;
			if (var2 == 0 || var2 == 2) {
				short var5;
				if ((var5 = var1.b().readShort()) == this.q.cG) {
					this.q.cI = -1;
					this.q.cJ = -1;
					class_hw.bw.removeAllElements();
					if (var2 == 0) {
						this.a(new class_kk("", "Bị đuổi khỏi nhóm"));
						return;
					}

					this.a(new class_kk("", "Rời khỏi nhóm"));
					return;
				}

				if (!(var3 = class_sc.b(var5)).equals("")) {
					if (var2 == 0) {
						this.a(new class_kk("", var3 + " bị đuổi khỏi nhóm"));
					} else {
						this.a(new class_kk("", var3 + " rời khỏi nhóm"));
					}
				}

				if (class_hw.bw.size() <= 0) {
					class_hw.bw.removeAllElements();
					this.q.cI = -1;
					this.q.cJ = -1;
					this.a(new class_kk("", "Nhóm đã bị giải tán"));
				}

				return;
			}

			if (var2 == 1) {
				this.q.cI = -1;
				this.q.cJ = -1;
				class_hw.bw.removeAllElements();
				this.a(new class_kk("", "Nhóm đã bị giải tán"));
				return;
			}
		} catch (Exception var4) {
		}

	}

	public final void e(final class_abs class_abs) {
		try {
			final byte byte1 = class_abs.b().readByte();
			final short short1 = class_abs.b().readShort();
			if (byte1 == 2) {
				for (int i = 0; i < this.l.size(); ++i) {
					final class_vh class_vh;
					if ((class_vh = (class_vh) this.l.elementAt(i)).cF == 0 && class_vh.cG == short1) {
						class_abs.b().read(((class_hw) class_vh).bC, 0, ((class_hw) class_vh).bC.length);
						for (int j = 0; j < ((class_hw) class_vh).bC.length; ++j) {
							((class_hw) class_vh).bE[j] = class_abs.b().readShort();
						}
						((class_hw) class_vh).a(((class_hw) class_vh).bC, ((class_hw) class_vh).bE);
						class_abs.b().read(((class_hw) class_vh).bD, 0, ((class_hw) class_vh).bD.length);
						return;
					}
				}
				return;
			}
			final byte byte2 = class_abs.b().readByte();
			final short short2 = class_abs.b().readShort();
			if (byte1 == 1) {
				final byte byte3 = class_abs.b().readByte();
				int n;
				for (n = 0; n < class_hw.cz.length && class_hw.cz[n] != byte2; ++n) {
				}
				if (short1 == this.q.cG) {
					if (!this.q.e(byte2)) {
						final class_zx obj;
						(obj = new class_zx(this.q.cK, this.q.cL, byte2)).a(short2);
						class_abj.bI = obj.a;
						this.bB = true;
						this.q.bD[n] = byte3;
						this.q.bC[n] = byte2;
						this.q.de.addElement(obj);
					}
					return;
				}
				for (int size = this.l.size(), k = 0; k < size; ++k) {
					final class_vh class_vh2;
					if ((class_vh2 = (class_vh) this.l.elementAt(k)).cF == 0 && class_vh2.cG == short1) {
						if (!((class_hw) class_vh2).e(byte2)) {
							final class_zx obj2;
							(obj2 = new class_zx(class_vh2.cK, class_vh2.cL, byte2)).a(short2);
							((class_hw) class_vh2).bD[n] = byte3;
							((class_hw) class_vh2).bC[n] = byte2;
							((class_hw) class_vh2).de.addElement(obj2);
						}
						return;
					}
				}
			} else if (byte1 == 0) {
				for (int size2 = this.l.size(), l = 0; l < size2; ++l) {
					final class_vh class_vh3;
					if ((class_vh3 = (class_vh) this.l.elementAt(l)).cF == 0 && class_vh3.cG == short1) {
						((class_hw) class_vh3).d(byte2);
						return;
					}
				}
			}
		} catch (final Exception ex) {
		}
	}

	public final void d(String var1) {
		this.a(new class_kk("", var1));
	}

	public static void q() {
		class_acv.g();
	}

	public final void f(final class_abs class_abs) {
		try {
			final short short1 = class_abs.b().readShort();
			final int int1 = class_abs.b().readInt();
			final int int2 = class_abs.b().readInt();
			final short short2 = class_abs.b().readShort();
			final int int3 = class_abs.b().readInt();
			if (short1 != this.q.cG) {
				for (int size = this.l.size(), i = 0; i < size; ++i) {
					final class_vh class_vh;
					if ((class_vh = (class_vh) this.l.elementAt(i)).cF == 0 && class_vh.cG == short1) {
						((class_hw) class_vh).v = int3;
						((class_hw) class_vh).t = int3;
						((class_hw) class_vh).w = int1;
						((class_hw) class_vh).by = int2;
						((class_hw) class_vh).L = short2;
						if (((class_hw) class_vh).cV == 3 && this.q.v > 0) {
							((class_hw) class_vh).cV = 0;
							this.a(new class_kk("", String.valueOf(((class_hw) class_vh).am) + " đã được hồi sinh."));
						}
						return;
					}
				}
				return;
			}
			this.q.w = int1;
			this.q.by = int2;
			this.q.L = short2;
			this.q.v = int3;
			this.q.t = int3;
			if (this.q.cV == 3 && this.q.v > 0) {
				this.q.cV = 0;
				this.a(new class_kk("", "Đã được hồi sinh."));
			}
		} catch (final Exception ex) {
		}
	}

	public final void a(int var1, int var2, short var3) {
		if (this.q.cG == var1) {
			this.q.cY = var2 == 1;
			this.q.cQ = var3;
		} else {
			int var4 = this.l.size();
			class_vh var5 = null;

			for (int var6 = 0; var6 < var4; ++var6) {
				if ((var5 = (class_vh) this.l.elementAt(var6)).cF == 0 && var5.cG == var1) {
					((class_hw) var5).cY = var2 == 1;
					var5.cQ = var3;
					return;
				}
			}

		}
	}

	public final void j(short var1) {
		class_hw var2;
		if ((var2 = (class_hw) this.b(var1)) != null) {
			class_acv.a(var2.am + " đề nghị giao dịch với bạn.", new class_acj(this, var1), new class_ack(this, var1));
		}

	}

	public final void k(short var1) {
		class_hw var2 = (class_hw) this.b(var1);
		String var3 = "Bắt đầu giao dịch";
		if (var1 != this.q.cG && var2 != null) {
			var3 = var2.am + " đồng ý giao dịch";
		}

		this.a(new class_kk("", var3));
		this.G();
		class_nu.a().a(0, true, new byte[] { 8 });
		class_nu.a().a(108, 90, 6, 6, 18, 18);
		class_nu.a().d();
	}

	public final void l(short var1) {
		class_hw var3 = (class_hw) this.b(var1);
		String var2 = "";
		if (var3 != null) {
			var2 = var3.am;
		}

		this.a(new class_kk("", var2 + " không đồng ý giao dịch"));
		this.G();
	}

	public final void a(short var1, class_abs var2, byte var3) {
		try {
			if (var3 == 0) {
				class_ql var8;
				(var8 = new class_ql()).m = var8.D = var2.b().readByte();
				var8.i = var2.b().readShort();
				var8.k = var8.i;
				var8.r = var2.b().readShort();
				var8.s = var2.b().readByte();
				var8.y = var2.b().readByte();
				var8.u = var2.b().readShort();
				var8.v = var2.b().readShort();
				byte var4 = var2.b().readByte();

				for (byte var5 = 0; var5 < var4; ++var5) {
					class_zu var6 = new class_zu((short) var2.b().readUnsignedByte(), var2.b().readShort());
					var8.H.addElement(var6);
				}

				var8.K = var2.b().readByte();
				var8.n = var2.b().readByte();
				var8.p = var2.b().readByte();
				var8.q = var2.b().readByte();
				var8.F = true;
				int var11;
				if (var1 == this.q.cG) {
					if ((var11 = class_hw.a(this.q.j, var8)) == -1) {
						this.q.j.addElement(var8);
						return;
					}

					this.q.j.removeElementAt(var11);
					return;
				}

				if ((class_hw) this.b(var1) != null) {
					if ((var11 = class_hw.a(this.q.k, var8)) == -1) {
						this.q.k.addElement(var8);
						return;
					}

					this.q.k.removeElementAt(var11);
					return;
				}
			} else {
				if (var3 == 1) {
					class_ub var10;
					(var10 = new class_ub()).d = (short) var2.b().readUnsignedByte();
					var10.e = class_sc.l[var10.d].e;
					var10.a = var2.b().readShort();
					if (var1 == this.q.cG) {
						class_ub var10000 = class_sc.l[var10.d];
						var10000.b += var10.a;
						a(this.q.j, var10);
						return;
					}

					a(this.q.k, var10);
					return;
				}

				if (var3 == 2) {
					int var9 = var2.b().readUnsignedByte();
					if (var1 == this.q.cG) {
						class_sc.l[var9].b = 0;
						a(this.q.j, var9);
						return;
					}

					a(this.q.k, var9);
					return;
				}
			}
		} catch (Exception var7) {
			var7.printStackTrace();
		}

	}

	private static void a(Vector var0, class_ub var1) {
		int var2 = var0.size();

		for (int var3 = 0; var3 < var2; ++var3) {
			class_ub var4;
			if (var0.elementAt(var3) instanceof class_ub
					&& (var4 = (class_ub) var0.elementAt(var3)).e == class_sc.l[var1.d].e) {
				var4.a += var1.a;
				return;
			}
		}

		var0.addElement(var1);
	}

	private static void a(Vector var0, int var1) {
		int var2 = var0.size();

		for (int var3 = 0; var3 < var2; ++var3) {
			class_ub var4;
			if (var0.elementAt(var3) instanceof class_ub
					&& (var4 = (class_ub) var0.elementAt(var3)).e == class_sc.l[var1].e) {
				var0.removeElement(var4);
				return;
			}
		}

	}

	public final void r() {
		if (class_nu.x[class_nu.w] == 8) {
			class_nu.a().ba = new class_s("Chuyển", new class_acl(this));
		}

	}

	public final void s() {
		this.G();
		class_acv.a("Giao dịch hoàn thành", false);
	}

	public final void t() {
		this.G();
		class_acv.a("Giao dịch bị hủy.");
	}

	public final void b(class_ap var1, class_ap var2, int var3) {
		class_kp var4 = new class_kp(var1, var2, var3);
		if (var1.D != 1) {
			n.addElement(var4);
		} else {
			this.o.addElement(var4);
		}
	}

	private void G() {
		this.q.bI = false;
		this.q.j.removeAllElements();
		this.q.k.removeAllElements();
		if (class_sc.l != null) {
			for (int var1 = 0; var1 < class_sc.l.length; ++var1) {
				class_sc.l[var1].b = 0;
			}
		}

		if (class_acv.q == class_nu.a() && class_nu.x[class_nu.w] == 8) {
			this.d();
		}

	}

	private static Vector c(Vector var0) {
		Vector var1 = new Vector();

		for (int var2 = 0; var2 < var0.size(); ++var2) {
			class_gz var3;
			if (class_yi.a((var3 = (class_gz) var0.elementAt(var2)).a).h == 0) {
				class_gz var4 = new class_gz(var3.a);
				class_gz.a(var3, var4);
				var1.addElement(var4);
			}
		}

		return var1;
	}

	public final void b(short var1, byte var2) {
		class_nu.a().ae = var1;
		Vector var7 = new Vector();
		class_nu.U = var2;
		class_gz var9;
		int var10;
		if (var2 == 0) {
			var7 = c(class_sc.g);
		} else if (var2 == 1) {
			var7 = c(class_sc.h);
		} else {
			int var8 = class_sc.g.size();
			var10 = class_sc.h.size();

			int var3;
			class_gz var4;
			for (var3 = 0; var3 < var8; ++var3) {
				if (class_yi.a((var4 = (class_gz) class_sc.g.elementAt(var3)).a).h == 0) {
					class_gz var6 = new class_gz(var4.a);
					class_gz.a(var4, var6);
					var7.addElement(var6);
				}
			}

			for (var3 = 0; var3 < var10; ++var3) {
				var4 = (class_gz) class_sc.h.elementAt(var3);
				boolean var5 = false;

				for (int var11 = 0; var11 < var7.size(); ++var11) {
					if ((var9 = (class_gz) var7.elementAt(var11)).a == var4.a) {
						var9.c += var4.c;
						var5 = true;
					}
				}

				if (!var5 && class_yi.a(var4.a).h == 0) {
					var9 = new class_gz(var4.a);
					class_gz.a(var4, var9);
					var7.addElement(var9);
				}
			}
		}

		var9 = null;

		for (var10 = 0; var10 < var7.size(); ++var10) {
			var9 = (class_gz) var7.elementAt(var10);
			class_nu.a().C.addElement(var9);
		}

		a(0, false, new byte[] { 21 });
		class_nu.a().m = "Luyện đồ";
	}

	public final void c(short var1, byte var2) {
		class_nu.a().ae = var1;
		Vector var7 = new Vector();
		class_nu.V = var2;
		int var3;
		int var8;
		if (var2 == 0) {
			var7 = class_sc.g;
		} else if (var2 == 1) {
			var7 = class_sc.h;
		} else {
			var8 = class_sc.g.size();
			int var9 = class_sc.h.size();

			class_gz var4;
			for (var3 = 0; var3 < var8; ++var3) {
				var4 = (class_gz) class_sc.g.elementAt(var3);
				class_gz var5 = new class_gz(var4.a);
				class_gz.a(var4, var5);
				var7.addElement(var5);
			}

			for (var3 = 0; var3 < var9; ++var3) {
				var4 = (class_gz) class_sc.h.elementAt(var3);
				boolean var12 = false;

				for (var8 = 0; var8 < var7.size(); ++var8) {
					class_gz var6;
					if ((var6 = (class_gz) var7.elementAt(var8)).a == var4.a) {
						var6.c += var4.c;
						var12 = true;
					}
				}

				if (!var12) {
					class_gz var10 = new class_gz(var4.a);
					class_gz.a(var4, var10);
					var7.addElement(var10);
				}
			}
		}

		var8 = var7.size();
		class_gz var11 = null;

		for (var3 = 0; var3 < var8; ++var3) {
			var11 = (class_gz) var7.elementAt(var3);
			class_nu.a().C.addElement(var11);
		}

		a(0, false, new byte[] { 25 });
	}

	public final void a(short var1, byte var2, byte var3, short var4, byte var5, byte var6, byte var7) {
		class_nu.a().C.removeAllElements();
		class_nu.a().ae = 1000;
		class_nu.H = var2;
		class_nu.I = var3;
		class_nu.a();
		class_nu.J = var5;
		class_nu.K = var6;
		Vector var10 = new Vector();
		class_nu.T = var7;
		int var11;
		int var15;
		if (var7 == 0) {
			var10 = class_sc.g;
		} else if (var7 == 1) {
			var10 = class_sc.h;
		} else {
			var11 = class_sc.g.size();
			int var12 = class_sc.h.size();

			class_gz var16;
			for (var15 = 0; var15 < var11; ++var15) {
				var16 = (class_gz) class_sc.g.elementAt(var15);
				class_gz var8 = new class_gz(var16.a);
				class_gz.a(var16, var8);
				var10.addElement(var8);
			}

			for (var15 = 0; var15 < var12; ++var15) {
				var16 = (class_gz) class_sc.h.elementAt(var15);
				boolean var17 = false;

				for (var11 = 0; var11 < var10.size(); ++var11) {
					class_gz var9;
					if ((var9 = (class_gz) var10.elementAt(var11)).a == var16.a) {
						var9.c += var16.c;
						var17 = true;
					}
				}

				if (!var17) {
					class_gz var13 = new class_gz(var16.a);
					class_gz.a(var16, var13);
					var10.addElement(var13);
				}
			}
		}

		var11 = var10.size();
		class_gz var14 = null;

		for (var15 = 0; var15 < var11; ++var15) {
			if ((var14 = (class_gz) var10.elementAt(var15)).a >= var4 && var14.a <= var4 + 5) {
				class_nu.a().C.addElement(var14);
			}
		}

		if (class_nu.a().C.size() == 0) {
			class_acv.a("Không có nguyên liệu.");
		} else {
			a(0, false, new byte[] { 32 });
			class_nu.a().m = "Đồ " + (var6 == 0 ? "ma" : "vật") + " " + var3;
			class_acv.g();
		}
	}

	public final void m(short var1) {
		class_nu.a().ae = var1;
		a(0, false, new byte[] { 26 });
		class_nu.a().m = "Hợp thành";
		class_acv.g();
	}

	public static void g(class_abs var0) {
		class_sc.i.removeAllElements();

		try {
			byte var1 = var0.b().readByte();
			class_gz var2 = null;

			for (int var3 = 0; var3 < var1; ++var3) {
				(var2 = new class_gz()).b = var0.b().readShort();
				var2.a = var0.b().readByte();
				var2.c = var0.b().readShort();
				class_sc.i.addElement(var2);
			}
		} catch (Exception var4) {
		}

		class_nu.a().g();
	}

	public static void h(class_abs var0) throws IOException {
		Vector var1;
		(var1 = new Vector()).removeAllElements();
		short var2 = var0.b().readShort();
		class_gz var3 = null;

		for (int var4 = 0; var4 < var2; ++var4) {
			(var3 = new class_gz()).b = var0.b().readShort();
			var3.a = var0.b().readShort();
			var3.c = var0.b().readShort();
			var1.addElement(var3);
		}

		byte var6 = 0;

		try {
			var6 = var0.b().readByte();
		} catch (Exception var5) {
		}

		if (var6 == 0) {
			class_sc.g = var1;
		} else {
			class_sc.h = var1;
		}

		if (class_acv.q == class_nu.a()) {
			if (class_nu.x[class_nu.w] == 26) {
				class_nu.a().a(true, 1, var6);
			}

			if (class_nu.x[class_nu.w] == 0) {
				class_wc.a();
				class_wc.b(0);
			}
		}

	}

	public static void e(String var0) {
		class_acv.a(var0, false);
		class_nu.a();
		class_nu.v();
	}

	public final void i(class_abs var1) {
		try {
			short var2 = var1.b().readShort();
			byte var9 = var1.b().readByte();
			int var3 = this.l.size();
			class_vh var4 = null;
			int var5 = 0;

			while (true) {
				if (var5 >= var3) {
					return;
				}

				if ((var4 = (class_vh) this.l.elementAt(var5)).cG == var2) {
					if (var9 == 1) {
						boolean var7 = false;
						boolean var10 = false;
						int var8 = var4.cK - 5 << 1;

						int var11;
						for (var11 = var4.cL - 5 << 1; var8 > 10 || var11 > 10 || var8 < -10
								|| var11 < -10; var11 >>= 1) {
							var8 >>= 1;
						}

						((class_bb) var4).a(var8, var11);
						var4.di = true;
						return;
					}

					if (var9 == 0) {
						var4.D();
						if (var4.cG == this.q.cG && class_ju.k && au) {
							class_acv.w = null;
							this.d((int) 0, (int) 0);
							return;
						}
					}
					break;
				}

				++var5;
			}
		} catch (Exception var6) {
		}

	}

	public final void j(final class_abs class_abs) {
		try {
			final short short1 = class_abs.b().readShort();
			final byte byte1 = class_abs.b().readByte();
			final byte byte2 = class_abs.b().readByte();
			final short short2 = class_abs.b().readShort();
			final byte byte3 = class_abs.b().readByte();
			final byte byte4 = class_abs.b().readByte();
			int byte5 = -1;
			try {
				byte5 = class_abs.b().readByte();
			} catch (final Exception ex) {
			}
			for (int size = this.l.size(), i = 0; i < size; ++i) {
				final class_vh class_vh;
				if ((class_vh = (class_vh) this.l.elementAt(i)).cG == short1) {
					switch (byte4) {
					case -1: {
						this.a("-" + short2, 1, class_vh.cK, class_vh.cL - 40, 0, -1);
						if (byte1 == 1) {
							((class_bb) class_vh).d(short2);
							if (((class_bb) class_vh).v <= 0) {
								((class_bb) class_vh).cE = true;
								return;
							}
							break;
						} else {
							final class_hw class_hw = (class_hw) class_vh;
							class_hw.v -= short2;
							if (((class_hw) class_vh).v <= 0) {
								((class_hw) class_vh).cV = 3;
								return;
							}
							break;
						}
					}
					case 0: {
						return;
					}
					case 1: {
						return;
					}
					case 2: {
						if (byte3 != 7 || short2 <= 0) {
							break;
						}
						this.a("-" + short2, 3, class_vh.cK, class_vh.cL - 40, 0, -1);
						final class_hw class_hw2 = (class_hw) class_vh;
						class_hw2.bz -= short2;
						if (((class_hw) class_vh).bz <= 0) {
							((class_hw) class_vh).bz = 0;
							return;
						}
						break;
					}
					case 3: {
						if (byte3 == 4) {
							class_vh.cW = true;
							class_vh.cZ = System.currentTimeMillis() + ((byte5 > 0) ? (byte5 * 1000) : 3000);
							final class_zx class_zx;
							(class_zx = new class_zx(class_vh.cK, class_vh.cL, 19)).a((byte5 > 0) ? byte5 : 3);
							class_vh.a(class_zx);
							return;
						}
						break;
					}
					case 4: {
						if (byte3 == 4) {
							final class_zx class_zx2;
							(class_zx2 = new class_zx(class_vh.cK, class_vh.cL, 22)).a((byte5 > 0) ? byte5 : 36);
							class_vh.a(class_zx2);
							class_vh.dg = System.currentTimeMillis();
							class_vh.df = short2;
							class_vh.dh = byte2;
							break;
						}
						break;
					}
					}
					return;
				}
			}
		} catch (final Exception ex2) {
		}
	}

	public final void b(byte[] var1) {
		class_acv.w = null;
		Vector var2 = new Vector();

		for (int var3 = 0; var3 < 3; ++var3) {
			var2.addElement(new class_s("Gian hàng " + (var3 + 1), new class_acs(this, var3, var1)));
		}

		class_acv.u.a(var2, 3);
	}

	public final void c(int var1, int var2, int var3) {
		if (var2 == 0) {
			class_nu.a().ac = var3;
			class_nu.a().ad = var1;
			class_acv.h();
			this.D.a(var3, var1, (int) this.q.cG);
		} else {
			if (var2 == 1) {
				this.D.c(var3, var1);
				class_acv.h();
			}

		}
	}

	public static void a(class_abs var0, int var1, String var2) {
		try {
			Vector var3 = new Vector();
			short var4 = var0.b().readShort();

			for (int var5 = 0; var5 < var4; ++var5) {
				class_hw var6;
				(var6 = new class_hw()).am = var0.b().readUTF();
				var6.aJ = var0.b().readByte();
				var6.D = 0;
				var6.N = var0.b().readByte();
				var6.ax = 0;
				byte var7 = var0.b().readByte();
				Vector var8 = new Vector();

				for (int var9 = 0; var9 < var7; ++var9) {
					class_ql var10 = new class_ql();
					var6.aO = var10.m = var0.b().readByte();
					var10.r = var0.b().readShort();
					var10.y = var0.b().readByte();
					var10.s = var0.b().readByte();
					var8.addElement(var10);
				}

				var6.cH = var0.b().readShort();
				var6.ae = var0.b().readByte();
				if (var1 == 3 || var1 == 4 || var1 == 7 || var1 == 8) {
					var6.br = var0.b().readLong();
					var6.aV = var0.b().readInt();
					var6.cS = var0.b().readByte();
					if (var1 == 7) {
						var6.bY = var0.b().readInt();
						var6.bZ = var0.b().readInt();
					}
				}

				var6.a(var8);
				var3.addElement(var6);
			}

			if (var3.size() > 0) {
				if (var1 == 0) {
					class_na.a().b = var3;
					return;
				}

				if (var1 == 1 || var1 == 3 || var1 == 4 || var1 == 6 || var1 == 7 || var1 == 8) {
					class_na.a().a(var3, var1, var2);
					class_na.a().d();
					class_acv.g();
					return;
				}
			}
		} catch (Exception var11) {
			(new StringBuffer("loi onFriendList >> ")).append(var11.toString()).toString();
		}

	}

	public final void k(class_abs var1) {
		try {
			Vector var2 = new Vector();
			byte var3 = var1.b().readByte();
			byte var4 = var1.b().readByte();
			byte var5 = var1.b().readByte();
			switch (var3) {
			case 0:
				var3 = var1.b().readByte();

				for (int var16 = 0; var16 < var3; ++var16) {
					String var17 = var1.b().readUTF();
					short var19;
					if ((var19 = var1.b().readShort()) != this.q.cG) {
						var2.addElement(new class_s(var17, new class_em(this, var4, var5, var19)));
					}
				}

				class_acv.w = null;
				if (var2.size() > 0) {
					class_acv.u.a(var2, 3);
					return;
				}
				break;
			case 1:
				class_acv.w = null;
				class_nu.a().B.removeAllElements();
				byte var6 = var1.b().readByte();
				short var7 = var1.b().readShort();

				for (int var8 = 0; var8 < var6; ++var8) {
					class_ql var12;
					(var12 = new class_ql()).D = var12.m = var1.b().readByte();
					var12.i = var1.b().readShort();
					var12.r = var1.b().readShort();
					var12.s = var1.b().readByte();
					var12.B = var1.b().readInt();
					var12.y = var1.b().readByte();
					var12.u = var1.b().readShort();
					var12.I = var1.b().readByte();
					var12.J = var1.b().readByte();
					var12.H.removeAllElements();
					var3 = var1.b().readByte();

					for (byte var9 = 0; var9 < var3; ++var9) {
						class_zu var10 = new class_zu((short) var1.b().readUnsignedByte(), var1.b().readShort());
						var12.H.addElement(var10);
					}

					var12.K = var1.b().readByte();
					var12.n = var1.b().readByte();
					var12.o = var1.b().readByte();
					var12.p = var1.b().readByte();
					var12.q = var1.b().readByte();
					var12.C = var1.b().readByte();
					var12.d = var1.b().readUTF();
					if (this.q.cG == var7) {
						int var20 = class_hw.bu.size();

						for (int var21 = 0; var21 < var20; ++var21) {
							class_ql var14;
							if ((var14 = (class_ql) class_hw.bu.elementAt(var21)).i == var12.i) {
								var14.B = var12.B;
								var14.z = true;
								class_nu.a().B.addElement(var14);
							}
						}
					} else {
						class_nu.a().B.addElement(var12);
					}
				}

				byte var18 = var1.b().readByte();

				for (int var13 = 0; var13 < var18; ++var13) {
					class_dq var15;
					(var15 = new class_dq()).a = var1.b().readShort();
					var15.b = var1.b().readShort();
					var15.c = var1.b().readInt();
					class_nu.a().B.addElement(var15);
				}

				class_nu.a().ac = var4;
				class_nu.a().ad = var5;
				if (this.q.cG == var7) {
					a(0, true, new byte[] { 23 });
					return;
				}

				if (class_nu.a().B.size() <= 0) {
					break;
				}

				class_nu.a().A = var7;
				a(0, true, new byte[] { 24 });
			default:
				return;
			}
		} catch (IOException var11) {
			var11.printStackTrace();
		}

	}

	public static void a(int var0, boolean var1, byte[] var2) {
		class_nu.a().a(var0, var1, var2);
		class_nu.a().d();
	}

	public final void l(class_abs var1) {
		try {
			boolean var6 = var1.b().readBoolean();
			short var2 = var1.b().readShort();
			int var3 = 0;
			if (var6) {
				var3 = var1.b().readInt();
			}

			if (var1.b().readByte() != 0) {
				short var10 = var1.b().readShort();
				class_dq var4;
				class_gz var8;
				if (var6) {
					if ((var8 = class_gz.b(var2)) != null) {
						--var8.c;
						if (var8.c <= 0) {
							class_sc.g.removeElement(var8);
						}

						(var4 = new class_dq(var8.b)).b = var10;
						var4.c = var3;
						class_nu.a().B.addElement(var4);
					}
				} else {
					int var7 = class_nu.a().B.size();
					var4 = null;

					for (int var11 = 0; var11 < var7; ++var11) {
						if ((var4 = (class_dq) class_nu.a().B.elementAt(var11)).a == var2) {
							class_nu.a().B.removeElement(var4);
							if ((var8 = class_gz.a(var4.b)) != null) {
								++var8.c;
							} else {
								(var8 = new class_gz()).b = var4.a;
								var8.a = var4.b;
								var8.c = 1;
								class_sc.g.addElement(var8);
							}
							break;
						}
					}
				}

				class_acv.g();
				return;
			}

			class_ql var9;
			if ((var9 = a(class_hw.bu, var2)) != null) {
				var9.z = var6;
				if (var6) {
					var9.B = var3;
					class_nu.a().B.addElement(var9);
					class_acv.a("Đã bỏ vào gian hàng.");
					return;
				}

				var9.B = 0;
				class_nu.a().B.removeElement(var9);
				class_acv.a("Đã lấy vật phẩm khỏi gian hàng.");
				return;
			}
		} catch (Exception var5) {
			(new StringBuffer("LOI HAM ON_USER_SELL_ITEM")).append(var5.toString()).toString();
		}

	}

	public final void c(short var1, short var2, byte var3) {
		if (this.q.cG == var2) {
			class_acv.a("Món đồ đã ở trong hành trang.");
		}

		int var5 = class_nu.a().B.size();

		for (int var6 = 0; var6 < var5; ++var6) {
			if (var3 == 0 && class_nu.a().B.elementAt(var6) instanceof class_ql) {
				if (((class_ql) class_nu.a().B.elementAt(var6)).i == var1) {
					class_nu.a().B.removeElementAt(var6);
					if (class_nu.a() == class_acv.q && class_nu.x[class_nu.w] == 24) {
						class_nu.a().a(class_nu.a().k());
					}

					return;
				}
			} else if (class_nu.a().B.elementAt(var6) instanceof class_dq
					&& ((class_dq) class_nu.a().B.elementAt(var6)).a == var1) {
				class_nu.a().B.removeElementAt(var6);
				if (class_nu.a() == class_acv.q && class_nu.x[class_nu.w] == 24) {
					class_nu.a().a(class_nu.a().k());
				}

				return;
			}
		}

	}

	public final void m(class_abs var1) {
		try {
			byte var2 = var1.b().readByte();
			String var3 = var1.b().readUTF();
			short var5 = var1.b().readShort();
			switch (var2) {
			case -1:
			default:
				return;
			case 0:
				class_acv.a(var3 + " muốn kết bạn với bạn", new class_ek(this, var5), new class_er(this, var5));
				return;
			case 1:
			}
		} catch (Exception var4) {
			var4.printStackTrace();
		}
	}

	public final void n(class_abs var1) throws IOException {
		byte var2 = var1.b().readByte();
		for (int var3 = 0; var3 < var2; ++var3) {
			this.cy.addElement(var1.b().readUTF());
			this.cz.addElement(var1.b().readUTF());
			this.cA.addElement(var1.b().readUTF());
		}

	}

	public static void d(int var0) {
		int var1;
		switch (var0) {
		case 0:
			cx = 0;
			aO = 1;
			if (class_ls.e != null) {
				var0 = class_ls.e.size();

				for (var1 = 0; var1 < var0; ++var1) {
					class_ls.e.elementAt(var1);
				}

				return;
			}
			break;
		case 1:
		case 2:
			cx = 1;
			aO = 1;
			return;
		case 3:
			cx = 0;
			aO = 0;
			if (class_ls.e != null) {
				var0 = class_ls.e.size();

				for (var1 = 0; var1 < var0; ++var1) {
					class_ls.e.elementAt(var1);
				}
			}
		}

	}

	public final void u() {
		Vector var1 = new Vector();
		String[] var2 = new String[] { "Thấp", "Vừa", "Cao", "Rất thấp" };

		for (int var3 = 0; var3 < 4; ++var3) {
			var1.addElement(new class_s(var2[var3], new class_eo(this, var3)));
		}

		class_acv.u.a(var1, 3);
	}

	public final void a(short[] var1) {
		Vector var2 = new Vector();
		int var3 = var1.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			var2.addElement(new class_fe(this, "", new class_ey(this, var1, var4), var1, var4));
		}

		class_xy.a().a(20, 20, class_acv.m - 40, class_acv.n - 40 - class_aae.c, (class_acv.m - 40) / 20);
		class_xy.a().a(var2, "ICON");
		class_xy.a().d();
	}

	public static void a(class_zy var0) {
		class_zt.a().a(var0);
		class_zt.a().d();
		class_acv.g();
	}

	public static void b(class_hw var0) {
		class_nu.a().a(0, false, new byte[] { 1 });
		class_nu.O = var0;
		class_nu.a().d();
		class_nu.a().m = "Trang bị";
		class_acv.g();
	}

	public final void a(String var1, short var2, short var3, short var4, short var5, short var6, short var7, byte var8,
			byte var9) {
		short var12 = var2;
		class_abj var10 = this;
		if (var9 == 1) {
			int var20 = this.m.size();
			class_vh var21 = null;
			int var22 = 0;

			while (true) {
				if (var22 >= var20) {
					class_xn var25;
					(var25 = new class_xn()).c = var1;
					var25.a = var25.cG = var12;
					var25.e = var3;
					var25.cK = var4;
					var25.cL = var5;
					var25.cN = var6;
					var25.cM = var7;
					var25.f = var8;
					var25.cU = var9;
					var10.m.addElement(var25);
					break;
				}

				class_xn var23;
				class_gn var24;
				if ((var21 = (class_vh) var10.m.elementAt(var22)) != null && var21.cF == 2
						&& (var24 = (class_gn) var21).d == 1 && (var23 = (class_xn) var24).cG == var12) {
					var23.c = var1;
					var23.a = var23.cG = var12;
					var23.e = var3;
					var23.cK = var4;
					var23.cL = var5;
					var23.cN = var6;
					var23.cM = var7;
					var23.f = var8;
					var24.cU = var9;
					break;
				}

				++var22;
			}
		}

		int var26 = this.l.size();
		class_vh var11 = null;

		for (int var28 = 0; var28 < var26; ++var28) {
			class_xn var13;
			class_gn var27;
			if ((var11 = (class_vh) this.l.elementAt(var28)) != null && var11.cF == 2
					&& (var27 = (class_gn) var11).d == 1 && (var13 = (class_xn) var27).cG == var2) {
				var13.c = var1;
				var13.a = var13.cG = var2;
				var13.e = var3;
				var13.cK = var4;
				var13.cL = var5;
				var13.cN = var6;
				var13.cM = var7;
				var13.f = var8;
				var27.cU = var9;
				return;
			}
		}

		class_xn var29;
		(var29 = new class_xn()).c = var1;
		var29.a = var29.cG = var2;
		var29.e = var3;
		var29.cK = var4;
		var29.cL = var5;
		var29.cN = var6;
		var29.cM = var7;
		var29.f = var8;
		var29.cU = var9;
		this.l.addElement(var29);
	}

	public final void a(int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8,
			boolean var9, byte var10, byte var11) {
		int var15 = this.l.size();

		for (int var12 = 0; var12 < var15; ++var12) {
			class_vh var13;
			class_vo var14;
			if ((var13 = (class_vh) this.l.elementAt(var12)).cF == 10 && (var14 = (class_vo) var13).cG == var1) {
				var14.a(var1, var2, var3, var4, var5, var7, var8, var9, var10, var11);
				return;
			}
		}

		this.l.addElement(new class_vo(var1, var2, var3, var4, var5, var7, var8, var9, var10, var11));
	}

	private static class_vh a(byte var0, short var1, short var2, short var3, short var4, byte var5, byte var6) {
		Object var7 = null;
		switch (var0) {
		case 0:
			if (var6 > -1) {
				((class_vh) (var7 = new class_acq())).a(var6);
			} else {
				var7 = new class_hw();
			}
			break;
		case 1:
			if (var1 != 91 && var1 != 92) {
				if (var1 == 93) {
					var7 = new class_dk();
				} else if (var1 == 94) {
					var7 = new class_dv();
				} else if (var1 == 46) {
					var7 = new class_jw();
				} else if (var1 == 43) {
					var7 = new class_xm(0);
				} else if (var1 == 36) {
					var7 = new class_xm(1);
				} else if (var1 == 37) {
					var7 = new class_xm(2);
				} else if (var1 == 38) {
					var7 = new class_e();
				} else if (var1 == 39) {
					var7 = new class_dj();
				} else if (var1 == 82) {
					var7 = new class_hy();
				} else if (var1 == 83) {
					Y = (class_vh) (var7 = new class_ty());
				} else if (var1 == 84) {
					var7 = new class_abi();
				} else if (var1 == 113) {
					var7 = new class_zv(113);
				} else if (var1 == 115) {
					var7 = new class_zv(115);
				} else if (var1 == 116) {
					var7 = new class_zv(116);
				} else if (var1 == 117) {
					var7 = new class_zv(117);
				} else if (var1 >= 95 && var1 <= 112) {
					var7 = new class_zv(var1);
				} else if (var5 == 1) {
					var7 = new class_zv(var1);
				} else {
					var7 = new class_bb();
				}
			} else {
				var7 = new class_yt();
			}
		case 2:
		case 5:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:
		default:
			break;
		case 3:
			var7 = new class_gs();
			break;
		case 4:
			var7 = new class_gb();
			break;
		case 6:
		case 7:
			var7 = new class_v();
			break;
		case 14:
			var7 = new class_aq();
		}

		((class_vh) var7).m(var5);
		if (var1 >= 85 && var1 <= 89 && var0 == 1) {
			((class_bb) var7).a = true;
		}

		((class_vh) var7).cK = var3;
		((class_vh) var7).cL = var4;
		((class_vh) var7).cF = var0;
		((class_vh) var7).cG = var2;
		((class_vh) var7).cO = var3;
		((class_vh) var7).cP = var4;
		((class_vh) var7).a(var1);
		return (class_vh) var7;
	}

	public final void c(byte[] var1) {
		Image var5;
		int var2 = (var5 = Image.createImage(var1, 0, var1.length)).getWidth() + 35;
		int var3 = var5.getHeight() + 60;
		class_bz var4;
		(var4 = new class_bz(5, var3 - 26, var2 - 10, 20)).e = true;
		class_px.a().a(class_acv.o - var2 / 2, class_acv.p - var3 / 2 - class_aae.c, var2, var3, "NHẬP CHỮ",
				(class_s) null);
		class_px.a().ba = new class_s("Ok", new class_fc(this, var4));
		class_px.a().bc = var4.i;
		class_px.a().b = new class_fh(this, var4, var5, var2);
		class_px.a().d();
	}

	private void H() {
		if (!class_acv.a(class_acv.o - 40, 0, 80, 20)) {
			if (class_acv.a(0, 0, class_acv.m, class_acv.n)) {
				int var1;
				int var2;
				int var3;
				if (class_acv.g) {
					var1 = class_yi.o.getWidth();
					var2 = class_yi.o.getHeight();
					if (class_acv.a(class_acv.o - var1 / 2, class_acv.n - var2 - 20, var1, var2)) {
						var3 = (class_acv.j - (class_acv.o - var1 / 2)) / class_yi.P;
						class_acv.c[1 + (var3 << 1)] = true;
						class_acv.g = false;
						class_acv.f = false;
						return;
					}
				}

				if (class_acv.a(this.bR.posX, this.bR.posY, aq, ar) && class_acv.g) {
					var1 = class_acv.E - class_acv.j;
					if (class_yg.d(class_acv.D - class_acv.k) < 10 && class_yg.d(var1) < 10) {
						if (this.cJ == null) {
							this.cJ = new MoveObj(0, 0);
						}

						this.cJ.posX = (short) (cF + class_acv.j - this.bR.posX);
						this.cJ.posY = (short) (cB + class_acv.k - this.bR.posY);
						this.q.s = null;
						if (!class_ls.a((this.cJ.posX << 4) + 2, (this.cJ.posY << 4) + 2, 2)
								&& !this.a((this.cJ.posX << 4) + 2, (this.cJ.posY << 4) + 2)) {
							this.q.av = this.q.cK;
							this.q.aw = this.q.cL;
							this.q.p = this.q.cK;
							this.q.q = this.q.cL;
							this.cK.c = 8;
							this.q.s = this.b(this.q.cK / 16, this.q.cL / 16, this.cJ.posX, this.cJ.posY);
							this.q.r = 0;
							class_acv.g = false;
							return;
						}
					}
				}

				if (class_acv.g) {
					var1 = j + class_acv.j;
					var2 = k + class_acv.k;
					if (this.r != null) {
						class_vh var4;
						int var5;
						if (this.r.cF != 10) {
							var3 = this.l.size();
							var4 = null;

							for (var5 = 0; var5 < var3; ++var5) {
								if (class_yg.d((var4 = (class_vh) this.l.elementAt(var5)).cK - var1) < 20
										&& class_yg.d(var4.cL - 20 - var2) < 40) {
									class_acv.g = false;
									if (this.r.cG == var4.cG) {
										if (var4 instanceof class_hw && (this.q.cR <= 0 || this.aG / 100 == 3)) {
											if (((class_hw) this.r).Q == -1) {
												this.E();
												return;
											}

											this.d((int) 5, (int) V);
											return;
										}

										if (this.r.cF != 2 || var4.cF != 2) {
											this.d((int) 5, (int) V);
											return;
										}

										if (((class_gn) this.r).a == ((class_gn) var4).a) {
											if (((class_gn) var4).a != 4) {
												this.d((int) 5, (int) V);
												return;
											}

											if (((class_gn) this.r).b == ((class_gn) var4).b) {
												this.d((int) 5, (int) V);
												return;
											}

											if (var4.cG != this.q.cG) {
												this.r = var4;
												this.d((int) 5, (int) V);
												return;
											}
										}
									}

									if (var4.cG != this.q.cG) {
										boolean var6;
										label159: {
											var6 = false;
											if (ao == 1) {
												if (var4.cF == 0 && (!var4.cY || var4.d_())) {
													var6 = true;
												}

												if (var4.cF == 1 || var4.cF != 0 || var4.cY) {
													break label159;
												}
											} else if (ao == 2) {
												if (var4.d_()) {
													break label159;
												}
											} else {
												if (ao == 3) {
													if (var4.cF == 0 && var4.cH == this.q.cH || var4.d_()) {
														var6 = true;
													}
													break label159;
												}

												if (ao != 4 || (var4.cF != 0 || var4.cS != this.q.cS) && !var4.d_()) {
													break label159;
												}
											}

											var6 = true;
										}

										if (!var6) {
											this.r = var4;
										}

										if (this.aG == 29) {
											this.movePlayer_(var1, var2);
										}
									}

									return;
								}
							}
						} else if (this.q.cK >= this.aK && this.q.cK <= this.aM + 32 && this.q.cL >= this.aL
								&& this.q.cL <= this.aN + 32) {
							var3 = this.l.size();
							var4 = null;

							for (var5 = 0; var5 < var3; ++var5) {
								var4 = (class_vh) this.l.elementAt(var5);
								if (var1 >= var4.cK + 2 && var1 <= var4.cK + 30 && var2 >= var4.cL
										&& var2 <= var4.cL + 30) {
									class_acv.g = false;
									if (this.r.cG != -1 && this.r.cG == var4.cG) {
										if (this.q.cV == 0) {
											this.d((int) 5, (int) V);
										}

										return;
									}

									if (var4.cG != this.q.cG) {
										this.movePlayer_(var1, var2);
									}

									return;
								}
							}
						}

						this.r = null;
					}

					this.movePlayer_(var1, var2);
				}
			}

		}
	}

	public void movePlayer_(int var1, int var2) {
		var1 /= 16;
		var2 /= 16;
		if (!class_ls.a(j + class_acv.j, k + class_acv.k, 2) && !this.a(j + class_acv.j, k + class_acv.k)) {
			if (this.cJ == null) {
				this.cJ = new MoveObj(0, 0);
			}
			this.cJ.posX = (short) var1;
			this.cJ.posY = (short) var2;
			class_acv.g = false;
			this.q.av = this.q.cK;
			this.q.aw = this.q.cL;
			this.q.p = this.q.cK;
			this.q.q = this.q.cL;
			this.cK.c = 8;
			this.q.s = this.b(this.q.cK / 16, this.q.cL / 16, var1, var2);
			this.q.r = 0;
		} else {
		}
	}

	public final void movePlayer(int var1, int var2) {
		var1 /= 16;
		var2 /= 16;
		if (this.cJ == null) {
			this.cJ = new MoveObj(0, 0);
		}
		this.cJ.posX = (short) var1;
		this.cJ.posY = (short) var2;
		this.q.av = this.q.cK;
		this.q.aw = this.q.cL;
		this.q.p = this.q.cK;
		this.q.q = this.q.cL;
		this.cK.c = 8;
		this.q.s = this.b(this.q.cK / 16, this.q.cL / 16, var1, var2);
		this.q.r = 0;
		aB = 100;
	}

	private static int a(int var0, int var1, int var2, int var3) {
		return class_yg.d(var0 - var2) + class_yg.d(var1 - var3);
	}

	private short[] b(int var1, int var2, int var3, int var4) {

		if (class_yg.a(var1 << 4, var2 << 4, var3 << 4, var4 << 4) <= 16) {
			return null;
		} else if (this.a(var3, var4)) {
			return null;
		} else {
			aR = (byte) cG;
			aS = (byte) cC;
			var1 -= aR;
			var2 -= aS;
			var3 -= aR;
			var4 -= aS;
			int var5 = aQ.length;
			int var7;
			int var8;
			for (int var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < aQ[var6].length; ++var7) {
					if ((var8 = (aS + var7) * class_ls.a + aR + var6) < class_ls.g.length - 1) {
						if (class_ls.g[var8] == 2) {
							aQ[var6][var7] = -1;
						} else {
							aQ[var6][var7] = 0;
						}
					}
				}
			}

			var7 = var1;
			var8 = var2;
			short var18 = (short) var1;
			short var19 = (short) var2;
			if (var1 >= 0 && var1 < aQ.length) {
				if (var1 < aQ.length && var2 < aQ[var1].length) {
					aQ[var1][var2] = 1;
				}

				short var20 = 2;
				int var10 = aQ.length;
				int var11 = aQ[0].length;
				int var12 = 0;

				while (true) {
					++var12;
					if (var12 > 500) {
						if (X == 2) {
							this.cM = X;
							cL = true;
							var12 = 0;
						}
						X = 1;
						return null;
					}

					var5 = -1;
					int var9 = -1;
					if (var7 + 1 < var10 && aQ[var7 + 1][var8] == 0) {
						aQ[var7 + 1][var8] = (byte) var20;
						var5 = var7 + 1;
						var9 = var8;
					}

					if (var7 - 1 >= 0 && aQ[var7 - 1][var8] == 0) {
						aQ[var7 - 1][var8] = (byte) var20;
						if (var5 == -1 || a(var5, var9, var3, var4) > a(var7 - 1, var8, var3, var4)) {
							var5 = var7 - 1;
							var9 = var8;
						}
					}

					if (var8 + 1 < var11 && aQ[var7][var8 + 1] == 0) {
						aQ[var7][var8 + 1] = (byte) var20;
						if (var5 == -1 || a(var5, var9, var3, var4) > a(var7, var8 + 1, var3, var4)) {
							var5 = var7;
							var9 = var8 + 1;
						}
					}

					if (var8 - 1 >= 0 && aQ[var7][var8 - 1] == 0) {
						aQ[var7][var8 - 1] = (byte) var20;
						if (var5 == -1 || a(var5, var9, var3, var4) > a(var7, var8 - 1, var3, var4)) {
							var5 = var7;
							var9 = var8 - 1;
						}
					}

					byte var13 = -1;
					if (var5 != -1) {
						var13 = 0;
						var7 = var5;
						var8 = var9;
					} else {
						var8 = 1000;
						var7 = 1000;
					}

					for (short var21 = 0; var21 < var10; ++var21) {
						for (short var14 = 0; var14 < var11; ++var14) {
							if (aQ[var21][var14] > 1) {
								byte[][] var17 = aQ;
								if ((var21 + 1 < var17.length && var17[var21 + 1][var14] == 0 ? true
										: (var21 - 1 >= 0 && var17[var21 - 1][var14] == 0 ? true
												: (var14 + 1 < var17[var21].length && var17[var21][var14 + 1] == 0
														? true
														: var14 - 1 >= 0 && var17[var21][var14 - 1] == 0)))
										&& aQ[var21][var14] + a((int) var21, (int) var14, (int) var3,
												(int) var4) < var20 + a(var7, var8, var3, var4)) {
									var7 = var21;
									var8 = var14;
									var20 = aQ[var21][var14];
									var13 = 0;
								}
							}
						}
					}

					if (var7 == var3 && var8 == var4) {
						if (var20 >= 127) {
							return null;
						}

						int var23 = 0;
						short[] var22 = new short[var20];

						while (true) {
							var22[var23] = (short) ((var7 << 8) + var8);
							if (var7 + 1 < var10 && aQ[var7 + 1][var8] == aQ[var7][var8] - 1) {
								var7 = (short) (var7 + 1);
							} else if (var7 - 1 >= 0 && aQ[var7 - 1][var8] == aQ[var7][var8] - 1) {
								var7 = (short) (var7 - 1);
							} else if (var8 + 1 < var11 && aQ[var7][var8 + 1] == aQ[var7][var8] - 1) {
								var8 = (short) (var8 + 1);
							} else if (var8 - 1 >= 0 && aQ[var7][var8 - 1] == aQ[var7][var8] - 1) {
								var8 = (short) (var8 - 1);
							}
							if (var7 == var18 && var8 == var19) {
								return var22;
							}

							++var23;
						}
					}

					if (var13 != 0) {
						return null;
					}

					++var20;
				}
			} else {
				return null;
			}
		}
	}

	public final void a(int var1, byte var2, String[] var3) {
		if (class_acv.u.a) {
			class_acv.u.a = false;
		}

		Vector var4 = new Vector();
		int var5 = var3.length;

		for (int var6 = 0; var6 < var5; ++var6) {
			var4.addElement(new class_s(var3[var6], new class_ff(this, var1, var2, var6)));
		}

		class_acv.u.a(var4, 3);
		class_acv.w = null;
	}

	public final void a(int var1, byte var2, String var3, int var4) {
		class_acv.y.a(var3, new class_fu(this, var1, var2), var4, 40, true);
		class_acv.w = class_acv.y;
	}

	public final void f(String var1) {
		class_acv.b(var1, new class_fw(this));
	}

	public static void a(byte var0, int var1, int var2) {
		if (var0 != -1) {
			aj.addElement(new class_kl(var0, true, var1, var2));
		} else {
			for (int var3 = 0; var3 < aj.size(); ++var3) {
				((class_kl) aj.elementAt(var3)).a = true;
			}

		}
	}

	public final void a(short var1, byte[] var2, byte[] var3) {
		class_ap var9;
		if ((var9 = (class_ap) this.c(var1)) != null) {
			int var10 = var2.length;

			for (int var4 = 0; var4 < var10; ++var4) {
				boolean var5 = false;
				int var6 = var9.R.size();

				for (int var7 = 0; var7 < var6; ++var7) {
					class_acg var8;
					if ((var8 = (class_acg) var9.R.elementAt(var7)).h == var2[var4]) {
						var8.a = var3[var4];
						var5 = true;
						break;
					}
				}

				if (!var5) {
					var9.R.addElement(new class_acg(var2[var4], var3[var4], var9));
				}
			}
		}

	}

	public final void a(class_hn var1) {
		this.cN.addElement(var1);
		this.l.addElement(var1);
	}

	public static void a(class_abk var0) {
		if (ak == null) {
			ak = new Vector();
		}

		ak.addElement(var0);
	}

	public final void a(String var1, short var2, Vector var3, int var4, int var5) {
		class_nu.a().C.removeAllElements();
		class_nu.a().E = var3;
		class_nu.a().D = new Vector();
		class_nu.N = var2;
		class_nu.aa = (byte) var4;
		if (var3.size() == 0) {
			class_acv.a("Vật phẩm không thể thăng cấp");
		} else {
			class_nu.S = (byte) var5;
			Vector var10 = new Vector();
			int var6;
			class_gz var8;
			int var11;
			if (var5 == 0) {
				var10 = class_sc.g;
			} else if (var5 == 1) {
				var10 = class_sc.h;
			} else {
				var11 = class_sc.g.size();
				var5 = class_sc.h.size();

				class_gz var7;
				for (var6 = 0; var6 < var11; ++var6) {
					var7 = (class_gz) class_sc.g.elementAt(var6);
					var8 = new class_gz(var7.a);
					class_gz.a(var7, var8);
					var10.addElement(var8);
				}

				for (var6 = 0; var6 < var5; ++var6) {
					var7 = (class_gz) class_sc.h.elementAt(var6);
					boolean var15 = false;

					for (var11 = 0; var11 < var10.size(); ++var11) {
						class_gz var9;
						if ((var9 = (class_gz) var10.elementAt(var11)).a == var7.a) {
							var9.c += var7.c;
							var15 = true;
						}
					}

					if (!var15) {
						class_gz var12 = new class_gz(var7.a);
						class_gz.a(var7, var12);
						var10.addElement(var12);
					}
				}
			}

			var11 = var3.size();
			class_kq var13 = null;

			for (var6 = 0; var6 < var11; ++var6) {
				var13 = (class_kq) var3.elementAt(var6);

				for (int var14 = 0; var14 < var10.size(); ++var14) {
					var8 = (class_gz) var10.elementAt(var14);
					if ((var4 > 2 || var4 == 2 && (var4 != 2 || var6 != 0)) && var4 <= 2) {
						if (var8.a == var13.b + 5) {
							class_nu.a().C.addElement(var8);
						}
					} else if (var8.a >= var13.b + (var4 == 0 ? 0 : 3) && var8.a <= var13.b + 5) {
						class_nu.a().C.addElement(var8);
					}
				}
			}

			if (class_nu.a().C.size() == 0) {
				class_acv.a("Không có nguyên liệu.");
			} else {
				a(0, false, new byte[] { 28 });
				class_nu.a().m = var1;
			}
		}
	}

	public final void g(String var1) {
		if (this.cO == null) {
			this.cO = new Vector();
		}

		this.cO.addElement(var1);
		class_act.a().a(var1, (String) null);
	}

	public final void o(class_abs var1) {
		try {
			byte var2 = var1.b().readByte();

			for (int var3 = 0; var3 < var2; ++var3) {
				class_ba var4;
				(var4 = (class_ba) a((byte) var1.b().readByte(), (short) var1.b().readShort(),
						(short) var1.b().readShort(), var1.b().readShort(), (short) var1.b().readShort(), (byte) 0,
						(byte) -1)).a(var4.cK, var4.cL, var4.cK, var4.cL);
				this.l.addElement(var4);
			}

		} catch (Exception var5) {
		}
	}

	public final void a(class_f[] var1, class_f[] var2) {
		this.aT = var1;
		this.aU = var2;
	}

	public final void p(class_abs var1) {
		try {
			byte var2;
			byte var3;
			if ((var2 = var1.b().readByte()) == 0) {
				class_km.a().f();
				class_km.b.removeAllElements();
				var1.b().readByte();
				var2 = var1.b().readByte();

				for (var3 = 0; var3 < var2; ++var3) {
					class_aag var4;
					(var4 = new class_aag()).a = var1.b().readByte();
					var4.c = var1.b().readShort();
					var4.d = var1.b().readUTF();
					var4.e = new String[var1.b().readByte()];

					for (int var5 = 0; var5 < var4.e.length; ++var5) {
						var4.e[var5] = var1.b().readUTF();
					}

					var4.b = var1.b().readByte();
					class_km.b.addElement(var4);
				}

				if ((class_km.f = (short) class_km.b.size()) < 32) {
					class_km.f = 32;
				}

				class_km.a().a = this;
				class_km.a().d();
				return;
			}

			if (var2 == 1) {
				class_sh.a().b = this;
				class_sh.a().d();
				class_sh.f = new byte[var2 = var1.b().readByte()];

				for (var3 = 0; var3 < var2; ++var3) {
					class_sh.f[var3] = var1.b().readByte();
				}

				class_sh.a().g();
				return;
			}
		} catch (Exception var6) {
			var6.printStackTrace();
		}

	}

	public static void q(class_abs var0) {
		try {
			short var1 = var0.b().readShort();
			class_im.a().I = var1;
			var1 = var0.b().readShort();
			Vector var2 = new Vector();

			for (int var3 = 0; var3 < var1; ++var3) {
				class_ql var4;
				(var4 = new class_ql()).m = var0.b().readByte();
				var4.i = var0.b().readShort();
				var4.r = var0.b().readShort();
				var4.s = var0.b().readByte();
				var4.y = var0.b().readByte();
				var4.v = var0.b().readShort();
				var4.u = var0.b().readShort();
				var4.D = var0.b().readByte();
				var4.I = var0.b().readByte();
				var4.J = var0.b().readByte();
				var4.K = var0.b().readByte();
				var4.n = var0.b().readByte();
				var4.o = var0.b().readByte();
				var4.p = var0.b().readByte();
				var4.q = var0.b().readByte();
				var4.C = var0.b().readByte();
				var4.d = var0.b().readUTF();
				var4.H.removeAllElements();
				var4.x = System.currentTimeMillis();
				var4.w = var0.b().readUnsignedShort();
				byte var5 = var0.b().readByte();

				for (byte var6 = 0; var6 < var5; ++var6) {
					class_zu var7 = new class_zu((short) var0.b().readUnsignedByte(), var0.b().readShort());
					var4.H.addElement(var7);
				}

				var4.h = var0.b().readByte();
				var4.F = true;
				var2.addElement(var4);
			}

			class_im.B = var0.b().readUTF();
			class_im.H = var0.b().readUTF();
			class_im.a().y = var2;
			class_wc.a();
			boolean var9 = false;
			class_im.a().d();
			class_im.a().a(0, class_im.a().l, class_im.a().l ? class_im.a().z : new byte[] { 0, 1, 2, 3, 4, 5, 6, 31 });
			class_im.x = class_acv.s.q;
			class_im.a().h();
		} catch (Exception var8) {
		}
	}

	public final void r(class_abs var1) {
		try {
			byte var2 = var1.b().readByte();
			short var3 = var1.b().readShort();
			String var4 = var1.b().readUTF();
			int var5 = var1.b().readInt();
			boolean var6 = false;
			boolean var7 = false;

			short var16;
			byte var17;
			try {
				var16 = var1.b().readShort();
				var17 = var1.b().readByte();
			} catch (Exception var10) {
				var16 = -1;
				var17 = -1;
			}

			long var8 = System.currentTimeMillis() + (long) (var5 * 1000);
			if (var2 != -1) {
				if (var5 > 0) {
					class_vh var12;
					if ((var12 = this.d(var3, var2)) != null) {
						bK = var12;
					}

					cP = new class_p(var8, var4);
				}

				if (var5 == 0) {
					cP = null;
					bK = null;
				}
			}

			if (var2 == -1 && var5 >= 0) {
				short var15 = var3;
				class_abj var13 = this;
				int var18 = 0;

				class_ht var10000;
				while (true) {
					if (var18 >= var13.cQ.size()) {
						var10000 = null;
						break;
					}

					class_ht var9;
					if ((var9 = (class_ht) var13.cQ.elementAt(var18)) != null && var9.c == var15) {
						var10000 = var9;
						break;
					}

					++var18;
				}

				class_ht var14 = var10000;
				if (var14 == null) {
					var14 = new class_ht(var3, var16, (long) var5, var4, var17);
					this.cQ.addElement(var14);
				}

				if (var14 != null) {
					var14.a = var4;
					var14.d = var16;
					var14.a((long) var5);
					if (var17 == -2) {
						var14.b = true;
						return;
					}
				}
			}
		} catch (Exception var11) {
		}

	}

	private void b(class_vh var1) {
		if (aV != null && (aV.m == 1 || aV.m == 2) && aV.d == var1.g_()) {
			c(var1.g_(), aV.m == 1 ? 3 : 0, var1.cK, var1.cL);
		} else if (aW != null && (aW.m == 1 || aW.m == 2) && aW.d == var1.g_()) {
			c(var1.g_(), aW.m == 1 ? 3 : 0, var1.cK, var1.cL);
		} else if (aX != null && (aX.m == 1 || aX.m == 2) && aX.d == var1.g_()) {
			c(var1.g_(), aX.m == 1 ? 3 : 0, var1.cK, var1.cL);
		} else {
			for (int var3 = 0; var3 < cS.size(); ++var3) {
				class_do var2;
				if ((var2 = (class_do) cS.elementAt(var3)).m == 0 && var2.c == var1.g_()) {
					c(var1.g_(), 0, var1.cK, var1.cL);
				}
			}

		}
	}

	private static Vector g(int var0) {
		Vector var1 = new Vector();
		if (aV != null && (aV.m == 1 || aV.m == 2) && aV.d == var0) {
			var1.addElement(new class_s("Trả " + aV.i, new class_fv()));
		}

		if (aW != null && (aW.m == 1 || aW.m == 2) && aW.d == var0) {
			var1.addElement(new class_s("Trả " + aW.i, new class_fy()));
		}

		if (aX != null && (aX.m == 1 || aX.m == 2) && aX.d == var0) {
			var1.addElement(new class_s("Trả " + aX.i, new class_fx()));
		}

		for (int var2 = 0; var2 < cS.size(); ++var2) {
			class_do var3;
			if ((var3 = (class_do) cS.elementAt(var2)).m == 0 && var3.c == var0) {
				var1.addElement(new class_s(var3.i, new class_fz(var3)));
			}
		}

		return var1;
	}

	public static Image e(int var0) {
		if (aV != null && (aV.m == 1 || aV.m == 2) && aV.d == var0) {
			return class_yi.n;
		} else if (aW != null && (aW.m == 1 || aW.m == 2) && aW.d == var0) {
			return class_yi.n;
		} else if (aX != null && (aX.m == 1 || aX.m == 2) && aX.d == var0) {
			return class_yi.n;
		} else {
			for (int var1 = 0; var1 < cS.size(); ++var1) {
				class_do var2;
				if ((var2 = (class_do) cS.elementAt(var1)).m == 0 && var2.c == var0) {
					if (var2.a == 3) {
						return class_yi.n;
					}

					return class_yi.m;
				}
			}

			return class_yi.l;
		}
	}

	private static void c(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < cT.size(); ++var4) {
			MoveObj var5;
			if ((var5 = (MoveObj) cT.elementAt(var4)) != null && var5.e == var0) {
				return;
			}
		}

		MoveObj var6;
		(var6 = new MoveObj()).e = var0;
		var6.d = (short) var1;
		var6.posX = var2;
		var6.posY = var3;
		cT.addElement(var6);
	}

	public final void s(class_abs var1) {
		try {
			byte var2 = var1.b().readByte();
			byte var3 = var1.b().readByte();
			if (var2 == 0) {
				cS.removeAllElements();
			}

			for (int var4 = 0; var4 < var3; ++var4) {
				short var5 = var1.b().readShort();
				class_do var12;
				(var12 = new class_do(var5)).m = var2;
				var12.e = var1.b().readByte();
				var12.i = var1.b().readUTF();
				String[] var13;
				int var14;
				switch (var2) {
				case 0:
					var12.c = var1.b().readByte();
					var13 = class_yg.a(var1.b().readUTF(), ">");

					for (var14 = 0; var14 < var13.length; ++var14) {
						var12.f.addElement(var13[var14]);
					}

					var12.a = var1.b().readByte();
					var12.s = var1.b().readByte();
					break;
				case 1:
					var12.d = var1.b().readByte();
					var13 = class_yg.a(var1.b().readUTF(), ">");

					for (var14 = 0; var14 < var13.length; ++var14) {
						var12.g.addElement(var13[var14]);
					}

					var12.h = var1.b().readUTF();
					var12.q = var1.b().readUTF();
					break;
				case 2:
					var12.a = var1.b().readByte();
					var12.h = var1.b().readUTF();
					var12.d = var1.b().readByte();
					var12.s = var1.b().readByte();
					var12.q = var1.b().readUTF();
					int var6;
					byte var7;
					short var8;
					short var9;
					short var10;
					if (var12.a == 2) {
						var7 = var1.b().readByte();
						var12.n = new short[var7];
						var12.p = new short[var7];
						var12.o = new short[var7];

						for (var6 = 0; var6 < var7; ++var6) {
							var8 = var1.b().readShort();
							var9 = var1.b().readShort();
							var10 = var1.b().readShort();
							var12.n[var6] = var8;
							var12.o[var6] = var9;
							var12.p[var6] = var10;
						}
					} else if (var12.a == 0) {
						var7 = var1.b().readByte();
						var12.j = new short[var7];
						var12.l = new short[var7];
						var12.k = new short[var7];

						for (var6 = 0; var6 < var7; ++var6) {
							var8 = var1.b().readShort();
							var9 = var1.b().readShort();
							var10 = var1.b().readShort();
							var12.j[var6] = var8;
							var12.k[var6] = var9;
							var12.l[var6] = var10;
						}
					} else if (var12.a == 4) {
						var12.l = new short[1];
						var12.k = new short[1];
						var12.k[0] = var1.b().readShort();
						var12.l[0] = var1.b().readShort();
					}
				}

				if (var2 == 0) {
					cS.addElement(var12);
					if (var12.e == 0 && class_hw.aS[0] == 0) {
						this.K = var12.c;
						this.a(this.K);
					}
				} else if (var12.e == 0) {
					aV = var12;
				} else if (var12.e == 1) {
					aW = var12;
				} else if (var12.e == 2) {
					aX = var12;
				}
			}

		} catch (Exception var11) {
			var11.printStackTrace();
		}
	}

	public static void t(class_abs var0) {
		try {
			class_gv var10000 = class_gv.a();
			class_abs var1 = var0;
			class_gv var10 = var10000;

			try {
				byte var2;
				if ((var2 = var1.b().readByte()) == 0) {
					var10.i();
					var10.h = new Vector();
					class_xl var11 = null;
					var10.b = var1.b().readUTF();
					byte var12 = var1.b().readByte();

					for (int var4 = 0; var4 < var12; ++var4) {
						String var5 = var1.b().readUTF();
						byte var6 = var1.b().readByte();
						byte var7 = var1.b().readByte();
						(var11 = new class_xl(var10)).c = var6;
						var11.e = var5;
						var11.d = var7;
						var11.a = var10.e[var4];
						var11.b = var10.f[var4];
						var10.h.addElement(var11);
					}

					return;
				}

				if (var2 == 1) {
					var2 = var1.b().readByte();
					class_xl var3;
					(var3 = (class_xl) var10.h.elementAt(var2)).f = var1.b().readUTF();
					var10.a(var3.f);
					return;
				}
			} catch (Exception var8) {
				var8.printStackTrace();
			}

		} catch (Exception var9) {
		}
	}

	public static void u(class_abs var0) {
		class_hx.a().a(var0);
	}

	public static void a(class_ap var0, class_ap var1, int var2, byte var3, int var4) {
		class_yb var5;
		(var5 = new class_yb(var4)).a(0, var0.cK, var0.cL, var2, var3, var0, var1);
		if (var4 == 10) {
			var5.b = 46;
		} else if (var4 == 11) {
			var5.b = 45;
		} else if (var4 == 12) {
			var5.b = 30;
		} else if (var4 == 15) {
			var5.b = 58;
		}

		n.addElement(var5);
	}

	public static class_di a(class_ap var0, int var1, int var2, int var3) {
		class_di var4 = new class_di(var1, var2, var3);
		if (var0 != null) {
			var4.k = var0;
			if (var0.m() != -1) {
				var4.m = -5;
			}
		}

		switch (var3) {
		case 41:
			var4.l = 2;
			var4.m = (byte) (var4.m - 6);
			break;
		case 42:
		case 56:
			var4.l = 2;
			var4.m = (byte) (var4.m - 6);
			break;
		case 43:
			var4.l = 3;
			var4.m = (byte) (var4.m - 6);
			break;
		case 44:
		case 47:
		case 57:
			var4.l = 1;
			var4.f -= 6;
			var4.m = (byte) (var4.m - 6);
		case 45:
		case 46:
		case 48:
		case 49:
		case 50:
		case 51:
		case 52:
		case 53:
		case 54:
		case 55:
		}

		return var4;
	}

	public final void v(class_abs var1) {
		int[] var2 = new int[] { 41, 42, 43, 56 };
		int[] var3 = new int[] { 12, 10, 11, 15 };
		int[] var4 = new int[] { 44, 44, 47, 57 };

		try {
			short var5 = var1.b().readShort();
			class_ap var19;
			if ((var19 = (class_ap) this.f((int) var5)) != null) {
				byte var6 = var1.b().readByte();
				byte var7 = var1.b().readByte();
				byte var8 = var1.b().readByte();
				Vector var9 = new Vector();
				Vector var10 = new Vector();
				Vector var11 = new Vector();

				for (int var12 = 0; var12 < var8; ++var12) {
					short var13 = var1.b().readShort();
					int var14 = var1.b().readInt();
					int var15 = var1.b().readInt();
					int var16;
					if (var6 == 0) {
						class_hw var22;
						if ((var22 = (class_hw) this.f((int) var13)) != null) {
							var10.addElement(String.valueOf(var14));
							var9.addElement(var22);
							var11.addElement(String.valueOf(var15));

							for (var16 = 0; var16 < 3; ++var16) {
								class_hw var23;
								(var23 = new class_hw()).cK = (short) (var22.cK + (ap.nextInt() % 10 << 4));
								var23.cL = (short) (var22.cL + (ap.nextInt() % 10 << 4));
								var9.addElement(var23);
								var10.addElement(String.valueOf(var14));
								var11.addElement(String.valueOf(var15));
							}
						}
					} else {
						class_bb var21;
						if (var6 == 1 && (var21 = this.n(var13)) != null) {
							var10.addElement(String.valueOf(var14));
							var9.addElement(var21);
							var11.addElement(String.valueOf(var15));

							for (var16 = 0; var16 < 3; ++var16) {
								class_bb var17;
								(var17 = new class_bb()).cK = (short) (var21.cK + (ap.nextInt() % 10 << 4));
								var17.cL = (short) (var21.cL + (ap.nextInt() % 10 << 4));
								var9.addElement(var17);
								var10.addElement(String.valueOf(var14));
								var11.addElement(String.valueOf(var15));
							}
						}
					}
				}

				class_di var20;
				(var20 = a(var19, var19.cK, var19.cL, var2[var7])).n = new class_zr();
				var20.n.a = var19;
				var20.n.b = var9;
				var20.n.e = var4[var7];
				var20.n.c = var10;
				var20.n.d = var11;
				var20.n.f = 0;
				var20.n.g = var3[var7];
				class_abm.b.addElement(var20);
				return;
			}
		} catch (Exception var18) {
		}

	}

	public final void w(class_abs var1) {
		try {
			if (var1.b().readByte() == 0) {
				class_hr.a().a(this);
				class_hr.a().a((byte) 1, false);
				return;
			}

			String var4 = var1.b().readUTF();
			byte var5 = var1.b().readByte();
			if (class_acv.q == class_hr.a()) {
				class_hr.a().u = var4;
				class_hr.a().i();
				class_acv.g();
			}

			if (var5 == 1) {
				class_hr.a().j();
				class_hr.B = true;
				return;
			}
		} catch (Exception var3) {
		}

	}

	public final void x(class_abs var1) {
		try {
			byte var2;
			if ((var2 = var1.b().readByte()) == 0) {
				class_hr.a().a(this);
				class_hr.a().a((byte) 0, false);
				return;
			}

			if (var2 == 4) {
				class_acv.q.a(var1.b().readShort(), var1.b().readByte(), var1.b().readByte());
				return;
			}
		} catch (Exception var3) {
		}

	}

	public static void y(class_abs var0) {
		try {
			byte var1;
			if ((var1 = var0.b().readByte()) == -1) {
				class_acv.J.a(class_acv.q);
				return;
			}

			byte var2 = var1;
			if (var1 == 3) {
				var2 = 4;
			} else if (var1 == 4) {
				var2 = 5;
			}

			((Vector) class_kj.a.elementAt(var2)).removeAllElements();
			byte var3 = var0.b().readByte();

			for (int var4 = 0; var4 < var3; ++var4) {
				class_ql var5;
				(var5 = new class_ql()).F = true;
				var5.D = var0.b().readByte();
				var5.r = var0.b().readShort();
				var5.s = var0.b().readByte();
				var5.y = var0.b().readByte();
				var5.v = var0.b().readShort();
				var5.u = var0.b().readShort();
				var5.I = var0.b().readByte();
				var5.J = var0.b().readByte();
				var5.K = var0.b().readByte();
				var5.n = var0.b().readByte();
				var5.o = var0.b().readByte();
				var5.p = var0.b().readByte();
				var5.q = var0.b().readByte();
				var5.C = var0.b().readByte();
				var5.d = var0.b().readUTF();
				var5.e = var0.b().readUTF();
				var5.f = var0.b().readUTF();
				var5.B = var0.b().readInt();
				var5.N = var0.b().readInt();
				var5.O = var0.b().readLong();
				var5.P = var0.b().readUTF();
				var5.H.removeAllElements();
				byte var6 = var0.b().readByte();

				for (byte var7 = 0; var7 < var6; ++var7) {
					class_zu var8 = new class_zu((short) var0.b().readUnsignedByte(), var0.b().readShort());
					var5.H.addElement(var8);
				}

				((Vector) class_kj.a.elementAt(var2)).addElement(var5);
			}

			if (var1 == 0) {
				class_kj.j();
			}

			if (var1 == 3) {
				class_kj.j = var0.b().readLong();
			}

			class_kj.b[var2] = var0.b().readShort();
			if (class_kj.e[var2] >= class_kj.b[var2]) {
				class_kj.e[var2] = 0;
				return;
			}
		} catch (Exception var9) {
			var9.printStackTrace();
		}

	}

	public static void z(class_abs var0) {
		try {
			short var1 = (short) var0.b().readUnsignedByte();
			short var2 = var0.b().readShort();
			if (var1 == 0) {
				byte[] var4 = new byte[var0.b().readByte()];
				var0.b().read(var4, 0, var4.length);
				class_yi.a(var2, var4);
				class_yi.T[var2].l = var0.b().readUTF();
				var0.b().readByte();
				var0.b().readInt();
				class_yi.T[var2].m = var0.b().readByte();
				class_yi.T[var2].n = var0.b().readByte();
				byte var5 = var0.b().readByte();
				class_yi.T[var2].k = var5;
				if (var5 == 1) {
					var4 = new byte[var0.b().readShort()];
					var0.b().read(var4, 0, var4.length);
					class_yi.T[var2].b(var4);
					return;
				}
			}
		} catch (Exception var3) {
			var3.printStackTrace();
		}

	}

	public static void A(class_abs var0) {
		try {
			short var1 = var0.b().readShort();
			byte var2;
			if ((var2 = var0.b().readByte()) == 0) {
				short var3 = var0.b().readShort();
				byte var4;
				int[] var5 = new int[var4 = var0.b().readByte()];
				int[] var6 = new int[var4];
				Vector var7 = new Vector();
				class_vh var8;
				if ((var8 = class_acv.s.d((short) var1, (byte) 12)) != null) {
					int var9 = 0;

					while (true) {
						if (var9 >= var4) {
							var8.a(var7, var2, var3, var5, var6);
							break;
						}

						byte var10 = var0.b().readByte();
						short var11 = var0.b().readShort();
						class_vh var13;
						if ((var13 = class_acv.s.d(var11, var10)) != null) {
							var7.addElement(var13);
						}

						var5[var9] = var0.b().readInt();
						var6[var9] = var0.b().readInt();
						++var9;
					}
				}
			}

			if (var2 == 1) {
				class_vh var14 = class_acv.s.c(var1);
				short var15 = var0.b().readShort();
				long var16 = var0.b().readLong();
				if (var14 != null) {
					var14.a(var15, var14.cK, var14.cL, var16);
					return;
				}
			}
		} catch (Exception var12) {
		}

	}

	public final void B(class_abs var1) {
		try {
			byte var2 = var1.b().readByte();
			short var3 = var1.b().readShort();
			short var4 = var1.b().readShort();
			long var5 = var1.b().readLong();
			int var7 = var1.b().readByte() << 4;
			int var8 = var1.b().readByte() << 4;
			byte var9 = var1.b().readByte();
			byte var10 = var1.b().readByte();
			class_ap var11 = (class_ap) (var9 == 0 ? this.b(var4) : this.n(var4));
			class_acc var14;
			(var14 = new class_acc(var3)).b = var5;
			var14.cK = (short) var7;
			var14.cL = (short) var8;
			var14.cF = var9;
			var14.d = var1.b().readByte();
			byte var15 = var1.b().readByte();
			boolean var6 = false;

			try {
				int var16 = var1.b().readInt();
				var14.c = var16;
			} catch (Exception var12) {
			}

			if (var11 != null && var2 == 1) {
				if (var10 == 0) {
					var11.b(var14, var15);
					return;
				}

				var11.a(var14, var15);
				return;
			}

			if (var4 > 32000 || var2 == 0) {
				if (var11 != null) {
					var14.cK = var11.cK;
					var14.cL = var11.cL;
				}

				this.l.addElement(var14);
				return;
			}
		} catch (Exception var13) {
			var13.printStackTrace();
		}

	}

	public final void C(class_abs var1) {
		try {
			switch (var1.b().readByte()) {
			case 0:
				byte var2 = var1.b().readByte();
				short var3 = var1.b().readShort();
				short var4 = var1.b().readShort();
				int var5 = var1.b().readInt();
				boolean var6 = var1.b().readBoolean();
				boolean var7 = var1.b().readBoolean();
				long var9 = 0L;
				if (var5 > 0) {
					var9 = (long) var5 + System.currentTimeMillis();
				}

				class_vh var13 = this.d(var3, var2);
				var2 = 0;

				try {
					var2 = var1.b().readByte();
				} catch (Exception var11) {
				}

				if (var13 != null) {
					var13.a(var4, var13.cK, var13.cL, var9, var6, var7, true, 0, (byte) class_yi.a(1, 8), var2);
					return;
				}
				break;
			default:
				return;
			}
		} catch (Exception var12) {
		}

	}

	public static void a(class_ap var0, int var1, long var2, int var4, int var5, int var6) {
		class_acc var7;
		(var7 = new class_acc(var1)).b = var2;
		var7.cK = var0.cK;
		var7.cL = var0.cL;
		var7.cF = var0.cF;
		var7.d = 0;
		var7.e = var5;
		if (var6 == 0) {
			var0.a(var7, 0);
		} else {
			class_acv.s.l.addElement(var7);
		}
	}

	public static void c(Graphics var0) {
		class_acv.a(var0);
		/*
		 * if (R != null) { byte var1 = 15; if (class_acv.q == class_acv.s) { var1 = 40;
		 * }
		 * 
		 * var0.drawImage(R, 0, var1, 0); }
		 */

	}

	static void a(class_abj var0, int var1, Vector var2) {
		var0.a(var1, var2);
	}

	static void a(class_abj var0, int var1, String var2, String var3) {
		class_bz var4;
		(var4 = new class_bz(10, 40, 120, class_aae.c)).e = true;
		class_px.a().bc = var4.i;
		class_bz var5;
		(var5 = new class_bz(10, 75, 120, class_aae.c)).c(3);
		class_px.a().a(class_acv.o - 70, class_acv.n - class_aae.c - 120, 140, 100, var3,
				new class_s("Nạp", new class_abx(var0, var1, var2, var4, var5)));
		class_px.a().ba = new class_s("Đóng", new class_aby(var0));
		class_px.a().b = new class_aar(var0, var4, var5);
		class_px.a().d();
	}

	static void a(class_abj var0) {
		var0.F();
	}
}
