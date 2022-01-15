package study.car;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Car.getCount());//総生産量,と入力される
		Car car = new Car("ブルー","セダン");
		
		System.out.println(car.getColor()); 
		System.out.println(car.getType()); 
		
		if (car.isEnginestaring())
		{System.out.println("エンジンが起動しています");
		}
		car.startEngine();
		if (car.isEnginestaring())
		{System.out.println("エンジンが起動しています");
		}
		
		car.speedup();
		car.speedup();
		car.speedup();
		System.out.println(car.getspeed());//3と出力されるはず
		car.speeddown();
		car.speeddown();
		car.speeddown();
//		car.speeddown();
		System.out.println(car.getspeed());//0と出力されるはず
		System.out.println(Car.getCount());//総生産量,1と入力される
		new Car("レッド","軽自動車");
		System.out.println(Car.getCount());//総生産量,と入力される
	}

}
