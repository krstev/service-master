package com.krstev.servicemaster.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.Random;

/**
 * Created by fkrstev | 8/6/18.
 */

@RestController
@RequestMapping("/google/v2")
public class GoogleMockResourceV2 {

  private static final Logger logger = LoggerFactory.getLogger(com.krstev.servicemaster.resource.GoogleMockResourceV2.class);

  @RequestMapping("/web")
  public String googleWeb(@PathParam(value = "search") String search) throws InterruptedException {
    sleepUpTo500Millis();
    return "Results from Google Web for : " + search + " !";
  }

  @RequestMapping("/image")
  public String googleImage(@PathParam(value = "search") String search) throws InterruptedException {
    sleepUpTo500Millis();
    return "Results from Google Image for : " + search + " !";
  }

  @RequestMapping("/video")
  public String googleVideo(@PathParam(value = "search") String search) throws InterruptedException {
    sleepUpTo500Millis();
    return "Results from Google Video for : " + search + " !";
  }

  private void sleepUpTo500Millis() throws InterruptedException {
    Thread.sleep((new Random().nextInt(3) + 2) * 100);
  }
}
