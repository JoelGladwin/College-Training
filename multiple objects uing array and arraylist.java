import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		//Using array list
		
		//ArrayList<Student> custArr = new ArrayList<Student>();
		//custArr.add(new Student());
		//custArr.get(0);
	    
	    //using array
	    
	    Student[] arr = new Student[2];
	    
	    for(int i=0;i<arr.length;i++){
	        arr[i] = new Student();
	    }
	    
	    System.out.println(arr[0].id);
	    System.out.println(arr[1].id);
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
        
        System.out.println();
    }        
}
