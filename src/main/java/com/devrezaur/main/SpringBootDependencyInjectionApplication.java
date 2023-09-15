package com.devrezaur.main;

import com.devrezaur.main.config.BeanConfig;
import com.devrezaur.main.model.Programmer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({BeanConfig.class})
public class SpringBootDependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootDependencyInjectionApplication.class, args);

        Programmer p1 = context.getBean(Programmer.class);
        p1.printDetails();
    }
}
