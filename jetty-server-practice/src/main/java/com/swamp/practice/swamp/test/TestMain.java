package com.swamp.practice.swamp.test;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.util.Jetty;
import org.eclipse.jetty.webapp.WebAppContext;

public class TestMain {

	public static void main(String[] args) throws Exception {

		Server server = new Server(8585);
		WebAppContext context = new WebAppContext();
//		context.setContextPath("./page/index.jsp");
		context.setResourceBase("./page");
		server.setHandler(context);
		server.start();
	}

}
