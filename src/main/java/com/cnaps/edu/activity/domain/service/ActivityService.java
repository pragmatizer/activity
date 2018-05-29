package com.cnaps.edu.activity.domain.service;

import java.util.List;

import com.cnaps.edu.activity.domain.model.Activity;

public interface ActivityService {
	public void register(Activity activity);
	public Activity find(Long id);
	public List<Activity> findAll();
}
