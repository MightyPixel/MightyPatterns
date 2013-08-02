package net.mightypixel;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MonsterHandler.addMonsterPrototype(new OneEyedMonster());
		MonsterHandler.addMonsterPrototype(new TwoEyedMonster());
		MonsterHandler.addMonsterPrototype(new ThreeEyedMonster());
		
		System.out.println(MonsterHandler.getEyedMonster(2).getEyeCount());
		
	}

}
