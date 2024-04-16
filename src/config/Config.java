package config;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import utility.ResUtils;

public class Config {
	public static final String CONFIG_RECORD_NAME = "global_config";
	public AutoChatConfig autoChatConfig = new AutoChatConfig();
	public AutoClickConfig autoClickConfig = new AutoClickConfig();
	public PaintConfig paintConfig = new PaintConfig();
	public boolean isBlockNoti = false;
	public long gameSpeed = 40;

	public class AutoChatConfig {
		public String content = "KPAH TEAMOBI";
		public int delay;
	}

	public class AutoClickConfig {
		public String keyBoardCodes = "-5:0,-5:0";
		public int delay = 500;
		public int activeKey = 35;
	}

	public class PaintConfig {
		public boolean isPaintID = true;
		public boolean isPaintAttackPoint = true;
		public boolean isPaintBalance = true;
		public boolean isPaintDoBen = true;
		public boolean isPaintCurrentPosition = true;
	}

//	public class FocusConfig {
//		public FocusObject[] focusObject = new FocusObject[5];
//
//		public FocusConfig() {
//			focusObject[0] = new FocusObject("Người giao thẻ", false,
//					"boss tho dien,dracula,boss gau xam,bach cot tuong quan,than lan,nhan sam,matquy,ran em,ran chi,thuoc cuong hoa sieu cap,bi ngo,tru rong");
//			focusObject[1] = new FocusObject("Người giao thẻ", false,
//					"boss tho dien,dracula,boss gau xam,bach cot tuong quan,than lan,nhan sam,matquy,ran em,ran chi,thuoc cuong hoa sieu cap,bi ngo,tru rong");
//
//		}
//	}
//
//	public class FocusObject {
//		public String label;
//		public boolean isSelected;
//		public String listFocus;
//
//		public FocusObject(String label, boolean isSelected, String listFocus) {
//			super();
//			this.label = label;
//			this.isSelected = isSelected;
//			this.listFocus = listFocus;
//		}
//
//	}

	public static Config loadConfig() {
		Config _config = new Config();
		final byte[] bytes;
		if ((bytes = ResUtils.loadRecordBytes(CONFIG_RECORD_NAME)) != null) {
			ByteArrayInputStream bais = null;
			DataInputStream dis = null;
			try {
				bais = new ByteArrayInputStream(bytes);
				dis = new DataInputStream(bais);
				// game speed
				_config.gameSpeed = dis.readLong();
				// block noti
				_config.isBlockNoti = dis.readBoolean();
				// read auto chat configuration
				_config.autoChatConfig.content = dis.readUTF();
				_config.autoChatConfig.delay = dis.readInt();
				// read auto click configuration
				_config.autoClickConfig.keyBoardCodes = dis.readUTF();
				_config.autoClickConfig.delay = dis.readInt();
				_config.autoClickConfig.activeKey = dis.readInt();
				// read paint configuration
				_config.paintConfig.isPaintID = dis.readBoolean();
				_config.paintConfig.isPaintAttackPoint = dis.readBoolean();
				_config.paintConfig.isPaintBalance = dis.readBoolean();
				_config.paintConfig.isPaintDoBen = dis.readBoolean();
				_config.paintConfig.isPaintCurrentPosition = dis.readBoolean();
				dis.close();
				bais.close();

			} catch (IOException ex) {
				ex.printStackTrace();
			} finally {
				if (bais != null) {
					close(bais);
				}
				if (dis != null) {
					close(bais);
				}
			}
		}
		return _config;
	}

	public void saveConfig() {
		ByteArrayOutputStream baos = null;
		DataOutputStream dos = null;
		try {
			baos = new ByteArrayOutputStream();
			dos = new DataOutputStream(baos);
			// game speed
			dos.writeLong(gameSpeed);
			// block noti
			dos.writeBoolean(isBlockNoti);
			// auto chat
			dos.writeUTF(autoChatConfig.content);
			dos.writeInt(autoChatConfig.delay);
			// auto click
			dos.writeUTF(autoClickConfig.keyBoardCodes);
			dos.writeInt(autoClickConfig.delay);
			dos.writeInt(autoClickConfig.activeKey);
			// paint
			dos.writeBoolean(paintConfig.isPaintID);
			dos.writeBoolean(paintConfig.isPaintAttackPoint);
			dos.writeBoolean(paintConfig.isPaintBalance);
			dos.writeBoolean(paintConfig.isPaintDoBen);
			dos.writeBoolean(paintConfig.isPaintCurrentPosition);
			ResUtils.saveRecordBytes(CONFIG_RECORD_NAME, baos.toByteArray());
			dos.flush();
		} catch (IOException e) {
		} finally {
			if (dos != null) {
				close(dos);
			}
			if (baos != null) {
				close(baos);
			}
		}
	}

	private static void close(Object obj) {
		if (obj != null) {
			try {
				if (obj instanceof DataInputStream) {
					((DataInputStream) obj).close();
				} else if (obj instanceof DataOutputStream) {
					((DataOutputStream) obj).close();
				} else if (obj instanceof ByteArrayOutputStream) {
					((ByteArrayOutputStream) obj).close();
				} else if (obj instanceof ByteArrayInputStream) {
					((ByteArrayInputStream) obj).close();
				}
			} catch (IOException exception) {
			}
			obj = null;
		}
	}

}
