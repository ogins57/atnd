package org.tokyo.ita.dto;

import java.io.Serializable;

public class PageContextDto implements Serializable, PageContext {

	private static final long serialVersionUID = 1L;

	private int page;

	private int total;

	private int pageSize;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

}
