package Ing.SPAutomation.SPAutomation;
//comments 11 Feb 19
//another comments 11Feb
//FINNN
//Third comments
//Fourth Comments
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

public class SPAutomationProperties {

public	static Properties Params=null;
public	static Properties Objects=null;
public static File FParams=null;
public static File FObjects=null;
public static FileInputStream FISParam=null;	
public static FileInputStream FISObjects=null;
public static Logger log=null;

public  void Init() {
		
//comments needs to add 101 -105-107-109
	Params = new Properties();
		Objects = new Properties();
		log=Logger.getLogger("root");		
		try {
			String path="C:\\deleteMe";
			FParams = new File(path+"\\Param.properties");
			FObjects = new File(path+"\\Objects.properties");

			FISParam = new FileInputStream(FParams);
			FISObjects = new FileInputStream(FObjects);

			Params.load(FISParam);
			Objects.load(FISObjects);

		}

		catch (Exception e) {
			System.out.println("File Excepton during Loading " + e.getMessage());
		}
	}

}
