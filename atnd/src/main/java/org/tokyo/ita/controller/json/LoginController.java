package org.tokyo.ita.controller.json;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.tokyo.ita.dto.ResultDto;
import org.tokyo.ita.service.ItaLoginService;

@RequestMapping("/login")
@Controller
public class LoginController {

	@Autowired
	ItaLoginService loginService;

	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public ResultDto login() {

		ResultDto ret = new ResultDto();

		try {
			System.out.println("ÅôÅôÅôÅô Login ÅôÅôÅôÅô");
			loginService.login();
		} catch (Throwable e) {
			ret.setResult(false);
			e.printStackTrace();
		}
		return ret;
	}

}
