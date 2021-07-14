package ua.epam.symovin.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.epam.symovin.beans.OtherBeanC;

@Component
public class InjectSetterBean {
    private OtherBeanC otherBeanC;

    @Autowired
    public void setOtherBeanC(OtherBeanC otherBeanC) {
        this.otherBeanC = otherBeanC;
    }

    public void method(){
        System.out.println(otherBeanC);
    }
}
