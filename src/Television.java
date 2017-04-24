/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Omer
 */
public class Television extends Electronic{
    private double screenSize;
    private int energyRating;
    private float weight;
    
    
    public Television(String br, double ss, int er, int wa, float we, int ty){
        super(wa, ty, br);
        this.screenSize = ss;
        this.energyRating = er;
        this.weight = we;
    }
    
    public double getScreenSize(){
        return this.screenSize;
    }
    
    public void setScreenSize(double ss){
        this.screenSize = ss;
    }
    
    public int getEnergyRating(){
        return this.energyRating;
    }
    
    public void EnergyRating(int er){
        this.energyRating = er;
    }
    
    public float getWeight(){
        return this.weight;
    }
    
    public void setWeight(float we){
        this.weight = we;
    }
}
