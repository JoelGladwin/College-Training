public class SeriesPattern {
	
	public static void main(String[] args) {
		
		int num = 9;
		int n = 4;
		
		int total = 0;
		int sum = 0;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				total = total * 10 + num;
			}
			sum = sum + total;
			System.out.println(total);
			total = 0;
		}
		System.out.println("Total sum: "+sum);
	}
	
}
