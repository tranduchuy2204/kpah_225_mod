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
	public DrawConfig drawConfig = new DrawConfig();

	public boolean isBlockNoti = false;
	public long gameSpeed = 40;
	public String savedPostion = "";

	public boolean isAutoRemoveDa;
	public boolean isAutoRemoveTranh;
	public boolean isAutoCayThan;
	public boolean isLiaQuai; // Chức năng này là cái gì ?

	public class AutoChatConfig {
		public String content = "KPAH TEAMOBI";
		public int delay;
	}

	public class AutoClickConfig {
		public String keyBoardCodes = "-5:0,-5:0";
		public int delay = 500;
		public int activeKey = 35;
	}

	public class DrawConfig {
		public boolean isDrawUserId = true;
		public boolean isDrawAttackPoint = true;
		public boolean isDrawBalance = true;
		public boolean isDrawDoBen = true;
		public boolean isDrawCurrentPosition = true;
		public boolean isDrawSavedPosition = true;
		public boolean isDrawExpPlus = true;
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
				// saved location
				_config.savedPostion = dis.readUTF();
				// read auto chat configuration
				_config.autoChatConfig.content = dis.readUTF();
				_config.autoChatConfig.delay = dis.readInt();
				// read auto click configuration
				_config.autoClickConfig.keyBoardCodes = dis.readUTF();
				_config.autoClickConfig.delay = dis.readInt();
				_config.autoClickConfig.activeKey = dis.readInt();
				// read paint configuration
				_config.drawConfig.isDrawUserId = dis.readBoolean();
				_config.drawConfig.isDrawAttackPoint = dis.readBoolean();
				_config.drawConfig.isDrawBalance = dis.readBoolean();
				_config.drawConfig.isDrawDoBen = dis.readBoolean();
				_config.drawConfig.isDrawCurrentPosition = dis.readBoolean();
				_config.drawConfig.isDrawSavedPosition = dis.readBoolean();
				_config.drawConfig.isDrawExpPlus = dis.readBoolean();

//				_config.isAutoRemoveDa = dis.readBoolean();
//				_config.isAutoRemoveTranh = dis.readBoolean();
//				_config.isAutoCayThan = dis.readBoolean();
//				_config.isLiaQuai = dis.readBoolean();

				dis.close();
				bais.close();

			} catch (IOException ex) {
				_config = new Config();
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
			// saved location
			dos.writeUTF(savedPostion);
			// auto chat
			dos.writeUTF(autoChatConfig.content);
			dos.writeInt(autoChatConfig.delay);
			// auto click
			dos.writeUTF(autoClickConfig.keyBoardCodes);
			dos.writeInt(autoClickConfig.delay);
			dos.writeInt(autoClickConfig.activeKey);
			// paint
			dos.writeBoolean(drawConfig.isDrawUserId);
			dos.writeBoolean(drawConfig.isDrawAttackPoint);
			dos.writeBoolean(drawConfig.isDrawBalance);
			dos.writeBoolean(drawConfig.isDrawDoBen);
			dos.writeBoolean(drawConfig.isDrawCurrentPosition);
			dos.writeBoolean(drawConfig.isDrawSavedPosition);
			dos.writeBoolean(drawConfig.isDrawExpPlus);

//			dos.writeBoolean(isAutoRemoveDa);
//			dos.writeBoolean(isAutoRemoveTranh);
//			dos.writeBoolean(isAutoCayThan);
//			dos.writeBoolean(isLiaQuai);

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
