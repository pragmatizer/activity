package com.cnaps.edu.activity.domain.service;

import java.util.ArrayList;
import java.util.List;

import com.cnaps.edu.activity.domain.model.Activity;
import com.cnaps.edu.activity.domain.repository.ActivityMapRepository;
import com.cnaps.edu.activity.domain.repository.ActivityRepository;

public class ActivityLogic implements ActivityService {
	public ActivityRepository activityRepository;
	
	public ActivityLogic() {
		activityRepository = new ActivityMapRepository();
	}

	@Override
	public void register(Activity activity) {
		activityRepository.save(activity);
	}

	@Override
	public Activity find(Long id) {
		return activityRepository.findById(id);	
	}

	@Override
	public List<Activity> findAll() {
		return activityRepository.findAll();
	}
}
