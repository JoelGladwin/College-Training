

public class Main
{
	public static void main(String[] args) {
		
		int arr[] = {1,1,0,1,1,0,0,0,1,1,1,1,0};
		
		int val = 0;
		
		int count = 0;
		int max_count = 0;
		
		for(int i=0;i<arr.length;i++){
		    if(arr[i] == val){
		        count++;
		    }
		    else{
		        if(count > max_count){
		            max_count = count;
		        }
		        count = 0;
		    }
		    
		}
		System.out.println("Maximum count of "+val+" is "+max_count);
	}
}