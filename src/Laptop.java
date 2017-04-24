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
    private String brand;
    private double screenSize;
    private int ram;
    private String operatingSystem;
    
    
    public Laptop(String br, double ss, int ram, int wa, String os, int ty){
        super(wa, ty);
        this.brand = br;
        this.screenSize = ss;
        this.ram = ram;
        this.operatingSystem = os;
    }
}
