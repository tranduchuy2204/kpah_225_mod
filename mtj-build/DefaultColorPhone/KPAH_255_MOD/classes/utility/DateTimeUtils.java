package utility;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateTimeUtils {
	public static String getDate(long currentTimeMillis) {
		Date today = new Date(currentTimeMillis);
		Calendar cal = Calendar.getInstance();
		cal.setTimeZone(TimeZone.getTimeZone("Asia/Ho_Chi_Minh"));
		cal.setTime(today);
		String dateStr = cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MONTH) + 1) + "/" + cal.get(Calendar.YEAR);
		return dateStr;
	}

	public static String getTime(long currentTimeMillis) {
		Date today = new Date(currentTimeMillis);
		Calendar cal = Calendar.getInstance();
		cal.setTime(today);
		cal.setTimeZone(TimeZone.getTimeZone("Asia/Ho_Chi_Minh"));
		String timeStr = cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE);
		return timeStr;
	}
}
