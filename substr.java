import java.io.*;
import java.util.*;
class  Solution
{
	void permu(String s,String ans)
	{
		if(s.length==0)
			System.out.println(ans+ " ");
		for(int i=0;i<s.length;i++)
		{
			char c=s.charAt(i);

			String ros=s.substring(0,i)+s.substring(i+1);

			permu(ros,ans+c);
		}

	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		permu(s,"");
	}
}
