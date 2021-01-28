package hw1;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student("Lee","태백산맥1");
		studentLee.addBook("태백산맥2");
		
		Student studentKim= new Student("Kim","토지1");
		studentKim.addBook("토지2");
		studentKim.addBook("토지3");
		
		Student studentChoi= new Student("Choi","해리포터1");
		studentChoi.addBook("해리포터2");
		studentChoi.addBook("해리포터3");
		studentChoi.addBook("해리포터4");
		studentChoi.addBook("해리포터5");
		studentChoi.addBook("해리포터6");
		
		studentLee.showStudentInfo1();
		studentKim.showStudentInfo2();
		studentChoi.showStudentInfo1();

		
		
	}

}
