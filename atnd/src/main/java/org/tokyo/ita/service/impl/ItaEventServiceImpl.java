package org.tokyo.ita.service.impl;

import static org.tokyo.ita.util.ItaUtil.convert2dto;
import static org.tokyo.ita.util.ItaUtil.convert2eventDtoList;
import static org.tokyo.ita.util.ItaUtil.convert2eventDtoMap;
import static org.tokyo.ita.util.ItaUtil.convert2entity;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tokyo.ita.dto.ItaEvent;
import org.tokyo.ita.dto.PageContext;
import org.tokyo.ita.entity.ItaEventEntity;
import org.tokyo.ita.entity.ItaEventIdEntity;
import org.tokyo.ita.service.ItaEventService;

@Transactional
@Service
public class ItaEventServiceImpl implements ItaEventService {

	@PersistenceContext(unitName = "persistenceUnit")
	private EntityManager em;

	@Transactional
	private long getEventId() {
		ItaEventIdEntity entity = new ItaEventIdEntity();
		em.persist(entity);
		return entity.getId();
	}

	public void create(ItaEvent event) throws Throwable {

		long id = getEventId();

		ItaEventEntity entity = convert2entity(event);
		entity.setEventId(id);
		em.persist(entity);
	}

	public void update(Long id, ItaEvent event) throws Throwable {
		ItaEventEntity entity = em.find(ItaEventEntity.class, id);
		entity.setEventName(event.getEventName());
		entity.setLimit(event.getLimit());
		entity.setOverview(event.getOverview());
		em.merge(entity);
	}

	public void remove(Long id) throws Throwable {
		ItaEventEntity entity = em.find(ItaEventEntity.class, id);
		em.remove(entity);
	}

	public ItaEvent find(Long id) throws Throwable {
		ItaEventEntity entity = em.find(ItaEventEntity.class, id);
		return (entity == null) ? null : convert2dto(entity);
	}

	public List<ItaEvent> findList(PageContext page, ItaEvent condition) {
		Criteria criteria = getSettion().createCriteria(ItaEventEntity.class);

		int pageSize = page.getPageSize();
		criteria.setFirstResult(page.getPage() * pageSize).setMaxResults(
				pageSize);

		@SuppressWarnings("unchecked")
		List<ItaEventEntity> list = criteria.list();
		return convert2eventDtoList(list);
	}
	
	public Map<Long,ItaEvent> findMap(PageContext page, ItaEvent condition) {
		Criteria criteria = getSettion().createCriteria(ItaEventEntity.class);

		int pageSize = page.getPageSize();
		criteria.setFirstResult(page.getPage() * pageSize).setMaxResults(
				pageSize);

		@SuppressWarnings("unchecked")
		List<ItaEventEntity> list = criteria.list();
		return convert2eventDtoMap(list);
	}

	private Session getSettion() {
		return (Session) em.getDelegate();
	}

	// private Example createExample(ItaEventEntity entity){
	// Example ex = Example.create(entity);
	// return ex;
	// }
}
