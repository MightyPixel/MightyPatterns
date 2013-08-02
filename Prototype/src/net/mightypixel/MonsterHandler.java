package net.mightypixel;
import java.util.ArrayList;
import java.util.List;


public class MonsterHandler {

	private static List<MonsterPrototype> monsters = new ArrayList<>();
	
	
	public static void addMonsterPrototype(MonsterPrototype monster) {
		monsters.add(monster);
	}
	
	public static MonsterPrototype getEyedMonster (int numberOfEyes) {
		MonsterPrototype prototype = null;
		for (MonsterPrototype monster : monsters) {
			if (monster.getEyeCount() == numberOfEyes) {
				prototype = monster.clone();
			}
		}
		
		return prototype;
	}
	
}
