package net.mightypixel;

public class TwoEyedMonster implements MonsterPrototype {

	@Override
	public MonsterPrototype clone() {
		return new TwoEyedMonster();
	}

	
	@Override
	public int getEyeCount() {
		return 2;
	}

}
