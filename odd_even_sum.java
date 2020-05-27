import java.util.Scanner; 
public class Main
{
	public static void main(String[] args) {
	    int a,b,c;
	   
	    Scanner s=new Scanner(System.in);
	    a=s.nextInt();
	    b=s.nextInt();
	    c=a+b;
	    if(c%2==0)
		    System.out.println("EVEN");
	
		else
		    System.out.println("ODD");
    	}
}
