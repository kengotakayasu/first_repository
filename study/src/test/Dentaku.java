package test;

public class Dentaku {

	int number1a;
	int number2b;

	public Dentaku() {
	}

	public Dentaku(int number1, int number2) {
		this.number1a = number1;
		this.number2b = number2;
	}

	public int sum() {
		return number1a + number2b;
	}

	public int sub() {
		return number1a - number2b;
	}

}