package com.wolfinexile.games.seven_seas;

public class Weapon extends Equipment {
	
	private final int damage;
	private final String name;
	private final Ammunition ammoType;

	public enum Ammunition {
		SOLID_SHOT("SOLID_SHOT"),
		CHAIN_SHOT("CHAIN_SHOT"),
		CANISTER_SHOT("CANISTER_SHOT"),
		GRAPE_SHOT("GRAPE_SHOT");

		private String text;

		Ammunition(String text) {
			this.text = text;
		}

		public String getText() {
			return this.text;
		}

		public static Ammunition fromString(String text) {
			if (text != null) {
				for (Ammunition b : Ammunition.values()) {
					if (text.equalsIgnoreCase(b.text)) {
						return b;
					}
				}
			}
			return null;
		}
	}
	
	public Weapon(String name, int dmg, Ammunition ammo ) {
		this.ammoType = ammo;
		this.name = name;
		this.damage = dmg;
	}
	
	public int getDamage() {
		return damage;
	}

	public String getName() {
		return name;
	}

	public Ammunition getAmmoType() {
		return ammoType;
	}

    @Override
    public String toString() {
        return "Weapon{" +
                "damage=" + damage +
                ", name='" + name + '\'' +
                ", ammoType=" + ammoType +
                "}\n";

    }
}

