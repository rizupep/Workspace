package log4fileTest;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogFiletest {
	public static Logger log = LoggerFactory.getLogger(LogFiletest.class);

	public static void main(String[] args) {
		PropertyConfigurator.configure("E:\\Eclipse Workspace\\FileHandlingTest(12_08_2017)\\File\\test.properties");
		log.info("I am info 1");
		log.error("I am error 1");
	}

}
