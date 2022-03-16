package sii.maroc;

public class Program {
    public static void main(String[] args) {
        Vehicles vehicles = new Vehicles("Diesel:5%,Fuel:6%,Hybrid:3%");
        for(String key : vehicles.caracteristics.keySet()){
            System.out.println(key+" "+vehicles.caracteristics.get(key));
        }
    }
}
