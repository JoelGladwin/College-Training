import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int size = in.nextInt();
		
		
		System.out.println("Enter the array elements: ");
		int arr[] = new int[size];
		
		for(int i=0;i<size;i++){
		    arr[i] = in.nextInt();
		}
		
		//display array elements
		
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		//reverse
		
		for(int i=arr.length-1;i>=0;i--){
		    System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		//for each
		
		for(int i : arr){
		    System.out.print(i+" ");
		}
		
		System.out.println();
		
		//Changing the values for each loop
		
		for(int i : arr){
		    i++;
		    System.out.print(i+" ");
		}
		
		System.out.println();
		
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		//changing values in for loop
		
		for(int i=0;i<arr.length;i++){
		    arr[i]++;
		    System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]+" ");
		}
		
		
		
	}
}