
public class Main
{
	public static void main(String[] args) {
	    //-128 to 127 byte limit
		byte a =(byte) (200),b = (byte) (100);
	    byte sum = (byte) (a+b);
	    byte diff = (byte) (a-b);
	    byte div = (byte) (a/b);
	 
		System.out.println(sum);
		System.out.println(diff);
		
	}
}