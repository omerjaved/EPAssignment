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
    private double energyRating;
    private double weight;
    
    
    public Television(String br, double ss, double er, int wa, double we, int ty){
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
    
    public double getEnergyRating(){
        return this.energyRating;
    }
    
    public void EnergyRating(double er){
        this.energyRating = er;
    }
    
    public double getWeight(){
        return this.weight;
    }
    
    public void setWeight(double we){
        this.weight = we;
    }
}
