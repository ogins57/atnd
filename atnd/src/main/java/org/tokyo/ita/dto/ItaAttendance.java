package org.tokyo.ita.dto;

import java.io.Serializable;

public class ItaAttendance implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer atnd;

	private Long personId;

	private Long dateId;

	public Integer getAtnd() {
		return atnd;
	}

	public void setAtnd(Integer atnd) {
		this.atnd = atnd;
	}

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
	}

	public Long getDateId() {
		return dateId;
	}

	public void setDateId(Long dateId) {
		this.dateId = dateId;
	}

}
