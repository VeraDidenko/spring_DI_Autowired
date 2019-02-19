package com.dependencyInjection.dependencyInjection;

import com.dependencyInjection.dependencyInjection.magicBalls.MagicBallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class AllMagicBalls {

    private Collection<MagicBallService> magicBallList;

    @Autowired
    public void setMagicBallList(Collection<MagicBallService> magicBallList) {
        this.magicBallList = magicBallList;
    }

    void show() {
        for (MagicBallService magicBall : magicBallList) {
            System.out.println(magicBall.getName() + " " + magicBall.shake());
        }
    }

}
