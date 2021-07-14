import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ua.epam.symovin.beans3.BeanD;
import ua.epam.symovin.configs.AppConfigFirst;

import java.util.Arrays;

public class ApplicationRunner {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfigFirst.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

    }
}
