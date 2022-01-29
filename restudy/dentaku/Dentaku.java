package restudy.dentaku;

public class Dentaku {

	private int a;
	private int b;

	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public Dentaku(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int add() {
		return a + b;
	}

	public int sub() {
		return a - b;
	}

}
