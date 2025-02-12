
public class Main
{
	public static void main(String[] args) {
	    int a = 2, b = 1,c = 3;
	    int max = ((a>b) && (a>c))?a:(b>c)?b:c;
	    System.out.println(max+" is greater");
	}
}