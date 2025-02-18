
public class Main
{
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6};
		int n = 3;
		
		int start = 0;
		int end = n;
		
		for(int i=0;i<arr.length/n;i++){
		    for(int j=end-1;j>=start;j--){
		        System.out.print(arr[j]+" ");
		    }
		    start += n;
		    end += n;
		}
		
	}
}