package com.challenge;

public class Challenge3 {
    private String MyText="";
    private int N=0;
    private String System_out="";
    
    public String getSystem_out() {
        return System_out;
    }

    public void setSystem_out(String system_out) {
        System_out = system_out;
    }

    public Challenge3(String myText, int n) {
        MyText = myText;
        N = n;
    }

    public String getMyText() {
        return MyText;
    }

    public int getN() {
        return N;
    }

    private void setMyText(String myText) {
        MyText = myText;
    }

    private void setN(int n) {
        N = n;
    }

    private void Clear_System_out() {
        System_out = "";
    }


    public String Solve() {
        int len = MyText.length();
        String output="";
        int pos = N-1; // começando na posição 0
        int caracteres[] = new int[130];
        int order[] = new int[130];
        char a;
        int order_count =0;
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
                        if(caracteres[a]==0){ // evitar duplicatas
                            order[order_count] = a;
                            ++order_count;
                        }
                        caracteres[a]+=1;
                        output+=a;
                    }
                    pos+=N;
                }  
            }
        }
        int i =0; 
        Clear_System_out(); // limpa o system out antes de um novo sysout
        while(order[i]>0){
            System_out += Character.toString((char)order[i]) + " = " + caracteres[order[i]] + " "; // ja que nao dá pra ver sysout no junit vejo o valor da variável
            System.out.println(Character.toString((char)order[i]) + " = " + caracteres[order[i]]);
            ++i;
        }
        return output;    
    }


    public static void main(String[] args){
        Challenge3 myChallenge = new Challenge3("ItCLINiCAL",1);
        myChallenge.Solve(); 
		
	
	}

    
}
