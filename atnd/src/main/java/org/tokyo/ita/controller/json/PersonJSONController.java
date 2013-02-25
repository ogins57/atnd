package org.tokyo.ita.controller.json;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.tokyo.ita.dto.ItaPerson;
import org.tokyo.ita.dto.PageContextDto;
import org.tokyo.ita.dto.ResultDto;
import org.tokyo.ita.service.ItaBaseService;

@RequestMapping("/person_json")
@Controller
public class PersonJSONController extends BaseJSONController<ItaPerson> {

	@Autowired
	public void setPersonService(ItaBaseService<ItaPerson> personService) {
		this.baseService = personService;
	}

	@Override
	public ResultDto create(ItaPerson person) {
		debugLog(person);
		return super.create(person);
	}

	@Override
	public ItaPerson get(@PathVariable("id") Long id) {
		System.out.println("id : " + id);
		return super.get(id);
	}

	@Override
	public List<ItaPerson> getList(PageContextDto page, ItaPerson person) {
		debugLog(person);
		return super.getList(page, person);
	}

	@Override
	public ResultDto update(@PathVariable("id") Long id, ItaPerson person) {
		debugLog(person);
		return super.update(id, person);
	}

	@Override
	public ResultDto delete(@PathVariable("id") Long id) {
		System.out.println("id : " + id);
		return super.delete(id);
	}

	private void debugLog(ItaPerson person) {
		System.out.println("name        : " + person.getName());
		System.out.println("email       : " + person.getEmail());
		System.out.println("placeOfWork : " + person.getPlaceOfWork());
	}

}
