package ua.epam.symovin.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class BeanA implements InitializingBean, DisposableBean {
    @NotNull
    private String name;
    @Positive
    private int value;

    @Override
    public void destroy() {
        System.out.println("beanA destroyed");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("beanA initialize");
    }

    @Override
    public String toString() {
        return "BeanA{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
