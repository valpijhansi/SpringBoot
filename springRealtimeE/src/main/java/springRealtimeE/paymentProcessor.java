package springRealtimeE;

public class paymentProcessor implements IPayment {
	public paymentProcessor() {
		System.out.println("paymentProcessor::constructor");
	}
		private IPayment payment;
		public void setPayment(IPayment pay) {
			this.payment = pay;
			System.out.println("setPayment method called...");
			System.out.println("Injected ::"+payment.getClass().getName());
		}
		
		public boolean pay(double amt) {
		    if (payment == null) {
		        System.out.println("Payment dependency is not set.");
		        return false;
		    }

		    boolean status = payment.pay(amt);
		    if (status) {
		        System.out.println("Payment Successful.....");
		    } else {
		        System.out.println("Payment not successful....");
		    }
			return status;
		}

		@Override
		public String toString() {
			return "paymentProcessor [payment=" + payment + "]";
		}
		
	}


