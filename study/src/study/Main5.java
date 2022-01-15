package study;

import java.util.ArrayList;
import java.util.List;

public class Main5 {

	public static void main(String[] args) {
		List<String> animals = new ArrayList<>();
		animals.add("cat");
		animals.add("dog");
		animals.add("bird");
		
		for (int i = 0; i< animals.size(); i++) {
			System.out.println(animals.get(i));
		}
		
		for (String animal : animals) {
			System.out.println(animal);
		}			
		
		animals.forEach(animal -> {
			System.out.println(animal);			
		});
		
		
	}

}
