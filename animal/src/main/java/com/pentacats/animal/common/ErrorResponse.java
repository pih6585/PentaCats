package com.pentacats.animal.common;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Builder
public class ErrorResponse {

	private String message;

	private int status;

	private String code;
}
