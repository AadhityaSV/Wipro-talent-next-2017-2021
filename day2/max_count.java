import java.util.*; 
public class Main
{
	public static void main(String[] args) {
	    int a[]=new int[30];
	    int i=0;
	    Scanner s=new Scanner(System.in);
	    for(i=0;i<10;i++)
	    {
	        a[i]=s.nextInt();
	    }
	    int max=a[i];
	    for(i=0;i<10;i++)
	    {
	        if(a[i]>max)
	            max=a[i];
	    }
	    int c=0;
	    for(i=0;i<10;i++)
	    {
	        if(a[i]==max)
	            c++;
	    }
		System.out.println("No of times max elment is :");
		System.out.println(c);
	}
}
