/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Omer
 */
public class Stocks implements StockLimit{
    
    //public Electronic [] stocks;
    public ArrayList <SmartPhone> smartphones=new ArrayList<>();	
    public ArrayList <Television> televisions=new ArrayList<>();	
    public ArrayList <Laptop> laptops=new ArrayList<>();
    private int availablePhoneStock;
    private int availableTVStock;
    private int availableLaptopStock;
    Scanner s = new Scanner(System.in);
    
    public Stocks(){
        
        this.availablePhoneStock = 0;
        this.availableTVStock = 0;
        this.availableLaptopStock = 0;
    }
    
    public int totalCurrentStocks(){
        return this.availableLaptopStock+this.availableTVStock+this.availablePhoneStock;
    }
    
    public void popStockFromConsole() throws StockLimitException{
            System.out.println("Enter the type of Electronic Product:"); 
            int type = Integer.parseInt(s.nextLine());
            System.out.println("Enter the quantity of stock:"); 
            int quantity = Integer.parseInt(s.nextLine());
            System.out.println("Enter the brand of the product:");
            String brand= s.nextLine();
            System.out.println("Enter Screen Size of the product:");
            double ss= Double.parseDouble(s.nextLine());
            
            if (type == 1){
                System.out.println("Enter Storage of the SmartPhone:"); 
                int st = Integer.parseInt(s.nextLine());
                
                if (this.availablePhoneStock+quantity <= MAXIMUMPHONESTOCK){
                    for (int j = this.totalCurrentStocks(); j < this.totalCurrentStocks() + quantity; j++ ){
                        SmartPhone sp = new SmartPhone(brand, ss, st, 2, 1);
                        smartphones.add(sp);
                        writeRepo();
                    }
                    this.availablePhoneStock += quantity;
                    //if (this.totalCurrentStocks() >= TOTALSTOCK) throw new StockLimitException();
                }
                else if (this.availablePhoneStock+quantity >= MAXIMUMPHONESTOCK || this.availablePhoneStock+quantity >= TOTALSTOCK) throw new StockLimitException();
            }
            
            if (type == 2){
                System.out.println("Enter Energy Rating of the Television:"); 
                double eRating = Double.parseDouble(s.nextLine());
                System.out.println("Enter weight of the Television:"); 
                double weight = Double.parseDouble(s.nextLine());
                if (this.availableTVStock+quantity <= MAXIMUMTVSTOCK){
                    for (int j = this.totalCurrentStocks(); j < this.totalCurrentStocks() + quantity; j++ ){
                        Television tv = new Television(brand, ss, eRating, 2, weight, 2);
                        televisions.add(tv);
                        writeRepo();
                    }
                    this.availableTVStock += quantity;
                    //if (this.totalCurrentStocks() >= TOTALSTOCK) throw new StockLimitException();
                }
                else if (this.availableTVStock+quantity >= MAXIMUMTVSTOCK || this.availableTVStock+quantity >= TOTALSTOCK) throw new StockLimitException();
            }
            
            if (type == 3){
                System.out.println("Enter RAM of the Laptop:"); 
                int ram = Integer.parseInt(s.nextLine());
                System.out.println("Enter Operating System of the Laptop:"); 
                String os = s.nextLine();
                
                if (this.availableLaptopStock+quantity <= MAXIMUMLAPTOPSTOCK){
                    for (int j = this.totalCurrentStocks(); j < this.totalCurrentStocks() + quantity; j++ ){
                        Laptop l = new Laptop(brand, ss, ram, 2, os, 3);
                        laptops.add(l);
                        writeRepo();
                    }
                    this.availableLaptopStock += quantity;
                    //if (this.totalCurrentStocks() >= TOTALSTOCK) throw new StockLimitException();
                }
                else if (this.availableLaptopStock+quantity >= MAXIMUMLAPTOPSTOCK || this.availableLaptopStock+quantity >= TOTALSTOCK) throw new StockLimitException();
            }
            
    }
    
    public void popStockFromFile(String fileName) throws StockLimitException{
                
        String delims = "[ :]+";
        String [] inputs = new String[100];
        int index = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
               //System.out.println(line);
                if(line.length() > 1){
                    inputs[index++] = line;
                }                    
            }
            //System.out.println(index);
            for(int i = 0; i < index; ){
                //System.out.println(inputs[i]);
                String[] tokens = inputs[i].split(delims);
                if (tokens[0].equals( "Type") & tokens[1].equals("1")){ // This is smartphone type
                    System.out.println("Type 1 object found");
                    int quantity = Integer.parseInt(inputs[i+1].split(delims)[1]);
                    String brand = inputs[i+2].split(delims)[1];
                    double SS = Double.parseDouble(inputs[i+3].split(delims)[1]);
                    int storage  = Integer.parseInt(inputs[i+4].split(delims)[1]);
                    
                    if (this.availablePhoneStock+quantity <= MAXIMUMPHONESTOCK){
                        for (int j = this.totalCurrentStocks(); j < this.totalCurrentStocks() + quantity; j++){ 
                            SmartPhone sp = new SmartPhone(brand, SS, storage, 2, 1); // Assuming two years of warranty
                            smartphones.add(sp);
                            writeRepo();
                        }
                        this.availablePhoneStock += quantity;
                        if (this.totalCurrentStocks()+quantity >= TOTALSTOCK) throw new StockLimitException();
                    } 
                    
                    i += 5;
                }
                
                if (tokens[0].equals( "Type") & tokens[1].equals("2")){ // This is Television type
                    System.out.println("Type 2 object found");
                    int quantity = Integer.parseInt(inputs[i+1].split(delims)[1]);
                    String brand = inputs[i+2].split(delims)[1];
                    double SS = Double.parseDouble(inputs[i+3].split(delims)[1]);
                    double energyRating  = Double.parseDouble(inputs[i+4].split(delims)[1]);
                    double weight  = Double.parseDouble(inputs[i+5].split(delims)[1]);
                    
                    if (this.availableTVStock+quantity <= MAXIMUMTVSTOCK){
                        for (int j = this.totalCurrentStocks(); j < this.totalCurrentStocks() + quantity; j++){ 
                            Television tv = new Television(brand, SS, energyRating, 2, weight, 2); // Assuming two years of warranty
                            televisions.add(tv);
                            writeRepo();
                        }
                        this.availableTVStock += quantity;
                        if (this.totalCurrentStocks()+quantity >= TOTALSTOCK) throw new StockLimitException();
                    } 
                    
                    i += 6;
                }
                
                if (tokens[0].equals( "Type") & tokens[1].equals("3")){ // This is Laptop type
                    System.out.println("Type 3 object found");
                    int quantity = Integer.parseInt(inputs[i+1].split(delims)[1]);
                    String brand = inputs[i+2].split(delims)[1];
                    double SS = Double.parseDouble(inputs[i+3].split(delims)[1]);
                    int RAM  = Integer.parseInt(inputs[i+4].split(delims)[1]);
                    String OS  = (inputs[i+5].split(delims)[1]);
                    
                    if (this.availableLaptopStock+quantity <= MAXIMUMLAPTOPSTOCK){
                        for (int j = this.totalCurrentStocks(); j < this.totalCurrentStocks() + quantity; j++){ 
                            Laptop l = new Laptop(brand, SS, RAM, 2, OS, 3); // Assuming two years of warranty
                            laptops.add(l);
                            writeRepo();
                        }
                        this.availableLaptopStock += quantity;
                        if (this.totalCurrentStocks()+quantity >= TOTALSTOCK) throw new StockLimitException();
                    } 
                    
                    i += 6;
                }
                               
            }
        }
        catch(IOException ex){
            System.out.println("File not found");
        }
    }

    public void writeRepo(){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Repository.txt"))) {

	//For smartphones	
        for(SmartPhone sp:smartphones){
            bw.write("Type:1");
            bw.newLine();
            bw.write("Quantity:1");
            bw.newLine();
            bw.write("Brand:"+sp.getBrand());
            bw.newLine();
            bw.write("ScreenSiz:"+sp.getScreenSize());
            bw.newLine();
            bw.write("Storage:"+sp.getStorageCapacity());
            bw.newLine();
         }
		 
	//For Television	
        for(Television tv:televisions){
            bw.write("Type:2");
            bw.newLine();
            bw.write("Quantity:1");
            bw.newLine();
            bw.write("Brand:"+tv.getBrand());
            bw.newLine();
            bw.write("EnergyRating:"+tv.getERating());
            bw.newLine();
            bw.write("Weight:"+tv.getWeight());
            bw.newLine();
         }
	
        //For Laptops
	for(Laptop lp:laptops){
            bw.write("Type:3");
            bw.newLine();
            bw.write("Quantity:1");
            bw.newLine();
            bw.write("Brand:"+lp.getBrand());
            bw.newLine();
            bw.write("RAM:"+lp.getRam());
            bw.newLine();
            bw.write("Operating System:"+lp.getOpSystem());
            bw.newLine();
        }
        bw.close();
	} catch (IOException e) {
            e.printStackTrace();
	}
        
    }

}
       

