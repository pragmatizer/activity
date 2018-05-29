package com.cnaps.edu.activity.domain.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cnaps.edu.activity.domain.model.Activity;

public class ActivityMapRepository implements ActivityRepository {
	private static Long sequence;
	private Map<Long, Activity> activities;

	public ActivityMapRepository() {
		this.activities = new HashMap<Long, Activity>();
		this.sequence = new Long(1);
	}
	
	@Override
	public void save(Activity activity) {
		if(activity.getId() == null) {
			activity.setId(sequence++);
		}
		activities.put(activity.getId(), activity);
	}

	@Override
	public Activity findById(Long id) {
		return activities.get(id);
	}

	@Override
	public List<Activity> findAll() {
		return new ArrayList<Activity>(activities.values());
	}
	
}
