package utility;

import java.io.InputStream;

import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
/*
 * Class về record, lưu trữ thông tin và ổ nhớ
 */
public class ResUtils {

	public static byte[] loadRecordBytes(String string) {
		byte[] record;
		try {
			final RecordStore openRecordStore;
			record = (openRecordStore = RecordStore.openRecordStore(string, false)).getRecord(1);
			openRecordStore.closeRecordStore();
		} catch (final Exception ex) {
			return null;
		}
		return record;

	}

	public static void saveRecordBytes(String s, byte[] array) {
		try {
			final RecordStore openRecordStore;
			if ((openRecordStore = RecordStore.openRecordStore(s, true)).getNumRecords() > 0) {
				openRecordStore.setRecord(1, array, 0, array.length);
			} else {
				openRecordStore.addRecord(array, 0, array.length);
			}
			openRecordStore.closeRecordStore();
		} catch (RecordStoreException e) {
			e.printStackTrace();
		}
	}

	public static String getRecordText(String string) {
		final byte[] recordBytes = loadRecordBytes(string);
		if (recordBytes == null) {
			return null;
		}
		try {
			return new String(recordBytes, "UTF-8");
		} catch (final Exception ex) {
			return new String(recordBytes);
		}
	}

	public static void saveRecordText(String recordName, String content) {
		try {
			saveRecordBytes(recordName, content.getBytes("UTF-8"));
		} catch (final Exception ex) {
			ex.printStackTrace();
		}
	}

	public static String readStringRes(String resourceName) {
		InputStream resource = "".getClass().getResourceAsStream(resourceName);
		try {
			byte[] data = new byte[resource.available()];
			resource.read(data);
			resource.close();
			return new String(data, "UTF-8");
		} catch (Exception exception) {
			return null;
		}
	}
}
