
public class Multiplication extends Operation implements Runnable {

	public Multiplication(int a, int b) {
		super(a, b);
	}

	@Override
	public void run() {
		this.output = this.getA() * this.getB();
		System.out.println("The result of the multiplication operation on " + this.getA() + " and " + this.getB() +  " is " + this.getOutput());
	}

}
