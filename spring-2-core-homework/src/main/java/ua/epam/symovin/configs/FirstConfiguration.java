package ua.epam.symovin.configs;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import ua.epam.symovin.beans.BeanB;
import ua.epam.symovin.beans.BeanC;
import ua.epam.symovin.beans.BeanD;

@Configuration
public class FirstConfiguration {
    @Bean(initMethod = "init", destroyMethod = "destroy")
    @DependsOn("beanD")
    @ConfigurationProperties(prefix = "b")
    public BeanB beanB(){
        return new BeanB();
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    @ConfigurationProperties(prefix = "c")
    @DependsOn("beanB")
    public BeanC beanC(){
        return new BeanC();
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    @ConfigurationProperties(prefix = "d")
    public BeanD beanD(){
        return new BeanD();
    }
}
