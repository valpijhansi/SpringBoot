package springframeWork.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spingframeWork.Car;
import spingframeWork.IEngine;

public class Test {

	public static void main(String[] args) {
		
ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
Car car = context.getBean(Car.class);
 IEngine eng = context.getBean(IEngine.class);
car.drive();
car.setEng(eng);
	}

}