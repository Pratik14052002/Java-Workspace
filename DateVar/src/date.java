import java.util.*;
public class date {
	 public static void main(String[] args)
	    {
	        Date d1 = new Date();
	        System.out.println("Current date is " + d1);
	       
	        System.out.println("Date represented is "+ d1.getDate() );
	        System.out.println("Day represented is "+ d1.getDay() );
	        System.out.println("Hours represented is "+ d1.getHours() );
	        System.out.println("Minutes represented is "+ d1.getMinutes() );
	        System.out.println("Month represented is "+ d1.getMonth() );
	        System.out.println("Seconds represented is "+ d1.getSeconds() );
	        System.out.println("Time represented is "+ d1.getTime());
	        System.out.println("Time zone represented is "+ d1.getTimezoneOffset());
	        System.out.println("Year represented is "+ d1.getYear());
	        System.out.println("GMT represented is "+ d1.toGMTString());
	    }
}
