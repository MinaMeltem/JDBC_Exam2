/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Environment;

import GeoLocation.Location;

/**
 *
 * @author MEL
 * Represents a Tachyon particle
 * 
 * IDNumber     PCOde
 * --------     -----
 * TPA-10       AAAA
 * TPA-11       AAXA
 */
public class Particle {
    protected String particalID;
    protected String particalCode;
    protected Location loc;

    public Particle(String particalID, String particalCode, Location loc) {
        this.particalID = particalID;
        this.particalCode = particalCode;
        this.loc = loc;
    }

    public String getParticalID() {
        return particalID;
    }

    public void setParticalID(String particalID) {
        this.particalID = particalID;
    }

    public String getParticalCode() {
        return particalCode;
    }

    public void setParticalCode(String particalCode) {
        this.particalCode = particalCode;
    }

    public Location getLoc() {
        return loc;
    }

    public void setLoc(Location loc) {
        this.loc = loc;
    }

    
    
    
}
