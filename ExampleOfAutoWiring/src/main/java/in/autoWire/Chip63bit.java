package in.autoWire;

import org.springframework.stereotype.Component;

@Component("Chip63bit")
public class Chip63bit implements Ichip {

	public Chip63bit() {
		System.out.println("Chip64bit:Constructor");
	}

	@Override
	public boolean process() {
		// TODO Auto-generated method stub
		System.out.println("process started....");
		return true;
	}

}
