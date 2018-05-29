package com.cnaps.edu.activity.domain.model;

import com.cnaps.edu.activity.domain.model.common.ValueObject;

public class Resource implements ValueObject {
	private String title;
	private String url;
	private ResourceType resourceType;
	
	public Resource(String title, String url, ResourceType resourceType) {
		this.title = title;
		this.url = url;
		this.resourceType = resourceType;
	}
	
	@Override
	public String toString() {
		return "Resource [title=" + title + ", url=" + url + ", resourceType=" + resourceType + "]";
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public ResourceType getResourceType() {
		return resourceType;
	}
	public void setResourceType(ResourceType resourceType) {
		this.resourceType = resourceType;
	}
}
