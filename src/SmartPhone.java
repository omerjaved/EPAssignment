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
    
    private int storage;
    
    public SmartPhone(String br, double ss, int st, int wa, int ty){
        super(wa, ty, br, ss);
        this.storage = st;      
    }
    
    public int getStorage(){
        return this.storage;
    }
    
    public void setStorage(int st){
        this.storage = st;
    }
    
    
}
