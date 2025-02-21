import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		System.out.println("Area of circle: "+Area.area(3.0));
		System.out.println("Area of square: "+Area.area(2));
		System.out.println("Area of rectangle: "+Area.area(2,3));
		
	}
}

class Area{
    
    //Circle pi r square
    static double area(double r){
        double pi = 3.14;
        double res = pi * (r*r);
        return res;
    }
    //square a*a
    static int area(int a){
        return(a*a);
    }
    //rectangle l * w
    static int area(int l,int b){
        int res = l*b;
        return(res);
    }
}