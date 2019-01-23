package com.snsystems;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EndOfMonthService {

	public List<String> find(List<String> dates) {

		Set<String> uniqueEndOfMonthDates = new HashSet<String>();
		LocalDate date = LocalDate.now();
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		for (String dateAsString : dates) {
			date = LocalDate.parse(dateAsString, df);
			
			System.out.println("\n" + dateAsString + " DAY ::: " + date.get(ChronoField.DAY_OF_MONTH));
			System.out.println(dateAsString + " MONTH ::: " + date.get(ChronoField.MONTH_OF_YEAR));
			System.out.println("EOM : " + date.withDayOfMonth(date.lengthOfMonth()).format(df));
			
			uniqueEndOfMonthDates.add(date.withDayOfMonth(date.lengthOfMonth()).format(df));
		}
		
		uniqueEndOfMonthDates.retainAll(dates);
		System.out.println(" List : " + uniqueEndOfMonthDates);
		return new ArrayList<String>(uniqueEndOfMonthDates);
	}	
	
	public List<String> getEOM(String dateAsString) {
		
		Set<String> uniqueEndOfMonthDates = new HashSet<String>();
		LocalDate date = LocalDate.now();
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			
		date = LocalDate.parse(dateAsString, df);
		uniqueEndOfMonthDates.add(date.withDayOfMonth(date.lengthOfMonth()).format(df));
		
		System.out.println(" List : " + uniqueEndOfMonthDates);
		return new ArrayList<String>(uniqueEndOfMonthDates);
	}	

}
