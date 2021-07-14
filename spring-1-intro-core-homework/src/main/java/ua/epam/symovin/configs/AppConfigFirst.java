package ua.epam.symovin.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "ua.epam.symovin.beans1")
@Import(AppConfigSecond.class)
public class AppConfigFirst {
}
