package hw1;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student("Lee","�¹���1");
		studentLee.addBook("�¹���2");
		
		Student studentKim= new Student("Kim","����1");
		studentKim.addBook("����2");
		studentKim.addBook("����3");
		
		Student studentChoi= new Student("Choi","�ظ�����1");
		studentChoi.addBook("�ظ�����2");
		studentChoi.addBook("�ظ�����3");
		studentChoi.addBook("�ظ�����4");
		studentChoi.addBook("�ظ�����5");
		studentChoi.addBook("�ظ�����6");
		
		studentLee.showStudentInfo1();
		studentKim.showStudentInfo2();
		studentChoi.showStudentInfo1();

		
		
	}

}
