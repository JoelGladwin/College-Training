//Generate all the prime numbers for n numbers

public class Main
{
	public static void main(String[] args) {
	    
	   //Using for
	   int n = 10;
	   int count = 0;
	   for(int i=1;i<=n;i++){
	       if(i == 1){
               continue;	          
	       }
	       for(int j=1;j<=i;j++){
	           if(i%j==0){
	               count++;
	           }
	       }
	       if(count == 2){
	           System.out.print(i+" ");
	       }
	       count = 0;
	   }
	   
	   //using while
	   int i=2;
	   while(i<=n){
	       int j = 1;
	       while(j<=i){
	           if(i%j == 0){
	               count++;
	           }
	           j++;
	       }
	       if(count == 2){
	           System.out.print(i+" ");
	       }
	       count = 0;
	       i++;
	   }
	}
	
}