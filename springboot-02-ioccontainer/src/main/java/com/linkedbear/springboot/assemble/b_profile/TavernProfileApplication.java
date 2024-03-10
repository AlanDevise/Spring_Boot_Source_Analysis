package com.linkedbear.springboot.assemble.b_profile;

import com.linkedbear.springboot.assemble.b_profile.config.TavernConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

public class TavernProfileApplication {

    public static void main(String[] args) throws Exception {
        // AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TavernConfiguration.class);
        // ctx.getEnvironment().setActiveProfiles("city");
        // Stream.of(ctx.getBeanDefinitionNames()).forEach(System.out::println);

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        // 为ApplicationContext的环境设置正在激活的Profile
        ctx.getEnvironment().setActiveProfiles("city");
        // 以下两步等价于 new AnnotationConfigApplicationContext(TavernConfiguration.class)
        ctx.register(TavernConfiguration.class);
        ctx.refresh();


        System.out.println("---------------------");
        Stream.of(ctx.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
