package ua.epam.symovin.injection;

import org.springframework.stereotype.Component;
import ua.epam.symovin.beans.OtherBeanA;

@Component
public class InjectConstructorBean {
    private OtherBeanA otherBeanA;

    public InjectConstructorBean(OtherBeanA otherBeanA) {
        this.otherBeanA = otherBeanA;
    }

    public void method(){
        System.out.println(otherBeanA);
    }
}
