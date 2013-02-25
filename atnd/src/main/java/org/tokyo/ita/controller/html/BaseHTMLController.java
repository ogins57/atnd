package org.tokyo.ita.controller.html;

import java.util.Map;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.tokyo.ita.dto.PageContextDto;
import org.tokyo.ita.dto.ResultDto;
import org.tokyo.ita.service.ItaBaseService;

public class BaseHTMLController<D> {

	protected ItaBaseService<D> baseService;

	protected String viewResolvePath;

	private static final String SUCCESS_MSG = "process is success.";

	private static final String FATAL_MSG = "Fatal error occurred by the system.";

	@RequestMapping(value = "create", method = RequestMethod.GET)
	public String create() {
		return viewResolvePath + "/create";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String create(D dto, ModelMap model) {

		ResultDto result = new ResultDto();

		try {
			baseService.create(dto);
			result.setMsg(SUCCESS_MSG);
		} catch (Throwable e) {
			result.setResult(false);
			result.setErrMsg(FATAL_MSG);
			e.printStackTrace();
		}

		model.addAttribute("result", result);

		return "result";
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String get(@PathVariable("id") Long id, ModelMap model) {

		D dto = null;
		try {
			dto = baseService.find(id);
		} catch (Throwable e) {
			e.printStackTrace();
		}

		model.addAttribute("dto", dto);

		return viewResolvePath + "/get";
	}

	@RequestMapping(method = RequestMethod.GET)
	public String getList(PageContextDto page, D dto, ModelMap model) {

		if (page.getPageSize() == 0)
			page.setPageSize(20);

		Map<Long, D> map = null;
		try {
			map = baseService.findMap(page, dto);
		} catch (Throwable e) {
			e.printStackTrace();
		}

		model.addAttribute("list", map);

		return viewResolvePath + "/list";
	}

	@RequestMapping(value = "/{id}/update", method = RequestMethod.GET)
	public String update(@PathVariable("id") Long id, D dto, ModelMap model) {

		ResultDto result = new ResultDto();

		try {
			baseService.update(id, dto);
			result.setMsg(SUCCESS_MSG);
		} catch (Throwable e) {
			result.setResult(false);
			result.setErrMsg(FATAL_MSG);
			e.printStackTrace();
		}

		model.addAttribute("result", result);

		return "result";
	}

	@RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
	public String delete(@PathVariable("id") Long id, ModelMap model) {

		ResultDto result = new ResultDto();

		try {
			baseService.remove(id);
			result.setMsg(SUCCESS_MSG);
		} catch (Throwable e) {
			result.setResult(false);
			result.setErrMsg(FATAL_MSG);
			e.printStackTrace();
		}

		model.addAttribute("result", result);

		return "result";
	}

}
