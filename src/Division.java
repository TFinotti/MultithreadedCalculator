
public class Division extends Operation implements Runnable {

	public Division(int a, int b) {
		super(a, b);
	}

	@Override
	public void run() {
		try {
			this.output = this.getA() / this.getB();
			System.out.println("The result of the division operation on " + this.getA() + " and " + this.getB() +  " is " + this.getOutput());
		}
		catch(ArithmeticException e) {
			System.out.println("This calculator does not support division by zero");
		}
		
	}

}
