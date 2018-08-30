package com.krstev.servicemaster.service;

import com.krstev.servicemaster.models.PrimeNumbers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.function.IntPredicate;

/**
 * @author fkrstev
 *         Created on 17-Feb-18
 */
@Service
public class APIService {

    private static final Logger logger = LoggerFactory.getLogger(APIService.class);


    private IntPredicate vowel = new IntPredicate() {
        @Override
        public boolean test(int t) {
            return t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u'
                    || t == 'A' || t == 'E' || t == 'I' || t == 'O'
                    || t == 'U';
        }
    };

    public PrimeNumbers primeNumbers(int lowerLimit, int upperLimit) {
        long start = System.currentTimeMillis();
        logger.info("Lower limit : " + lowerLimit + " Upper limit : " + upperLimit);
        List<Integer> primeNumbers = new LinkedList<>();
        int flag = 0;
        for (int i = lowerLimit; i <= upperLimit; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                } else {
                    flag = 1;
                }
            }
            if (flag == 1) {
                primeNumbers.add(i);
            }
        }
        logger.info("Prime numbers : " + primeNumbers.toString());
        logger.info("Time in ms :" + (System.currentTimeMillis() - start));
        return new PrimeNumbers(primeNumbers);
    }

    public int countVowels(String text) {
        logger.info("Received text : " + text);
        long start = System.currentTimeMillis();
        int res = (int) text.chars().filter(vowel).count();
        logger.info("Time in ms :" + (System.currentTimeMillis() - start));
        return res;
    }
}
