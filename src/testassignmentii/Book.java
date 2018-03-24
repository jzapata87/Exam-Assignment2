
package testassignmentii;



public class Book extends Product {
    
    private String author;
    private String title;
    
    
    public Book(String code,String description,double price ,String author, String title) {
        super(code, description, price);
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    
    public String getTitle() {
        return title;
    }
   
    @Override
    public void print(){
        super.print();
        System.out.println("Code: " + this.getAuthor());
        System.out.println("Title: " + this.getTitle());
    }
    
}
