/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fusion;

import GeoLocation.Location;
import Globals.Fusionable;
import Globals.NodeStatus;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Write all the values in this DataFusion object’s FusedBuffer to an output file (see format of file on Expected Output slide)

 *
 * @author MEL
 */
public class DataFusion_A extends DataFusion implements Fusionable{

    public DataFusion_A(String NodeID, NodeStatus sensorStatus, Location location, ArrayList<ArrayList<Integer>> codeBuffer, ArrayList<Integer> fusedBuffer) {
        super(NodeID, sensorStatus, location, codeBuffer, fusedBuffer);
    }

    @Override
    public void writeDataToFile() {
        super.writeDataToFile(); 
        
        String f = FileA; 
        BufferedWriter bw; 
        try {
            bw = new BufferedWriter(new FileWriter(f));
            for (int i = 0; i < this.fusedBuffer.size(); i++){
                bw.write(this.fusedBuffer.get(i).toString()+" ");
                bw.close();
            }
           
        } catch (IOException ex) {
            Logger.getLogger(DataFusion_A.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    @Override
    public void processSensorData() {
        super.processSensorData();
    }
    
    
    
}
