package classes;

import java.util.Vector;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.List;
import javax.microedition.lcdui.TextField;

public class class_jd implements IAction {

	private final class_s a;

	class_jd(class_xw paramclass_xw, class_s paramclass_s) {
		this.a = paramclass_s;
	}

	public final void perform() {
		Vector localVector;
		(localVector = new Vector()).addElement(this.a);
		localVector.addElement(new class_s("Chọn máy chủ", new class_je(this)));
		localVector.addElement(new class_s("Quản lý tài khoản", new AccountControlForm()));
		localVector.addElement(new class_s("Auto Click", new AutoClick()));
		class_acv.u.a(localVector, 0);
	}

	private static void setCurrentScreen(Displayable dsplayable) {
		Display.getDisplay(game.GameMidlet.a).setCurrent(dsplayable);
	}

	class AccountControlForm implements IAction, CommandListener {

		private Command listBack = new Command("Quay lại", Command.ITEM, 1);
		private Command add = new Command("Thêm", Command.ITEM, 2);
		private Command edit = new Command("Sửa", Command.ITEM, 3);
		private Command delete = new Command("Xóa", Command.ITEM, 4);
		private Command save = new Command("Lưu", Command.SCREEN, 0);
		private Command back = new Command("Quay lại", Command.BACK, 1);
		private int selectedIndex = 0;
		private List list;
		private Form addForm;
		private Form editForm;
		private TextField userText;
		private TextField passwordText;

		public void perform() {
			list = new List("Chuyển NV", List.IMPLICIT);
			for (int i = 0; i < AccountManager.getInstance().getAccounts().size(); i++) {
				list.append(AccountManager.getInstance().getAccountByIndex(i).getUser(), null);
			}
			addForm = new Form("Thêm tài khoản");
			editForm = new Form("Sửa tài khoản");
			userText = new TextField("Tài khoản", "", 50, TextField.ANY);
			passwordText = new TextField("Mật khẩu", "", 50, TextField.PASSWORD);
			list.addCommand(listBack);
			list.addCommand(add);
			list.addCommand(edit);
			list.addCommand(delete);
			list.setCommandListener(this);
			setCurrentScreen(list);
		}

		public Alert alertNoti(String noti) {
			Alert alert = new Alert("Thông báo");
			alert.setString(noti);
			alert.setTimeout(Alert.FOREVER);
			return alert;
		}

		public void commandAction(Command c, Displayable d) {
			if (d == list) {
				if (c == add) {
					addForm.deleteAll();
					userText.setString("");
					passwordText.setString("");
					addForm.append(userText);
					addForm.append(passwordText);
					addForm.addCommand(save);
					addForm.addCommand(back);
					addForm.setCommandListener(this);
					setCurrentScreen(addForm);
					return;
				} else if (c == edit) {
					if (AccountManager.getInstance().getAccounts().size() <= 0) {
						setCurrentScreen(alertNoti("Bạn chưa có tài khoản nào trong danh sách"));
						return;
					}
					selectedIndex = list.getSelectedIndex();
					editForm.deleteAll();
					userText.setString(AccountManager.getInstance().getAccountByIndex(selectedIndex).getUser());
					passwordText.setString(AccountManager.getInstance().getAccountByIndex(selectedIndex).getPassword());
					editForm.append(userText);
					editForm.append(passwordText);
					editForm.addCommand(save);
					editForm.addCommand(back);
					editForm.setCommandListener(this);
					setCurrentScreen(editForm);
					return;
				} else if (c == delete) {
					if (AccountManager.getInstance().getAccounts().size() <= 0) {
						setCurrentScreen(alertNoti("Bạn chưa có tài khoản nào trong danh sách"));
						return;
					}
					selectedIndex = list.getSelectedIndex();
					AccountManager.getInstance().removeAccountByIndex(selectedIndex);
					AccountManager.getInstance().saveRecord();
					perform();
					return;
				} else if (c == List.SELECT_COMMAND) {
					if (AccountManager.getInstance().getAccounts().size() <= 0) {
						setCurrentScreen(alertNoti("Bạn chưa có tài khoản nào trong danh sách"));
						return;
					}
					selectedIndex = list.getSelectedIndex();
					class_acv.v.a.a(AccountManager.getInstance().getAccountByIndex(selectedIndex).getUser());
					class_acv.v.b.a(AccountManager.getInstance().getAccountByIndex(selectedIndex).getPassword());
					setCurrentScreen(class_acv.a);
//                    class_acv.v.i();
					return;
				} else if (c == listBack) {
					setCurrentScreen(class_acv.a);
					return;
				}
			}
			if (d == addForm) {
				if (c == save) {
					if (userText.getString().equals("") || passwordText.getString().equals("")) {
						setCurrentScreen(alertNoti("Tài khoản hoặc mật khẩu không được bỏ trống"));
						return;
					}
					Account account = new Account(userText.getString(), passwordText.getString());
					if (AccountManager.getInstance().appendAccount(account)) {
						AccountManager.getInstance().saveRecord();
					} else {
						setCurrentScreen(alertNoti("Đã có tài khoản này trong danh sách."));
						return;
					}
				}
				perform();
				return;
			}
			if (d == editForm) {
				if (c == save) {
					if (userText.getString().equals("") || passwordText.getString().equals("")) {
						setCurrentScreen(alertNoti("Tài khoản hoặc mật khẩu không được bỏ trống"));
						return;
					}
					System.out.println("selectedIndex: " + selectedIndex);
					Account account = new Account(userText.getString(), passwordText.getString());
					AccountManager.getInstance().getAccounts().setElementAt(account, selectedIndex);
					AccountManager.getInstance().saveRecord();
				}
				perform();
				return;
			}
		}
	}
}
