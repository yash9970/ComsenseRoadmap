/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class trapwater
{
	public static void main(String[] args) {
		int height[]={4,2,0,6,3,2,5};
		int n=height.length;
		int leftmax[]=new int[n];
		int rightmax[]=new int[n];
		
		//for right max 
		leftmax[0]=height[0];
		for(int i=1;i<n;i++)
		{
		    leftmax[i]=Math.max(height[i],leftmax[i-1]);
		}
		
		//for right max
		
		rightmax[n-1]=height[n-1];
		for(int i=n-2;i>=0;i--)
		{
		    rightmax[i]=Math.max(height[i],rightmax[i+1]);
		}
		
		//now calculate water lavel
		for(int i=0;i<n;i++)
		{
		    System.out.print(leftmax[i]+" ");
		}
		int trapedwater=0;
		for(int i=0;i<n;i++)
		{
		    int waterlevel=Math.min(leftmax[i],rightmax[i]);
		    trapedwater+=waterlevel-height[i];
		}
		System.out.print(trapedwater);
	}
}
