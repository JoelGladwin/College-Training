public class Main
{
	public static void main(String[] args) {
		int n = 123456;
		int rem;
		int even_sum = 0;
		int odd_sum = 0;
		int prime_sum = 0;
		int count = 0;
		while(n>0){
		    rem = n % 10;
		    n = n / 10;
		    if(rem%2 == 0){
		        even_sum+=rem;
		    }
		    else{
		        odd_sum+=rem;
		    }
		    for(int i=1;i<=rem;i++){
		        if(rem%i == 0){
		            count++;
		        }
		    }
		    if(count == 2){
		        prime_sum += rem;
		    }
		    count = 0;
		}
		System.out.println(even_sum);
		System.out.println(odd_sum);
		System.out.println(prime_sum);
	}
}