
public class Day02 {
	// (((10-2)+2)*2)-2)/2)
	public int sub(int a,int b) {
		int sub;
		sub = a-b;
		System.out.println("Sub result =" + sub);
		return sub;
	}
	public int sum(int c,int d) {
		int sum;
		sum = c+d;
		System.out.println("Sum result =" + sum);
		return sum;
	}
	public int mul(int e,int f)
	{
		int mul ;
		mul = e*f;
		System.out.println("Multiply result =" + mul);
		return mul;
	}
	public void div(int g,int h)
	{
		int div;
		div=g/h;
		System.out.println("Div result =" + div);
	}
	// (((10-2)+2)*2)-2)/2)
	public static void main(String[] args) {
		Day02 answer = new Day02();
		int sub=answer.sub(10, 2);
		int sum=answer.sum(sub, 2);
		int mul=answer.mul(sum, 2);
		int sub1=answer.sum(mul, 2);
		answer.div(sub1, 2);
		
			}
}
