package com.javaholic.dims.hglee.demon.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {

	private ServerSocket server;
	
	public SimpleServer(int port) throws IOException {
		server = new ServerSocket(port);
	}
	
	public void run() {
		Runnable acceptor = new Runnable() {
			@Override
			public void run() {
				while(true)
				{
					try
					{
						Socket client = server.accept();
						request(client);
					}
					catch (IOException e)
					{
						e.printStackTrace();
					}
				}
			}
		};
		
		new Thread(acceptor).start();
	}
	
	public void request(final Socket client) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				try 
				{
					BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream(), "UTF-8"));
					PrintWriter bw = new PrintWriter(new OutputStreamWriter(client.getOutputStream(), "UTF-8"));
					
					String input = br.readLine();
					
					String index = "{\"key\":\"value\"}";
					System.out.println(input);
					bw.println("HTTP/1.1 200 OK");
					bw.println("Content-Type: application/json");
					bw.println("Content-Length: "+index.getBytes().length);
					bw.println();
					bw.println(index);
					bw.flush();
					bw.close();
					client.close();
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}).start();
		
		
		
		
	}
	
}
