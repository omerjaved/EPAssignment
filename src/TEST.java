/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Omer
 */
public class TEST {
    public static void main(String args []){
        Stocks stock = new Stocks();
        try{
        stock.popStockFromFile("Stocks.txt");
        }catch(Exception e){
            System.out.println("File not found");
        }
        //System.out.println(stock.totalCurrentStocks());
        try{
            stock.popStockFromConsole();
            System.out.println("Stock Succesfully written to repository");
        }catch(StockLimitException e){
            System.out.println(e.LimitReached());
        }
        stock.writeRepo();
       
    }
}