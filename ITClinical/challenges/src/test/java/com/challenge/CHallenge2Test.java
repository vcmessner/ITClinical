package com.challenge;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CHallenge2Test {
    Challenge2 myChallenge2 = new Challenge2();
    
    @Test
    void test_my_Challenge(){
        assertTrue(myChallenge2.Solve(0).equals("Challenge2"));

    }
    
}
