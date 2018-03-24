
package testassignmentii;
import java.util.*;


public class Product implements IPrintable {
    
    private String code;
    private String description;
    private double price;
    private static ArrayList<Product> myArray =new ArrayList<>();
    
    public Product(String code, String description, double price){
        this.code = code;
        this.description = description;
        this.price = price;
        
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public static ArrayList<Product> getMyArray() {
        return myArray;
    }
    
    
    
    @Override
    public void print(){
        System.out.println("Code: " + this.getCode());
        System.out.println("Description: " + this.getDescription());
        System.out.println("Price: " + this.getPrice());
    }
    

    

}