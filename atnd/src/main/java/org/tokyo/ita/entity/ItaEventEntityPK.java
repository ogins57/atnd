package org.tokyo.ita.entity;

import java.io.Serializable;

import javax.persistence.Column;

public class ItaEventEntityPK implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "EVENT_ID", columnDefinition = "serial")
	private Long eventId;

	@Column(name = "CATEGORY_ID")
	private Long categoryId;

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

	public int hashCode() {
		return (eventId == null ? 0 : eventId.hashCode())
				+ (categoryId == null ? 0 : categoryId.hashCode());
	}

	public boolean equals(Object obj) {
		if (obj == this)
			return true;

		if (obj == null || obj instanceof ItaEventEntityPK)
			return false;

		ItaEventEntityPK pk = (ItaEventEntityPK) obj;

		if (eventId != null && !eventId.equals(pk.getEventId()))
			return false;

		if (eventId == null && pk.getEventId() != null)
			return false;

		if (categoryId != null && !categoryId.equals(pk.getCategoryId()))
			return false;

		if (categoryId == null && pk.getCategoryId() != null)
			return false;

		return true;
	}
}
