/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Vector;

/**
 *
 * @author ASUS
 */
public class Account {

	public String user;
	public String password;

	public Account(String user, String password) {
		this.user = user.toLowerCase().trim();
		this.password = password;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user.toLowerCase().trim();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String toString() {
		return "Account{" + "user=" + user + ", password=" + password + '}';
	}

	public boolean equals(Object otherAccount) {
		if (otherAccount == null) {
			return false;
		}

		if (otherAccount.getClass() != this.getClass()) {
			return false;
		}

		if (this.user == null || ((Account) otherAccount).user == null
				|| !((Account) otherAccount).user.equals(this.user)) {
			return false;
		}
		return true;
	}

}
