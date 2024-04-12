package utility;

public class ArrayUtils {
	public static String arrayToString(int[] array) {
		if (array == null) {
			return "[]";
		}
		StringBuffer buffer = new StringBuffer();
		buffer.append("[");
		for (int i = 0; i < array.length; i++) {
			if (i > 0) {
				buffer.append(", ");
			}
			buffer.append(array[i]);
		}
		buffer.append("]");
		return buffer.toString();
	}

	public static String arrayToString(short[] array) {
		if (array == null) {
			return "[]";
		}
		StringBuffer buffer = new StringBuffer();
		buffer.append("[");
		for (int i = 0; i < array.length; i++) {
			if (i > 0) {
				buffer.append(", ");
			}
			buffer.append(array[i]);
		}
		buffer.append("]");
		return buffer.toString();
	}

	public static String arrayToString(String[] array) {
		if (array == null) {
			return "[]";
		}
		StringBuffer buffer = new StringBuffer();
		buffer.append("[");
		for (int i = 0; i < array.length; i++) {
			if (i > 0) {
				buffer.append(", ");
			}
			buffer.append(array[i]);
		}
		buffer.append("]");
		return buffer.toString();
	}

	public static String arrayToString(byte[] array) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("[");
		for (int i = 0; i < array.length; i++) {
			if (i > 0) {
				buffer.append(", ");
			}
			buffer.append(array[i]);
		}
		buffer.append("]");
		return buffer.toString();
	}
}
