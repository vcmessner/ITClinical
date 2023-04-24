package com.itclinical.challenge1.Services;

import org.springframework.stereotype.Service;

import com.itclinical.challenge1.Input.Input;

@Service
public class ChallengeService {
    public Boolean isActive(){
        return true;
    } 
    
    public String Solve(Input in){
        return in.getText();
    }
}
