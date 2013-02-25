package org.tokyo.ita.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.tokyo.ita.dto.ItaAttendance;
import org.tokyo.ita.dto.ItaCategory;
import org.tokyo.ita.dto.ItaDate;
import org.tokyo.ita.dto.ItaEvent;
import org.tokyo.ita.dto.ItaPerson;
import org.tokyo.ita.entity.ItaAttendanceEntity;
import org.tokyo.ita.entity.ItaCategoryEntity;
import org.tokyo.ita.entity.ItaDateEntity;
import org.tokyo.ita.entity.ItaEventEntity;
import org.tokyo.ita.entity.ItaPersonEntity;

public class ItaUtil {

	public static ItaEventEntity convert2entity(Long id, ItaEvent event) {

		ItaEventEntity entity = convert2entity(event);
		if (entity == null)
			return null;

		entity.setEventId(id);
		return entity;
	}

	public static ItaCategoryEntity convert2entity(ItaCategory category) {

		if (category == null)
			return null;

		ItaCategoryEntity entity = new ItaCategoryEntity();
		entity.setCategoryName(category.getCategoryName());
		return entity;
	}

	public static ItaEventEntity convert2entity(ItaEvent event) {

		if (event == null)
			return null;

		ItaEventEntity entity = new ItaEventEntity();
		entity.setCategoryId(event.getCategoryId());
		entity.setEventName(event.getEventName());
		entity.setLimit(event.getLimit());
		entity.setOverview(event.getOverview());
		return entity;
	}

	public static ItaPersonEntity convert2entity(ItaPerson person) {

		if (person == null)
			return null;

		ItaPersonEntity entity = new ItaPersonEntity();
		entity.setName(person.getName());
		entity.setEmail(person.getEmail());
		entity.setPlaceOfWork(person.getPlaceOfWork());
		return entity;
	}

	public static ItaDateEntity convert2entity(ItaDate date) {

		if (date == null)
			return null;

		ItaDateEntity entity = new ItaDateEntity();
		entity.setCountOfParticipant(date.getCountOfParticipant());
		entity.setPlace(date.getPlace());
		return entity;
	}

	public static ItaAttendanceEntity convert2entity(ItaAttendance attendance) {

		if (attendance == null)
			return null;

		ItaAttendanceEntity entity = new ItaAttendanceEntity();
		entity.setAtnd(attendance.getAtnd());
		entity.setDateId(attendance.getDateId());
		entity.setPersonId(attendance.getPersonId());
		return entity;
	}

	public static List<ItaCategory> convert2categoryDtoList(
			List<ItaCategoryEntity> entityList) {

		if (entityList == null)
			return null;

		List<ItaCategory> dtoList = new ArrayList<ItaCategory>(
				entityList.size());
		ItaCategory tmp = null;
		for (ItaCategoryEntity entity : entityList) {
			tmp = convert2dto(entity);
			dtoList.add(tmp);
		}
		return dtoList;
	}

	public static Map<Long,ItaEvent> convert2eventDtoMap(
			List<ItaEventEntity> entityList) {

		if (entityList == null)
			return null;

		Map<Long,ItaEvent> dtoMap = new HashMap<Long, ItaEvent>(entityList.size());
		ItaEvent tmp = null;
		for (ItaEventEntity entity : entityList) {
			tmp = convert2dto(entity);
			dtoMap.put(entity.getEventId(), tmp);
		}
		return dtoMap;
	}
	
	public static List<ItaEvent> convert2eventDtoList(
			List<ItaEventEntity> entityList) {

		if (entityList == null)
			return null;

		List<ItaEvent> dtoList = new ArrayList<ItaEvent>(entityList.size());
		ItaEvent tmp = null;
		for (ItaEventEntity entity : entityList) {
			tmp = convert2dto(entity);
			dtoList.add(tmp);
		}
		return dtoList;
	}

	public static List<ItaPerson> convert2personDtoList(
			List<ItaPersonEntity> entityList) {

		if (entityList == null)
			return null;

		List<ItaPerson> dtoList = new ArrayList<ItaPerson>(entityList.size());
		ItaPerson tmp = null;
		for (ItaPersonEntity entity : entityList) {
			tmp = convert2dto(entity);
			dtoList.add(tmp);
		}
		return dtoList;
	}

	public static List<ItaDate> convert2dateDtoList(
			List<ItaDateEntity> entityList) {

		if (entityList == null)
			return null;

		List<ItaDate> dtoList = new ArrayList<ItaDate>(entityList.size());
		ItaDate tmp = null;
		for (ItaDateEntity entity : entityList) {
			tmp = convert2dto(entity);
			dtoList.add(tmp);
		}
		return dtoList;
	}

	public static List<ItaAttendance> convert2attendanceDtoList(
			List<ItaAttendanceEntity> entityList) {

		if (entityList == null)
			return null;

		List<ItaAttendance> dtoList = new ArrayList<ItaAttendance>(
				entityList.size());
		ItaAttendance tmp = null;
		for (ItaAttendanceEntity entity : entityList) {
			tmp = convert2dto(entity);
			dtoList.add(tmp);
		}
		return dtoList;
	}

	public static ItaCategory convert2dto(ItaCategoryEntity entity) {

		if (entity == null)
			return null;

		ItaCategory dto = new ItaCategory();
		dto.setCategoryName(entity.getCategoryName());
		return dto;
	}

	public static ItaEvent convert2dto(ItaEventEntity entity) {

		if (entity == null)
			return null;

		ItaEvent dto = new ItaEvent();
		dto.setEventName(entity.getEventName());
		dto.setLimit(entity.getLimit());
		dto.setOverview(entity.getOverview());
		return dto;
	}

	public static ItaPerson convert2dto(ItaPersonEntity entity) {

		if (entity == null)
			return null;

		ItaPerson dto = new ItaPerson();
		dto.setName(entity.getName());
		dto.setEmail(entity.getEmail());
		dto.setPlaceOfWork(entity.getPlaceOfWork());
		return dto;
	}

	public static ItaDate convert2dto(ItaDateEntity entity) {

		if (entity == null)
			return null;

		ItaDate dto = new ItaDate();
		dto.setCountOfParticipant(entity.getCountOfParticipant());
		dto.setPlace(entity.getPlace());
		return dto;
	}

	public static ItaAttendance convert2dto(ItaAttendanceEntity entity) {

		if (entity == null)
			return null;

		ItaAttendance dto = new ItaAttendance();
		dto.setAtnd(entity.getAtnd());
		dto.setDateId(entity.getDateId());
		dto.setPersonId(entity.getPersonId());
		return dto;
	}

}
