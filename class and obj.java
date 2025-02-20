import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
	    Student joel = new Student();
	}
}


class Student{
    
    String name;
    int id;
    
    Scanner in = new Scanner(System.in);
    
    Student(){
        get_Details();
    }
    
    void get_Details(){
        
        System.out.println("Enter the Students name: ");
        String name = in.nextLine();
        
        System.out.println("Enter the Student red no: ");
        int id = in.nextInt();
        
        this.name = name;
        this.id = id;
        
        display();
    }
        
    void display(){
        System.out.println(name+" details: ");
        System.out.println("Name: "+name);
        System.out.println("Reg no: "+id);
    }        
}
