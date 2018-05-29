package com.cnaps.edu.activity;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cnaps.edu.activity.domain.model.Activity;
import com.cnaps.edu.activity.domain.model.Resource;
import com.cnaps.edu.activity.domain.model.ResourceType;
import com.cnaps.edu.activity.domain.service.ActivityLogic;
import com.cnaps.edu.activity.domain.service.ActivityService;

@SpringBootApplication
public class ActivityApplication {
	private static final Logger log = LoggerFactory.getLogger(ActivityApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ActivityApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo() {
		return (args) -> {		
			log.info("RUN");
			
			ActivityService activityService = new ActivityLogic();
			
			Activity requirement1100 = new Activity();
			requirement1100.setTitle("요구사항 정의");
			requirement1100.setNumber("1100");
			
			Activity requirement2100 = new Activity();
			requirement2100.setTitle("아키텍처 정의");
			requirement2100.setNumber("2100");
			requirement2100.getGuideLines().add(new Resource("가이드", "http://guidee", ResourceType.GUIDELINE));
			
			activityService.register(requirement1100);
			activityService.register(requirement2100);
			
			List<Activity> results = activityService.findAll();
			
			System.out.println(results.toString());
		};
	}
}
