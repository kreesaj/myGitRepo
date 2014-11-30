package om.moh.training;
import java.io.*;
import java.sql.Date;
public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileTest t = new FileTest();
		t.SaveFile("Hi Test", "Jas", ".txt");
		

	}
public File SaveFile(String contents,String pathPre,String extn)
{

	PrintWriter ps = null;
	File parent= new File("/apps/dat");
	 // File parent=getFolder();
	//System.out.println(parent.canWrite());
	//System.out.println(parent.canRead());
	//System.out.println(parent.getAbsolutePath());
   // System.out.println(parent.getName());
	System.out.println("The Parent is a Direcory="+parent.isDirectory());
	System.out.println("The Parent is a File="+parent.isFile());
	
	try{
	
		if (!parent.exists())
		{
			parent.mkdir();
		}
		//Creating a tempfile
		File fileOutfile= File.createTempFile(pathPre,extn, parent);
        
	//	File fileOutfile11= new File("jaseer.txt");
	//	fileOutfile11.createNewFile();
		//ps = new PrintWriter(fileOutfile);
		//creating file in an appendmode and write the contents
		 ps= new PrintWriter(new BufferedWriter(new FileWriter("Jaseertest.txt",true)));
		ps.write(contents);
		 ps.println();
		 //ps.close();
		//ps.write(contents);
		
	} catch(Exception e)
	{
		System.out.println("Error InCreating");
	} finally {
			ps.close();
		}
	
	
	
	//try(ps= new PrintWriter(new BufferedWriter(new FileWriter("Jaseer1.txt",true))))
	try( FileWriter fs =new FileWriter("Jaseernew1.txt",true))
	{
		//ps = new PrintWriter(new FileOutputStream(fs));
		ps.write("contents");
		System.out.println("here here here");
	}catch (Exception e)
	{
	  e.printStackTrace();
	}
	
	
	
	return null;
}
	
	
}
