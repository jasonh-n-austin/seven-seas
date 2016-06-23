package com.wolfinexile.games.seven_seas;

public abstract class Equipment {
	private int price;
	private int weight;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}
