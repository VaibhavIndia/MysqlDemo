package stringPractice;

public class ReverseString 
{
	public static void main(String[] args) 
	{
		String str= "vaibhav";
		String str1="";
		for (int i =str.length()-1; i>=0;i--)
		{
			str1=str1 + str.charAt(i);
//			System.out.print(str.charAt(i));
		}

		System.out.println(str1);
		if (str.equalsIgnoreCase(str1))
		{
			System.out.println("String is palindrome");
		}
		else 
		{
			System.out.println("String is not pallindrome");
		}
	}

}
