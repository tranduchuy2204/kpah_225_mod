/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.ItemStateListener;
import javax.microedition.lcdui.TextField;
import utility.ResUtils;

/**
 *
 * @author ASUS
 */
public class Menu extends Debug {

	public static Menu menu;

	public static Menu gI() {
		if (menu == null) {
			menu = new Menu();
		}
		return menu;
	}

	public Menu() {
		Debug.log("Class này được tạo ra để show các menu nhỏ");
	}

	public static void showChangeMapMenu() {
		new LoadMap().a();
	}

	public static void showOtherMenu() {
		Vector vector = new Vector();
		vector.addElement(new class_s("Thêm dòng", new class_lm(class_acv.s)));
		vector.addElement(new class_s("Luyện đồ", new class_ln(class_acv.s)));
		vector.addElement(new class_s("Luyện đồ tự động", new class_ku(class_acv.s)));
		vector.addElement(new class_s("Cộng thuộc tính", new class_kw(class_acv.s)));
		vector.addElement(new class_s("Khóa đồ thú", new class_ky(class_acv.s)));
		vector.addElement(new class_s("Khóa trang bị", new class_la(class_acv.s)));
		vector.addElement(new class_s("Đục lỗ", new class_oi(class_acv.s)));
		vector.addElement(new class_s("Khảm", new class_ok(class_acv.s)));
		vector.addElement(new class_s("Hợp thành", new class_ol(class_acv.s)));
		class_acv.u.a(vector, 3);
	}

	public void showPointerMenu() {
		Vector vector = new Vector();
		vector.addElement(
				new class_s(FunctionUtils.getOnOffStatus(!ModScr.isPointUserGiaoThe) + " chỉ Ng G.Thẻ", new IAction() {
					public void perform() {
						// ModScr.pauseAllPointOption();
						ModScr.isPointUserGiaoThe = !ModScr.isPointUserGiaoThe;
					}
				}));
		vector.addElement(
				new class_s(FunctionUtils.getOnOffStatus(!ModScr.isPointUserPhaThe) + " chỉ Ng P.Thẻ", new IAction() {
					public void perform() {
						// ModScr.pauseAllPointOption();
						ModScr.isPointUserPhaThe = !ModScr.isPointUserPhaThe;
					}
				}));
		vector.addElement(
				new class_s(FunctionUtils.getOnOffStatus(!ModScr.isPointUserUpLan) + " chỉ Ng Up.Lan", new IAction() {
					public void perform() {
						// ModScr.pauseAllPointOption();
						ModScr.isPointUserUpLan = !ModScr.isPointUserUpLan;
					}
				}));
		vector.addElement(new class_s(FunctionUtils.getOnOffStatus(!ModScr.isPointBossAndPepper) + " chỉ boss, tiêu",
				new IAction() {
					public void perform() {
						// ModScr.pauseAllPointOption();
						ModScr.isPointBossAndPepper = !ModScr.isPointBossAndPepper;
					}
				}));
		vector.addElement(
				new class_s(FunctionUtils.getOnOffStatus(!ModScr.isSkipUser) + " né người chơi", new IAction() {
					public void perform() {
						// ModScr.pauseAllPointOption();
						ModScr.isSkipUser = !ModScr.isSkipUser;
					}
				}));
		vector.addElement(new class_s("Cài đặt", new IAction() {
			public void perform() {
				Vector vector = new Vector();
				vector.addElement(new class_s("Xóa D.S G.T", new IAction() {
					public void perform() {
						ModScr.pointList[0] = "";
						Menu.gI().saveFocusList();
					}
				}));
				vector.addElement(new class_s("Xóa D.S P.T", new IAction() {
					public void perform() {
						ModScr.pointList[1] = "";
						Menu.gI().saveFocusList();
					}
				}));
				vector.addElement(new class_s("Xóa D.S up lan", new IAction() {
					public void perform() {
						ModScr.pointList[2] = "";
						Menu.gI().saveFocusList();
					}
				}));
				vector.addElement(new class_s("Xóa D.S né người", new IAction() {
					public void perform() {
						ModScr.pointList[5] = "";
						Menu.gI().saveFocusList();
					}
				}));
				vector.addElement(new class_s("Thông tin", IActionSettingFocus));
				class_acv.u.a(vector, 3);
			}
		}));
		class_acv.u.a(vector, 3);
	}

	public void specialMenu() {
		Vector vector = new Vector();
		vector.addElement(new class_s("Xa phu", new class_om(class_acv.s)));
		vector.addElement(new class_s("Mua bán", new IAction() {
			public void perform() {
				Vector vector = new Vector();
				vector.addElement(new class_s("Trên thành", new IAction() {
					public void perform() {
						Vector vector = new Vector();
						vector.addElement(new class_s("Nhất ngưu", new NpcMap(new int[] { 70, 94, 10, 4 })));
						vector.addElement(new class_s("Tam giáp", new NpcMap(new int[] { 70, 97, 10, 4 })));
						vector.addElement(new class_s("Nhất giáp", new NpcMap(new int[] { 70, 99, 10, 4 })));
						vector.addElement(new class_s("Ngũ giáp", new NpcMap(new int[] { 70, 95, 10, 4 })));
						vector.addElement(new class_s("Nhị giáp", new NpcMap(new int[] { 70, 98, 10, 4 })));
						class_acv.u.a(vector, 3);
					}
				}));
				vector.addElement(new class_s("Tại làng", new IAction() {
					public void perform() {
						Vector vector = new Vector();
						vector.addElement(new class_s("Hắc ngưu", new NpcMap(new int[] { 70, 103, 4, 4 })));
						vector.addElement(new class_s("Phú ông", new NpcMap(new int[] { 70, 89, 4, 4 })));
						class_acv.u.a(vector, 3);
					}
				}));
				class_acv.u.a(vector, 3);
			}
		}));
		vector.addElement(new class_s("Chặn thông báo", IActionBlockNoti));
		class_acv.u.a(vector, 3);
	}

	public void showOptionChat() {
		Vector vector = new Vector();
		vector.addElement(new class_s(ModScr.isAutoChat ? "Tắt" : "Bật", IActionStartChat));
		vector.addElement(new class_s("Cài đặt", IActionSettingChat));
		class_acv.u.a(vector, 3);
	}

	// IAction
	private IAction IActionFocus = new IAction() {
		public void perform() {
			ModScr.focusIndex++;
			ModScr.focusIndex %= ModScr.focusText.length;
			Menu.gI().showPointerMenu();
			class_acv.u.c = 0;
		}
	};

	private IAction IActionSettingFocus = new IAction() {
		public void perform() {
			final TextField textField = new TextField("DS người giao thẻ", ModScr.pointList[0], 500, TextField.ANY);
			final TextField textField2 = new TextField("DS người phá thẻ", ModScr.pointList[1], 500, TextField.ANY);
			final TextField textField3 = new TextField("DS người up lan", ModScr.pointList[2], 500, TextField.ANY);
			final TextField textField5 = new TextField("DS người cần né", ModScr.pointList[5], 500, TextField.ANY);
			Form form = new Form("Cài đặt focus nhân vật");
			form.append(textField);
			form.append(textField2);
			form.append(textField3);
			// form.append(textField4);
			form.append(textField5);
			form.append(
					"Lưu ý mỗi tên cần focus thì phải cách nhau bằng dấu , \nVà không cần ghi dấu tiếng Việt vì phiên bản sẽ tự nhận diện");
			form.addCommand(new Command("Lưu", 4, 0));
			form.addCommand(new Command("Hủy", 7, 0));
			form.setCommandListener(new CommandListener() {
				public void commandAction(Command c, Displayable d) {
					if (c.getCommandType() == 4) {
						try {
							ModScr.pointList[0] = textField.getString();
							ModScr.pointList[1] = textField2.getString();
							ModScr.pointList[2] = textField3.getString();
							// ModScr.pointList[4] = textField4.getString();
							ModScr.pointList[5] = textField5.getString();
							saveFocusList();
							ModScr.setNoti("Đã lưu cài đặt thành công.");
						} catch (Exception ex) {
							ex.printStackTrace();
						}
					}
					Display.getDisplay(game.GameMidlet.a).setCurrent(class_acv.a);
				}
			});
			Display.getDisplay(game.GameMidlet.a).setCurrent(form);
		}
	};

	public void saveFocusList() {
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			DataOutputStream dos = new DataOutputStream(baos);
			dos.writeUTF(VNCharacterUtils.removeAccent(ModScr.pointList[0]));
			dos.writeUTF(VNCharacterUtils.removeAccent(ModScr.pointList[1]));
			dos.writeUTF(VNCharacterUtils.removeAccent(ModScr.pointList[2]));
			// dos.writeUTF(VNCharacterUtils.removeAccent(ModScr.pointList[4]));
			dos.writeUTF(VNCharacterUtils.removeAccent(ModScr.pointList[5]));
			ResUtils.saveRecordBytes("data_focus", baos.toByteArray());
			dos.flush();
			dos.close();
			baos.flush();
			baos.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	private IAction IActionSettingChat = new IAction() {
		public void perform() {
			Form form = new Form("Cài đặt chat");
			final TextField textField = new TextField("Nội dung chat", ModScr.chatContent, 500, TextField.ANY);
			form.append(textField);
			form.addCommand(new Command("Lưu", 4, 0));
			form.addCommand(new Command("Hủy", 7, 0));
			form.setCommandListener(new CommandListener() {
				public void commandAction(Command c, Displayable d) {
					if (c.getCommandType() == 4) {
						ModScr.chatContent = textField.getString();
					}
					Display.getDisplay(game.GameMidlet.a).setCurrent(class_acv.a);
				}
			});
			Display.getDisplay(game.GameMidlet.a).setCurrent(form);
		}
	};

	private IAction IActionStartChat = new IAction() {
		public void perform() {
			ModScr.isAutoChat = !ModScr.isAutoChat;
			if (ModScr.isAutoChat) {
				new Thread(new Runnable() {
					public void run() {
						while (ModScr.isAutoChat) {
							class_abj.a(class_acv.s.q, ModScr.chatContent, 100);
							class_go.a().a(ModScr.chatContent);
							try {
								Thread.sleep(5000);
							} catch (InterruptedException ex) {
								ex.printStackTrace();
							}
						}
					}
				}).start();
			}
		}
	};

	private IAction IActionBlockNoti = new IAction() {
		public void perform() {
			final Form form = new Form("Cài đặt chặn thông báo");
			final TextField textField = new TextField("Thông báo cần chặn", ModScr.blockContent, 500, TextField.ANY);
			final ChoiceGroup choiceGroup = new ChoiceGroup("Chế độ chặn", ChoiceGroup.EXCLUSIVE);

			choiceGroup.append("Không chặn", null);
			choiceGroup.append("Chặn tất cả", null);
			choiceGroup.append("Chặn thông báo được set", null);

			choiceGroup.setSelectedIndex(ModScr.isBlockNoti, true);
			form.append(choiceGroup);
			if (ModScr.isBlockNoti == 2) {
				form.append(textField);
			}
			form.append("Nội dung cần chặn được cách nhau bởi dấu , và không cần ghi dấu. Phiên bản sẽ tự nhận diện");
			form.addCommand(new Command("Lưu", 4, 0));
			form.addCommand(new Command("Hủy", 7, 0));
			form.setCommandListener(new CommandListener() {
				public void commandAction(Command c, Displayable d) {
					if (c.getCommandType() == 4) {
						ModScr.blockContent = VNCharacterUtils.removeAccent(textField.getString());
						ModScr.isBlockNoti = (byte) choiceGroup.getSelectedIndex();
						ResUtils.saveRecordText("block_noti", ModScr.blockContent);
					}
					Display.getDisplay(game.GameMidlet.a).setCurrent(class_acv.a);
				}
			});
			form.setItemStateListener(new ItemStateListener() {
				public void itemStateChanged(Item item) {
					if (item == choiceGroup) {
						if (choiceGroup.isSelected(2) && form.get(1) != textField) {
							textField.setString(ModScr.blockContent);
							form.insert(1, textField);
							return;
						}
						if (form.get(1) == textField) {
							form.delete(1);
						}
					}

				}

			});
			Display.getDisplay(game.GameMidlet.a).setCurrent(form);
		}
	};
}
