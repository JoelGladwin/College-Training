import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the size of array: ");
		int size = in.nextInt();
		
		int int_arr[] = new int[size];
		
		System.out.println("Enter Integer Values");
		for(int i=0;i<size;i++){
		    int_arr[i] = in.nextInt();
		}
		
		System.out.println("Integer Values");
		for(int i=0;i<size;i++){
		    System.out.println(int_arr[i]);
		}
		
		float fl_arr[] = new float[size];
		
		System.out.println("Enter Float Values");
		for(int i=0;i<size;i++){
		    fl_arr[i] = in.nextFloat();
		}
		
		System.out.println("Float Values");
		for(int i=0;i<size;i++){
		    System.out.println(fl_arr[i]);
		}
		
		
		
		System.out.println("Enter Character Values");
		
		char ch_arr[] = in.next().toCharArray();
		
		
		System.out.println("Character Values");
		for(int i=0;i<ch_arr.length;i++){
		    System.out.println(ch_arr[i]);
		}
	}
}
