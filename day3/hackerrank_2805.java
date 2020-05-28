public static longpthfactor(long n,long p)
{
		int i=0,c=0,k,k=0,l=1;
		long a[]=new long[1000];
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				a[c]=i;
				c++;
			}
		}
		for(i=1;i<=n;i++)
		{
			if(p==(i+1))
			{
				l=a[i];
				k++;
			}
		}
			
		if(k==0)
			return 0;
		else
			return l;
}