package classes;

final class class_vr implements IAction {

	private class_nu a;
	private final int b;

	class_vr(class_nu paramclass_nu, int paramInt) {
		this.a = paramclass_nu;
		this.b = paramInt;
	}

	public final void perform() {
		if ((class_acv.s.q.cY) && (this.b >= 14) && (this.b <= 18)) {
			class_acv.a("Không thể đeo khăn khi đang phạm tội.");
			return;
		}
		if (this.b == 19) {
			if (class_acv.s.aG != 0) {
				class_go.a().k(this.b);
				class_acv.s.q.F();
				class_go.a().j();
			} else {
				class_acv.a("Không thể sử dụng trong làng.");
			}
			return;
		}
		class_acv.s.b(this.b);
		if (class_acv.s.q.bq[this.b] == 0) {
			this.a.n.removeElementAt(this.a.f);
		}
		if ((this.b >= 14) && (this.b <= 18)) {
			class_acv.s.q.as = System.currentTimeMillis();
			class_acv.s.q.cR = ((byte) this.b);
		}
	}
}
