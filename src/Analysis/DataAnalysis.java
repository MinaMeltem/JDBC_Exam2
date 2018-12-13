/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analysis;

import Globals.Analyzable;

/**
 * @author MEL
 * 
 * 
 * ANode | XCoord | YCoord | ZCoord |
+-------+--------+--------+--------+
| DAA-1 |    100 |    125 |      6 |
| DAB-1 |    200 |    250 |      6
 */
public abstract class DataAnalysis implements Analyzable{
    
    protected String node;
    protected int xcoor;
    protected int ycoord;
    protected int zcoord;

    public DataAnalysis(String node, int xcoor, int ycoord, int zcoord) {
        this.node = node;
        this.xcoor = xcoor;
        this.ycoord = ycoord;
        this.zcoord = zcoord;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public int getXcoor() {
        return xcoor;
    }

    public void setXcoor(int xcoor) {
        this.xcoor = xcoor;
    }

    public int getYcoord() {
        return ycoord;
    }

    public void setYcoord(int ycoord) {
        this.ycoord = ycoord;
    }

    public int getZcoord() {
        return zcoord;
    }

    public void setZcoord(int zcoord) {
        this.zcoord = zcoord;
    }
    
    

     
    
    
}
