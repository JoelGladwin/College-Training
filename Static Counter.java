import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		Counter o1 = new Counter();
		Counter o2 = new Counter();
		Counter o3 = new Counter();
		Counter.display();
	}
}

class Counter{
    
    static int count = 0;
    
    Counter(){
        Counter.count++;
    }
    
    static void display(){
        System.out.println("Total Count: "+Counter.count);
    }
}