import java.util.*;

public class kadansalgo
{
	public static void main(String args[])
	{
		int cs=0;
		int ms=0;
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			cs=cs+arr[i];
			ms=Math.max(ms,cs);
			if(cs<0)
			{
				cs=0;
			}
		}
		System.out.print("max sum is "+ms);
	}
}
		