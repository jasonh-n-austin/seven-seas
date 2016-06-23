package com.wolfinexile.games.seven_seas;

import java.util.ArrayList;
import java.util.HashMap;

public class Ship {

	private String name;
	private int currentHealth;
	private int maxHealth;
	private Type shipType;
	private HashMap<WeaponLocation, Weapon> weapons = new HashMap<WeaponLocation, Weapon>();

	public Ship() {
		NameGenerator rnd = new NameGenerator(RandomInt.randomInt());
		this.name = (rnd.next());
	}

	public enum Type {
		SLOOP("SLOOP"),
		CARAVEL("CARAVEL"),
		CUTTER("CUTTER"),
		CLIPPER("CLIPPER"),
		GALLEASS("GALLEASS"),
		GALLEON("GALLEON"),
		BRIGANTINE("BRIGANTINE"),
		CORVETTE("CORVETTE"),
		FRIGATE("FRIGATE");

		private String text;

		Type(String text) {
			this.text = text;
		}

		public String getText() {
			return this.text;
		}

		public static Type fromString(String text) {
			if (text != null) {
				for (Type b : Type.values()) {
					if (text.equalsIgnoreCase(b.text)) {
						return b;
					}
				}
			}
			return null;
		}
	}

    public enum WeaponLocation {
        PORT_BOW, STARBOARD_BOW, PORT_AFT, STARBOARD_AFT
    }

	public String getName() {
		return name;
	}

	public int getCurrentHealth() {
		return currentHealth;
	}

	public void setCurrentHealth(int health) {
		this.currentHealth = health;
	}

	public int getMaxHealth(int health) {
		return maxHealth;
	}
	
	public boolean isDead(Ship ship) {
		boolean isDead = false;
		if (ship.getCurrentHealth() <= 0 ) {
			isDead = true;
			
		}
		return isDead;
	}

    public void addWeapon(WeaponLocation weaponLocation, Weapon weapon) {
        weapons.put(weaponLocation, weapon);
    }

    public HashMap<WeaponLocation, Weapon> getWeapons() {
        return weapons;
    }
	@Override
	public String toString() {
		return "Ship{" +
				"Type=" + shipType +
				", Name='" + name + '\'' +
				", Max Health=" + maxHealth +
				"}\n";

	}
}
