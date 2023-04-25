package com.challenge;

public class Challenge3 {
    String MyText="";
    int N=0;
    
    public Challenge3(String myText, int n) {
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
        if(N<1){
            return output; 
        }       
        else{
            if(len<N){
                return output;
            }
            else{
                while(pos<len){
                    a = MyText.charAt(pos);
                    if((a<97) || (a>122)){
                        output+=a;
                    }
                    pos+=N;
                }
                return output;   
            }
        }     
    }


    public static void main(String[] args){
		System.out.println("Hello, World! from Challenge3");
	
	}

    
}
