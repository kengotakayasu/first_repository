package restudy;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import restudy.dentaku.Dentaku;
import restudy.nintendoswitch.Gamesoft;
import study.nintendoswitch.Switch;
import study.nintendoswitch.gamesoft;

public class handsun {

	// ===================================================================================
	// メソッドを作る
	// ============
	@Test
	public void want01_二つの数字を渡したらそれらを足し算して結果を返してくれるメソッドがほしいな() {
		// ほしいな詳細
		System.out.println(add(100, 50));
		System.out.println(add(1, 2));
	}

	// ↓↓↓足し算のメソッドはここに書いてね↓↓↓
	public int add(int a, int b) {
		return a + b;
	}
	// ↑↑↑足し算のメソッドはここに書いてね↑↑↑

	@Test
	public void want02_二つの数字を渡したらそれらを引き算して結果を返してくれるメソッドがほしいな() {

		System.out.println(sub(5, 1));
		System.out.println(sub(20, 1));
		// ほしいな詳細
		// ・結果を標準出力してほしいな
	}
	// ↓↓↓引き算のメソッドはここに書いてね↓↓↓

	public int sub(int a, int b) {
		return a - b;
	}

	// ↑↑↑引き算のメソッドはここに書いてね↑↑↑

	@Test
	public void want03_二つの数字を渡したらそれらを割り算して結果を返してくれるメソッドがほしいな() {
		// ほしいな詳細
		// ・割り算の結果は少数第３位で四捨五入してほしいな
		// ・1 / 3 の結果がわかるとうれしいな
		// ・結果を標準出力してほしいな
		System.out.println(div(new BigDecimal("1"), new BigDecimal("3")));
	}

	// ↓↓↓割算のメソッドはここに書いてね↓↓↓
	public BigDecimal div(BigDecimal a, BigDecimal b) {
		return a.divide(b, 2, RoundingMode.HALF_UP);
	}

	// ↑↑↑割算のメソッドはここに書いてね↑↑↑
	// ===================================================================================
	// クラスを作る
	// ==========
	@Test
	public void want04_Dentakuクラスがほしいな() {
		// ほしいな詳細
		// ・study.dentakuのパッケージ内に作ってほしいな
		// ・作ったDentakuクラスのインスタンスを作って変数に入れてほしいな
		Dentaku dentaku = new Dentaku(0, 0);
	}

	@Test
	public void want05_すでにつくった足し算メソッドと引き算メソッドをDentakuクラスにも作ってほしいな() {
		// ほしいな詳細
		// ・Dentakuクラスに作ったそれぞれのメソッドを使って、計算結果を標準出力してほしいな
		Dentaku dentaku = new Dentaku(0, 0);
		System.out.println(dentaku.add(3, 10));
		System.out.println(dentaku.sub(10, 5));
	}

	@Test
	public void want06_Dentakuクラスは作られた瞬間に計算に使う二つの数字を保持できるようになっていてほしいな() {
		// ほしいな詳細
		Dentaku dentaku = new Dentaku(4, 5);
		// ・Dentakuクラスのインスタンスを作って変数に入れてほしいな
	}

	@Test
	public void want07_足し算と引き算は保持している数字を使うようにしてほしいな() {
		// ほしいな詳細
		// ・それぞれのメソッドを使って、計算結果を標準出力してほしいな
		Dentaku dentaku = new Dentaku(1, 4);
		System.out.println(dentaku.add());

	}

	// ===================================================================================
	// CollectionやMapを扱う
	// ====================
	@Test
	public void want08_ニンテンドースイッチのソフトのタイトルのリストがほしいな() {
		List<String> softtitle = new ArrayList<>();
		softtitle.add("スプラトゥーン");
		softtitle.add("ゼルダ");
		softtitle.add("マリオ");
		System.out.println(softtitle);

		// ほしいな詳細
		// ・リストの中には "スプラトゥーン"、"ゼルダの伝説"、"マリオオデッセイ"が入っていてほしいな
		// ・作ったリストの中身を一つずつ標準出力してほしいな
	}

	@Test
	public void want09_ニンテンドースイッチのソフトのタイトルと感想のマップがほしいな() {
		// ほしいな詳細
		Map<String, String> gamereview = new HashMap<>();
		gamereview.put("スプラトゥーン", "なかなか勝てない。悔しい！けどおもしろい！");
		gamereview.put("マリオ", "おもしろい！");
		System.out.println(gamereview);

		// ・"スプラトゥーン: なかなか勝てない。悔しい！けどおもしろい！"みたいになっていてほしいな
		// ・"スプラトゥーン"、"ゼルダの伝説"、"マリオオデッセイ"でそれぞれタイトルと感想のマップを作って、それぞれの感想を標準出力してほしいな
	}

	// ===================================================================================
	// クラスを扱う 基本編
	// ================
	@Test
	public void want10_ゲームソフトクラスがほしいな() {
		// ほしいな詳細
		// ・study.nintendoswitchのパッケージ内に作ってほしいな
		// ・ゲームソフトクラスは、「タイトル」、「ジャンル」、「感想」を保持できるようになっていてほしいな
		Gamesoft soft = new Gamesoft();
	}

	@Test
	public void want11_タイトルとジャンルと感想をそれぞれセットしてほしいな() {

		// ほしいな詳細
		// ・ゲームソフトクラスのインスタンスを作った瞬間にセットされるようになっていてほしいな
		// セットする内容は↓がいいな
		// タイトル：スプラトゥーン
		// ジャンル：シューティング
		// 感想：おもしろい！
		// ・セットした内容はそれぞれ標準出力してほしいな

		Gamesoft soft = new Gamesoft("タイトル", "スプラトゥーン", "シューティング");
		System.out.println(soft.gettitle());
		System.out.println(soft.getgenre());
		System.out.println(soft.getreview());

	}

	@Test
	public void want12_ゲームソフトクラスは自分が何回作られたのかを分かるようになっていてほしいな() {
		// ほしいな詳細
		// ・ゲームソフトを何個か作って、作られた回数がちゃんと数えられることを標準出力で確認してほしいな
		Gamesoft soft1 = new Gamesoft("タイトル", "スプラトゥーン", "シューティング");
		Gamesoft soft2 = new Gamesoft("タイトル", "スプラトゥーン", "シューティング");
		Gamesoft soft3 = new Gamesoft();
		System.out.println(Gamesoft.getcount());
	}

	@Test
	public void want13_ゲームソフトのリストがほしいな() {
		// ほしいな詳細
		// ・ゲームソフトを何個か作って、それをリストにしてほしいな
		// ・そのリストに入っているゲームソフトのタイトルを、一つずつ標準出力してほしいな
		List<Gamesoft> gamesofts = new ArrayList<>();
		gamesofts.add(new Gamesoft("タイトル", "スプラトゥーン", "シューティング"));
		gamesofts.add(new Gamesoft("タイトル", "スプラトゥーン", "シューティング"));
		gamesofts.stream().map(Gamesoft::gettitle).forEach(System.out::println);
	}

	@Test
	public void want14_ニンテンドースイッチがほしいな() {

	}

	@Test
	public void want15_ニンテンドースイッチにゲームソフトを保存できるようにしてほしいな() {
		// ほしいな詳細
		// installメソッドを作って、ゲームソフトを受け取ったらそれを保持できるようにしてほしいな
		// インストールしたゲームソフトはリストになっていてほしいな
		Switch nintendoSwitch = new Switch();
		nintendoSwitch.install(new gamesoft("スプラトゥーン", "シューティング", "おもしろい！"));
		nintendoSwitch.install(new gamesoft("スマブラ", "バトル", "おもしろい！"));
		nintendoSwitch.install(new gamesoft("ドラクエ", "RPG", "おもしろい！"));
	}

}