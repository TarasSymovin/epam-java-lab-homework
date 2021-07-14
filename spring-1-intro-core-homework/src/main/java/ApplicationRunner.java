import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ua.epam.symovin.configs.AppConfig;

import java.util.Arrays;

public class ApplicationRunner {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
