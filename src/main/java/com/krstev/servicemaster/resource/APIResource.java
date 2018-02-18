package com.krstev.servicemaster.resource;

import com.krstev.servicemaster.models.PrimeNumbers;
import com.krstev.servicemaster.service.APIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.serviceregistry.EurekaRegistration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Random;

/**
 * @author fkrstev
 * Created on 13-Feb-18
 */
@RestController
public class APIResource {

    @Autowired
    private APIService apiService;

    @Autowired
    private EurekaRegistration registration;

    @RequestMapping("/info")
    public String info() {
        return " NumberResource@" + registration.getPort();
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
        return apiService.countVowels(text);
    }

}
