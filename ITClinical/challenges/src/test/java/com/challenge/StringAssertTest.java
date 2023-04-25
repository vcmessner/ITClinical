package com.challenge;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.RepeatedTest;

import com.challenge.Support.StringGenerationSupport;
import com.challenge.Support.StringVerificationSupport;

public class StringAssertTest {
    private StringVerificationSupport verificator = new StringVerificationSupport();
	private StringGenerationSupport GenStr = new StringGenerationSupport();

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
