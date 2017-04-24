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
    
    public Electronic(){
        this.warranty = 2;
    }
    public Electronic(int wa, int ty){
        this.warranty = wa;
        this.type = ty;
    }
    
    public int getWarranty(){
        return this.warranty;
    }
    public void setWarranty(int wa){
        this.warranty = wa;
    }
}
