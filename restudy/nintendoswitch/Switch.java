package restudy.nintendoswitch;

import java.util.ArrayList;
import java.util.List;

public class Switch {

	List<Gamesoft> gamesofts = new ArrayList<>();

	public void install(Gamesoft soft) {
		gamesofts.add(soft);
	}

	public List<Gamesoft> getGamesofts() {
		return gamesofts;
	}
}