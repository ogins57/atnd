package org.tokyo.ita.dto;

import java.io.Serializable;
import java.util.List;

public class ItaCategory implements Serializable {

	private static final long serialVersionUID = 1L;

	private String categoryName;

	private List<ItaEvent> eventList;

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<ItaEvent> getEventList() {
		return eventList;
	}

	public void setEventList(List<ItaEvent> eventList) {
		this.eventList = eventList;
	}

}
