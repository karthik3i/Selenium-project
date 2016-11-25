package lip;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	
	Properties pro;
	
	public ConfigReader() throws Exception{
		
		File src = new File("./config.property");
		FileInputStream fis = new FileInputStream(src);
		
		pro = new Properties();
		pro.load(fis);		
	}
	
	public String GetChromeDriver(){
		return pro.getProperty("ChromePath");
		
	}

	public String GetAppURL(){
		return pro.getProperty("URL");
		
	}
	
	public String GetbrowserName(){
		return pro.getProperty("Browser");
	}
}
