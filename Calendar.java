/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {
		int theYear = Integer.parseInt(args[0]);
	 	int sumSundays = 0;
	 	while (year < 2024) {
	 		if (year == theYear){
	 		if (dayOfWeek == 1 && dayOfMonth == 1) {
	 			System.out.println(dayOfMonth + "/" + month + "/" + year + " Sunday");	
	 			sumSundays ++;
	 		} else {
	 			System.out.println(dayOfMonth + "/" + month + "/" + year);
	 		} 
	 	}
			advance(); 		
	 	}

	 		
	 	}
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {
		if (dayOfWeek < 7) {
			dayOfWeek++;
			}
			else{
				dayOfWeek = 1;
			}
		if (dayOfMonth < nDaysInMonth(month,year)) {
			dayOfMonth ++;
			}
			else{
				dayOfMonth = 1;
		
				if (month < 12) {
					month++;
			 } else {
			 	year ++;
			 	month = 1;
			 }
			
	 } 
	}
	
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
	    boolean check = false;
	    if (year % 4 == 0) {
	    	if (year % 100 != 0) {
	    		if (year % 400 !=0) {
	    		check = true;	
	    		}
	    		
	    	} else {check = true;}	
	    	} else {check = false;}
	    return check;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) {
		int theDay = 0;
		switch (month) {
			case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
           		theDay = 31;
        	break;
        	case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
            	theDay = 30;
            break;
        	case 2: //February
        		if (isLeapYear(year) == true) {
        			theDay = 29;
        		}else {
        			theDay = 28;
        		}
		}
		return theDay;
	}
}
