import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;


public class DateTime {


	public static void main(String[] args) throws ParseException {
		DateTime dateTime = new DateTime();
		dateTime.case2();


	}

	public void case2() throws ParseException {

		Date date = new Date();
		DateFormat stringFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String beginTime = "2020-12-29 16:52:06"; //마지막 제출시각

		Date endDate = stringFormat.parse(stringFormat.format(date)); //now
		Date beginDate = stringFormat.parse(beginTime);
		long gap = (endDate.getTime() - beginDate.getTime()) / 1000; // 초 단위


		long reminder = ((gap / 60)) % 60; //분
		long secondGap = gap % 60; //초

		if(reminder < 30) {
			System.out.println("제출불가");
			String modTime = String.format("%02d",30-reminder)
					+ ":" + String.format("%02d", secondGap);

			System.out.println(modTime);

		} else {
			System.out.println("제출가능");
		}





//		Date ldate = new Date(gap);
//		SimpleDateFormat dateFormat =new SimpleDateFormat("HH:mm:ss");
//		System.out.println(dateFormat.format(ldate));


	}

//	public void case1() throws ParseException {
//		DateFormat stringFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		String beginTime = "2020-12-29 13:00:00";
//		Date date = new Date();
//
//		// String을 Date로 포맷
//		Date beginDate = stringFormat.parse(beginTime);
//		Date endDate = stringFormat.parse(stringFormat.format(date));
//
//		long gap = (endDate.getTime() - beginDate.getTime()) / 1000; // 초 단위
//
//		long hourGap = gap / 60 / 60;
//		long reminder = ((gap / 60)) % 60;
//		long minuteGap = reminder;
//		long secondGap = gap % 60;
//
//		if (hourGap > 99) {
//			hourGap = 99;
//		}
//
//
//		String returnTime = String.format("%02d", hourGap)
//				+ ":" + String.format("%02d", minuteGap)
//				+ ":" + String.format("%02d", secondGap);
//
//
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//
//		Date begin = new Date();
//		Calendar cal = Calendar.getInstance();
//		;
//		cal.add(Calendar.MINUTE, 30);
//		String today = sdf.format(cal.getTime());
//		System.out.println(today);
//
//
//		Date end = new Date();
//
//		Duration duration = Duration.between(beginDate.toInstant(), begin.toInstant());
//		System.out.println("남은 분 : " + duration.toMinutes());
//		System.out.println("남은 초 : " + duration.toMillis());
//
//		//System.out.println(returnTime);
//	}

}
