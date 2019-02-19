package com.dependencyInjection.dependencyInjection.answers;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

@Component
public class AnswerNineService implements AnswerService {

    private ArrayList<String> answers = new ArrayList<>(
            Arrays.asList("As I see it, yes.",
                    "Most likely.",
                    "Outlook good.",
                    "Yes.",
                    "Signs point to yes.",
                    "Cannot predict now.",
                    "Concentrate and ask again.",
                    "My sources say no.",
                    "Outlook not so good.",
                    "Very doubtful."));

    @Override
    public String giveAnswer() {
        Random randomGenerator = new Random();
        int index = randomGenerator.nextInt(answers.size());
        return answers.get(index);
    }
}
