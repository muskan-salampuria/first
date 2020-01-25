import java.io.*;
import java.util.*;
class Cranky
{
	public static int satisfied(int[] cust,int[] crank,int z)
	{
		int maxi=0,n=0;
		int[] a=new int[z];
		for(int i=0;i<cust.length-z;i++)
		{
			int j,max=0;
			for(j=i;j<i+z;j++)
			{
				max=max+cust[j];
			}
			if(maxi<max)
			{
				maxi=max;
				for (int k=0;k<z;k++)
				{
					a[k]=j;
					j--;
				}
			}
		}
		System.out.println("max"+maxi);
		for (int k=0;k<z;k++)
				{
					System.out.println("a["+k+"]"+a[k]);
					if(crank[a[k]]==1)
						crank[a[k]]=0;
				}
		for (int k=0;k<cust.length;k++)
				{
					if(crank[k]==0)
						n=n+cust[k];
				}
		return(n);
	}
	public static void main(String[] args) throws IOException 
	{
		Scanner scan=new Scanner(System.in);
		int[] cust=new int[8];
		int[] crank=new int[8];
		for(int i=0;i<8;i++)
		{
			cust[i]=scan.nextInt();
		}
		for(int i=0;i<8;i++)
		{
			crank[i]=scan.nextInt();
		}
		int z=scan.nextInt();
		int r=satisfied(cust,crank,z);
		System.out.println(r);
	}
}
