package in.wipro;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.wipro.dao.ReportDao;
import in.wipro.service.MessageService;

// loggers application

@SpringBootApplication
public class LoggingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoggingAppApplication.class, args);
		
		MessageService service = new MessageService();
		service.getWelcomeMsg();
		service.getGreetMsg();
		
		ReportDao Dao = new ReportDao();
		Dao.getName(101);
		
		
	
		
	}

}
