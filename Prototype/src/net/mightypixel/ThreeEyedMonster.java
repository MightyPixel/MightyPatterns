package net.mightypixel;

public class ThreeEyedMonster implements MonsterPrototype {

	@Override
	public MonsterPrototype clone() {
		return new ThreeEyedMonster();
	}

	
	@Override
	public int getEyeCount() {
		return 3;
	}

}
