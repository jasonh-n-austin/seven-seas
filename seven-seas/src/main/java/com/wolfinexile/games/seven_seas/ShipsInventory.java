package com.wolfinexile.games.seven_seas;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;

public class ShipsInventory {
    private static final String FILE_PATH = "ships.json";
    private final HashMap<UUID, Ship> ships = new HashMap<UUID, Ship>();

    public ShipsInventory() throws IOException, ParseException {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream(FILE_PATH);
        final InputStreamReader reader = new InputStreamReader(is);

        final JSONArray jsonArray = (JSONArray) new JSONParser().parse(reader);

        final Iterator it = jsonArray.iterator();

        while (it.hasNext()) {
            final JSONObject json = (JSONObject)it.next();
            //String name = json.get("name").toString();
            Integer health = Integer.parseInt(json.get("health").toString());
            Ship.Type shipType = Ship.Type.fromString(json.get("type").toString());
            ships.put(UUID.randomUUID(), new Ship());
        }
    }

    public HashMap<UUID, Ship> getShips() {
        return ships;
    }

    public Ship getShip(UUID shipID) {
        return ships.get(shipID);
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        Iterator<Ship> it = this.getShips().iterator();
        while (it.hasNext()) {
            result.append(it.next().toString());
        }
        return result.toString();
    }
}
