package com.challenge;

public class Challenge2 {
     String MyText="";
    int N=0;
    
    public Challenge2(String myText, int n) {
        MyText = myText;
        N = n;
    }

    public String getMyText() {
        return MyText;
    }

    private void setMyText(String myText) {
        MyText = myText;
    }
    
    public int getN() {
        return N;
    }

    private void setN(int n) {
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
		System.out.println("Hello, World! from Challenge2");
	
	}

  
}
