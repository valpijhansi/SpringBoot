package spring_boot.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import springRealtimeE.debitCardPayment;
import springRealtimeE.paymentProcessor;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		paymentProcessor pp = context.getBean(paymentProcessor.class);
		
		pp.pay(10.00);
		pp.setPayment(pp);
		

	}

}
