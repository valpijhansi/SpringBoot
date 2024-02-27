package in.autoWire;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("Chip32bit")
@Primary

public class Chip32bit implements Ichip {

	public Chip32bit() {
		// TODO Auto-generated constructor stub
		System.out.println("Chip32Bit:Constructor");
	}

	@Override
	public boolean process() {
		
		System.out.println("chipt32bit process started....");
		return true;
	}

}
