package com.challenge;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Challenge1Test {
    Challenge1 myChallenge1 = new Challenge1();
    
    @Test
    void test_my_Challenge(){
        assertTrue(myChallenge1.Solve(0).equals("Challenge1"));

    }
    
}
