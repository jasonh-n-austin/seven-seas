package com.wolfinexile.games.seven_seas;

import java.util.Random;

public class RandomInt<Int> {

  private Int integer;

  public void add(Int t) {
    this.integer = t;
  }

  public Int get() {
    return integer;
  }

  public static <Int> int randomInt() {
	Random randomGenerator = new Random();
	int randomInt = randomGenerator.nextInt(1500000);
	return randomInt;
  }
  
}