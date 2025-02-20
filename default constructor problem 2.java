import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		Car b1 = new Car();
	}
}

class Car{
    
    String brand;
    
    Scanner in = new Scanner(System.in);
    
    Car(){
        this.brand = "Unknown";
        display();
        setBrand();
        display();
    }
    void setBrand(){
        System.out.println("Enter the Brand name: ");
        this.brand = in.nextLine();
    }
    void display(){
        System.out.println("Brand: "+this.brand);
    }
    
}