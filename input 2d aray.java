import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the row and columen of DD array: ");
		int row = in.nextInt();
		int column = in.nextInt();
		
		int[][] arr = new int[row][column]; 
		
		int r =1;
		for(int i=0;i<row;i++){
		    System.out.println("row "+ r);
		    for(int j=0;j<column;j++){
		        arr[i][j] = in.nextInt();       
		    }
		    r++;
		}
		
		System.out.println("DD Arry: ");
		for(int i=0;i<row;i++){
		    for(int j=0;j<column;j++){
		        System.out.print(arr[i][j]+" ");
		    }
		    System.out.println();
		}
		
	}
}
