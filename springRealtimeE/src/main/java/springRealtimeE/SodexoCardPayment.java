package springRealtimeE;

public class SodexoCardPayment implements IPayment {
	

  public SodexoCardPayment() {
	  System.out.println("SDXCard::Constructor");
  }

	@Override
	public boolean pay(double amt) {
		// TODO Auto-generated method stub
		return true;
	}
}
