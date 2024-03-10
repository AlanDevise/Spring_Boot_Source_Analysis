package com.linkedbear.springboot.assemble.a_module;

import com.linkedbear.springboot.assemble.a_module.config.TavernConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

public class TavernApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TavernConfiguration.class);
        Stream.of(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
