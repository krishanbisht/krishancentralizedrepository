
public class Day03_Assignment1 
{	
       public Day03_Assignment1 ()
       {
    	   this(1,2,3);
    	   System.out.println("Default Constructor");
       }
       public Day03_Assignment1 (int a)
       {
    	   this();
    	   System.out.println("1 parameterized constructor");
       }
       public Day03_Assignment1 (int a1,int a2)
       {
    	   this(1,2,3,4);
    	   System.out.println("2 parameterized constructor");
       }
       public Day03_Assignment1 (int b1,int b2,int b3)
       {
    	   System.out.println("3 parameterized constructor");
       }
       public Day03_Assignment1(int c1,int c2,int c3,int c4)
       {
    	   this(1);
    	   System.out.println("4 parameterized constructor");
       }
	public static void main(String[] args) {
		Day03_Assignment1 d = new Day03_Assignment1(1,2);

	}

}
