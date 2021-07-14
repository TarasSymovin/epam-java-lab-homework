package ua.epam.symovin.collection;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FlyableContainer {
    private final List<Flyable> flyableList;

    public FlyableContainer(List<Flyable> flyableList) {
        this.flyableList = flyableList;
    }

    public void startFly(){
        flyableList.forEach(Flyable::fly);
    }
}