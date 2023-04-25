package com.challenge;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/* Escreva uma função que imprima os números de 1 a 100.

    Para múltiplos de 3, imprima “IT” em vez do número e para múltiplos de 5
    imprima “Clinical”.

    Para múltiplos de 3 e 5 imprima "ITClinical".*/

class Challenge4Test {
    Challenge4 myChallenge4 = new Challenge4();
    
    @Test
    void test_my_Challenge(){
        //assertTrue(myChallenge4.Solve(0).equals("Challenge4"));
    }

    @ParameterizedTest
    @ValueSource(ints =  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100})
    void test_IT_return(int n){
        if(n%3==0 && n%5!=0){
            assertTrue(myChallenge4.Solve(n).equals("IT"));
        }
        if(n%5==0 && n%3!=0){
            assertTrue(myChallenge4.Solve(n).equals("Clinical"));
        }
        if(n%5==0 && n%3==0){
            assertTrue(myChallenge4.Solve(n).equals("ITClinical"));
        }


    }
}
