
public class Addition extends Operation implements Runnable {

	public Addition(int a, int b) {
		super(a, b);
	}

	@Override
	public void run() {
			this.output = this.getA() + this.getB();
			System.out.println("The result of the addition operation on " + this.getA() + " and " + this.getB() +  " is " + this.getOutput());
	}

}
