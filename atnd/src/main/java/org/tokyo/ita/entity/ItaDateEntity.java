package org.tokyo.ita.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "ITA_DATE")
public class ItaDateEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "DATE_ID")
	private Long dateId;

	@Version
	@Column(name = "VERSION")
	private Integer version;

	@Column(name = "COUNT_OF_PARTICIPANT")
	private Integer countOfParticipant;

	@Column(name = "PLACE")
	private String place;

	public Long getDateId() {
		return dateId;
	}

	public void setDateId(Long dateId) {
		this.dateId = dateId;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

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
