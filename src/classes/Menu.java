/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Vector;

import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;
import javax.microedition.lcdui.game.GameCanvas;



import config.Config.AutoChatConfig;

/**
 *
 * @author ASUS
 */
public class Menu {

	public static Menu menu;

	public static Menu gI() {
		if (menu == null) {
			menu = new Menu();
		}
		return menu;
	}

	public Menu() {
	}

	public static void showConfigMenu() {
		new Setting().generalFormConfig();
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

	public void specialMenu() {
		Vector vector = new Vector();
//		vector.addElement(new class_s("Get All Users", new IAction() {
//
//			public void perform() {
//				Vector actor = class_acv.s.l;
//				for (int i = actor.size() - 1; i >= 0; --i) {
//					final class_vh class_vh;
//					if ((class_vh = (class_vh) actor.elementAt(i)).cF == 0) {
//						class_hw user = (class_hw) class_vh;
//						boolean isNpc = user.d_();
//						if (!isNpc) {
//							System.out.println("UserName: " + user.a_());
//							System.out.println("Effect: " + user.T);
//						}
//
////						Vector dynamicEffects = user.T;
////						for (int j = 0; j < dynamicEffects.size(); j++) {
////							class_acc dynamic = (class_acc) dynamicEffects.elementAt(j);
////							
////						}
//					}
//				}
//			}
//		}));

		vector.addElement(new class_s("Quick Action", new IAction() {
			public void perform() {
				Vector quickActionMenu = new Vector();
				quickActionMenu.addElement(new class_s("Bỏ đá, tranh, auto cây", new IAction() {
					public void perform() {
						ModController.globalConfig.isAutoCayThan = ModController.globalConfig.isAutoRemoveDa = ModController.globalConfig.isAutoRemoveTranh = true;
					}
				}));
				quickActionMenu.addElement(new class_s("Bỏ đá, auto cây", new IAction() {
					public void perform() {
						ModController.globalConfig.isAutoCayThan = ModController.globalConfig.isAutoRemoveDa = true;
					}
				}));
				quickActionMenu.addElement(new class_s("Tắt hết", new IAction() {
					public void perform() {
						ModController.globalConfig.isAutoCayThan = ModController.globalConfig.isAutoRemoveDa = ModController.globalConfig.isAutoRemoveTranh = false;
					}
				}));
				class_acv.u.a(quickActionMenu, 3);
			}
		}));
		vector.addElement(new class_s("Xa phu", new class_om(class_acv.s)));
		vector.addElement(new class_s("Quick NPC", new IAction() {
			public void perform() {
				Vector vector = new Vector();
				vector.addElement(new class_s("Hợp BXH", new IAction() {
					public void perform() {
						GameService.a().a(-11, (byte) 0, 4);
					}
				}));
				vector.addElement(new class_s("Sự kiện", new IAction() {
					public void perform() {
						GameService.a().l(-49);
					}
				}));
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
		vector.addElement(new class_s(
				ModHelpers.getOnOffStatus(!ModController.globalConfig.isBlockNoti) + " chặn thông báo", new IAction() {
					public void perform() {
						ModController.globalConfig.isBlockNoti = !ModController.globalConfig.isBlockNoti;
						ModController.globalConfig.saveConfig();
					}
				}));
		class_acv.u.a(vector, 3);
	}

	public void showOptionChat() {
		Vector vector = new Vector();
		vector.addElement(new class_s(ModController.isActiveAutoChat ? "Tắt" : "Bật", IActionStartChat));
		vector.addElement(new class_s("Cài đặt", IActionSettingChat));
		class_acv.u.a(vector, 3);
	}

	private IAction IActionSettingChat = new IAction() {
		public void perform() {
			final AutoChatConfig autoChat = ModController.globalConfig.autoChatConfig;
			Form form = new Form("Cài đặt chat");
			final TextField textField = new TextField("Nội dung chat", autoChat.content, 500, TextField.ANY);
			form.append(textField);
			form.addCommand(new Command("Lưu", 4, 0));
			form.addCommand(new Command("Hủy", 7, 0));
			form.setCommandListener(new CommandListener() {
				public void commandAction(Command c, Displayable d) {
					if (c.getCommandType() == 4) {
						autoChat.content = textField.getString();
						ModController.globalConfig.saveConfig();
					}
					Display.getDisplay(game.GameMidlet.a).setCurrent(class_acv.a);
				}
			});
			Display.getDisplay(game.GameMidlet.a).setCurrent(form);
		}
	};

	private IAction IActionStartChat = new IAction() {
		public void perform() {
			final AutoChatConfig autoChat = ModController.globalConfig.autoChatConfig;
			ModController.isActiveAutoChat = !ModController.isActiveAutoChat;
			if (ModController.isActiveAutoChat) {
				new Thread(new Runnable() {
					public void run() {
						while (ModController.isActiveAutoChat) {
							MapScreen.a(class_acv.s.q, autoChat.content, 100);
							GameService.a().a(autoChat.content);
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

}
