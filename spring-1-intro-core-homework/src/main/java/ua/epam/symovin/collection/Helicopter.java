package ua.epam.symovin.collection;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class Helicopter implements Flyable{
    @Override
    public void fly() {
        System.out.println("Start from helipad");
    }
}
