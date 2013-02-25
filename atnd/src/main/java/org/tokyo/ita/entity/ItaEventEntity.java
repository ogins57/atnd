package org.tokyo.ita.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "ITA_EVENT")
@NamedQuery(name = "ItaEventEntity.findByCategoryId", query = "select iee from "
		+ " org.tokyo.ita.entity.ItaEventEntity iee "
		+ " where iee.categoryId IN (:categoryId)")

public class ItaEventEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "EVENT_ID")
	private Long eventId;

	@Column(name = "CATEGORY_ID")
	private Long categoryId;

	@Version
	@Column(name = "VERSION")
	private Integer version;

	@Column(name = "EVENT_NAME")
	private String eventName;

	@Column(name = "LIMIT")
	private int limit;

	@Column(name = "OVERVIEW")
	private String overview;

	public Long getEventId() {
		return eventId;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
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

}
