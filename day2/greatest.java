import java.util.*; 
public class Main
{
	public static void main(String[] args) {
	    int a[]=new int[30];
	    int i=0;
	    Scanner s=new Scanner(System.in);
	    for(i=0;i<25;i++)
	    {
	        a[i]=s.nextInt();
	    }
	    int max=a[i];
	    for(i=0;i<25;i++)
	    {
	        if(a[i]>max)
	            max=a[i];
	    }
		System.out.println("Greatest no is");
		System.out.println(max);
	}
}
