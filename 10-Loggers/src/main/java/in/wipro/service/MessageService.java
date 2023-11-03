package in.wipro.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageService {
	
	private static final Logger logger = LoggerFactory.getLogger(MessageService.class);
	
	public String getWelcomeMsg() {
		
		logger.debug("getWelcomeMsg() - method start");
		
		String msg = "Welcome to Wipro IT..!";
		
		logger.debug("getWelcomeMsg() - method end");
		
		return msg;
		
	
	}
	
    public String getGreetMsg() {
		
    	logger.debug("getGreetMsg() - method start");
    	
		String msg = "Good Morning..!";
		
		logger.debug("getGreetMsg() - method end");
		
		return msg;
		
	}
    
    

}
