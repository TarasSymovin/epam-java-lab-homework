package ua.epam.symovin.beans;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class BeanC {
    @NotNull
    private String name;
    @Positive
    private int value;

    private void init(){
        System.out.println("initMethod for BeanC!");
    }

    private void destroy() {
        System.out.println("destroyMethod for BeanC!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "BeanC{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
