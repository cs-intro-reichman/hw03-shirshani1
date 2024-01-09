/*
 * Checks if a given year is a leap year or a common year,
 * and computes the number of days in a given month and a given year. 
 */
public class Calendar0 {	
	
	// Gets a year (command-line argument), and tests the functions isLeapYear and nDaysInMonth.
	public static void main(String args[]) {
		int year = Integer.parseInt(args[0]);
		int month = 0;
		isLeapYearTest(year);
		nDaysInMonthTest(year);
		String commonOrLeap = "common";
		if (isLeapYear(year)) {
			commonOrLeap = "leap";
		}
		System.out.println(year + " is a " + commonOrLeap + " year");  
		for (int i=1 ;i <= 12 ; i++) {
			System.out.println("Month "+  i + " has " +nDaysInMonth(i, year) + " days");
		}
	
	}
		 
	// Tests the isLeapYear function.
	private static void isLeapYearTest(int year) {
		
}
	// Tests the nDaysInMonth function.
	private static void nDaysInMonthTest(int year) {
		// Replace this comment with your code
	}

	// Returns true if the given year is a leap year, false otherwise.
	public static boolean isLeapYear(int year) {
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
	public static int nDaysInMonth(int month, int year) {
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

