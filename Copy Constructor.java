

public class Main
{
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(10,5);
		
		Rectangle r2 = new Rectangle(r1);
		
	}
}

class Rectangle{
    
    int length;
    int breadth;
    
    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
        display();
    }
    
    Rectangle(Rectangle r1){
        this.length = r1.length;
        this.breadth = r1.breadth;
        display();
    }
    
    void display(){
        System.out.println("Length: "+length);
        System.out.println("Breadth: "+breadth);
    }
}