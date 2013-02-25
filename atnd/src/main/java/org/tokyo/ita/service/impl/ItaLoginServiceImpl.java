package org.tokyo.ita.service.impl;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.tokyo.ita.service.ItaLoginService;

public class ItaLoginServiceImpl implements ItaLoginService {

	public void login() throws Throwable {
		HttpClient client = new HttpClient();
		GetMethod method = new GetMethod("http://localhost:8080/atnd/event");

		int result = client.executeMethod(method);
		System.out.println("☆☆☆ HTTP結果コード ：" + result);

		System.out.println("☆☆☆ HTTPレスポンス ☆☆☆");
		System.out.println(method.getResponseBodyAsString());
		System.out.println("☆☆☆ HTTPレスポンス ☆☆☆");

		method.releaseConnection();
	}

}
