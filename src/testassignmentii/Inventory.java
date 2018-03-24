/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testassignmentii;
import java.util.*;


public class Inventory {
    
    
    

    
    public static void addProduct(Product product){
        Product.getMyArray().add(product);
        
    }
    
    public static void removeProduct(Product product){
        
        Product.getMyArray().remove(product);
        
    }
    
    public static void removeProductAtIndex(int n){
        Product.getMyArray().remove(n);
    }
    
    public static Product getProduct(String string){
        
    
        for (Product product : Product.getMyArray()){
            
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
        
        for (Product product:Product.getMyArray()){ 
            product.print();
            System.out.println("");
        }
        
    }
}   
