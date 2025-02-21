//public scope

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
    	
    	Add obj = new Add();
    	
    	Scanner in = new Scanner(System.in);
    	
    	System.out.println("Enter three values: ");
    	
    	obj.a = in.nextInt();
    	obj.b = in.nextInt();
    	obj.c = in.nextInt();
    	
    	int res = obj.sum();
    	
    	System.out.println(res);
	}
}

class Add{
    public int a,b,c;
    public int d = 0;
    
    public int sum(){
        d = a+b+c;
        return d;
    }
    
}