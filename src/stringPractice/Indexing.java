package stringPractice;

public class Indexing 
{
	public static void main(String[] args) 
	{
	
		String str1 = "Payment of $100 done";
		System.out.println(str1.indexOf("$"));
		int i =str1.indexOf("$");
		System.out.println(str1.substring(i));
		System.out.println(str1.charAt(i));
		
		
		// String str1 = "Payment of $100 done"; from this string bring number only 
		System.out.println("--------");
		String str2 = "Payment of $10023423423 done";
		int startindex = str2.indexOf("$");
		String substring = str2.substring(startindex);
		int stopindex = substring.indexOf(" ");
		String finalstring = substring.substring(1, stopindex);
		System.out.println(finalstring);
		
		
	}

}
