package com.krstev.servicemaster.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

/**
 * Created by fkrstev | 8/6/18.
 */

@RestController
@RequestMapping("/google/v1")
public class GoogleMockResourceV1 {

  private static final Logger logger = LoggerFactory.getLogger(GoogleMockResourceV1.class);

  @RequestMapping("/web")
  public String googleWeb(@PathParam(value = "search") String search) {
    return "Results from Google Web for : " + search + " !";
  }

  @RequestMapping("/image")
  public String googleImage(@PathParam(value = "search") String search) {
    return "Results from Google Image for : " + search + " !";
  }

  @RequestMapping("/video")
  public String googleVideo(@PathParam(value = "search") String search) {
    return "Results from Google Video for : " + search + " !";
  }

}
