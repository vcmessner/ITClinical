package com.challenge;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Challenge1Test {
    
    @Test
    void test_input_Challenge(){
        String text = "ITCLiNicAl";
        int N = 1;
        Challenge1 myChallenge1 =new Challenge1(text, N);
        assertTrue(myChallenge1.getMyText().equals(text));
        assertTrue(myChallenge1.getN()==N);
    }




    
}
