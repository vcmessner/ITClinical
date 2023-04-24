package com.itclinical.challenge1.Input;

import com.itclinical.challenge1.Supporters.StringVerificationSupport;

public class Input {
    String text = "";
    int N=0;

    public Input(String string) {
        String[] in = getStrValues(string);        
        text=in[0];
        String n=in[1];
        StringVerificationSupport sup = new StringVerificationSupport();
        if(sup.Validate_is_Num(n)){
            N=Integer.parseInt(n);
        }
    }

    public Input(String string, int num) {
        text=string;
        N = num;
    }
    
    private String[] getStrValues(String string) {
        String[] Splitted = string.split("\"");
        String [] raw_n = Splitted[2].split(" ");
        String text = Splitted[1];
        String n = raw_n[raw_n.length-1];
        String[] Raw_input = {text,n};        
        return Raw_input;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public int getN() {
        return N;
    }
    public void setN(int n) {
        this.N = n;
    }
    
}
