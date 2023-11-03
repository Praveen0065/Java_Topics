package in.wipro.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReportDao {
	
	private static final Logger logger = LoggerFactory.getLogger(ReportDao.class); 
	
	public String getName(Integer id) {
		
		String name = null;
		
		logger.info("getName() - method start");
		
		   if(id == 101) {
			name = "John";
		  }
			else if(id == 102) {
				name = "Smith";
			}
			else if(id == 103) {
				name ="Smith";
			}
			else {
				name = "Invalid Id";

		}
			logger.info("getName() - method end");
			return name;
	}

}
