package classes;

import java.io.IOException;

public class MessageHandlerClone {
	public static void onMessage(MessageHandler msgHandler, Message message) {
		try {
			switch (message.COMMAND) {
			case 30: {
				short idUser = message.reader().readShort();
				short percenLv = message.reader().readShort();
				int expPlus = message.reader().readInt();
				class_acv.s.a(idUser, percenLv, expPlus);
				if (idUser == class_acv.s.q.cG) {
					MainCharInfo.expPlus += expPlus;
				}
				return;
			}
			}
			msgHandler.onMessage(message);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
