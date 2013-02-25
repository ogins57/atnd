package org.tokyo.ita.controller.json;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.tokyo.ita.dto.PageContextDto;
import org.tokyo.ita.dto.ResultDto;
import org.tokyo.ita.service.ItaBaseService;

public class BaseJSONController<D> {

	protected ItaBaseService<D> baseService;

	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public ResultDto create(D dto) {

		ResultDto result = new ResultDto();

		try {
			baseService.create(dto);
		} catch (Throwable e) {
			result.setResult(false);
			e.printStackTrace();
		}
		return result;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public D get(@PathVariable("id") Long id) {

		D dto = null;
		try {
			dto = baseService.find(id);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return dto;
	}

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<D> getList(PageContextDto page, D dto) {

		if (page.getPageSize() == 0)
			page.setPageSize(20);

		List<D> list = null;
		try {
			list = baseService.findList(page, dto);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return list;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	@ResponseBody
	public ResultDto update(@PathVariable("id") Long id, D dto) {

		ResultDto result = new ResultDto();

		try {
			baseService.update(id, dto);
		} catch (Throwable e) {
			result.setResult(false);
			e.printStackTrace();
		}
		return result;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public ResultDto delete(@PathVariable("id") Long id) {

		ResultDto result = new ResultDto();

		try {
			baseService.remove(id);
		} catch (Throwable e) {
			result.setResult(false);
			e.printStackTrace();
		}
		return result;
	}

}
