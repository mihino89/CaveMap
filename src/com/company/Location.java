package com.company;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exist;

    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        this.exist = new HashMap<String, Integer>();
        this.exist.put("Q", 0);
    }

    public void addExit(String direction, int location){
        exist.put(direction, location);
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExist() {
        return new HashMap<String, Integer>(exist);
    }
}
