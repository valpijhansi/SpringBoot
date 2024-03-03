package in.logFile.Service;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;

@Service
public class MsgService {
	private Logger logger =  (Logger) LoggerFactory.getLogger(MsgService.class);
	
	public String getWelcoming() {
		logger.info();
	}

}
