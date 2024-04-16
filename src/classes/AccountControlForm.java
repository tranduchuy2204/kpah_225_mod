package classes;

import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.List;
import javax.microedition.lcdui.TextField;

public class AccountControlForm implements IAction, CommandListener {

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
		ModHelpers.setCurrentScreen(list);
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
				ModHelpers.setCurrentScreen(addForm);
				return;
			} else if (c == edit) {
				if (AccountManager.getInstance().getAccounts().size() <= 0) {
					ModHelpers.setCurrentScreen(alertNoti("Bạn chưa có tài khoản nào trong danh sách"));
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
				ModHelpers.setCurrentScreen(editForm);
				return;
			} else if (c == delete) {
				if (AccountManager.getInstance().getAccounts().size() <= 0) {
					ModHelpers.setCurrentScreen(alertNoti("Bạn chưa có tài khoản nào trong danh sách"));
					return;
				}
				selectedIndex = list.getSelectedIndex();
				AccountManager.getInstance().removeAccountByIndex(selectedIndex);
				AccountManager.getInstance().saveRecord();
				perform();
				return;
			} else if (c == List.SELECT_COMMAND) {
				if (AccountManager.getInstance().getAccounts().size() <= 0) {
					ModHelpers.setCurrentScreen(alertNoti("Bạn chưa có tài khoản nào trong danh sách"));
					return;
				}
				selectedIndex = list.getSelectedIndex();
				class_acv.v.a.a(AccountManager.getInstance().getAccountByIndex(selectedIndex).getUser());
				class_acv.v.b.a(AccountManager.getInstance().getAccountByIndex(selectedIndex).getPassword());
				ModHelpers.setCurrentScreen(class_acv.a);
//                    class_acv.v.i();
				return;
			} else if (c == listBack) {
				ModHelpers.setCurrentScreen(class_acv.a);
				return;
			}
		}
		if (d == addForm) {
			if (c == save) {
				if (userText.getString().equals("") || passwordText.getString().equals("")) {
					ModHelpers.setCurrentScreen(alertNoti("Tài khoản hoặc mật khẩu không được bỏ trống"));
					return;
				}
				Account account = new Account(userText.getString(), passwordText.getString());
				if (AccountManager.getInstance().appendAccount(account)) {
					AccountManager.getInstance().saveRecord();
				} else {
					ModHelpers.setCurrentScreen(alertNoti("Đã có tài khoản này trong danh sách."));
					return;
				}
			}
			perform();
			return;
		}
		if (d == editForm) {
			if (c == save) {
				if (userText.getString().equals("") || passwordText.getString().equals("")) {
					ModHelpers.setCurrentScreen(alertNoti("Tài khoản hoặc mật khẩu không được bỏ trống"));
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