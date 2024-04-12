/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Vector;

/**
 *
 * @author Tran Duc Huy
 */
public class AccountManager {

	private static AccountManager INSTANCE;
	private Vector accounts;
	private Account currentAccount;

	public Vector getAccounts() {
		return accounts;
	}

	public void setAccounts(Vector accounts) {
		this.accounts = accounts;
	}

	public Account getCurrentAccount() {
		return currentAccount;
	}

	public void setCurrentAccount(Account currentAccount) {
		this.currentAccount = currentAccount;
	}

	public static AccountManager getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new AccountManager();
		}
		return INSTANCE;
	}

	private AccountManager() {
		accounts = new Vector();
	}

	public boolean appendAccount(Account account) {
		if (accounts.contains(account)) {
			return false;
		}
		account.user = account.user.toLowerCase();
		accounts.addElement(account);
		return true;
	}

	public void removeAccountByIndex(int index) {
		accounts.removeElementAt(index);
	}

	public Account getAccountByIndex(int index) {
		return (Account) accounts.elementAt(index);
	}

	public void loadByRecord() {
		byte[] bytes;
		if ((bytes = class_aai.a("list_account")) != null) {
			ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
			DataInputStream dis = new DataInputStream(bis);
			try {
				int index = dis.readInt();
				System.out.println(index);
				for (int i = 0; i < index; i++) {
					Account account = new Account(dis.readUTF(), dis.readUTF());
					this.appendAccount(account);
				}
				dis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void saveRecord() {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(bos);
		try {
			int index = this.accounts.size();
			dos.writeInt(index);
			for (int i = 0; i < index; i++) {
				Account account = this.getAccountByIndex(i);
				dos.writeUTF(account.getUser());
				dos.writeUTF(account.getPassword());
			}
			class_aai.a("list_account", bos.toByteArray());
			dos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
