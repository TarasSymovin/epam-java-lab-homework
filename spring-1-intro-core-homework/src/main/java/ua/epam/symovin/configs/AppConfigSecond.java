package ua.epam.symovin.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import ua.epam.symovin.beans3.BeanE;

@Configuration
@ComponentScans({
        @ComponentScan(basePackages = "ua.epam.symovin.beans2"),
        @ComponentScan(basePackages = "ua.epam.symovin.beans3", excludeFilters = {
                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = BeanE.class)
        })
})
public class AppConfigSecond {
}
