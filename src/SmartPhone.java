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
    
    private int storageCapacity;
    
    public SmartPhone(String br, double ss, int st, int wa, int ty){
        super(wa, ty, br, ss);
        this.storageCapacity = st;      
    }
    
    public int getStorageCapacity(){
        return this.storageCapacity;
    }
    
    public void setStorageCapacity(int st){
        this.storageCapacity = st;
    }
    
    
}
