package com.wolfinexile.games.seven_seas;

public class Ship {
	
	private String name;
	private int health;
	private int damage;
	private int morale;
	
	public void shipName(){
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
	
	public boolean isDead(Ship ship) {
		boolean isDead = false;
		if (ship.getHealth() <= 0 ) {
			isDead = true;
			
		}
		return isDead;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getMorale() {
		return morale;
	}

	public void setMorale(int morale) {
		this.morale = morale;
	}
}
