package ua.epam.symovin.beans;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class BeanF {
    @NotNull
    private String name;
    @Positive
    private int value;

    public BeanF() {
        System.out.println("beanF created!");
    }

    @Override
    public String toString() {
        return "BeanF{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
