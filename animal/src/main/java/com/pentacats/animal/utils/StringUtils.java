package com.pentacats.animal.utils;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringUtils {

	private static final String BLANK = " ";
	private static final int START_INCLUSIVE = 0;

	public static String convertDepthByLevel(String message, int level) {
		return IntStream.range(START_INCLUSIVE, level)
			.mapToObj(i -> BLANK)
			.collect(Collectors.joining("", "", message));
	}

	public static String convertDepthByLevel(String message, int level, String expression) {
		return IntStream.range(START_INCLUSIVE, level)
			.mapToObj(i -> expression)
			.collect(Collectors.joining("", "", message));
	}

	public static boolean isNull(String str) {
		if (str == null) {
			return true;
		}
		String strRet = str.replaceAll(" ", "");
		if (strRet.length() <= 0) {
			return true;
		}
		return false;
	}

	public static String nullCheck(String stOrigin) {
		if (stOrigin == null) {
			return "";
		}
		return stOrigin;
	}

	public static String nullCheckAndReplaceChar(String stOrigin) {
		String stReturn = "";
		if (stOrigin == null) {
			return "";
		}
		stReturn = stOrigin;
		stReturn = stReturn.replaceAll("&", "&amp");
		stReturn = stReturn.replaceAll("<", "&lt");
		stReturn = stReturn.replaceAll(">", "&gt");
		stReturn = stReturn.replaceAll("\"", "&quot");

		return stReturn;
	}

	public static String nullCheckAndReplaceChar(String stOrigin, String initData) {
		String stReturn = "";
		if (stOrigin == null) {
			if (initData == null || initData.length() <= 0) {
				stReturn = "";
			} else {
				stReturn = initData;
			}
		} else {
			stReturn = stOrigin;
		}
		stReturn = stReturn.replaceAll("&", "&amp");
		stReturn = stReturn.replaceAll("<", "&lt");
		stReturn = stReturn.replaceAll(">", "&gt");
		stReturn = stReturn.replaceAll("\"", "&quot");

		return stReturn;
	}

	public static String replaceQuote(String str) {
		String strRet = "";
		if ((str.startsWith("\"") && str.endsWith("\"")) || (str.startsWith("\'") && str.endsWith("\'"))) {
			strRet = str.substring(1, str.length() - 1);
		}
		return strRet;
	}

	public static String replaceJsLen(String str) {
		String retStr = str;

		retStr = retStr.replaceAll("\n", "\\n"); // 줄바꿈기호
		retStr = retStr.replaceAll("\"", "\\\\\""); // 더블쿼테이션
		return retStr;
	}

	public static String cleanXSS(String value) {
		value = value.replaceAll("<", "").replaceAll(">", "");
		value = value.replaceAll("\\(", "").replaceAll("\\)", "");
		value = value.replaceAll("'", "");
		value = value.replaceAll("eval\\((.*)\\)", "");
		value = value.replaceAll("[\\\"\\\'][\\s]*javascript:(.*)[\\\"\\\']", "");
		value = value.replaceAll("script", "");

		return value;
	}
}
