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
@Table(name = "ITA_ATTENDANCE")
public class ItaAttendanceEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ATTENDANCE_ID")
	private Long attendanceId;

	@Version
	@Column(name = "VERSION")
	private Integer version;

	@Column(name = "ATND")
	private Integer atnd;

	@Column(name = "PERSON_ID")
	private Long personId;

	@Column(name = "DATE_ID")
	private Long dateId;

	public Long getAttendanceId() {
		return attendanceId;
	}

	public void setAttendanceId(Long attendanceId) {
		this.attendanceId = attendanceId;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

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
