package com.itclinical.challenge1;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.itclinical.challenge1.Input.Input;
import com.itclinical.challenge1.Services.ChallengeService;
import com.itclinical.challenge1.Supporters.StringGenerationSupport;
import com.itclinical.challenge1.Supporters.StringVerificationSupport;

@SpringBootTest
class Challenge1ApplicationTests {
	StringVerificationSupport verificator = new StringVerificationSupport();
	StringGenerationSupport GenStr = new StringGenerationSupport();

@RepeatedTest(1000)
    void test_Assert_Number_as_Integer(){
		String output = GenStr.Create_Random_Number_String(50,10);
		assertFalse(verificator.Validate_isAlpha(output));
		assertFalse(verificator.Validate_isLowerCaseAlpha(output));
		assertFalse(verificator.Validate_isUpperCaseAlpha(output));
		assertTrue(verificator.Validate_is_Num(output));
		//assertTrue(verificator.Validate_is_Pos_Num(resp));
		//assertTrue(verificator.Validate_isUpperCaseAlNum(resp));
		//assertTrue(verificator.Validate_LowerCaseAlNum(resp));
		//assertTrue(verificator.Validate_isAlNum(resp));
	}

@RepeatedTest(1000)
    void test_Assert_String_as_LowerCaseAlpha(){
        String output = GenStr.Create_Random_Alpha_String(0, 10);
		assertTrue(verificator.Validate_isAlpha(output));
		assertTrue(verificator.Validate_isLowerCaseAlpha(output));
		assertFalse(verificator.Validate_isUpperCaseAlpha(output));
		assertFalse(verificator.Validate_is_Num(output));
		assertFalse(verificator.Validate_is_Pos_Num(output));
		assertFalse(verificator.Validate_isUpperCaseAlNum(output));
		//assertTrue(verificator.Validate_isLowerCaseAlNum(N));
		//assertTrue(verificator.Validate_isAlNum(N));
	}

@RepeatedTest(1000)
    void test_Assert_String_as_UpperCaseAlpha(){
		String output = GenStr.Create_Random_Alpha_String(100, 10);
		assertTrue(verificator.Validate_isAlpha(output));
		assertTrue(verificator.Validate_isUpperCaseAlpha(output));
		assertFalse(verificator.Validate_isLowerCaseAlpha(output));
		assertFalse(verificator.Validate_is_Num(output));
		assertFalse(verificator.Validate_is_Pos_Num(output));
		assertFalse(verificator.Validate_isLowerCaseAlNum(output));
	}

	@RepeatedTest(1000)
    void test_Assert_String_as_LowerCaseAlphaNum(){
        String output = GenStr.Create_Random_AlphaNum_String(0,10);
		assertFalse(verificator.Validate_isUpperCaseAlpha(output));
		assertFalse(verificator.Validate_isUpperCaseAlNum(output));
		assertTrue(verificator.Validate_isLowerCaseAlNum(output));
	}

	@RepeatedTest(1000)
    void test_Assert_String_as_UpperCaseAlphaNum(){
        String output = GenStr.Create_Random_AlphaNum_String(100,10);
		assertFalse(verificator.Validate_isLowerCaseAlpha(output));
		assertFalse(verificator.Validate_isLowerCaseAlNum(output));
		assertTrue(verificator.Validate_isUpperCaseAlNum(output));
	}

    @Test
    void test_create_input(){ 
		/*               TODO 
            create a Input 
			asserttrue matching values
    	 */ 
		Input in = new Input("\"ITCLiNicAl\" and N = 1");
        assertTrue(in.getText().equals("ITCLiNicAl")); 
		assertTrue(in.getN()==1);
		assertTrue(Integer.class.isInstance(in.getN())); 
    }
	

    @Test
    void test_post_request_contents(){
		String Body ="\"ITCLiNicAl\" and N = 1";
        Input in = new Input(Body);		
        assertTrue(in.getText().equals("ITCLiNicAl"));
        assertTrue(in.getN()==1);       
    }  


	@Test
    void test_create_service(){
		ChallengeService challengeService = new ChallengeService();
        assertTrue(challengeService.isActive());
    }

	@Test
    void test_Challenge1_service(){
		ChallengeService challengeService = new ChallengeService();
        String Body ="\"ITCLiNicAl\" and N = 1";
        Input in = new Input(Body);	
		String output = challengeService.Solve(in);
		assertTrue(output.equals("\"ITCLNA\""));

    }


    @RepeatedTest(1000)
    void test_Solve_Invalid_Input_Challenge(){
        /*               TODO 
            Automate Incorrect input generation 
            All lowercase, Lowercase Alphanum and num inputs
            assert false with the problem solver
            */
    }

    @Test 
    void test_Solve_Valid_Input_Challenge(){
        /*               TODO 
            Automate valid input generation 
            All upercase, Upercase Alphanum
            assert true with the problem solver
            */
    }

    @Test 
    void test_Solve_Custom_Input_Challenge(){
        /*               TODO 
            Solve given custom problem inputs 
            assert true with the expected outputs
            */
    }






    
    
}
