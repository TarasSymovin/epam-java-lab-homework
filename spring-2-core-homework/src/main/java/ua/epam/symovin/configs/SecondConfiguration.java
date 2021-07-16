package ua.epam.symovin.configs;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;
import ua.epam.symovin.beans.BeanA;
import ua.epam.symovin.beans.BeanE;
import ua.epam.symovin.beans.BeanF;
import ua.epam.symovin.implementation.BeanFactoryPostProcessorImpl;
import ua.epam.symovin.implementation.BeanPostProcessorImpl;

@Configuration
@Import(FirstConfiguration.class)
public class SecondConfiguration {
    @Bean
    public BeanA beanA(){
        return new BeanA();
    }

    @Bean
    public BeanE beanE(){
        return new BeanE();
    }

    @Lazy
    @Bean
    public BeanF beanF(){
        return new BeanF();
    }

    @Bean
    public BeanFactoryPostProcessorImpl beanFactoryImpl(){
        return new BeanFactoryPostProcessorImpl();
    }

    @Bean
    public BeanPostProcessorImpl beanPostProcessorImpl(){
        return new BeanPostProcessorImpl();
    }
}
