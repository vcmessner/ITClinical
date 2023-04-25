package com.challenge;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Challenge4Test {
    Challenge4 myChallenge4 = new Challenge4();
    
    @Test
    void test_my_Challenge(){
        assertTrue(myChallenge4.Solve(0).equals("Challenge4"));

    }
}
