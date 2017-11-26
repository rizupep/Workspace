package testFile;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestFile {

	public static Logger log = LoggerFactory.getLogger(TestFile.class);

	public static void main(String[] args) {
		PropertyConfigurator.configure("E:\\Eclipse Workspace\\SampleFiletest\\file\\log4j.properties");
		log.info("I am info 2");
		log.error("I am error 2");

	}

}
