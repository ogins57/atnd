package org.tokyo.ita.controller.json;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.tokyo.ita.dto.ItaEvent;
import org.tokyo.ita.dto.PageContextDto;
import org.tokyo.ita.dto.ResultDto;
import org.tokyo.ita.service.ItaBaseService;

@RequestMapping("/event_json")
@Controller
public class EventJSONController extends BaseJSONController<ItaEvent> {

	@Autowired
	public void setEventService(ItaBaseService<ItaEvent> eventService) {
		this.baseService = eventService;
	}

	@Override
	public ResultDto create(ItaEvent event) {
		debugLog(event);
		return super.create(event);
	}

	@Override
	public ItaEvent get(@PathVariable("id") Long id) {
		System.out.println("id : " + id);
		return super.get(id);
	}

	@Override
	public List<ItaEvent> getList(PageContextDto page, ItaEvent event) {
		debugLog(event);
		return super.getList(page, event);
	}

	@Override
	public ResultDto update(@PathVariable("id") Long id, ItaEvent event) {
		debugLog(event);
		return super.update(id, event);
	}

	@Override
	public ResultDto delete(@PathVariable("id") Long id) {
		System.out.println("id : " + id);
		return super.delete(id);
	}

	private void debugLog(ItaEvent event) {
		System.out.println("eventName : " + event.getEventName());
		System.out.println("limit : " + event.getLimit());
		System.out.println("Overview : " + event.getOverview());
		System.out.println("determination : " + event.getDetermination());
	}

}
