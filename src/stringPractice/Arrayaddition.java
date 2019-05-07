package stringPractice;

public class Arrayaddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,5,9,7,11};
		int sum = 0;
		for (int i=0 ;i<a.length;i++)
		{
			sum = sum + a[i];
		}
		
		System.out.println(sum);
	}

}
