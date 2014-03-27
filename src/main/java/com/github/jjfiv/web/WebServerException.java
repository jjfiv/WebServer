package com.github.jjfiv.web;

/**
 * @author jfoley.
 */
public class WebServerException extends Exception {
  public WebServerException(Exception reason) {
    super(reason);
  }
}
