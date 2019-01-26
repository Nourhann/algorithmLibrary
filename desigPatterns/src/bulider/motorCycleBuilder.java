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
public class motorCycleBuilder extends vehicleBuilder{

    public motorCycleBuilder() {
        vehicle = new Vehicle("MotorCycle");
    }
   
    @Override
    public void BuildFrame() {
        vehicle.setFrame("MotorCycle Frame");
        System.out.println("MotorCycle Frame");
    }

    @Override
    public void BuildEngine() {
        vehicle.setEngine("500 cc");
        System.out.println("500 cc");
    }

    @Override
    public void BuildWheels() {
        vehicle.setWheels("2");
        System.out.println("2");
    }

    @Override
    public void BuildDoors() {
        vehicle.setDoors("0");
        System.out.println("0");
    }
    
}
