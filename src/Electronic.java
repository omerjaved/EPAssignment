/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Omer
 */
public class Electronic {
    private int warranty;
    private int type;
    private String brand;
    
    public Electronic(){
        this.warranty = 2;
    }
    public Electronic(int wa, int ty, String br){
        this.warranty = wa;
        this.type = ty;
        this.brand = br;
    }
    
    public int getWarranty(){
        return this.warranty;
    }
    public void setWarranty(int wa){
        this.warranty = wa;
    }
    
    public String getBrand(){
        return this.brand;
    }
    
    public void setBrand(String br){
        this.brand = br;
    }
}
