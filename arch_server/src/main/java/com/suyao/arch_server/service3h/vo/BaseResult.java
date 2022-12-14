package com.suyao.arch_server.service3h.vo;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

/**
 * 结果基类
 * @author 林建冰
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="Result")
@XmlType(name = "result", propOrder = { "code", "message"})
public class BaseResult implements Serializable {

	private static final long serialVersionUID = -3090783966216796997L;
	
	public static final String SUCCESS_CODE = "00001";
	public static final String FAIL_CODE = "00002";
	public static final String PROCESS_CODE = "00003";
	public static final String WAIT_CODE = "00004";

	/** 编码 **/
	@XmlElement
	private String code;
	
	/** 信息 **/
	@XmlElement
	private String message;

	private Object data;

	public BaseResult(){}

	public BaseResult(String code, String message){
		this.code = code;
		this.message = message;
	}

	public BaseResult(String code, String message, Object data){
		this.code = code;
		this.message = message;
		this.data = data;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
