package DateandTimeAPI;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TimeZoneConversion {

	public static void main(String[] args) {
	//Capturing today's date
		Date today = new Date();
		
		//Displaying this date on ISTtimezone
		DateFormat df = new SimpleDateFormat("dd-MM-yy HH:mm:SS z");
		
		df.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
		String IST = df.format(today);
		System.out.println("Date in Indian TimeZone (IST) : " + IST);
		
		//Displaying date on GMT TimeZone
		df.setTimeZone(TimeZone.getTimeZone("England/London"));
		String GMT = df.format(today);
		System.out.println("Date in GMT TimeZone : " + GMT);
	}
	
}
