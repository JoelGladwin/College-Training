

public class Main
{
	public static void main(String[] args) {
		
		Book b1 = new Book();
	}
}

class Book{
    String title;
    float price;
    
    Book(){
        this.title = "Java Programming";
        this.price = 100.0f;
        display();
    }
    
    void display(){
        System.out.println("Book Title: "+this.title);
        System.out.println("Book Price: "+this.price);
    }
}