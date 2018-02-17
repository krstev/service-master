package com.krstev.servicemaster.service;

import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.function.IntPredicate;

/**
 * @author fkrstev
 * Created on 17-Feb-18
 */
@Service
public class APIService {

    private IntPredicate vowel = new IntPredicate() {
        @Override
        public boolean test(int t) {
            return t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u'
                    || t == 'A' || t == 'E' || t == 'I' || t == 'O'
                    || t == 'U';
        }
    };

    public List<Integer> primeNumbers(int lowerLimit, int upperLimit) {
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
        return primeNumbers;
    }

    public int countVowels(String text) {
        return (int) text.chars().filter(vowel).count();
    }
}
