//Array shifting

public class Main
{
	public static void main(String[] args) {

		int a[] = {10,20,5,1,3,2};

		// op - 1 3 2 10 3 5

		int n = 3;

		int temp;

		for(int j=0; j<n; j++) {
			for(int i=a.length-1; i>0; i--) {
				temp = a[i];
				a[i] = a[i-1];
				a[i-1] = temp;
			}
		}


		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
