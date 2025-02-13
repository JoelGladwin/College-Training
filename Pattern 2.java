/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {

		int n = 4;
		int a;


		//pattern 1

		for(int i=1; i<=n; i++) {
			for(int sp=1; sp<=n-i; sp++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n-1; i>=1; i--) {
			for(int sp=1; sp<=n-i; sp++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		//pattern 2

		a = 1;
		for(int i=1; i<=n; i++) {
			for(int sp=1; sp<=n-i; sp++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i*2-1; j++) {

				if(j>=i) {
					System.out.print(a);
					a--;
				}
				else {
					System.out.print(a);
					a++;
				}
			}
			a=1;
			System.out.println();
		}
		for(int i=n-1; i>=1; i--) {
			for(int sp=1; sp<=n-i; sp++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i*2-1; j++) {
				if(j>=i) {
					System.out.print(a);
					a--;
				}
				else {
					System.out.print(a);
					a++;
				}
			}
			a=1;
			System.out.println();
		}
		
		//pattern 3
		
		System.out.println();
		
		for(int i=1;i<=n;i++){
		    for(int sp=1;sp<=n-i;sp++)
		    {
		        System.out.print(" ");
		    }
		    for(int j=1;j<=i*2-1;j++){
		        if(j==1 || j==i*2-1){
		            System.out.print("*");
		        }
		        else{
		            System.out.print("0");
		        }
		        
		    }
		    System.out.println();
		}
		for(int i=n-1; i>=1; i--) {
			for(int sp=1; sp<=n-i; sp++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i*2-1; j++) {
				if(j==1 || j==i*2-1){
		            System.out.print("*");
		        }
		        else{
		            System.out.print("0");
		        }
			}
			System.out.println();
		}
		
		//pattern 4
		
		System.out.println();
		
		for(int i=1;i<=n;i++){
		    for(int sp=1;sp<=n-i;sp++)
		    {
		        System.out.print(" ");
		    }
		    for(int j=1;j<=i;j++){
		        if(j==1 || j==i){
		            System.out.print("*");
		            System.out.print(" ");
		        }
		        else{
		            System.out.print("0");
		            System.out.print(" ");
		        }
		        
		    }
		    System.out.println();
		}
		for(int i=n-1; i>=1; i--) {
			for(int sp=1; sp<=n-i; sp++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				if(j==1 || j==i){
		            System.out.print("*");
		            System.out.print(" ");
		        }
		        else{
		            System.out.print("0");
		            System.out.print(" ");
		        }
			}
			System.out.println();
		}
		
		System.out.println();
		
		//pattern 5 - x pattern
		
		
		for(int i=n; i>=1; i--) {
			for(int sp=1; sp<=n-i; sp++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i*2-1; j++) {
			    if(j==1 || j==i*2-1){
			        System.out.print("*");
			    }
				else{
				    System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=2; i<=n; i++) {
			for(int sp=1; sp<=n-i; sp++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i*2-1; j++) {
				if(j==1 || j==i*2-1){
			        System.out.print("*");
			    }
				else{
				    System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Pattern 6 - JOEL 
		
		n = 5;
		for(int i=1;i<=n;i++){
		    //J
		    for(int j=1;j<=n;j++){
		        if(i==1 || j==3){
		            System.out.print("*");
		        }
		        else if(i==5 && j<3){
		            System.out.print("*");
		        }
		        else if(i==4 && j==1){
		            System.out.print("*");
		        }
		        else{
		            System.out.print(" ");
		        }
		    }
		    for(int sp=1;sp<=n;sp++){
		        System.out.print(" ");
		    }
		    
		    //O
		    for(int j=1;j<=n;j++){
		        if(i==1 || i==n){
		            System.out.print("*");
		        }
		        else if(j==1 || j == n){
		            System.out.print("*");
		        }
		        else{
		            System.out.print(" ");
		        }
		    }
		    for(int sp=1;sp<=n;sp++){
		        System.out.print(" ");
		    }
		    
		    //E
		    for(int j=1;j<=n;j++){
		        if(i%2!=0){
		            System.out.print("*");
		        }
		        else if(j==1){
		            System.out.print("*");
		        }
		        else{
		            System.out.print(" ");
		        }
		        
		        
		    }
		    for(int sp=1;sp<=n;sp++){
		        System.out.print(" ");
		    }
		    
		    //L
		    for(int j=1;j<=n;j++){
		        if(j==1 || i==n){
		            System.out.print("*");
		        }
		        else{
		            System.out.print(" ");
		        }
		    }
		    for(int sp=1;sp<=n;sp++){
		        System.out.print(" ");
		    }
		    System.out.println();
		}

	}
}