/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class palinnop
{
	public static void main(String[] args) {
	int n=5;
   for(int i=1;i<=n;i++)
   {
      for(int j=1;j<=n-i;j++)
      {
        System.out.print(" ");
      }
      for(int j=i;j>=1;j--)
      {
        System.out.print(j);
      }
      for(int j=2;j<=i;j++)
      {
        System.out.print(j);  
      }
      System.out.print("\n");
    
       
   }
 
	
}
}
