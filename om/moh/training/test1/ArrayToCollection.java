package om.moh.training.test1;
import java.util.*;
import java.io.*;


	public class ArrayToCollection{
	   private int i;

	public static void main(String args[]) 
	   throws IOException{
	      BufferedReader in = new BufferedReader
	      (new InputStreamReader(System.in));
	     PrintWriter a= new PrintWriter(new FileWriter(new File("jas.txt")));
	     a.write("GFDFSFSFSfsdfsdff");
	     a.close();
	     
	      System.out.println("How many elements 	      you want to add to the array: ");
	     // int n = Integer.parseInt(in.readLine());
	     int  n=3;
	      String[] name = new String[n];
	      for(int i = 0; i < n; i++){
	       //  name[i] = in.readLine();
	         name[i]=String.valueOf(i);
	      }
	      List list = Arrays.asList(name); 
	      System.out.println("Here");
	   //   for(String li: list){
	      for (int j=0;j<list.size();j++)
	      {
	        String list1 = list.get(j).toString();
	        System.out.println(list1);
	      }
	      TreeMap<String,String> ab = new TreeMap<String,String>();
	      HashMap<String, String> abh = new HashMap<String, String>();
	      Map<String,String> am = new HashMap<String,String>();
	      
	      am.put("S","sexy");
	      am.put("J","joby");
	
	      System.out.println(am.keySet());
	      System.out.println(am.values());
	      
	      abh.put("S","sex");
	      abh.put("J","job");
	      System.out.println(abh.keySet());
	    //  System.out.println(abh.	());
	      
	      
	      ab.put("S","Safeena");
	      ab.put("J","JJJJJ");
	      System.out.println(ab.keySet());
	      System.out.println(ab.values());
	      
	   }
	}
