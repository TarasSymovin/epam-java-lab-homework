package ua.epam.symovin.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AppConfigFirst.class, AppConfigSecond.class})
@ComponentScans({
        @ComponentScan(basePackages = "ua.epam.symovin.injection"),
        @ComponentScan(basePackages = "ua.epam.symovin.beans"),
        @ComponentScan(basePackages = "ua.epam.symovin.collection")
})
public class AppConfig {
}
