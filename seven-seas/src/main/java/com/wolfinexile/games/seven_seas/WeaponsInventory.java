package com.wolfinexile.games.seven_seas;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class WeaponsInventory {
    private static final String FILE_PATH = "weapons.json";
    private final ArrayList<Weapon> weapons = new ArrayList<Weapon>();

    public WeaponsInventory() throws IOException, ParseException {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream(FILE_PATH);
        final InputStreamReader reader = new InputStreamReader(is);

        final JSONArray jsonArray = (JSONArray) new JSONParser().parse(reader);

        final Iterator it = jsonArray.iterator();

        while (it.hasNext()) {
            final JSONObject json = (JSONObject)it.next();
            String name = json.get("name").toString();
            Integer damage = Integer.parseInt(json.get("damage").toString());
            Weapon.Ammunition ammunitionType = Weapon.Ammunition.fromString(json.get("ammunitionType").toString());
            weapons.add(new Weapon(name, damage, ammunitionType));
        }
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        Iterator<Weapon> it = this.getWeapons().iterator();
        while (it.hasNext()) {
            result.append(it.next().toString());
        }
        return result.toString();
    }
}
