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
    private ChallengeService MyService;


    @PostMapping(value = "/ch1")
    public String HandleChallenge1( @RequestBody String request) {
        Input in = new Input(request);
        return MyService.solveMychallenge(in, "1");
    }

    @PostMapping(value = "/ch2")
    public String HandleChallenge2( @RequestBody String request) {
        Input in = new Input(request);
        return MyService.solveMychallenge(in, "2");
    }

    @PostMapping(value = "/ch3")
    public String HandleChallenge3( @RequestBody String request) {
        Input in = new Input(request);
        return MyService.solveMychallenge(in, "3");
    }

    @PostMapping(value = "/ch4")
    public String HandleChallenge4( @RequestBody String request) {
        Input in = new Input(request);
        return MyService.solveMychallenge(in, "4");
    }






}
