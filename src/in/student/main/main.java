package in.student.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import in.student.college_details;
import in.swadhin.configuration.javaconfiguration;

public class main {

	public static void main(String[] args) 
	{
		ApplicationContext context=new AnnotationConfigApplicationContext(javaconfiguration.class);
		college_details cd=(college_details)context.getBean("student");
		cd.display();
	}

}
