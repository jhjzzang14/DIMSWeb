package com.javaholic.dims.hglee.demon.test;

import java.io.IOException;

import com.javaholic.dims.hglee.demon.server.SimpleServer;

public class TestContext {

	public static void main(String[] args) throws IOException {
		
		SimpleServer server = new SimpleServer(8080);
		server.run();
		
	}
	
}
