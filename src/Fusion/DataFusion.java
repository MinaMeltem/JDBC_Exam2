/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fusion;

import GeoLocation.Location;
import Globals.Fusionable;
import Globals.NodeStatus;
import java.util.ArrayList;

/**
 *
 * @author MEL
 */
public abstract class DataFusion implements Fusionable{
    private String NodeID;
    private NodeStatus sensorStatus;
    private Location location;
    private ArrayList<ArrayList<Integer>> codeBuffer;
    private ArrayList<Integer> fusedBuffer;

    public DataFusion(String NodeID, NodeStatus sensorStatus, Location location, ArrayList<ArrayList<Integer>> codeBuffer, ArrayList<Integer> fusedBuffer) {
        this.NodeID = NodeID;
        this.sensorStatus = sensorStatus;
        this.location = location;
        this.codeBuffer = codeBuffer;
        this.fusedBuffer = fusedBuffer;
    }   
    
  
    /**
     * Write all the values in this DataFusion object’s FusedBuffer to an output 
     * file (see format of file on Expected Output slide)
     *
     */
    
    @Override
    public void processSensorData() {
        for (int i=0; i<this.codeBuffer.size(); i++){
            for (int k=0; k< this.codeBuffer.get(i).size(); k++){
                this.fusedBuffer.add(this.codeBuffer.get(i).get(k));
            }
        }
    }
    

    @Override
    public void writeDataToFile() {
        
    }
    


   

   
    
}
