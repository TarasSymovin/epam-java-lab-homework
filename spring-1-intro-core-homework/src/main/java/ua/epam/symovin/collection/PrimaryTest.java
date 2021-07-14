package ua.epam.symovin.collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PrimaryTest {
    private Flyable flyable;
    private Flyable bird;
    private Flyable helicopter;

    @Autowired
    public PrimaryTest(Flyable flyable) {
        this.flyable = flyable;
    }

    public void testMethod(){
        flyable.fly();
        bird.fly();
        helicopter.fly();
    }

    @Autowired
    @Qualifier("bird")
    public void setBird(Flyable bird) {
        this.bird = bird;
    }

    @Autowired
    @Qualifier("helicopter")
    public void setHelicopter(Flyable helicopter) {
        this.helicopter = helicopter;
    }
}
