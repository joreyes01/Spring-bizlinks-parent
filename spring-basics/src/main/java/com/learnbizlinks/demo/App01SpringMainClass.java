package com.learnbizlinks.demo;

import com.learnbizlinks.demo.exercise.BusinessCalculationService;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.learnbizlinks.demo.exercise")
public class App01SpringMainClass {

    public static void main(String[] args) {

        var ctx = new AnnotationConfigApplicationContext(App01SpringMainClass.class);
        System.out.println(ctx.getBean(BusinessCalculationService.class).findMax());

    }
}
