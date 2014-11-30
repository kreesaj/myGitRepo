package om.moh.training.test1;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DateTesting();
	//	Date nDate= new Date();
		  // Date currdate = new Date();
		   GregorianCalendar a = new GregorianCalendar();
		   System.out.println(a.getTime());
		  System.out.println(a.get(Calendar.YEAR));
		  System.out.println(a.get(Calendar.MARCH));
	//	System.out.println(nDate.getTime());
	//	System.out.println(nDate.getDay());
	}

}
