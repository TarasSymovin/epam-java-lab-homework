package ua.epam.symovin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ua.epam.symovin.beans.BeanB;

@SpringBootApplication
public class ApplicationRunner {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ApplicationRunner.class, args);
        System.out.println(context.getBean(BeanB.class));
    }
}
