package com.krstev.servicemaster.resource;

import com.krstev.servicemaster.models.PrimeNumbers;
import com.krstev.servicemaster.service.APIService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.Random;

/**
 * @author fkrstev
 * Created on 13-Feb-18
 */
@RestController
public class APIResource {

  private static final Logger logger = LoggerFactory.getLogger(APIResource.class);

  @Autowired
  private APIService apiService;

  private int uniqueId = new Random().nextInt(1000);


  @RequestMapping("/info")
  public String info() {
    return " NumberResource@" + uniqueId;
  }

  @RequestMapping("/nextInt")
  public int randomInt() {
    return new Random().nextInt(100);
  }

  @RequestMapping("/primeNumbers")
  public PrimeNumbers primeNumbers(@PathParam(value = "lower") int lower, @PathParam(value = "upper") int upper) {
    return apiService.primeNumbers(lower, upper);
  }

  @RequestMapping("/countVowels")
  public int countVowels(@PathParam(value = "text") String text) {
    logger.info("Counting vowels, text : " + text);
    return apiService.countVowels(text);
  }


}
