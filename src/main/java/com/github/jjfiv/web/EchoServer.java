package com.github.jjfiv.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class EchoServer {
  public static void main(String[] args) throws WebServerException {
    WebServer server = WebServer.start(1234, new WebHandler() {
      @Override
      public void handle(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String path = request.getPathInfo();
        String method = request.getMethod();
        if(path.equals("/") && method.equals("GET")) {
          PrintWriter out = response.getWriter();
          out.println(request.getQueryString());
          out.close();
          response.setStatus(200); // OK
        } else {
          response.sendError(400, "Bad Request to "+method+" "+path);
        }
      }
    });

    System.out.println("Server started at: " + server.getURL());
    server.join();
  }
}
