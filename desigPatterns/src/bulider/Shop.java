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
public class Shop {

    public Shop(vehicleBuilder vehiclebuilder) {
        vehiclebuilder.BuildFrame();
        vehiclebuilder.BuildEngine();
        vehiclebuilder.BuildWheels();
        vehiclebuilder.BuildDoors();
    }
    
}
