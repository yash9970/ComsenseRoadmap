/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class rectanglePattern
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
		    for(int j=1;j<=5;j++)
		    {
		        // for stars
		        if(i==1 || i==5 || j==1 || j==5)
		        {
		            System.out.print("*");
		            
		        }
		        else
		        {
		            // for spaces 
		            System.out.print(" ");
		        }
		        
		    }
		    System.out.print("\n");
		}
	}
}
