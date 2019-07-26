/**
 * 
 */
package com.core;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
/**
 * @author Ranjeet Nityanand
 *
 * May 8, 2019
 */
public class DateTimeDiffrence {
	public static void main(String[] args) throws Exception {
		DateFormat sourceFormat = new SimpleDateFormat("dd/MM/yyyy");
		try {

			// 1st Method...

			Date date = sourceFormat.parse("03/11/2019");
			LocalDate today = LocalDate.now();
			String testDate = sourceFormat.format(date);
			System.out.println("should be d-m-y" + testDate);
			LocalDate ldate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
			long diff = Duration.between(today.atStartOfDay(), ldate.atStartOfDay()).toDays();
			
			System.err.println("=-=--=-=-=Method 1=-=-=-=-==-");
			System.err.println(today + "-----Current Date-----");
			System.err.println(ldate + "======Given Date======");
			System.err.println(diff + "Difference=");

			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Calendar calendar = Calendar.getInstance();
			String requestDate = dateFormat.format(calendar.getTime());
			Date todayDate=dateFormat.parse(requestDate);
			String newDate = dateFormat.format(date);

			System.err.println("=-=-=--=Method 2=-=-=-=-=-=");

			System.err.println("new Date=" + newDate);
			System.err.println("Calendar time=" + requestDate);
			if (date.before(todayDate))
				System.out.println("Before Date....++");
			if (todayDate.before(date))
				System.out.println("After Date..");
			long diffDate = date.getTime() - todayDate.getTime();
			if (diffDate / (1000 * 60 * 60 * 24) > 180)
				throw new Exception("Your Application is Expire..........");
			else

			System.out.println("difference date " + diffDate / (1000 * 60 * 60 * 24));
			
		} catch (ParseException e) {
			System.err.println(e.getMessage());
		}

		// Joda time api

		LocalDate dat = LocalDate.now();
		System.err.println("=========Method-3==========");
		System.out.println("Joda Date ->" + dat);
		int dd = dat.getDayOfMonth();
		int mm = dat.getMonthValue();
		int yyyy = dat.getYear();
		System.out.println(dd + "-" + mm + "-" + yyyy);
		System.out.printf("%d-%d-%d", dd, mm, yyyy, "\n");
		LocalTime time = LocalTime.now();
		System.out.println("Joda Time" + time);
		int hour = time.getHour();
		int m = time.getMinute();
		int s = time.getSecond();
		time.getNano();
		System.out.println(hour);

		LocalDateTime dt = LocalDateTime.of(1994, 05, 28, 12, 10);
		System.out.println(dt);
		System.out.println("After 6 month" + dt.plusMonths(6));
		System.out.println("Before 6 Month" + dt.minusMonths(6));

		int n = 2000;
		Year year = Year.of(n);
		if (year.isLeap())
			System.out.println("leap year");
		else
			System.out.println("not Leap Year");
	}

}
