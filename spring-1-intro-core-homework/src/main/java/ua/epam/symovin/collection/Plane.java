package ua.epam.symovin.collection;

import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
@Primary
public class Plane implements Flyable{
    @Override
    public void fly() {
        System.out.println("Start from runway");
    }
}
