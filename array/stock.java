/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class stock
{
	public static void main(String[] args) {
		int price[]= {7,1,5,3,6,4};
		int buyprice=Integer.MAX_VALUE;
		int maxprofit=0;

		for(int i=0; i<6; i++)
		{
			if(buyprice < price[i])
			{
				int profit=price[i]-buyprice;
				maxprofit=Math.max(maxprofit,profit);
			}
			else
			{
				buyprice=price[i];
			}
		}
		System.out.print("profit is "+ maxprofit);
	}
}
