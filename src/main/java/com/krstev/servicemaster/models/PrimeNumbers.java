package com.krstev.servicemaster.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author fkrstev
 *         Created on 17-Feb-18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrimeNumbers {
    private List<Integer> primeNumbers;
}
