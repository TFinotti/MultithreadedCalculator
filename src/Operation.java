
public abstract class Operation {
	
	protected int a;
	protected int b;
	protected int output;
	
	public Operation(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int getA() {
		return this.a;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return this.b;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	public int getOutput() {
		return this.output;
	}
	
	public void setOutput(int output) {
		this.output = output;
	}

}
