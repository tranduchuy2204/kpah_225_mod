package classes;

import javax.microedition.lcdui.Graphics;
import java.util.Hashtable;

public final class class_acc extends class_vh {
	private static Hashtable f;
	public short a;
	public long b;
	private byte g;
	public int c;
	public byte d;
	public int e;

	static {
		class_acc.f = new Hashtable();
	}

	public String toString() {
		return "class_acc [a=" + a + ", b=" + b + ", g=" + g + ", c=" + c + ", d=" + d + ", e=" + e + "]";
	}

	public class_acc(final int n) {
		this.b = -1L;
		this.g = 0;
		this.c = 0;
		this.d = 0;
		this.e = 2000000000;
		this.a = (short) n;
	}

	public final void a(final Graphics graphics, final int n, final int n2) {
		final class_il class_il;
		final class_dh a;
		if ((class_il = (class_il) class_acc.f.get(new StringBuffer(String.valueOf(this.a)).toString())) != null
				&& (a = class_ko.a((short) (this.a + 8700))) != null && a.a != null) {
			class_il.a(graphics, (int) b(this.a)[this.g], n, n2, 0, a.a);
		}
	}

	public static void a(final byte[][] array) {
		for (int i = 0; i < array.length; ++i) {
			class_acc.f.put(new StringBuffer(String.valueOf(i)).toString(), new class_il(array[i]));
		}
	}

	private static byte[] b(final int i) {
		final class_il class_il;
		if ((class_il = (class_il) class_acc.f.get(new StringBuffer(String.valueOf(i)).toString())) != null) {
			return class_il.a;
		}
		return null;
	}

	public final boolean b() {
		return this.b != -1L && (System.currentTimeMillis() - this.b >= 0L && this.g == 0);
	}

	public final void a() {
		try {
			final byte[] b;
			if ((b = b(this.a)) != null) {
				this.g = (byte) ((this.g + 1) % b.length);
				if (this.g >= b.length / 2 && this.c > 0) {
					class_acv.s.a("-" + this.c, 0, (int) super.cK, super.cL - 15, 1, -2);
					this.c = 0;
				}
			}
		} catch (final Exception ex) {
		}
		if (this.b()) {
			super.cE = true;
		}
	}

	public final void a(final Graphics graphics) {
		final class_il class_il;
		final class_dh a;
		if ((class_il = (class_il) class_acc.f.get(new StringBuffer(String.valueOf(this.a)).toString())) != null
				&& (a = class_ko.a((short) (this.a + 8700))) != null && a.a != null) {
			class_il.a(graphics, (int) b(this.a)[this.g], (int) super.cK, (int) super.cL, 0, a.a);
		}
	}

	public final void a(final short n, final short n2) {
	}
}