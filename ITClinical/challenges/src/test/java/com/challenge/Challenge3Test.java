package com.challenge;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Challenge3Test {
    Challenge3 myChallenge3 = new Challenge3();
    
    @Test
    void test_my_Challenge(){
        assertTrue(myChallenge3.Solve(0).equals("Challenge3"));

    }
    
}
