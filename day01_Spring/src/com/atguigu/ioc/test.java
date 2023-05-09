package com.atguigu.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) throws Exception {
		 ApplicationContext ac= new ClassPathXmlApplicationContext("auto.xml");
		 Emp emp=ac.getBean("emp",Emp.class);
		 System.out.println(emp);
//		 Student student1=(Student)iocContainer.getBean("student",Student.class);
//		 Student student2=(Student)iocContainer.getBean("student",Student.class);
//		 System.out.println(student1==student2);
		 
		 

	}
}
