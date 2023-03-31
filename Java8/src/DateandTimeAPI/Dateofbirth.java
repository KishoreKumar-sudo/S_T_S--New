package DateandTimeAPI;

import java.time.LocalDate;
import java.time.Period;

public class Dateofbirth {
	
	public static void main(String[] args) {
		//Obtains an instance of LocalDate from a year, month and date
		LocalDate dob = LocalDate.of(1997, 10, 10);
		
		//Obtains the current date from the system clock
		LocalDate currentDate = LocalDate.now();
		
		//calculates the difference between two dates
		Period period = Period.between(dob, currentDate);
		
		//prints the difference in years, months & days
		System.out.printf("Your Age is %d years %d months & %d days.", period.getYears(),period.getMonths(),period.getDays());
	}

}
