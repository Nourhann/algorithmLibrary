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
public abstract class vehicleBuilder {

    protected Vehicle vehicle;   

    public Vehicle getVehicle() {
        return vehicle;
    }
    public abstract void BuildFrame();
    public abstract void BuildEngine();
    public abstract void BuildWheels();
    public abstract void BuildDoors();   
}
