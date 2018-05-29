package com.tomasmichalkevic.javajokes;

import java.util.Random;

public class Jokes {

    //Jokes taken from https://www.rd.com/funny-stuff/short-jokes/

    public Jokes(){
        initJokes();
    }

    private String[] jokes = new String[3];

    public String getJoke(){
        Random random = new Random();
        return jokes[random.nextInt(2)];
    }

    public void initJokes(){
        jokes[0] = "What's the best thing about Switzerland? I don't know, but the flag is a big plus.";
        jokes[1] = "I invented a new word! Plagiarism!";
        jokes[2] = "Did you hear about the claustrophobic astronaut? He just needed a little space.";
    }
}
