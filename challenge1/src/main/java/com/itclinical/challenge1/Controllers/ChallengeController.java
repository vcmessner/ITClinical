package com.itclinical.challenge1.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.itclinical.challenge1.Input.Input;
import com.itclinical.challenge1.Services.ChallengeService;

@RestController
public class ChallengeController {
    
    @Autowired
    private ChallengeService challengeService;    
    
    @PostMapping(value = "/ch1")
    public String HandleChallenge( @RequestBody String request) {
        Input in = new Input(request);
        return challengeService.Solve(in);
    }



}
