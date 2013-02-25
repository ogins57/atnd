package org.tokyo.ita.service.impl;

import static org.tokyo.ita.util.ItaUtil.convert2categoryDtoList;
import static org.tokyo.ita.util.ItaUtil.convert2eventDtoList;
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
import org.tokyo.ita.dto.ItaCategory;
import org.tokyo.ita.dto.PageContext;
import org.tokyo.ita.entity.ItaCategoryEntity;
import org.tokyo.ita.entity.ItaEventEntity;
import org.tokyo.ita.service.ItaCategoryService;

@Transactional
@Service
public class ItaCategoryServiceImpl implements ItaCategoryService {

	@PersistenceContext(unitName = "persistenceUnit")
	private EntityManager em;

	public void create(ItaCategory category) throws Throwable {
		ItaCategoryEntity entity = convert2entity(category);
		em.persist(entity);
	}

	public void update(Long id, ItaCategory category) throws Throwable {
		ItaCategoryEntity entity = em.find(ItaCategoryEntity.class, id);
		entity.setCategoryName(category.getCategoryName());
		em.merge(entity);
	}

	public void remove(Long id) throws Throwable {
		ItaCategoryEntity entity = em.find(ItaCategoryEntity.class, id);
		em.remove(entity);
	}

	public ItaCategory find(Long id) throws Throwable {
		ItaCategoryEntity entity = em.find(ItaCategoryEntity.class, id);
		if (entity == null)
			return null;

		@SuppressWarnings("unchecked")
		List<ItaEventEntity> entityList = em
				.createNamedQuery("ItaEventEntity.findByCategoryId")
				.setParameter("categoryId", entity.getCategoryId())
				.getResultList();

		ItaCategory category = convert2dto(entity);
		category.setEventList(convert2eventDtoList(entityList));
		return category;
	}

	public List<ItaCategory> findList(PageContext page, ItaCategory condition) {
		Criteria criteria = getSettion()
				.createCriteria(ItaCategoryEntity.class);

		int pageSize = page.getPageSize();
		criteria.setFirstResult(page.getPage() * pageSize).setMaxResults(
				pageSize);

		@SuppressWarnings("unchecked")
		List<ItaCategoryEntity> list = criteria.list();
		return convert2categoryDtoList(list);
	}

	private Session getSettion() {
		return (Session) em.getDelegate();
	}

	public Map<Long, ItaCategory> findMap(PageContext page,
			ItaCategory condition) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}

	// private Example createExample(ItaEventEntity entity){
	// Example ex = Example.create(entity);
	// return ex;
	// }
}
