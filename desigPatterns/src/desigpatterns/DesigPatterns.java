/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desigpatterns;

import bulider.Shop;
import bulider.carBuilder;
import bulider.motorCycleBuilder;
import bulider.vehicleBuilder;

/**
 *
 * @author norhan
 */
public class DesigPatterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        vehicleBuilder motorCycle= new motorCycleBuilder();
        Shop shop1 = new Shop(motorCycle);
        
        vehicleBuilder car= new carBuilder();
        Shop shop2 = new Shop(car);
        
    }
    
}
