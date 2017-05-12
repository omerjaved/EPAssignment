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
    private double eRating;
    private double weight;
    
    
    public Television(String br, double ss, double er, int wa, double we, int ty){
        super(wa, ty, br, ss);
        this.eRating = er;
        this.weight = we;
    }
    
    
    public double getERating(){
        return this.eRating;
    }
    
    public void setERating(double er){
        this.eRating = er;
    }
    
    public double getWeight(){
        return this.weight;
    }
    
    public void setWeight(double we){
        this.weight = we;
    }
}
