package study;

public class FizzBuzz {

	public static void main(String[] args) {
		for (int i = 1; i <= 1000; i++) {
			if  (i%15 ==0 ) {System.out.println("fizzbuzz");
			// 15で割り切れればfizzbuzz
			} else if  (i%5 ==0 ) {System.out.println("buzz");
			// 5で割り切れればbuzz
			}else if (i%3 ==0 ) {System.out.println("fizz");
			// 3で割り切れればfizz
			}else {System.out.println("野口"+i);}	
		}
	}
}
