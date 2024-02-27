package in.autoWire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component

public class Robot {

	public Robot() {
		System.out.println("robot:Constructor");
		
	}
	@Autowired
	//
	private Ichip chip;
	
	public void doWork() {
		String name = chip.getClass().getName();
		System.out.println(name);
		
		boolean status = chip.process();
		
		if(status) {
			System.out.println("rOBOT IS WORKING....");
		}else {
			System.out.println("Robot is not Working");
		}
	}

}

