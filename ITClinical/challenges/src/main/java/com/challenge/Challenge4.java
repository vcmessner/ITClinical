package com.challenge;

public class Challenge4{

    /* Escreva uma função que imprima os números de 1 a 100.

    Para múltiplos de 3, imprima “IT” em vez do número e para múltiplos de 5
    imprima “Clinical”.

    Para múltiplos de 3 e 5 imprima "ITClinical".*/

    private String[] prefixo= {"","","IT"};
  
    String Solve(int value) {
        if(value%3==0 && value%5!=0 ){
                return "IT";
            }
        if(value%5==0){            
            int contador=((value/5)-1)%3;
            return (prefixo[contador]+"Clinical");
        }
        return (Integer.toString(value));
    }

    void print_result(int n){
        int end=n+1;
        for(int i=1;i<end;++i){
            System.out.println(Solve(i));
            }
        }


    public static void main(String[] args){
        Challenge4 Instance = new Challenge4();
        Instance.print_result(100);
	}


}
