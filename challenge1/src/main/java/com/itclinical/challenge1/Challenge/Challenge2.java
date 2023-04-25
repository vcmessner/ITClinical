package com.itclinical.challenge1.Challenge;

import com.itclinical.challenge1.Input.Input;

public class Challenge2 implements Challenge {

    public String solve(Input in) {
        String output="";
        String texto = in.getText();
        int tamanho = texto.length();
        int n = in.getN();
        if(n<1){
            return ("\""+output+"\"");
        }       
        else{
            if(tamanho<n){
                return ("\""+output+"\"");
            }
            else{
                int pos = n-1; // começando na posição 0
                char a;
                while(pos<tamanho){
                    a = texto.charAt(pos);
                    if((a<97) || (a>122)){ // melhor do que um and com um não para delimitar o intervalo. 
                        output+=a;
                    }
                    pos+=n;
                }
	        }
        }
        return ("\""+output+"\"");
    }
}
