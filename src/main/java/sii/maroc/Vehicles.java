package sii.maroc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Vehicles {

    public Map<String, Integer> caracteristics = new HashMap();
     
    public Vehicles(String caracteristics){
       for(String car:Arrays.asList(caracteristics.split(","))){
           int percentage = Integer.parseInt(car.split(":")[1].split("")[0]);
            this.caracteristics.put(car.split(":")[0], percentage);
       }
    }

    public String move(String typeVehicle, String typeGaz, String closedDoor, String distanceKM){
        return null;
    }

    private double getGazConsumed(String typeGaz, String distanceKm){
        return 0;
    }

}
