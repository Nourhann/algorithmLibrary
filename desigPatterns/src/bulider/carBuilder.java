/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bulider;

/**
 *
 * @author norhan
 */
public class carBuilder extends vehicleBuilder{

    public carBuilder() {
        vehicle = new Vehicle("Car");
    }
    
    @Override
    public void BuildFrame() {
        vehicle.setFrame("Car Frame");
        System.out.println("Car Frame");
    }

    @Override
    public void BuildEngine() {
        vehicle.setEngine("2500 cc");
        System.out.println("2500 cc");
    }

    @Override
    public void BuildWheels() {
        vehicle.setWheels("4");
        System.out.println("4");
    }

    @Override
    public void BuildDoors() {
        vehicle.setDoors("4");
        System.out.println("4");
    }
    
}
