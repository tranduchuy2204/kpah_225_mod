package classes;

import java.util.Vector;

public class class_jd implements IAction {

	private final class_s a;

	class_jd(class_xw paramclass_xw, class_s paramclass_s) {
		this.a = paramclass_s;
	}

	public final void perform() {
		Vector localVector;
		(localVector = new Vector()).addElement(this.a);
		localVector.addElement(new class_s("Chọn máy chủ", new class_je(this)));
		localVector.addElement(new class_s("Q.Lý Tài khoản", new AccountControlForm()));
		localVector.addElement(new class_s("Auto click", new AutoClick()));
		class_acv.u.a(localVector, 0);
	}

}
