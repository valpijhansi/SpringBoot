package springRealtimeE;

public class debitCardPayment implements IPayment {
	
	public debitCardPayment() {
		System.out.println("debitCardPayment::Constructor");
	}

	@Override
	public boolean pay(double amt) {
		// TODO Auto-generated method stub
		return true;
	}

}
