/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Omer
 */
public class Laptop extends Electronic {
    private int ram;
    private String operatingSystem;
    
    
    public Laptop(String br, double ss, int ram, int wa, String os, int ty){
        super(wa, ty, br, ss);
        this.ram = ram;
        this.operatingSystem = os;
    }
    
    public int getRam(){
        return this.ram;
    }
    
    public void setRam(int ram){
        this.ram = ram;
    }
    
    public String getOperatingSystem(){
        return this.operatingSystem;
    }
    
    public void setOperatingSystem(String os){
        this.operatingSystem = os;
    }
}

