/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testassignmentii;
import java.util.*;


public class Inventory {
    
    private static ArrayList<Product> myArray =new ArrayList<>();;
    

    
    public static void addProduct(Product product){
        myArray.add(product);
        
    }
    
    public static void removeProduct(Product product){
        
        myArray.remove(product);
        
    }
    
    public static void removeProductAtIndex(int n){
        myArray.remove(n);
    }
    
    public static Product getProduct(String string){
        
    
        for (Product product : myArray){
            
            if (product.getCode().equals(string)){
                return product;
            } else {
                System.out.println("No such product exisit");
                return null;
            }
        }
        return null;
    }   
        
    
                
                
    

    
    public static void printInventory(){
        
        System.out.println("Inventory");
        System.out.println("-----------");
        
        for (Product product:myArray){ 
            product.print();
            System.out.println("");
        }
        
    }
}   
