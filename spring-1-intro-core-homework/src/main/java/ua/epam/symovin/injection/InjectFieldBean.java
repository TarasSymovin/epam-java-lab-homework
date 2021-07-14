package ua.epam.symovin.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ua.epam.symovin.beans.OtherBeanB;

@Component
public class InjectFieldBean {
    @Autowired
    @Qualifier("otherBeanB")
    private OtherBeanB otherBeanB;

    public void method(){
        System.out.println(otherBeanB);
    }
}
