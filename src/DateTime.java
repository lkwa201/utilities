import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateTime {


	public static void main(String[] args) throws ParseException {
		DateTime dateTime = new DateTime();
		dateTime.case2();
	}

	public void case2() throws ParseException {

		Date date = new Date();
		DateFormat stringFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String beginTime = "2021-01-04 10:10:00"; //기준 시간.

		Date endDate = stringFormat.parse(stringFormat.format(date)); //현재시간(현 날짜+현시간(초 포함)
		Date beginDate = stringFormat.parse(beginTime);
		long gap = (endDate.getTime() - beginDate.getTime()) / 1000; // 초 단위

		long reminder = ((gap / 60)) % 60; //분
		long secondGap = gap % 60; //초

		if(reminder < 30) {
			System.out.println("제출불가");
			String nextTime = String.format("%02d",30-reminder)
					+ ":" + String.format("%02d", 60-secondGap);
			System.out.println(nextTime);

		} else {
			System.out.println("제출가능");
		}

	}


}
