public class Main
{
	public static void main(String[] args) {
	    
	    int n = 5;
	    
	    
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=i;j++){
		        System.out.print(j);
		    }
		    System.out.println();
		}
		
		System.out.println();
		
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=i;j++){
		        System.out.print(i);
		    }
		    System.out.println();
		}
		
		System.out.println();
		
		
		int a=1;
		for(int i=1;i<=4;i++){
		    for(int j=1;j<=i;j++){
		        System.out.print(a);
		        a++;
		    }
		    System.out.println();
		}
		
		System.out.println();
		
		for(int i=1;i<=n;i++){
		    for(int sp=1;sp<=n-i;sp++)
		    {
		        System.out.print(" ");
		    }
		    for(int j=1;j<=i;j++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
		
		
		System.out.println();
		
		for(int i=1;i<=n;i++){
		    for(int sp=1;sp<=n-i;sp++)
		    {
		        System.out.print(" ");
		    }
		    for(int j=1;j<=i*2-1;j++){
		        System.out.print("$");
		    }
		    System.out.println();
		}
		
		System.out.println();
		
		for(int i=1;i<=n;i++){
		    for(int sp=1;sp<=n-i;sp++)
		    {
		        System.out.print(" ");
		    }
		    for(int j=1;j<=i*2-1;j++){
		        if(i==n){
		            System.out.print("*");
		        }
		        else if(j==1 || j==i*2-1){
		            System.out.print("*");
		        }
		        else{
		            System.out.print("@");
		        }
		        
		    }
		    System.out.println();
		}
		
		System.out.println();
		
		a = 1;
		for(int i=1;i<=n;i++){
		    for(int sp=1;sp<=n-i;sp++)
		    {
		        System.out.print(" ");
		    }
		    for(int j=1;j<=i*2-1;j++){
		        
		        if(j>=i){
		           System.out.print(a); 
		           a--;
		        }
		        else{
		            System.out.print(a);
		            a++;
		        }
		    }
		    a=1;
		    System.out.println();
		}
		
		System.out.println();
		
		for(int i=1;i<=n;i++){
		    for(int sp=1;sp<=n-i;sp++)
		    {
		        System.out.print(" ");
		    }
		    for(int j=1;j<=i;j++){
		        System.out.print("*");
		        System.out.print(" ");
		    }
		    System.out.println();
		}
		
	}
}