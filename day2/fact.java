import java.util.*; 
public class Main
{
	public static void main(String[] args) {
	    int a;
	    int i=0,f=1;
	    System.out.println("Enter the no :");
	    Scanner s=new Scanner(System.in);
	    a=s.nextInt();
	    for(i=1;i<=a;i++)
	    {
	        f=f*i;
	    }
		System.out.println("factorail is : ");
		System.out.println(f);
	}
}
