package study.nintendoswitch;

public class gamesoft {
	public String title = "";
	public String genre = "";
	public String review = "";
	public static int count = 0;

	public gamesoft() {
	}

	public gamesoft(String gametitle, String gamegenre, String gamereview) {
		title = gametitle;
		genre = gamegenre;
		review = gamereview;
		count++;
	}

}
// ・ゲームソフトクラスのインスタンスを作った瞬間にセットされるようになっていてほしいな
// セットする内容は↓がいいな
// タイトル：スプラトゥーン
// ジャンル：シューティング
// 感想：おもしろい！
