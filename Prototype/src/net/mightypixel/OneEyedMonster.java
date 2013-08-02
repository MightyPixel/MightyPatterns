package net.mightypixel;

public class OneEyedMonster implements MonsterPrototype {

	@Override
	public MonsterPrototype clone() {
		return new OneEyedMonster();
	}

	
	@Override
	public int getEyeCount() {
		
		return 1;
	}
	
}
