package study.nintendoswitch;

import java.util.ArrayList;
import java.util.List;

public class Switch {

	List<gamesoft> SwitchSoft = new ArrayList<>(); // リスト作成

	public void install(gamesoft list) {
		SwitchSoft.add(list);
	} // リストにgamesoft情報を入れる

	public List<gamesoft> getlist() {
		return SwitchSoft;

	}

}
