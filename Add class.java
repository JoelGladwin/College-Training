

public class Main
{
	public static void main(String[] args) {
    	
    	Add a = new Add();
    	a.set(1,3);
    	int res = a.sum();
    	
    	System.out.println(res);
	}
}

class Add{
    private int a,b;
    private int c = 0;
    
    void set(int a,int b){
        this.a = a;
        this.b = b;
        sum();
    }
    
    public int sum(){
        c = a+b;
        return c;
    }
    
}