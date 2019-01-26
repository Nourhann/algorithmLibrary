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
class Vehicle {
    
    private String vehicleType;
    private String Frame;
    private String Engine;
    private String Wheels;
    private String Doors;
    public Vehicle(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Vehicle() {
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setFrame(String Frame) {
        this.Frame = Frame;
    }

    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    public void setWheels(String Wheels) {
        this.Wheels = Wheels;
    }

    public void setDoors(String Doors) {
        this.Doors = Doors;
    }

    public String getFrame() {
        return Frame;
    }

    public String getEngine() {
        return Engine;
    }

    public String getWheels() {
        return Wheels;
    }

    public String getDoors() {
        return Doors;
    }
    
        
}
