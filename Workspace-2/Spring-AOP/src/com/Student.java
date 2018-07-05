package com;

public class Student {
   private Integer age;
   private String name;

   public void setAge(Integer age) {
      this.age = age;
   }
   public Integer getAge() {
	  System.out.println("Age : " + age );
      return age;
   }
   public void setName(String name) {
      this.name = name;
   }
   public String getName() {
      System.out.println("Name : " + name );
      return name;
   }
   public void printThrowException(){
      throw new IllegalArgumentException();
   }
   
   
   public int check(){
	   System.out.println("tested");
	   return 1;
   }
   
   public Integer validate(Integer num, String str ){
	   System.out.println("validating running");
	   System.out.println("***"+num+"  "+str+"***");
	   System.out.println("validating ending");
	   return 1;
   }
   
}