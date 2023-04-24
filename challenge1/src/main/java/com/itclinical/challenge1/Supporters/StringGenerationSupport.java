package com.itclinical.challenge1.Supporters;

import java.util.Random;

public class StringGenerationSupport {

    public String create_random_number_String(int probability, int digits){
        String output ="";
		Random ran = new Random();
        if(ran.nextInt(100)+1>probability){
			output+="-";
		}
        for(int i=0;i<digits;++i){
        	output+=Integer.toString(ran.nextInt(10)); //[0,9[		
	    } 
        return output; 
    }
}
