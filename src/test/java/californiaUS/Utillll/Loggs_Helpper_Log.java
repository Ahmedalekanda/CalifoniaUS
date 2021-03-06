package californiaUS.Utillll;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Loggs_Helpper_Log {
	
	private static boolean root = false;

	public static Logger getLogs(Class cls) {
		if (root) {
			return Logger.getLogger(cls);
		}
		PropertyConfigurator.configure("log4j.properties");
		root = true;
		return Logger.getLogger(cls);
	}

}
