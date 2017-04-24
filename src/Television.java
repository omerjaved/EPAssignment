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
    private String brand;
    private double screenSize;
    private int energyRating;
    private int weight;
    
    
    public Television(String br, double ss, int er, int wa, int w, int ty){
        super(wa, ty);
        this.brand = br;
        this.screenSize = ss;
        this.energyRating = er;
        this.weight = w;
    }
    
    
    
    
}
