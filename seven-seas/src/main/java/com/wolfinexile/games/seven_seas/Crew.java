package com.wolfinexile.games.seven_seas;

public class Crew {
	private int morale;
	private int health;
	private String name;
	
	public void CrewName() {
	NameGenerator rnd = new NameGenerator(RandomInt.randomInt());
	this.setName(rnd.next());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMorale() {
		return morale;
	}

	public void setMorale(int morale) {
		this.morale = morale;
	}
	
}
