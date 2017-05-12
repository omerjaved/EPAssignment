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
        message = "Stock Limit Reached, Unable to Write to Repository";
        System.out.println(message);
    }
    
    public String LimitReached(){
        return message;
    }
    
    
}
