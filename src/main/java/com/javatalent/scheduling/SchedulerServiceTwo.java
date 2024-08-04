package com.javatalent.scheduling;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerServiceTwo {

	@Scheduled(fixedRate = 1000)
	// @Scheduled(fixedRateString = "4000")
	public void scheduledMethod() {
		System.out.println("Hello Scheduler Two :" + new Date());
	}
}