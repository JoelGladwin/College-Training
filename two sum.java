
public class Main
{
	public static void main(String[] args) {
        
        int arr[] = {2,7,5,7};
        int target = 12;
        
        int n = arr.length;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] + arr[j] == target){
                    System.out.print(i+" "+j);
                    System.out.println();	
                }
            }
            
        }
        System.out.println();		
	}
}
