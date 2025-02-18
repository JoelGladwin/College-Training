
public class Main
{
	public static void main(String[] args) {
        String a = "111011011011";
        String b = "1110";
        
        int size = a.length() - b.length() + 1;
        
        int end = b.length();
        
        int count = 0;
        int occ = 0;
        
        System.out.println("Combinations of "+a);
        System.out.println();
        
        int z = 0;
        for(int i=0;i<size;i++){
            for(int start = i;start < end;start++){
                
                System.out.print(a.charAt(start));
                if(a.charAt(start) == b.charAt(z)){
                    count++;
                    z++;
                }
            }
            if(count == 4){
                System.out.print(" "+true);
                occ ++;
            }
            z=0;
            count = 0;
            end++;
            System.out.println();
        }
        System.out.println();
        System.out.println("There is "+occ+"occurence of "+b);
	}
}
