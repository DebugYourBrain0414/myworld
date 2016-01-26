package com.myworld.jetty;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class JettyServer {

	public static void main(String[] args) throws Exception {
		Server server = new Server(6060);

    WebAppContext ctx = new WebAppContext();
    ctx.setResourceBase("src/main/webapp");
    
    server.setHandler(ctx);
    server.start();
    server.join();
	}
}
