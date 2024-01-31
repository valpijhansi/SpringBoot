package spingframeWork;

public class Car {
	public Car() {
		System.out.println("Car::Constructor");
	}

	private IEngine eng;
	public void setEng(IEngine eng) {
		this.eng = eng;
		System.out.println("setEng() method called.....");
		System.out.println("injcted::"+ eng.getClass().getName());
	}
	public void drive() {
	    if (eng != null) {
	        boolean status = eng.start();
	        if (status) {
	            System.out.println("Journey started....");
	        } else {
	            System.out.println("Not started...");
	        }
	    } else {
	        System.out.println("Engine is not set. Cannot start the car.");
	    }
	}

	

}
