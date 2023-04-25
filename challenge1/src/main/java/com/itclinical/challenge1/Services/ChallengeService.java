package com.itclinical.challenge1.Services;

import org.springframework.stereotype.Service;

import com.itclinical.challenge1.Factory.ChallengeFactory;
import com.itclinical.challenge1.Input.Input;

@Service
public class ChallengeService {

    public Boolean isActive(){
        return true;
    } 

    public String solveMychallenge(Input in,String n){
        ChallengeFactory CF = new ChallengeFactory(n);
        return CF.SolveChallenge(in);
    }
    
}       
