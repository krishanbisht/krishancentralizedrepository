package pkg1;

public class Day03_Assignment2 {

	public void method()
	{
		System.out.println("default method");
	}
	public void method1(int a)
	{
		System.out.println("1 parameter method");
	}
	public void method2(int a,int b)
	{
		System.out.println("2 parameter method");
	}
	public void method3(int a,int b,int c)
	{
		System.out.println("3 parameter method");
		this.method();
		this.method1(1);
		this.method2(2, 4);
		this.method4(2, 3, 4,5);
	}
	public void method4(int a,int b, int c,int d)
	{
		System.out.println("4 parameter method");
	}
	public static void main(String[] args) {
		Day03_Assignment2 obj = new Day03_Assignment2();
		obj.method3(2, 3, 4);
	}

}
