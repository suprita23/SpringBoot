package com.example.demo.tasks;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {
	
	Logger logger = LoggerFactory.getLogger(ScheduledTasks.class);
	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
	
	@Scheduled(fixedRate = 5000)
	public void logTime() {
		logger.info("Time now is : "+ sdf.format(new Date()));
	}

}
