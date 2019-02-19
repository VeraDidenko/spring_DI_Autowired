package com.dependencyInjection.dependencyInjection;

import com.dependencyInjection.dependencyInjection.answers.AnswerEightService;
import com.dependencyInjection.dependencyInjection.answers.AnswerNineService;
import com.dependencyInjection.dependencyInjection.answers.AnswerService;
import com.dependencyInjection.dependencyInjection.magicBalls.MagicBallService;
import com.dependencyInjection.dependencyInjection.magicBalls.MagicEightBall;
import com.dependencyInjection.dependencyInjection.magicBalls.MagicNineBall;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean(name="AnswerEightService")
    public AnswerService AnswerEightService(){
        return new AnswerEightService();
    }

    @Bean(name="AnswerNineService")
    public AnswerService AnswerNineService(){
        return new AnswerNineService();
    }

    @Bean(name="magicNineBall")
    public MagicBallService MagicNineBall(){
        return new MagicNineBall();
    }

    @Bean(name="magicEightBall")
    public MagicBallService MagicEightBall() {
        return new MagicEightBall(AnswerEightService());
    }

    @Bean(name="allMagicBalls")
    public AllMagicBalls AllMagicBalls(){
        return new AllMagicBalls();
    }
}
