
public class Student {

		int age;
		int rollno;
		
		public void display() {
			System.out.println("Welcome all of you");
		}
		
		public static void main(String[] args) {
			Student student = new Student();
			student.age=26;
			student.rollno=25;
			System.out.println("Age of student " + student.age);
			System.out.println("Roll no of student " + student.rollno);
			student.display();
			
		}

	}


