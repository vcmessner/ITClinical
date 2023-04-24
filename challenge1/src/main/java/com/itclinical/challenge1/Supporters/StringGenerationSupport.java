package com.itclinical.challenge1.Supporters;

import java.util.Random;

public class StringGenerationSupport {

    public String Create_Random_Number_String(int probability, int digits){
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

    public String Create_Random_Alpha_String(int probability, int len){
		String output ="";
		Random ran = new Random();		
		for(int i=0;i<len;++i){
			char mychar = (char) ran.nextInt(26); //26 letras [0,26[
			mychar +=65; // estou na tabela ascii com letra maiuscula
			if(ran.nextInt(100)+1>probability){ //1 ao 100
				mychar = Character.toLowerCase(mychar);
			}
			output+=Character.toString(mychar);
		}
        return output;
    }

    public String Create_Random_AlphaNum_String(int probability, int len){
		String output ="";
		Random ran = new Random();		
		for(int i=0;i<len;++i){
        	char mychar = (char) ran.nextInt(36); //26 letras [0,26[ +10 [0,9[]
			if(mychar>25){ // numero
				output+=Integer.toString(35-mychar);
			}
			else{ //letra
				mychar +=65; // estou na tabela ascii com letra maiuscula
				if(ran.nextInt(100)+1>probability){
					mychar = Character.toLowerCase(mychar);
				}
				output+=Character.toString(mychar);
			}    
		}
        return output;
    }

}
