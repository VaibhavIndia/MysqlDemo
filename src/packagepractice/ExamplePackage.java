package packagepractice;

import inheritance.Grandfather;

public class ExamplePackage {

	int i =0;
	public void test1()
	{
		System.out.println("this is test 1 method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExamplePackage2 t = new ExamplePackage2();
		Grandfather f =  new Grandfather();
		t.test2();

	}

}
