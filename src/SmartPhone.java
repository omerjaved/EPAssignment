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
    private double screenSize;
    private int storage;
    
    public SmartPhone(String br, double ss, int st, int wa, int ty){
        super(wa, ty, br);
        this.screenSize = ss;
        this.storage = st;      
    }
    
    public double getScreenSize(){
        return this.screenSize;
    }
    
    public void setScreenSize(double ss){
        this.screenSize = ss;
    }
    
    public int getStorage(){
        return this.storage;
    }
    
    public void setStorage(int st){
        this.storage = st;
    }
    
}
