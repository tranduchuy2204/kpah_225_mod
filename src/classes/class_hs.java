package classes;

final class class_hs implements Runnable {

	private class_aco a;

	class_hs(final class_aco a) {
		this.a = a;
	}

	public final void run() {
		try {
			while (this.a.b()) {
				++class_aco.k;
				byte b = this.a.a.readByte();
				if (this.a.g) {
					b = class_aco.a(this.a, b);
				}
				int unsignedShort;
				if (this.a.g) {
					if (b == Byte.MIN_VALUE) {
						b = class_aco.a(this.a, this.a.a.readByte());
						final byte[] array = { this.a.a.readByte(), this.a.a.readByte(), this.a.a.readByte(),
								this.a.a.readByte() };
						unsignedShort = ((class_aco.a(this.a, array[3]) & 0xFF)
								| (class_aco.a(this.a, array[2]) & 0xFF) << 8
								| (class_aco.a(this.a, array[1]) & 0xFF) << 16
								| (class_aco.a(this.a, array[0]) & 0xFF) << 24);
					} else {
						unsignedShort = ((class_aco.a(this.a, this.a.a.readByte()) & 0xFF) << 8
								| (class_aco.a(this.a, this.a.a.readByte()) & 0xFF));
					}
				} else {
					unsignedShort = this.a.a.readUnsignedShort();
				}
				final byte[] array2 = new byte[unsignedShort];
				class_aco a;
				for (int read = 0, n = 0; read != -1 && n < unsignedShort; n += read, a = this.a, a.f += n + 5) {
					if ((read = this.a.a.read(array2, n, unsignedShort - n)) > 0) {
					}
				}
				if (this.a.g) {
					for (int i = 0; i < array2.length; ++i) {
						array2[i] = class_aco.a(this.a, array2[i]);
					}
				}
				final class_abs class_abs = new class_abs(b, array2);
				try {
					if (class_abs.a == -40) {
						final class_abs class_abs2 = class_abs;
						final byte byte1 = class_abs2.b().readByte();
						this.a.h = new byte[byte1];
						for (byte b2 = 0; b2 < byte1; ++b2) {
							this.a.h[b2] = class_abs2.b().readByte();
						}
						for (int j = 0; j < this.a.h.length - 1; ++j) {
							final byte[] h = this.a.h;
							final int n2 = j + 1;
							h[n2] ^= this.a.h[j];
						}
						this.a.g = true;
					} else {
						int cmd = class_abs.a;
						if (cmd != 4 && cmd != 90 && cmd != 60 && cmd != 70 && cmd != 27 && cmd != 15 && cmd != 47
								&& cmd != 8 && cmd != -51 && cmd != 5 && cmd != -48 && cmd != 17 && cmd != 7) {
							System.out.println("receive cmd=" + cmd);
						}
						MsgHandler.onMessage(this.a.b, class_abs);
//                        this.a.b.a(class_abs);
					}
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		} catch (Exception ex2) {
		}
		if (this.a.c) {
			if (this.a.b != null) {
				if (System.currentTimeMillis() - this.a.i > 500L) {
					final class_bi b3 = this.a.b;
					class_acv.s.n();

				} else {
					final class_bi b4 = this.a.b;
					class_acv.s.m();

				}
			}
			if (class_aco.a(this.a) != null) {
				class_aco.c(this.a);
			}
		}
	}
}
