
package testassignmentii;


public class Phone extends Product{
    
    int gigStorage;
    
    public Phone(String code, String description, double price, int gigStorage){
        super(code,description,price);
        this.gigStorage = gigStorage;
    }
    
}
