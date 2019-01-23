package com.snsystems;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EndOfMonthService {

	/**
	 * Return End Of Month dates using java.time.LocalDate
	 * @param inputDates
	 * @return
	 */	
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
	
	/**
	 * Return End Of Month dates using java.util.Calendar
	 * @param inputDates
	 * @return
	 */
	public List<String> find2(List<String> inputDates) {

		Set<String> uniqueEndOfMonthDates = new HashSet<String>();
		Calendar cal = Calendar.getInstance();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		for (String dateAsString : inputDates) {
			try {
				 cal.setTime(dateFormat.parse(dateAsString));
				 System.out.println("\n" + dateAsString + " DAY ::: " + cal.getTime());
				 
				 cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.getActualMaximum(Calendar.DAY_OF_MONTH));
				 System.out.println("\n" + dateAsString + " EOM ::: " + cal.getTime());
				 
				 uniqueEndOfMonthDates.add(dateFormat.format(cal.getTime()));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		
		uniqueEndOfMonthDates.retainAll(inputDates);
		System.out.println(" List : " + uniqueEndOfMonthDates);
		return new ArrayList<String>(uniqueEndOfMonthDates);		
	}

	/**
	 * Return End Of Month date using java.time.LocalDate
	 * @param inputDates
	 * @return
	 */	
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
