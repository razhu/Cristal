package com.casasmap.cristal;

import java.util.Random;

/**
 * Created by ramiro on 10/23/15.
 */
public class CristalBall {
    private String[] answers = {"no carajo", "si carajo", "imposible", "puta"};
    private Random randomAnswer = new Random();
    public String getAnswer() {
        return answers[randomAnswer.nextInt(answers.length)];
    }

}
