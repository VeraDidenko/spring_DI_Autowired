package com.dependencyInjection.dependencyInjection.answers;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

@Component
public class AnswerEightService implements AnswerService {

    private ArrayList<String> answers = new ArrayList<>(
            Arrays.asList("It is certain.",
                    "It is decidedly so.",
                    "Without a doubt.",
                    "Yes - definitely.",
                    "You may rely on it.",
                    "Reply hazy, try again.",
                    "Ask again later.",
                    "Better not tell you now.",
                    "Don't count on it.",
                    "My reply is no."));

    @Override
    public String giveAnswer() {
        Random randomGenerator = new Random();
        int index = randomGenerator.nextInt(answers.size());
        return answers.get(index);
    }
}
