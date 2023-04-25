package com.challenge;

public class Challenge4{

    /* Escreva uma função que imprima os números de 1 a 100.

    Para múltiplos de 3, imprima “IT” em vez do número e para múltiplos de 5
    imprima “Clinical”.

    Para múltiplos de 3 e 5 imprima "ITClinical".*/

  
    public String Solve(int value) {
       if(value%3==0){
        return "IT";
       }
       else{
        if(value%5==0){
            return "Clinical";
        }
       }
       return "";
        
    }


    public static void main(String[] args){
		System.out.println("Hello, World! from Challenge4");
	
	}


}
