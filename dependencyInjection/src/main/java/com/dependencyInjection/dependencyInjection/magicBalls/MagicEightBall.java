package com.dependencyInjection.dependencyInjection.magicBalls;

import com.dependencyInjection.dependencyInjection.SpringConfig;
import com.dependencyInjection.dependencyInjection.answers.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;

@Component
@ContextConfiguration(classes = {SpringConfig.class})
public class MagicEightBall implements MagicBallService{

    private AnswerService answerService;

    @Autowired
    public MagicEightBall(@Qualifier("AnswerEightService") AnswerService answerService) {
        this.answerService = answerService;
    }

    @Override
    public String getName() {
        return "*** Magic 8 Ball ***";
    }

    @Override
    public String shake() {
        return answerService.giveAnswer();
    }
}
