package com.pentacats.animal.config;

import java.io.IOException;
import java.util.Hashtable;

import javax.servlet.http.HttpServletResponse;

import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.pentacats.animal.common.ErrorResponse;
import com.pentacats.animal.utils.JsonUtil;
import com.pentacats.animal.utils.MakeResponseUtil;

@ControllerAdvice
public class ExceptionConfig {

	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public void handleException(Exception e, HttpServletResponse response) throws
		IOException {
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("rtnCode", "-1");
		ht.put("EXCEPTION_TYPE", "BIZ");
		ht.put("ERROR_CODE", "ERR002");
		String jsonStr = new String(JsonUtil.parseToString(ht));
		MakeResponseUtil.makeResponse(response, "json", jsonStr);
		response.setHeader("EXCEPTION", "Y");
	}

	@ExceptionHandler(NullPointerException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public void handleNullPointException(NullPointerException e,HttpServletResponse response) throws IOException {
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("rtnCode", "-1");
		ht.put("EXCEPTION_TYPE", "BIZ");
		ht.put("EXCEPTION_MSG_CODE", "ERR007");
		String jsonStr = new String(JsonUtil.parseToString(ht));
		MakeResponseUtil.makeResponse(response, "json", jsonStr);
		response.setHeader("EXCEPTION", "Y");
	}

	@ExceptionHandler(DuplicateKeyException.class)
	protected ResponseEntity<?> handleIllegalArgumentException(DuplicateKeyException e) {
		final ErrorResponse errorResponse = ErrorResponse.builder()
			.code("Item Not Found")
			.message(e.getMessage()).build();

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
	}

}
