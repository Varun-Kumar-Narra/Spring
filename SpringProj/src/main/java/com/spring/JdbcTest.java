package com.spring;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("jdbc.xml");
		StudentDao dao = (StudentDao) context.getBean("student");
		//dao.insertStudent(101,"Raj",20);
		//dao.updateStudent(101,22);
		//dao.deleteStudent(101);
		List<Map<String,Object>> studList = dao.listStudents();
		for(Map stud : studList)
		{
			System.out.println(stud.get("id")+" "+stud.get("name")+" "+stud.get("age"));
		}
	}

}
