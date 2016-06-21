package com.wolfinexile.games.seven_seas;

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
	static Ship playerShip = new Ship();
	static Crew mate = new Crew();
	
    public static void main( String[] args )
    {
    	mate.CrewName();
    	System.out.println(mate.getName());
    	playerShip.shipName();
    	System.out.println(playerShip.getName());
    	saveLoad();
    }
    
    public static void saveLoad(){
    	Writer writer;
		try {
			String savename = String.format("C:\\Users\\WaddlesMcSqueezy\\Documents\\My Games\\seven-seas\\%s.txt",
					playerInput());
			writer = new FileWriter(savename);
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
    
	public static String playerInput() {
    	Scanner input = new Scanner(System.in);
    	String playerInput;
    	playerInput = input.next();
		return playerInput;
    }

}
