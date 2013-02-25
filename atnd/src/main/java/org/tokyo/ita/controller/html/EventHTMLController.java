package org.tokyo.ita.controller.html;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.tokyo.ita.dto.ItaEvent;
import org.tokyo.ita.dto.PageContextDto;
import org.tokyo.ita.service.ItaBaseService;

@RequestMapping("/event")
@Controller
public class EventHTMLController extends BaseHTMLController<ItaEvent> {

	@Autowired
	public void setEventService(ItaBaseService<ItaEvent> eventService) {
		this.baseService = eventService;
	}

	public EventHTMLController() {
		viewResolvePath = "event";
	}

	@Override
	public String create(ItaEvent event, ModelMap model) {
		debugLog(event);
		return super.create(event, model);
	}

	@Override
	public String get(@PathVariable("id") Long id, ModelMap model) {
		System.out.println("id : " + id);
		return super.get(id, model);
	}

	@Override
	public String getList(PageContextDto page, ItaEvent event, ModelMap model) {
		debugLog(event);
		return super.getList(page, event, model);
	}

	@Override
	public String update(@PathVariable("id") Long id, ItaEvent event,
			ModelMap model) {
		debugLog(event);
		return super.update(id, event, model);
	}

	@Override
	public String delete(@PathVariable("id") Long id, ModelMap model) {
		System.out.println("id : " + id);
		return super.delete(id, model);
	}

	private void debugLog(ItaEvent event) {
		System.out.println("eventName : " + event.getEventName());
		System.out.println("limit : " + event.getLimit());
		System.out.println("Overview : " + event.getOverview());
		System.out.println("determination : " + event.getDetermination());
	}

}
