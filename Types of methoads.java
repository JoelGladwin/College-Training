import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		
		Calculator obj = new Calculator();
		obj.add();
		obj.diff(a,b);
		System.out.println("Mul: "+a+"*"+b+": "+obj.mul());
		System.out.println("Div: "+a+"/"+b+": "+obj.div(a,b));
	}
}

class Calculator{
    
    Scanner in = new Scanner(System.in);
    
    //no ret and no arg
    void add(){
        int a = 1;
        int b = 2;
        System.out.println("sum "+a+"+"+b+": "+ (a+b));
    }
    
    //no ret and arg
    void diff(int a, int b){
       System.out.println("Diff "+a+"-"+b+": "+ (a-b));
    }  
    
    //ret and no arg
    int mul(){
       int a = 5;
       int b = 5;
       return a*b; 
    }
    
    //ret and arg
    int div(int a, int b){
        return a/b;
    }
}