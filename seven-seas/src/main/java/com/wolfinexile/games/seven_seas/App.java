package com.wolfinexile.games.seven_seas;

import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	static Crew mate = new Crew();
	Ship playerShip = new Ship();
	
    public static void main( String[] args ) {

		WeaponsInventory weaponsInventory = null;
		try {
			weaponsInventory = new WeaponsInventory();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}

		ShipsInventory shipsInventory = null;
		try {
			shipsInventory = new ShipsInventory();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}


		System.out.println("Weapon Inventory:");
		System.out.println(weaponsInventory.toString());

		System.out.println("Ship Inventory:");
		System.out.println(shipsInventory.toString());


		playerShip.addWeapon(Ship.WeaponLocation.PORT_AFT, weaponsInventory.getWeapons().get(0));
		playerShip.addWeapon(Ship.WeaponLocation.PORT_BOW, weaponsInventory.getWeapons().get(1));
		System.out.println("Ship weapons:");
		System.out.println(playerShip.getWeapons().toString());

		mate.CrewName();
		System.out.println(mate.getName());
		playerShip.shipName();
		System.out.println(playerShip.getName());
		saveLoad();
	}
    
    public static void saveLoad(){
    	Writer writer;
		try {
			String saveName = String.format("C:\\Users\\WaddlesMcSqueezy\\Documents\\My Games\\seven-seas\\%s.txt",
					playerInput());
			writer = new FileWriter(saveName);
			writer.write("playershipname: "+playerShip.getName()+"\r\n");
	    	writer.write("crewnames: "+mate.getName()+"\r\n");
	    	writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

	/*
	public static String playerInput() {
    	Scanner input = new Scanner(System.in);
    	String playerInput;
    	playerInput = input.next();
		return playerInput;
    }
    */

}
