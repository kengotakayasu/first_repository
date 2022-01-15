package study.shop;

public class product {

	public String name = "";
	public int price = 0;
	public static int count = 0;

	public product(String name, int price) {
		this.name = name;
		this.price = price;
		count++;

	}

}
