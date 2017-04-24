/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Omer
 */
public class SmartPhone extends Electronic {
    private String brand;
    private double screenSize;
    private int storage;
    
    public SmartPhone(String br, double ss, int st, int wa, int ty){
        super(wa, ty);
        this.brand = br;
        this.screenSize = ss;
        this.storage = st;      
    }
}
