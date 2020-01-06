
public class Day2 {
    // (((10+2)-2)+2)*2)/2)
	public int sum(int a,int b) {
		int sum;
		sum = a+b;
		System.out.println("Sum result =" + sum);
		return sum;
	}
	public int sub(int c,int d) {
		int sub;
		sub = c-d;
		System.out.println("Sub result =" + sub);
		return sub;
	}
	public int mul(int e,int f)
	{
		int mul ;
		mul = e*f;
		System.out.println("Multiplication result =" + mul);
		return mul;
	}
	public void div(int g,int h)
	{
		int div;
		div=g/h;
		System.out.println("Div result =" + div);
	}
	// (((10+2)-2)+2)*2)/2)
	public static void main(String[] args) {
		Day2 answer = new Day2();
		int sum=answer.sum(10, 2);
		int sub=answer.sub(sum, 2);
		int sum1=answer.sum(sub, 2);
		int mul=answer.mul(sum1, 2);
		answer.div(mul, 2);
		
	}

}
