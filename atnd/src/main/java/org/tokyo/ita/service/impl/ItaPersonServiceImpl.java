package org.tokyo.ita.service.impl;

import static org.tokyo.ita.util.ItaUtil.convert2dto;
import static org.tokyo.ita.util.ItaUtil.convert2entity;
import static org.tokyo.ita.util.ItaUtil.convert2personDtoList;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tokyo.ita.dto.ItaPerson;
import org.tokyo.ita.dto.PageContext;
import org.tokyo.ita.entity.ItaPersonEntity;
import org.tokyo.ita.service.ItaPersonService;

@Transactional
@Service
public class ItaPersonServiceImpl implements ItaPersonService {

	@PersistenceContext(unitName = "persistenceUnit")
	private EntityManager em;

	public void create(ItaPerson person) throws Throwable {
		ItaPersonEntity entity = convert2entity(person);
		em.persist(entity);
	}

	public void update(Long id, ItaPerson person) throws Throwable {
		ItaPersonEntity entity = em.find(ItaPersonEntity.class, id);
		entity.setName(person.getName());
		entity.setEmail(person.getEmail());
		entity.setPlaceOfWork(person.getPlaceOfWork());
		em.merge(entity);
	}

	public void remove(Long id) throws Throwable {
		ItaPersonEntity entity = em.find(ItaPersonEntity.class, id);
		em.remove(entity);
	}

	public ItaPerson find(Long id) throws Throwable {
		ItaPersonEntity entity = em.find(ItaPersonEntity.class, id);
		return (entity == null) ? null : convert2dto(entity);
	}

	public List<ItaPerson> findList(PageContext page, ItaPerson condition) {
		Criteria criteria = getSettion().createCriteria(ItaPersonEntity.class);

		int pageSize = page.getPageSize();
		criteria.setFirstResult(page.getPage() * pageSize).setMaxResults(
				pageSize);

		@SuppressWarnings("unchecked")
		List<ItaPersonEntity> list = criteria.list();
		return convert2personDtoList(list);
	}

	private Session getSettion() {
		return (Session) em.getDelegate();
	}

	public Map<Long, ItaPerson> findMap(PageContext page, ItaPerson condition)
			throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}
}
