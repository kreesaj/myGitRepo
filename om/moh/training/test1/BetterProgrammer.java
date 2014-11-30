package om.moh.training.test1;

import java.util.Arrays;

public class BetterProgrammer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { -6, -1, -3, 3, 5, 2, 6, 7 };
		int result;
		result=getClosestToZero(a);
		System.out.println(result);

	}

	public static int getClosestToZero(int[] a) {
		/*
		 * Please implement this method to return the number in the array that
		 * is closest to zero. If there are two equally close to zero elements
		 * like 2 and -2 - consider the positive element to be "closer" to zero.
		 */
		int result = 0;
		int min = 0;
		int max = 0;
		//Arrays.sort(a);
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(i);
			if (a[i] < 0)
			{
				if (min == 0)
				{
					min = a[i];
					System.out.println("Min="+min);
				}
				else if (min > a[i])
				{
					min = a[i];
					System.out.println("Min="+min);
				}

			} 
			else
			{
				if (max == 0) 
				{
					max = a[i];
				} else if (max < a[i]) 
				{
					max = a[i];
				}

			}

		}

		 if (Math.abs(0-min)<Math.abs(0-max))
		 {
			 return Math.abs(0-min);
		 }
		 else
		 {
			 return Math.abs(0-max);
		 }	 
	}

	
}
