/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class diamondP
{
	public static void main(String[] args) {
	int n=4;
   for(int i=1;i<=n;i++)
   {
       
       for(int j=1;j<=n-i;j++)
       {
           System.out.print(" ");
       }
       for(int j=1;j<=(2*i)-1;j++)
       {
           System.out.print("*");
       }
        System.out.print("\n");
   }
    for(int i=n;i>=1;i--)
   {
       
       for(int j=1;j<=n-i;j++)
       {
           System.out.print(" ");
       }
       for(int j=1;j<=(2*i)-1;j++)
       {
           System.out.print("*");
       }
        System.out.print("\n");
   }
 
	
}
}
