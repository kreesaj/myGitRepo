package om.moh.training.test1;
import java.util.*;
public class MyTest {
public static void main(String[]  args)
{
    String nameCheck =" 123 2324 jas2 9 9 9 909 909 099 808 80";
    long sttime=System.currentTimeMillis();
    System.out.println("Start"+sttime/60*60*1000);
    long endtime;
    double a=234.56890;
    System.out.printf("Floating point number with 3 decimal digits: %.1f\n",1.21312939123);
    System.out.printf("%06d",13);
    String[] abc = nameCheck.split(" ");
    endtime = System.currentTimeMillis();
    System.out.println(endtime/1000);
    System.out.println("Elapsed Time="+(endtime-sttime)/1000);
    
    for (int i=0;i<abc.length;i++)
    {
    	
    	try 
    	{
    		if (Integer.parseInt(abc[i])>=0)
    
    	{
    		System.out.println(Integer.parseInt(abc[i]));
    	}
    	} catch (Exception e)
    	{
    		
    	}
    }
	System.out.println("INside");
}
}