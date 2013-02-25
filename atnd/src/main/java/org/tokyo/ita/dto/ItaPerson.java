package org.tokyo.ita.dto;

import java.io.Serializable;
import java.util.List;

public class ItaPerson implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;

	private String email;

	private String placeOfWork;

	private String ItaDate;

	private List<ItaCategory> categoryList;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPlaceOfWork() {
		return placeOfWork;
	}

	public void setPlaceOfWork(String placeOfWork) {
		this.placeOfWork = placeOfWork;
	}

	public String getItaDate() {
		return ItaDate;
	}

	public void setItaDate(String itaDate) {
		ItaDate = itaDate;
	}

	public List<ItaCategory> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(List<ItaCategory> categoryList) {
		this.categoryList = categoryList;
	}

}
