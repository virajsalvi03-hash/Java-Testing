package assignment6;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class DateandTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		System.out.println("Today is : "+date);
		LocalDateTime datetime= LocalDateTime.now();
		System.out.println("Today is : "+datetime);
		DateTimeFormatter datetimefor = DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");
		System.out.println("Date & Time Right now : "+datetime.format(datetimefor));
		System.out.println();

	}

}
