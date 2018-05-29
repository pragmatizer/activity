package com.cnaps.edu.activity.domain.repository;

import java.util.List;

import com.cnaps.edu.activity.domain.model.Activity;

public interface ActivityRepository {
	public void save(Activity activity);
	public Activity findById(Long id);
	public List<Activity> findAll();
}
