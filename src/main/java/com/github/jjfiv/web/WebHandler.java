package com.github.jjfiv.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author jfoley.
 */
public interface WebHandler {
  void handle(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
