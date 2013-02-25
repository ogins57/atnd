package org.tokyo.ita.dto;

import java.io.Serializable;
import java.util.List;

public class ItaEvent implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long categoryId;

	private String eventName;

	private int limit;

	private String overview;

	private List<ItaDate> candidateDays;

	private ItaDate determination;

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public List<ItaDate> getCandidateDays() {
		return candidateDays;
	}

	public void setCandidateDays(List<ItaDate> candidateDays) {
		this.candidateDays = candidateDays;
	}

	public ItaDate getDetermination() {
		return determination;
	}

	public void setDetermination(ItaDate determination) {
		this.determination = determination;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
