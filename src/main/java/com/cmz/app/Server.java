package com.cmz.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Server {
	public static void main(String[] args) throws Exception {
		new ClassPathXmlApplicationContext(new String[] { "com/cmz/server.xml", "com/cmz/jms.xml" });
	}
}
