package org.tokyo.ita.dto;

import java.io.Serializable;

public class ResultDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private boolean result = true;

	private String msg;

	private String errMsg;

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

}
