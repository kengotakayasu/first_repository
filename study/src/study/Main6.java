package study;

import java.util.HashMap;
import java.util.Map;


public class Main6 {

	public static void main(String[] args) {
		//
		Map<String, String> animalmap = new HashMap<>();		
		animalmap.put("cat","四足歩行の哺乳類、鳴き声はにゃー");
		animalmap.put("dog","四足歩行の哺乳類、鳴き声はわん");
		animalmap.put("bird","羽がついてて飛べる");	
// System.out.println(animalmap.get("dog"));

animalmap.forEach((key,value) ->{
System.out.println("キー" + key);
System.out.println("バリュー" + value);
	});
	}
}
