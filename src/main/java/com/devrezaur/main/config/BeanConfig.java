package com.devrezaur.main.config;

import com.devrezaur.main.model.Computer;
import com.devrezaur.main.model.Programmer;
import com.devrezaur.main.model.Supplier;
import org.springframework.context.annotation.Bean;

public class BeanConfig {

    @Bean
    public Programmer programmer(Computer computer) {
        Programmer p = new Programmer();
        p.setName("Mr. A");
        p.setComputer(computer);
        return p;
    }

    @Bean
    public Computer computer(Supplier supplier) {
        Computer c = new Computer();
        c.setBrand("Dell");
        c.setModel("xyz-123");
        c.setSupplier(supplier);
        return c;
    }

    @Bean
    public Supplier supplier() {
        Supplier s = new Supplier();
        s.setName("China Computers");
        s.setCountry("China");
        return s;
    }
}
