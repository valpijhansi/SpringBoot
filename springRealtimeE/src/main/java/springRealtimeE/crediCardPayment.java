package springRealtimeE;

 class creditCardPayment implements IPayment {
	public creditCardPayment() {
		System.out.println("CCcardPayment::constructor");
		
	}

	@Override
	public boolean pay(double amt) {
		// TODO Auto-generated method stub
		return true;
	}

}
