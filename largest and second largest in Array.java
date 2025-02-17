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
		
		int max = arr[0];
		
		for(int i=1;i<arr.length;i++){
		    if(arr[i]>max){
		        max = arr[i];
		    }
		}
		
		System.out.println("Max in array: "+max);
		
		//second largest using min and max
		
		int min = 0;
		for(int i=0;i<arr.length;i++){
		    if(arr[i]<max && arr[i]>min){
		        min = arr[i];
		    }
		}
		
		System.out.println("Second Largest in array: "+min);
		
		//sorting array
		
		Arrays.sort(arr);
		
		System.out.println("Second Largest in array: "+arr[size-2]);
	}
}