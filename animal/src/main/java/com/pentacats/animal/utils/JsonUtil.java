package com.pentacats.animal.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonUtil {
	private static Gson parseGson;

	private JsonUtil() {
		throw new AssertionError("인스턴스 생성이 불가능 합니다.");
	};

	public static String parseToString(Object svo) {
		return getParseInstance().toJson(svo);
	};

	private static Gson getParseInstance() {
		if (parseGson == null) {
			GsonBuilder gb = new GsonBuilder();
			parseGson = gb.create();
		}
		return parseGson;
	};

}
