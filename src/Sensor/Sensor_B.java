/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sensor;

import Environment.Particle;
import Fusion.DataFusion;
import GeoLocation.Location;
import Globals.Detectable;

/**
 *
 * @author MEL
 */
public class Sensor_B extends Sensor implements Detectable{
    public Sensor_B(String sensorID, String sensorType, String sensorStatus, Location location) {
        super(sensorID, sensorType, sensorStatus, location);
    }

    @Override
    public void detectParticle(Particle[] pSpace) {
        super.detectParticle(pSpace); 
    }

    @Override
    public void decodeParticle() {
        
    }

    @Override
    public void sendDataToFushionNode(DataFusion df) {
        
    }
    
    
    


}
