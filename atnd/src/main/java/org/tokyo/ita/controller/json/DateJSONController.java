package org.tokyo.ita.controller.json;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.tokyo.ita.dto.ItaDate;
import org.tokyo.ita.dto.PageContextDto;
import org.tokyo.ita.dto.ResultDto;
import org.tokyo.ita.service.ItaBaseService;

@RequestMapping("/date_json")
@Controller
public class DateJSONController extends BaseJSONController<ItaDate> {

	@Autowired
	public void setDateService(ItaBaseService<ItaDate> dateService) {
		this.baseService = dateService;
	}

	@Override
	public ResultDto create(ItaDate date) {
		debugLog(date);
		return super.create(date);
	}

	@Override
	public ItaDate get(@PathVariable("id") Long id) {
		System.out.println("id : " + id);
		return super.get(id);
	}

	@Override
	public List<ItaDate> getList(PageContextDto page, ItaDate date) {
		debugLog(date);
		return super.getList(page, date);
	}

	@Override
	public ResultDto update(@PathVariable("id") Long id, ItaDate date) {
		debugLog(date);
		return super.update(id, date);
	}

	@Override
	public ResultDto delete(@PathVariable("id") Long id) {
		System.out.println("id : " + id);
		return super.delete(id);
	}

	private void debugLog(ItaDate date) {
		System.out.println("countOfParticipant : "
				+ date.getCountOfParticipant());
		System.out.println("place              : " + date.getPlace());
	}

}
