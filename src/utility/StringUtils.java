package utility;

import java.util.Vector;

public class StringUtils {

	public static String replace(String source, String oldText, String newText) {
		int s = 0;
		int e = 0;
		StringBuffer result = new StringBuffer();
		while ((e = source.indexOf(oldText, s)) != -1) {
			result.append(source.substring(s, e));
			result.append(newText);
			s = e + oldText.length();
		}
		result.append(source.substring(s));
		return result.toString();
	}

	public static String[] split(String st, String x) {
		Vector vt = new Vector();
		String xm = x;
		if (!st.endsWith(xm)) {
			st = st + xm;
		}
		int sb = 0;
		int sa = st.indexOf(xm);
		while (sa != -1) {
			vt.addElement(st.substring(sb, sa));
			sb = sa + xm.length();
			sa = st.indexOf(xm, sb);
		}
		String[] re = new String[vt.size()];
		vt.copyInto(re);
		return re;
	}

	public static int getDigistString(String source) {
		char[] stringChars = source.toCharArray();
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < stringChars.length; i++) {
			if (stringChars[i] >= '0' && stringChars[i] <= '9') {
				buffer.append(stringChars[i]);
			}
		}
		if (buffer.length() == 0) {
			throw new RuntimeException("Can not find numberic in String: " + source);
		}
		return Integer.parseInt(buffer.toString());
	}

	public static String formatMoney(long l) {
		String str = "";
		final long n = l / 1000L + 1L;
		for (int n2 = 0; n2 < n; ++n2) {
			if (l < 1000L) {
				str = String.valueOf(l) + str;
				break;
			}
			final long lng;
			if ((lng = l % 1000L) == 0L) {
				str = ".000" + str;
			} else if (lng < 10L) {
				str = ".00" + lng + str;
			} else if (lng < 100L) {
				str = ".0" + lng + str;
			} else {
				str = "." + lng + str;
			}
			l /= 1000L;
		}
		return str;
	}

}
