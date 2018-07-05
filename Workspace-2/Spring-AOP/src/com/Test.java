package com;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("appConfig.xml");
      
      Student student = (Student) context.getBean("student");
     //student.getName();
     // student.getAge();
       //student.check();
     //   student.printThrowException();
       student.validate(10,"Accenture");
   }
}
