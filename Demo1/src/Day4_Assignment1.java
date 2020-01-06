// (((((x1+x2)-x3)+x4)*x5)/x6)
import java.util.Scanner;

public class Day4_Assignment1 {
	private int x1;
	private int x2;
	public int sum(int x1,int x2)
	{
		int sum;
		sum=x1+x2;
		System.out.println("Sum result = "+ sum);
		return sum;
	}
	public int sub(int x1,int x2)
	{
		int sub;
		sub=x1-x2;
		System.out.println("Sub result = "+ sub);
		return sub;
	}
	public int mul(int x1,int x2)
	{
		int mul;
		mul=x1*x2;
		System.out.println("Mul result = "+ mul);
		return mul;
	}
	public void div(int x1,int x2)
	{
		int div;
		div=x1/x2;
		System.out.println("Div result = "+ div);
		
	}
	public static void main(String[] args) {
		Day4_Assignment1 obj1 = new Day4_Assignment1();
		obj1.mul(obj1.x1,obj1.x2);
	}

}
