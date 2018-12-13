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
import Globals.SensorRanges;
import java.util.ArrayList;

/**
 *
 * @author MEL
 */
public class Sensor_A extends Sensor implements Detectable{

    public Sensor_A(String sensorID, String sensorType, String sensorStatus, Location location) {
        super(sensorID, sensorType, sensorStatus, location);
    }

    @Override
    public void detectParticle(Particle[] pSpace) {
        super.detectParticle(pSpace);
        
        for (Particle pObj : pSpace) {
            double d = this.getLocation().euclidean(pObj.getLoc());
            if (d <SensorRanges.Sensor_A) {
                if (pObj.getParticalCode().charAt(0) == 'A') {
                    this.detectedParticles.add(pObj);
                }
            }             
        }
    }

    @Override
    public void decodeParticle() {
        
    }

    @Override
    public void sendDataToFushionNode(DataFusion df) {
       
    }

    
    
    
}
