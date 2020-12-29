import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;


public class calcDateTime {

	public static void main(String[] args) throws ParseException {
		String lastRegistDt = "2020-12-29 13:30:00";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss", Locale.KOREA);
		SimpleDateFormat timeFormat = new SimpleDateFormat("mm:ss", Locale.KOREA);


		date = sdf.parse(sdf.format(date));
		long curDateTime = date.getTime();
//
		Date reqDate = sdf.parse(lastRegistDt);
		long reqDateTime = reqDate.getTime();
//
//
//
		long minute = (curDateTime - reqDateTime) / 60000;
		//System.out.println(minute);
		//System.out.println(timeFormat.format(minute));


		Date now = sdf.parse(sdf.format(date));
		Date prev = sdf.parse(lastRegistDt);
		long diff = now.getTime()-prev.getTime();

		System.out.println(timeFormat.format(diff));


//		long countTime = (1000 * 60 * 30)-diff;

//		System.out.println(diff);
//		System.out.println((60000 * 30));
//
//
//		if(diff < (60000*30)) {
//			System.out.println("제출불가");
//			System.out.println(timeFormat.format(countTime));
//		} else {
//			System.out.println("제출가능");
//		}

	}
}
