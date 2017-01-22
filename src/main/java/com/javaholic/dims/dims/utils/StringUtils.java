package com.javaholic.dims.dims.utils;

import java.util.UUID;

public class StringUtils {

	public static String getRandomString() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
	
}
