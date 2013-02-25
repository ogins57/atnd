package org.tokyo.ita.service;

import java.util.List;
import java.util.Map;

import org.tokyo.ita.dto.PageContext;

public interface ItaBaseService<D> {

	public void create(D attendance) throws Throwable;

	public void update(Long id, D attendance) throws Throwable;

	public void remove(Long id) throws Throwable;

	public D find(Long id) throws Throwable;

	public List<D> findList(PageContext page, D condition) throws Throwable;

	public Map<Long, D> findMap(PageContext page, D condition) throws Throwable;
}
