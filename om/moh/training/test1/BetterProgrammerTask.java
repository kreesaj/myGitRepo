package om.moh.training.test1;




public class BetterProgrammerTask
{

	public static void main(String[] args)
	{
		int result;
		BetterProgrammerTask app = new BetterProgrammerTask();
		String st=" 1 jas 2 test 13 4 5 ";
		System.out.println(st.trim());
		
		result=app.getSumOfNumbers("1*jas*2*test*13*4*5");
		
		System.out.println(result);
	}
    public static int getSumOfNumbers(String s) {
        /*
          Please implement this method to
          return the sum of all integers found in the parameter String. You can assume that
          integers are separated from other parts with one or more spaces (' ' symbol).
          For example, s="12 some text 3  7", result: 22 (12+3+7=22)
         */
    	int n=0;
    	int sum=0;
    	int slen=s.length();
    	for (int i=0;i<=slen;i++)
    	{
    		//int sum1=Integer.parseInt(s.substring(n,s.indexOf(' ')));
    		int sum1=0;
    		
    		//System.out.println("length="+s.length());
    		
    		   System.out.println(i+"="+"value="+s.substring(n,s.indexOf('*')+1));
    			if (!s.substring(n,s.indexOf('*')+1).equals("*"))
    			{
    				System.out.println("Inside sum="+sum);
    			  try{
    					 System.out.println("sum1="+sum1);
                     sum1=Integer.parseInt(s.substring(n,s.indexOf('*')));
                    
    				
                     System.out.println("adding");
                     sum=sum+sum1;
                    
    			   }catch(Exception e){
    				   
    			   }
    			  s=s.substring(s.indexOf('*')+1,s.length());  
    			  System.out.println("New Str="+s+"new length="+s.length());
    			}
    		  if (s.length()==1)
    		  {
    			  try {
    				  sum=sum+Integer.parseInt(s);
    				  return sum;
    			    }catch (Exception a){
    			       return sum;
    			      }
    			  
    		 }
    		  
    			 
    		    			
    	}
    		    	
    	return sum;
    }
}
