package com.challenge;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.challenge.Support.StringGenerationSupport;
import com.challenge.Support.StringVerificationSupport;

public class CHallenge2Test {
    StringVerificationSupport verificator = new StringVerificationSupport();
	StringGenerationSupport GenStr = new StringGenerationSupport();
    
    
    @Test
    void test_input_Challenge(){
        String text = "ITCLiNicAl";
        int N = 1;
        Challenge2 myChallenge2 =new Challenge2(text, N);
        assertTrue(myChallenge2.getMyText().equals(text));
        assertTrue(myChallenge2.getN()==N);
    }

    @ParameterizedTest
    @ValueSource(ints =  {1, 2, 3})
    void test__Challenge2_Valid_Input_Values(int N){
        String text = "ITCLiNicAl";
        Challenge2 myChallenge =new Challenge2(text, N);
        switch(N){
            case 1:
                assertTrue(myChallenge.Solve().equals("ITCLNA"));
                break;
            case 2:
                assertTrue(myChallenge.Solve().equals("TLN"));
                break;
            case 3:
                assertTrue(myChallenge.Solve().equals("CNA"));
                break;
        }
    }

    @ParameterizedTest
    @ValueSource(ints =  {1, 2, 3})
    void test__Challenge2_Special_Character_Valid_Input_Values(int N){
        String text = "!tCL1Nical";
        Challenge2 myChallenge =new Challenge2(text, N);
        switch(N){
            case 1:
                assertTrue(myChallenge.Solve().equals("!CL1N"));
                break;
            case 2:
                assertTrue(myChallenge.Solve().equals("LN"));
                break;
            case 3:
                assertTrue(myChallenge.Solve().equals("CN"));
                break;
        }
    }


    @RepeatedTest(10)
    void test__Challenge2_Invalid_Greater_Input_Values(){
        String text = "ITCLiNicAl";
        Random ran = new Random();
        int N= ran.nextInt(10)+text.length();
        Challenge2 myChallenge2 =new Challenge2(text, N);
        assertTrue(myChallenge2.Solve().equals(""));
    }

    @RepeatedTest(10)
    void test__Challenge2_Invalid_Lower_Input_Values(){
        String text = "ITCLiNicAl";
        Random ran = new Random();
        int N= -ran.nextInt(text.length());
        Challenge2 myChallenge2 =new Challenge2(text, N);
        assertTrue(myChallenge2.Solve().equals(""));
    }



    @RepeatedTest(1000)
    void test_Assert_Number_as_Integer(){
		String output = GenStr.Create_Random_Number_String(50,1);
		assertFalse(verificator.Validate_isAlpha(output));
		assertFalse(verificator.Validate_isLowerCaseAlpha(output));
		assertFalse(verificator.Validate_isUpperCaseAlpha(output));
		assertTrue(verificator.Validate_is_Num(output));
	}

    @RepeatedTest(1000)
    void test_Assert_String_as_LowerCaseAlpha(){
        String output = GenStr.Create_Random_Alpha_String(0, 1);
		assertTrue(verificator.Validate_isAlpha(output));
		assertTrue(verificator.Validate_isLowerCaseAlpha(output));
		assertFalse(verificator.Validate_isUpperCaseAlpha(output));
		assertFalse(verificator.Validate_is_Num(output));
		assertFalse(verificator.Validate_is_Pos_Num(output));
		assertFalse(verificator.Validate_isUpperCaseAlNum(output));
	}


    @RepeatedTest(1000)
    void test_Assert_String_as_UpperCaseAlpha(){
		String output = GenStr.Create_Random_Alpha_String(100, 1);
		assertTrue(verificator.Validate_isAlpha(output));
		assertTrue(verificator.Validate_isUpperCaseAlpha(output));
		assertFalse(verificator.Validate_isLowerCaseAlpha(output));
		assertFalse(verificator.Validate_is_Num(output));
		assertFalse(verificator.Validate_is_Pos_Num(output));
		assertFalse(verificator.Validate_isLowerCaseAlNum(output));
	}

	@RepeatedTest(1000)
    void test_Assert_String_as_LowerCaseAlphaNum(){
        String output = GenStr.Create_Random_AlphaNum_String(0,1);
		assertFalse(verificator.Validate_isUpperCaseAlpha(output));
        assertTrue(verificator.Validate_isLowerCaseAlNum(output));
	}

    @RepeatedTest(1000)
    void test_Assert_String_as_UpperCaseAlphaNum(){
        String output = GenStr.Create_Random_AlphaNum_String(100,1);
		assertFalse(verificator.Validate_isLowerCaseAlpha(output));
		assertTrue(verificator.Validate_isUpperCaseAlNum(output)); 
    }


    



}
