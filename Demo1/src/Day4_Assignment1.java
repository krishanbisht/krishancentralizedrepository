// (((((x1+x2)-x3)+x4)*x5)/x6)
import java.util.Scanner;

public class Day4_Assignment1 {
	/*private int x1;
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
*/
	int a,b,c,d,e,f;
		public Day4_Assignment1()
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter x1 value : ");
			this.a = s.nextInt();
			System.out.println("Enter x2 value : ");
			this.b = s.nextInt();
			System.out.println("Enter x3 value : ");
			this.c = s.nextInt();
			System.out.println("Enter x4 value : ");
			this.d = s.nextInt();
			System.out.println("Enter x5 value : ");
			this.e = s.nextInt();
			System.out.println("Enter x6 value : ");
			this.f = s.nextInt();
			s.close();
		}
		public int sum(int a, int b)
		{
			int sum_result;
			sum_result = a+b;
			return sum_result;
		}
		public int sub(int a, int b)
		{
			int sub_result;
			sub_result = a-b;
			return sub_result;
		}
		public void multiply(int a, int b)
		{
			int sum_result = this.sum(this.a, this.b);
			int sub_result = this.sub(sum_result, this.c);
			int sum_result2 = this.sum(sub_result, this.d);
			int multi_result = sum_result2*this.e;
			this.divide(multi_result,this.f);
		}
		
		public void divide(int a ,int b)
		{
			int div_result = a/b;
			System.out.println("Final result is :" +div_result);
		}
		public static void main(String[] args)
		{
			Day4_Assignment1 obj1 = new Day4_Assignment1();
			obj1.multiply(obj1.a, obj1.b);
		}
}
