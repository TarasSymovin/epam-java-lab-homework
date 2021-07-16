package ua.epam.symovin.beans;

public class BeanF {
    private String name;
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
