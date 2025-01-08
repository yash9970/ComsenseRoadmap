public class Typeconversion
{
	public static void main(String[] args) {
		// lets start with type conversion 
		// we can convert one type of data to another type but only if it is capable to convert and source type < destination type
		int a=12; // this is an Integer value. So, it has size of 4 bytes
		long b=a; // we are converting int which is having size of 4 bytes to long which have size of 4 bytes
		System.out.print(b);// Printing it and we get 12
		//java converting it automaticaly but when we do reverse of it long to int then it is not possiable
		//we can convert byte->short->int->float->long->double
	}
}
