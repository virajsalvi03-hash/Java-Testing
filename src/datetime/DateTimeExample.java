package datetime;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class DateTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		System.out.println("Today date "+date);
		
		LocalDateTime DaTm = LocalDateTime.now();
		System.out.println("Date & Time Right now : "+DaTm);
		
		DateTimeFormatter obj = DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");
		System.out.println("Date & Time Right now : "+DaTm.format(obj));

	}

}
