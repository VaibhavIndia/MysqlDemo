package trycatch;

public class MultipleCatchblock {

	public static void main(String args[])
	{
		try
		{
			//System.out.println(9/0);
			int a[] = new int[3];
		
			System.out.println(a[5]);
			System.out.println("hello");
		}
		/*
		catch(ArithmeticException ar)
		{
			System.out.println("Error is "+ar);
		}
		catch(ArrayIndexOutOfBoundsException b)
		{
			System.out.println("Error is "+b);
		}
		catch(Exception e)
		{
			System.out.println("Error is "+e);
		}*/
		finally
		{
			System.out.println("this is executed everytime");
		}
	}
}
