package com.cnaps.edu.activity.domain.model;

import java.util.ArrayList;
import java.util.List;

import com.cnaps.edu.activity.domain.model.common.AggregateRoot;
import com.cnaps.edu.activity.domain.model.common.Entity;

public class Activity extends Entity implements AggregateRoot {
	private String number;
	private String title;
	private String description;
	
	private List<Resource> guideLines = new ArrayList<>();
	private List<Resource> manuals = new ArrayList<>();
	private List<Resource> templateOrSamples = new ArrayList<>();
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Resource> getGuideLines() {
		return guideLines;
	}

	public void setGuideLines(List<Resource> guideLines) {
		this.guideLines = guideLines;
	}

	public List<Resource> getManuals() {
		return manuals;
	}

	public void setManuals(List<Resource> manuals) {
		this.manuals = manuals;
	}

	public List<Resource> getTemplateOrSamples() {
		return templateOrSamples;
	}

	public void setTemplateOrSamples(List<Resource> templateOrSamples) {
		this.templateOrSamples = templateOrSamples;
	}

	@Override
	public String toString() {
		return "Activity [id=" + getId() + ", number=" + number + ", title=" + title + ", description=" + description + ", guideLines="
				+ guideLines + ", manuals=" + manuals + ", templateOrSamples=" + templateOrSamples + "]";
	}
}
