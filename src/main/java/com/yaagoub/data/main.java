package com.yaagoub.data;

import com.yaagoub.config.Configurations;
import com.yaagoub.services.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {


    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(Configurations.class);

        Service service = (Service) context.getBean("service");


    }
}
