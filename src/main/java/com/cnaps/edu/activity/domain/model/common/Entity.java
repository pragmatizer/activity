package com.cnaps.edu.activity.domain.model.common;

public class Entity {
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Entity [id=" + id + "]";
	}
}
