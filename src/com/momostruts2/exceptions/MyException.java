package com.momostruts2.exceptions;

/**
 * 自定义异常类
 * @author MoYalan
 *
 */
@SuppressWarnings("serial")
public class MyException extends RuntimeException {

	public MyException() {
		super();
	}

	public MyException(String message) {
		super(message);
	}

}
