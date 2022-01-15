package test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import study.nintendoswitch.Switch;
import study.nintendoswitch.gamesoft;
import study.shop.product;
import study.shop.shoppingcart;

public class Test_java {

	// ===================================================================================
	// メソッドを作る
	// ============
	@Test
	public void want01_二つの数字を渡したらそれらを足し算して結果を返してくれるメソッドがほしいな() {
		int a = 1;
		int b = 2;
		int c = 3;
		// ほしいな詳細
		// ・結果を標準出力してほしいな
		System.out.println(sum(a, b));
	}

	// ↓↓↓足し算のメソッドはここに書いてね↓↓↓

	public int sum(int a, int b) {
		return a + b;
	}

	// ↑↑↑足し算のメソッドはここに書いてね↑↑↑
	@Test
	public void want02_二つの数字を渡したらそれらを引き算して結果を返してくれるメソッドがほしいな() {
		// ほしいな詳細
		int a = 10;
		int b = 4;
		System.out.println(sub(a, b));

		// ・結果を標準出力してほしいな
	}

	// ↓↓↓引き算のメソッドはここに書いてね↓↓↓
	public int sub(int a, int b) {
		return a - b;
	}

	// ↑↑↑引き算のメソッドはここに書いてね↑↑↑
	@Test
	public void want03_二つの数字を渡したらそれらを割り算して結果を返してくれるメソッドがほしいな() {
		BigDecimal bd1 = new BigDecimal(10);
		BigDecimal bd2 = new BigDecimal(3);
		System.out.println(div(bd1, bd2));

		// ほしいな詳細
		// ・割り算の結果は少数第３位で四捨五入してほしいな
		// ・1 / 3 の結果がわかるとうれしいな
		// ・結果を標準出力してほしいな

	}

	// ↓↓↓割算のメソッドはここに書いてね↓↓↓
	public BigDecimal div(BigDecimal a, BigDecimal b) {
		return a.divide(b, 2, BigDecimal.ROUND_HALF_UP);
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
		Dentaku dentaku = new Dentaku();
	}

	@Test
	public void want05_すでにつくった足し算メソッドと引き算メソッドをDentakuクラスにも作ってほしいな() {
		// ほしいな詳細
		// ・Dentakuクラスに作ったそれぞれのメソッドを使って、計算結果を標準出力してほしいな
		Dentaku dentaku = new Dentaku(3, 5);
		System.out.println(dentaku.sum());
		System.out.println(dentaku.sub());

	}

	@Test
	public void want06_Dentakuクラスは作られた瞬間に計算に使う二つの数字を保持できるようになっていてほしいな() {

		// ・Dentakuクラスのインスタンスを作って変数に入れてほしいな
	}

	@Test
	public void want07_足し算と引き算は保持している数字を使うようにしてほしいな() {
		// ほしいな詳細
		Dentaku dentaku = new Dentaku(9, 4);
		System.out.println(dentaku.sub());
		System.out.println(dentaku.sum());

		// ・それぞれのメソッドを使って、計算結果を標準出力してほしいな

	}

	// ===================================================================================
	// CollectionやMapを扱う
	// ====================
	@Test
	public void want08_ニンテンドースイッチのソフトのタイトルのリストがほしいな() {
		// ほしいな詳細
		List<String> titles = new ArrayList<>();
		titles.add("スプラトゥーン");
		titles.add("ゼルダの伝説");
		titles.add("マリオオデッセイ");
		for (int i = 0; i < titles.size(); i++) {
			System.out.println(titles.get(i));
		}

		// ・リストの中には "スプラトゥーン"、"ゼルダの伝説"、"マリオオデッセイ"が入っていてほしいな
		// ・作ったリストの中身を一つずつ標準出力してほしいな
	}

	@Test
	public void want09_ニンテンドースイッチのソフトのタイトルと感想のマップがほしいな() {
		// ほしいな詳細

		Map<String, String> titlemap = new HashMap<>();
		titlemap.put("スプラトゥーン", "神ゲー");
		titlemap.put("ゼルダの伝説", "うんちゲー");
		titlemap.put("マリオオデッセイ", "クソゲー");

		titlemap.forEach((title, review) -> {
			System.out.println(title + review);
		});

		// ・"スプラトゥーン: なかなか勝てない。悔しい！けどおもしろい！"みたいになっていてほしいな
		// ・"スプラトゥーン"、"ゼルダの伝説"、"マリオオデッセイ"でそれぞれタイトルと感想のマップを作って、それぞれの感想を標準出力してほしいな
	}

	// ===================================================================================
	// クラスを扱う 基本編
	// ================
	@Test
	public void want10_ゲームソフトクラスがほしいな() {
		gamesoft soft = new gamesoft();
		// ほしいな詳細
		// ・study.nintendoswitchのパッケージ内に作ってほしいな
		// ・ゲームソフトクラスは、「タイトル」、「ジャンル」、「感想」を保持できるようになっていてほしいな
	}

	@Test
	public void want11_タイトルとジャンルと感想をそれぞれセットしてほしいな() {
		gamesoft soft = new gamesoft("スプラトゥーン", "シューティング", "おもしろい");
		System.out.println(soft.title);
		System.out.println(soft.genre);
		System.out.println(soft.review);

		// ほしいな詳細
		// ・ゲームソフトクラスのインスタンスを作った瞬間にセットされるようになっていてほしいな
		// セットする内容は↓がいいな
		// タイトル：スプラトゥーン
		// ジャンル：シューティング
		// 感想：おもしろい！
		// ・セットした内容はそれぞれ標準出力してほしいな

	}

	@Test
	public void want12_ゲームソフトクラスは自分が何回作られたのかを分かるようになっていてほしいな() {

		new gamesoft("スプラトゥーン", "シューティング", "おもしろい");
		new gamesoft("スプラトゥーン", "シューティング", "おもしろい");
		System.out.println(gamesoft.count);

		// ほしいな詳細
		// ・ゲームソフトを何個か作って、作られた回数がちゃんと数えられることを標準出力で確認してほしいな
	}

	@Test
	public void want13_ゲームソフトのリストがほしいな() {

		gamesoft soft1 = new gamesoft("ゼルダ", "シューティング", "おもしろい");
		gamesoft soft2 = new gamesoft("マリオ", "シューティング", "おもしろい");
		gamesoft soft3 = new gamesoft("スマブラ", "シューティング", "おもしろい");
		List<String> gametitles = new ArrayList<>();
		gametitles.add(soft1.title);
		gametitles.add(soft2.title);

		for (int i = 0; i < gametitles.size(); i++) {
			System.out.println(gametitles.get(i));
		}
		gametitles.forEach((title) -> {
			System.out.println(title);
		});

		// ほしいな詳細
		// ・ゲームソフトを何個か作って、それをリストにしてほしいな
		// ・そのリストに入っているゲームソフトのタイトルを、一つずつ標準出力してほしいな
	}

	@Test
	public void want14_ニンテンドースイッチがほしいな() {
		Switch soft = new Switch();
		// ほしいな詳細
	}

	@Test
	public void want15_ニンテンドースイッチにゲームソフトを保存できるようにしてほしいな() {
		Switch softlist = new Switch();
		softlist.install(new gamesoft("ソフト", "タイトル", "レビュー"));
		softlist.install(new gamesoft("ソフト2", "タイトル2", "レビュー2"));
		for (int i = 0; i < softlist.getlist().size(); i++) {
			System.out.println(softlist.getlist().get(i));
		}
// ほしいな詳細
// installメソッドを作って、ゲームソフトを受け取ったらそれを保持できるようにしてほしいな
// インストールしたゲームソフトはリストになっていてほしいな
// インストールしたゲームソフトのタイトルを、一つずつ標準出力してほしいな
	}

	// ほしいな詳細
	// installメソッドを作って、ゲームソフトを受け取ったらそれを保持できるようにしてほしいな
	// インストールしたゲームソフトはリストになっていてほしいな
	// インストールしたゲームソフトのタイトルを、一つずつ標準出力してほしいな
	// ===================================================================================
	// クラスを扱う 応用編
	// ================
	@Test
	public void ultimateWant_書いてあるものが全部ほしいな() {
		product product1 = new product("ゲームハード", 1000);
		product product2 = new product("ゲームソフト", 3000);

		System.out.println(product1.name);
		System.out.println("持ってる数:" + product.count);

		shoppingcart cart = new shoppingcart();
		cart.put(new product("ゲームハード", 1000));
		cart.put(new product("ゲームソフト", 500));

		// ほしいな詳細
		// ・商品がほしいな
		// ・商品には名前と価格があってほしいな
		// ・名前と価格は商品を作った瞬間に持たせるようにしてほしいな
		// ・商品は自分が何個作られたのかわかるようになっていてほしいな
		// ・おかいものかごがほしいな
		// ・おかいものかごには商品リストをもたせることができるようにしてほしいな
		// ・おかいものかごには商品を一個ずつ入れることができて、一個ずつ入れた商品は商品リストに追加されるようにしてほしいな
		// ・レジがほしいな
		// ・レジはおかいものかごをもたせることができるようにしてほしいな
		// ・おかいものかごを渡せるようになっていてほしいな
		// ・レジに渡したおかいものかごの中には商品リストが入っているはずなので、それらの価格を足し合わせてレジで料金を算出できるようになっていてほしいな
	}

}
