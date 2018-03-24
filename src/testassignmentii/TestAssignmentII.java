
package testassignmentii;


import static testassignmentii.Inventory.*;

public class TestAssignmentII {


    public static void main(String[] args) {
        
        Book b = new Book("1A4B", "a weird book", 19.95, "Weirdness in Action", "Pete Jones");
        Book c = new Book("2B!2B", "another book", 21.95, "The Nature of Devils", "Joan Crawford");
        Phone ph = new Phone("444A", "A gold phone", 699.95, 128);
        addProduct(b);
        addProduct(c);
        addProduct(ph);
        printInventory();
        Product p = getProduct("1A4B");
        System.out.println("I'm going to buy: " + b.getCode());
        removeProduct(b);
        System.out.println("I'm going to buy: " + ph.getCode());
        removeProduct(p);
        System.out.println("Removed a product");
        printInventory();
        
        
       
    }
    
    
    
}
