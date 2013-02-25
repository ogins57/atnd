package org.tokyo.ita.controller.json;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.tokyo.ita.dto.ItaCategory;
import org.tokyo.ita.dto.PageContextDto;
import org.tokyo.ita.dto.ResultDto;
import org.tokyo.ita.service.ItaBaseService;

@RequestMapping("/category_json")
@Controller
public class CategoryJSONController extends
		BaseJSONController<ItaCategory> {

	@Autowired
	public void setCategoryService(ItaBaseService<ItaCategory> categoryService) {
		this.baseService = categoryService;
	}

	@Override
	public ResultDto create(ItaCategory category) {
		debugLog(category);
		return super.create(category);
	}

	@Override
	public ItaCategory get(@PathVariable("id") Long id) {
		System.out.println("id : " + id);
		return super.get(id);
	}

	@Override
	public List<ItaCategory> getList(PageContextDto page, ItaCategory category) {
		debugLog(category);
		return super.getList(page, category);
	}

	@Override
	public ResultDto update(@PathVariable("id") Long id, ItaCategory category) {
		debugLog(category);
		return super.update(id, category);
	}

	@Override
	public ResultDto delete(@PathVariable("id") Long id) {
		System.out.println("id : " + id);
		// no remove
		return null;
	}

	private void debugLog(ItaCategory category) {
		System.out.println("categoryId   : " + category.getCategoryName());
	}
}
