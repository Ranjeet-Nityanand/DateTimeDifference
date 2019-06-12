/**
 * 
 */
package com.core;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
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

	}

}
