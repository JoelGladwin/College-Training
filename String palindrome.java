import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		String str = "abcna";
		int s = 0;
		int e = str.length()-1;
		boolean ispal = true;
		
		while(s <= e){
		    ispal = true;
		    if(str.charAt(s) != str.charAt(e)){
		        ispal = false;
		        break;
		    } 
		    s++;
		    e--;
		}
		System.out.println(ispal);
		
	}
}

