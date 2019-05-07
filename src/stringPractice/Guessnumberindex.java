package stringPractice;

public class Guessnumberindex 
{
	public static void main(String[] args) 
	{
		int[] a = {2,3,4,6,5,8,9,12,321,312,312,321,3,213,213,23435,435345345,345,345,345,345345,345,345,345,345,345,435,345,45345,345,345,345345,345,345,345,345,3454,5,35,345,345,345,8,7};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==8)
			{
				System.out.println("8 is stored at "+(i+1)  +"th index");
				
			}
			
			else
			{
				continue;
			}
		}

	}
}
