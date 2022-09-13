package com.pentacats.animal.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class StringUtilsTest {

	@Test
	public void 게시판_깊이_테스트(){
		String result = StringUtils.convertDepthByLevel("test",3);

		Assertions.assertThat(result).isEqualTo("   test");
	}

	@Test
	public void 게시판_깊이_테스트2(){
		String result = StringUtils.convertDepthByLevel("test",3, "*");

		Assertions.assertThat(result).isEqualTo("***test");
	}

}