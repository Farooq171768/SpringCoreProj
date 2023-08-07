package cgg.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		//Triangle triangle = new Triangle(); - we can avoid this new method
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
			//If there is any constrains on resource, go with BeanFactory
		
		//ApplicationContext is big brother of BeanFactory
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//context.registerShutdownHook();  //Clean Shutdown
		//Triangle triangle =(Triangle) factory.getBean("triangle");
		
//		Triangle triangle =(Triangle) context.getBean("triangle");
//		triangle.draw();
		
//		Circle circle =(Circle) context.getBean("circle");
//		circle.draw();
		
		Shape shape =(Shape) context.getBean("triangle");
		shape.draw();
	}
}
