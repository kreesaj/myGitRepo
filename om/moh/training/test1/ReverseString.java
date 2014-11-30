package om.moh.training.test1;

public class ReverseString {
  static final String head="JAS";
  private String Test2="Thisis";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if any static method is defined in the class we can call directly the method 
		//without explicitly creating the object
		//new ReverseString();
		ReverseString a= new ReverseString();
		//a.reverseString("paaaaaaaaa");
		String myname="XXTTXX1";
		StringBuffer abc= new StringBuffer(myname);
		reverseString(abc,myname);
		//new ReverseString();
		//reverseString1("sfsfs");
		//System.out.println(a.Test2);
		int year = 2010, month = 10, day = 10;
		int hour = 10, minute = 10, second = 10;
		String dateStr = new StringBuilder()
		      .append(year).append("-").append(month).append("-").append(day).append(" ")
		      .append(hour).append(":").append(minute).append(":").append(second).toString();
		System.out.println(dateStr);
		
		
	}
	
	private static void reverseString(StringBuffer str,String myname)
	{
		String res=str.reverse().toString();
		System.out.println(str.reverse());
		if (myname.equals(res))
				{
			System.out.println("PalianDrome");
			System.out.println(res);
				}
		else
		{
			System.out.println(" Not aPalianDrome");
			System.out.println(res);
			
		}
		
		//System.out.println(str.reverse().toString());
		System.out.println(head);
		
		
		
	}

	public  void reverseString1(String str)
	{
		System.out.println(str.length());
	}

}
