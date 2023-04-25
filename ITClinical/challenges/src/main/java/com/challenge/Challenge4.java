package com.challenge;

public class Challenge4{

    /* Escreva uma função que imprima os números de 1 a 100.

    Para múltiplos de 3, imprima “IT” em vez do número e para múltiplos de 5
    imprima “Clinical”.

    Para múltiplos de 3 e 5 imprima "ITClinical".*/

    public String[] prefixo= {"","","IT"};
  
    public String Solve(int value) {
        if(value%3==0 && value%5!=0 ){
                return "IT";
            }
        if(value%5==0){            
            int contador=((value/5)-1)%3;
            return (prefixo[contador]+"Clinical");
        }
        return (Integer.toString(value));
    }

    void print_result(){
        for(int i=0;i<101;++i){
            if(Solve(i).equals("")){

            }
            //String[] prefixo= {"","","it"};

        }
    }



    public static void main(String[] args){

		System.out.println("Hello, World! from Challenge4");
	
	}


}
