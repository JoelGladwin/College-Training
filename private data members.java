import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Add obj = new Add();
		obj.display();
	}
}

class Add{
    private int a,b,c;
    private int d;
    
    Scanner in = new Scanner(System.in);
    
    private int get(){
        System.out.println("Enter three values: ");
    	
    	int a = in.nextInt();
    	int b = in.nextInt();
    	int c = in.nextInt();
    	
    	return(a+b+c);
    }
    
    public void display(){
        System.out.println(get());
    }
}