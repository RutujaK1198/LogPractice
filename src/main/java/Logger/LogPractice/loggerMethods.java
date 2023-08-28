package Logger.LogPractice;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class loggerMethods {

	private static Logger log= Logger.getLogger(loggerMethods.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Layout layout=new PatternLayout(" %d{yy-MMM--hh--mm}%m [%M] %C %n %l");
		//can try in various ways for dates
		Appender app= new ConsoleAppender(layout);
		log.addAppender(app);
System.out.println("Following are the priority msg of logger");	

  log.debug("debug method");
  log.info("info method");
  log.warn("warn message");
  log.fatal("fatal msg");
  log.error("error method");
 System.out.println("above methods should be printed"); 
	}

}
