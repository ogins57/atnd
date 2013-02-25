package org.tokyo.ita.service.impl;

import static org.tokyo.ita.util.ItaUtil.convert2attendanceDtoList;
import static org.tokyo.ita.util.ItaUtil.convert2dto;
import static org.tokyo.ita.util.ItaUtil.convert2entity;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tokyo.ita.dto.ItaAttendance;
import org.tokyo.ita.dto.PageContext;
import org.tokyo.ita.entity.ItaAttendanceEntity;
import org.tokyo.ita.service.ItaAttendanceService;

@Transactional
@Service
public class ItaAttendanceServiceImpl implements ItaAttendanceService {

	@PersistenceContext(unitName = "persistenceUnit")
	private EntityManager em;

	public void create(ItaAttendance attendance) throws Throwable {
		ItaAttendanceEntity entity = convert2entity(attendance);
		em.persist(entity);
	}

	public void update(Long id, ItaAttendance attendance) throws Throwable {
		ItaAttendanceEntity entity = em.find(ItaAttendanceEntity.class, id);
		entity.setAtnd(attendance.getAtnd());
		entity.setDateId(attendance.getDateId());
		entity.setPersonId(attendance.getPersonId());
		em.merge(entity);
	}

	public void remove(Long id) throws Throwable {
		ItaAttendanceEntity entity = em.find(ItaAttendanceEntity.class, id);
		em.remove(entity);
	}

	public ItaAttendance find(Long id) throws Throwable {
		ItaAttendanceEntity entity = em.find(ItaAttendanceEntity.class, id);
		return (entity == null) ? null : convert2dto(entity);
	}

	public List<ItaAttendance> findList(PageContext page,
			ItaAttendance condition) {
		Criteria criteria = getSettion().createCriteria(
				ItaAttendanceEntity.class);

		int pageSize = page.getPageSize();
		criteria.setFirstResult(page.getPage() * pageSize).setMaxResults(
				pageSize);

		@SuppressWarnings("unchecked")
		List<ItaAttendanceEntity> list = criteria.list();
		return convert2attendanceDtoList(list);
	}

	private Session getSettion() {
		return (Session) em.getDelegate();
	}

	public Map<Long, ItaAttendance> findMap(PageContext page,
			ItaAttendance condition) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}

}
