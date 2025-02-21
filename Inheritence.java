import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
	Display obj = new Display();
	
	obj.display();
		
	}
}

class Add{
    private int a = 5;
    private int b = 6;
    
    int get_a(){
        return a;
    }
    
    int get_b(){
        return b;
    }
}

class Display extends Add{
    
    void display(){
        System.out.println("Sum: " + (get_a()+get_b()));
    }
    
}