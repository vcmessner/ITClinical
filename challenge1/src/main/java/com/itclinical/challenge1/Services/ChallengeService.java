package com.itclinical.challenge1.Services;

import org.springframework.stereotype.Service;

import com.itclinical.challenge1.Input.Input;

@Service
public class ChallengeService {
    public Boolean isActive(){
        return true;
    } 
    
    public String SolveCh1(Input in){
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

    public String SolveCh2(Input in){
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

    public String SolveCh3(Input in){
        int caracteres[] = new int[130];
        int order[] = new int[130];
        String output="";
        String texto = in.getText();
        int tamanho = texto.length();
        int n = in.getN();
        int order_count =0;
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
                        if(caracteres[a]==0){ // evitar duplicatas
                            order[order_count] = a;
                            ++order_count;
                        }
                        caracteres[a]+=1;
                        output+=a;
                    }
                    pos+=n;
                }
	        }
        }
        int i=0;
        while(order[i]>0){
            String System_out = Character.toString(order[i]) + " = " + caracteres[order[i]]; // ja que nao dá pra ver sysout no junit vejo o valor da variável
            //System.out.println(Character.toString(i) + " = " + caracteres[i]);
            ++i;
        }
        return ("\""+output+"\"");
    }

}
