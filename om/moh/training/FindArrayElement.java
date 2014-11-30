package om.moh.training;

public class FindArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindArrayElement arrayCheck;
		 arrayCheck = new FindArrayElement();
       int[] a={0,1};
       boolean b;
       b=arrayCheck.arrayFront9(a);
       System.out.println(b);
       
	}
	
	public boolean arrayFront9(int[] nums) {
		  for (int i=0;i<4;i++)
		  {
		    if (nums.length-1==i && nums[i]!=9)
		    {
		      return false;
		    }
		    if (nums[i]==9)
		      {return true;}
		  }
		  return false;
		}


}
