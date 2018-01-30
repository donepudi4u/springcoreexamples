package com.donepudi.examples.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryBeanRegisterDemo {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        StudentBean studentBean = (StudentBean)applicationContext.getBean("student");
        StudentBean studentBean2 = (StudentBean)applicationContext.getBean("student2");
        StudentBean studentBean3 = (StudentBean)applicationContext.getBean("student3");

        System.out.println("1 : "+studentBean.hashCode());
        System.out.println("2 : "+studentBean2.hashCode());
        System.out.println("3 : "+studentBean3.hashCode());

    }

}
