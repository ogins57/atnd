package org.tokyo.ita.service.impl;

import static org.tokyo.ita.util.ItaUtil.convert2dateDtoList;
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
import org.tokyo.ita.dto.ItaDate;
import org.tokyo.ita.dto.PageContext;
import org.tokyo.ita.entity.ItaDateEntity;
import org.tokyo.ita.service.ItaDateService;

@Transactional
@Service
public class ItaDateServiceImpl implements ItaDateService {

	@PersistenceContext(unitName = "persistenceUnit")
	private EntityManager em;

	public void create(ItaDate date) throws Throwable {
		ItaDateEntity entity = convert2entity(date);
		em.persist(entity);
	}

	public void update(Long id, ItaDate date) throws Throwable {
		ItaDateEntity entity = em.find(ItaDateEntity.class, id);
		entity.setCountOfParticipant(date.getCountOfParticipant());
		entity.setPlace(date.getPlace());
		em.merge(entity);
	}

	public void remove(Long id) throws Throwable {
		ItaDateEntity entity = em.find(ItaDateEntity.class, id);
		em.remove(entity);
	}

	public ItaDate find(Long id) throws Throwable {
		ItaDateEntity entity = em.find(ItaDateEntity.class, id);
		return (entity == null) ? null : convert2dto(entity);
	}

	public List<ItaDate> findList(PageContext page, ItaDate condition) {
		Criteria criteria = getSettion().createCriteria(ItaDateEntity.class);

		int pageSize = page.getPageSize();
		criteria.setFirstResult(page.getPage() * pageSize).setMaxResults(
				pageSize);

		@SuppressWarnings("unchecked")
		List<ItaDateEntity> list = criteria.list();
		return convert2dateDtoList(list);
	}

	private Session getSettion() {
		return (Session) em.getDelegate();
	}

	public Map<Long, ItaDate> findMap(PageContext page, ItaDate condition)
			throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}
}
