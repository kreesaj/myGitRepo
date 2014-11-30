package om.moh.training;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.log4j.Logger;

public class Helper {
	private static final Logger logger = Logger.getLogger(Helper.class);
	final private SimpleDateFormat sf = new SimpleDateFormat("/yyyy/mm/dd");
	private Properties props=null;

	Helper()
	{
		LoadMyProps();
	}
	 private void LoadMyProps() {
		 props = new Properties();
		 try(InputStream is = new BufferedInputStream(Io.class.getResourceAsStream("props.txt"));)
		 {
		 props.load(is);
		 }catch(IOException ex)
		 {
			
		 }
		// TODO Auto-generated method stub
		
	}
	File getFolder() {
		String pid = "w43w";
		Date dt = new Date();

		String datePart = sf.format(dt);
		File parent = new File("/apps/dat/" + pid + datePart);
		logger.debug("Msg parent " + parent);
		return parent;
	}
}
