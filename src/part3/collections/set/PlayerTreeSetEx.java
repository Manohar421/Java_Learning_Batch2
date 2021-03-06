package part3.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class PlayerTreeSetEx {
	public static void main(String[] args) {
		Player sachin = new Player(10, "Sachin", 45);
		Player rohit = new Player(45, "Rohit", 32);
		Player kohli = new Player(18, "Kohit", 32);
		Player dhoni = new Player(7, "Dhoni", 38);
		
		Set<Player> set = new TreeSet<>();
		set.add(sachin);
		set.add(rohit);
		set.add(kohli);
		set.add(dhoni);
		
		for (Player p : set) {
			System.out.println(p);
		}
	}
}
