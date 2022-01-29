package restudy.nintendoswitch;

public class Gamesoft {

	private static int count = 0;
	private String title;
	private String genre;
	private String review;

	public Gamesoft() {

	}

	public Gamesoft(String title, String genre, String review) {
		count++;
		this.title = title;
		this.genre = genre;
		this.review = review;

	}

	public String gettitle() {
		return title;
	}

	public String getgenre() {
		return genre;
	}

	public String getreview() {
		return review;
	}

	public static int getcount() {
		return count;
	}

}
