public class Main
{
	public static void main(String[] args) {
		int n = 123456;
		int rem;
		int even_val = 0;
		int odd_val = 0;
		int prime_val = 0;
		int count = 0;
		
		while(n>0){
		    rem = n % 10;
		    n = n / 10;
		    if(rem%2 == 0){
		        even_val = even_val * 10 + rem;
		    }
		    else{
		        odd_val = odd_val * 10 + rem;
		    }
		    for(int i=1;i<=rem;i++){
		        if(rem%i == 0){
		            count++;
		        }
		    }
		    if(count == 2){
		        prime_val = prime_val*10+rem;
		    }
		    count = 0;
		}
		
		
		System.out.println(even_val);
		System.out.println(odd_val);
		System.out.println(prime_val);
		
		System.out.println("---");
		
		System.out.println(reverse(even_val));
		System.out.println(reverse(odd_val));
		System.out.println(reverse(prime_val));
	}
	
	public static int reverse(int val){
	    int rem = 0;
	    int res = 0;
	    while(val>0){
	        rem = val %10;
	        val = val / 10;
	        res = res * 10 + rem;
	    }
	    
	    return(res);
	}
}