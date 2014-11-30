package om.moh.training.test1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

public class ArrayCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] jas = {0,1,5,3,4};
     String[] jass={"jas","bas","ass"};
  
     System.out.println(jas.length);
     
     System.out.println(jass[2]);
    Arrays.sort(jas);
    System.out.println(jas.toString());
    
    
    for(int i =0;i<jas.length;i++)
    	
    	{System.out.println(jas[i]);
    	
    }
    int n=0;
    for (int i=1;i<50;i++)
    {
    	n=n+i;
    }
    System.out.println(n);
	}
  
}
