package com.challenge;

public class Challenge1 {
    String MyText="";
    int N=0;

    public Challenge1(String myText, int n) {
        MyText = myText;
        N = n;
    }
    
    public String getMyText() {
        return MyText;
    }

    public void setMyText(String myText) {
        MyText = myText;
    }
    
    public int getN() {
        return N;
    }

    public void setN(int n) {
        N = n;
    }


    public String Solve() {
       int len = MyText.length();
       String output="";
       int pos = N-1; // começando na posição 0
       char a;
       while(pos<len){
           a = MyText.charAt(pos);
           if(Character.isUpperCase(a))
           output+=a;
           pos+=N;
       }
       return output;

    }

    


    public static void main(String[] args){
		System.out.println("Hello, World!");
	
	}

}
