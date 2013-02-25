package org.tokyo.ita.dto;

import java.io.Serializable;

public class ItaDate implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer countOfParticipant;

	private String place;

	public Integer getCountOfParticipant() {
		return countOfParticipant;
	}

	public void setCountOfParticipant(Integer countOfParticipant) {
		this.countOfParticipant = countOfParticipant;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

}
