/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Omer
 */
public class StockLimitException extends Exception implements StockLimit{
    private String message =  "Default Message"; 
    
    public StockLimitException(){
        message = "Unable to add stock. Stock Limit reached";
        System.out.println(message);
    }
    
    public String returnMsg(){
        return message;
    }
    
    
}
