package study.car;

public class Car {
	 //総生産台数
	private static int count = 0;   
	
	private boolean isEnginestaring = false; //エンジンが始動しているか
	private int speed = 0;
	private String color;
	private String type; //スポーツカーとか軽自動車とか
	
	public Car(String color, String type) {
		count++; // 作られた時に生産台数を1つ増やす
	this.type = type;
	this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getType() {
		return type;
	}
	
	public int getspeed() {
		return speed;
	}
	
	
	public void speedup() {
		speed++;		
	}
	
	public void speeddown() {
		if (getspeed()<=0){
		throw new RuntimeException("すでに0km以下です");
		}
		speed--;
		
	}
	
	public 	static int 	getCount()
	{
	return count;
	}
	
	public void startEngine() {
		isEnginestaring = true;
	}
	public boolean isEnginestaring() {
		return isEnginestaring;
	}
	
	
	
	
}
