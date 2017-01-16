package com.javaholic.dims.dims.utils;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ResponseUtils {

	private static final String CHARSET = "UTF-8";

	private static final String MIME_JSON = "application/json";
	/*
	 *  text/plain
		text/html
		image/jpeg
		image/png
		audio/mpeg
		audio/ogg
		audio/*
		video/mp4
		application/octet-stream
		https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/MIME_types/Complete_list_of_MIME_types
		...
	 * */
	
	public static void jsonResponse(HttpServletResponse response, Object obj) throws IOException {
		response.setCharacterEncoding(CHARSET);
		response.setContentType(MIME_JSON);
		ObjectMapper mapper = new ObjectMapper();
		response.getWriter().println(mapper.writeValueAsString(obj));
	}
	
}
