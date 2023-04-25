package com.itclinical.challenge1.Challenge;

import com.itclinical.challenge1.Input.Input;

public class Challenge4 implements Challenge {

    public String solve(Input in) {
        int cont=0;
        String[] prefixo= {"","","it"};
        String output = "";

        for(int i = 1;i<101;++i){
            if((i%3)==0 || (i%5)==0){
                if((i%3==0) && (i%5!=0)){
                    output+="it";
                }
                else{
                    output+=(prefixo[cont]+"clinical");
                    cont+=1;
                    cont=cont%3;
                }
            }
            else{
                output+=i;
            }
        output+="\n";
        }
        System.out.println(output);
        return output;
    }
}
