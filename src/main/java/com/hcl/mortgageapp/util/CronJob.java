package com.hcl.mortgageapp.util;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CronJob {

	public CronJob() {
		// TODO Auto-generated constructor stub
	}
	
	@Scheduled(fixedRate = 6000)
	public void displayWelComeMsg() {
		System.out.println("Welcome .......This is cron job.");
	}

}
