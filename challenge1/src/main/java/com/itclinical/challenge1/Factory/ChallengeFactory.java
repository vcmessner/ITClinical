package com.itclinical.challenge1.Factory;

import com.itclinical.challenge1.Challenge.Challenge;
import com.itclinical.challenge1.Challenge.Challenge1;
import com.itclinical.challenge1.Challenge.Challenge2;
import com.itclinical.challenge1.Challenge.Challenge3;
import com.itclinical.challenge1.Challenge.Challenge4;
import com.itclinical.challenge1.Input.Input;

public class ChallengeFactory {

    Challenge myChallenge = null; 

    

    public ChallengeFactory(String Num) {
        myChallenge = this.createChallenge(Num);
    }


    public  String SolveChallenge(Input in){
        return myChallenge.solve(in);       
    }   
    

    public Challenge createChallenge(String Num){
        switch(Num) {
            case "1":
                return  new Challenge1(); 
            case "2":
                return  new Challenge2();
            case "3":
                return  new Challenge3();
            case "4":
                return  new Challenge4();
            default:
                return null;
          }
    }
}
