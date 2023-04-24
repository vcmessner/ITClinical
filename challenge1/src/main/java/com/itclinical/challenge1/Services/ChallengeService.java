package com.itclinical.challenge1.Services;

import org.springframework.stereotype.Service;

import com.itclinical.challenge1.Input.Input;

@Service
public class ChallengeService {
    public Boolean isActive(){
        return true;
    } 
    
    public String Solve(Input in){
        String resp="";
        String output="";
        String texto = in.getText();
        int tamanho = texto.length();
        int n = in.getN();
        if(n<1){
            output= resp; 
        }       
        else{
            if(tamanho<n){
                output= resp;
            }
            else{
                int pos = n-1; // começando na posição 0
                char a;
                while(pos<tamanho){
                    a = texto.charAt(pos);
                    if(Character.isUpperCase(a))
                    resp+=a;
                    pos+=n;
                }
                output=resp;
	        }
        }
        return ("\""+output+"\"");  }
}
