package trycatch;

public class Withtrycatch 
{
	public static void main(String args[])
	{
		try
		{
			System.out.println(9/0);
		}
		catch(Exception e)
		{
			System.out.println("Error is "+e);
		}
	}
}
