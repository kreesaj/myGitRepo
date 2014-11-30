package om.moh.training;

public class BetterProgrammerTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BetterProgrammerTask1 test = new BetterProgrammerTask1();
	String resultstr=	test.getBinaryRepresentation(15);
	System.out.println(resultstr);
		
	}
	
	  public static String getBinaryRepresentation(int n) {
	        /*
	         Please implement this method to
	         return a String with the binary representation of any number n, where n >= 0.
	         Example: "101" is a binary representation of 5
	        */
		 if (n>0)
		  return Integer.toBinaryString(n);
		 else
			return ""; 
	    }

}
