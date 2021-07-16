package ua.epam.symovin.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanE {
    private String name;
    private int value;

    @PostConstruct
    private void postConstructMethod(){
        name = "default";
        value = 18;
        System.out.println("PostConstruct executed");
    }

    @PreDestroy
    private void preDestroyMethod(){
        System.out.println("PreDestroy executed");
    }

    @Override
    public String toString() {
        return "BeanE{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
