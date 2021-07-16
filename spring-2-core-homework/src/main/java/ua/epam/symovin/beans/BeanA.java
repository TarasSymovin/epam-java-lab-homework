package ua.epam.symovin.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanA implements InitializingBean, DisposableBean {
    private String name;
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
