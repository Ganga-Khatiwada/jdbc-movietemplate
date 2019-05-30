package com.stackroute;

import com.stackroute.config.SpringJdbcConfig;
import com.stackroute.controller.SpringJdbcController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.stackroute.*")
public class Main {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(SpringJdbcConfig.class);
        ctx.refresh();

        SpringJdbcController springJdbcController =(SpringJdbcController) ctx.getBean("springJdbcController");
//        System.out.println(springJdbcController.insert());
        System.out.println(springJdbcController.getAll());
//        System.out.println(springJdbcController.executeShow());
//        System.out.println(springJdbcController.insert());
//        System.out.println(springJdbcController.read());
//        System.out.println(springJdbcController.update());
//        System.out.println(springJdbcController.delete());
    }

}
