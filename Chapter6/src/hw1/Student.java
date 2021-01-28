package hw1;

import java.util.ArrayList;

public class Student {

	private String studentName;
	
	private ArrayList<Book> book = new ArrayList<Book>();
	
	public Student(String studentName, String bookName)
	{
		this.studentName=studentName;
		Book theBook=new Book(bookName);
		book.add(theBook);
	}
	public void addBook(String bookName)
	{
		Book theBook= new Book(bookName);
		book.add(theBook);
	}
	public void showStudentInfo1()
	{
		System.out.print(studentName+" 학생이 읽은 책은: ");
		for(Book e : book)
		{
			System.out.print(e.getBookName()+" ");
		}
		System.out.println("입니다.");
	}
	public void showStudentInfo2()
	{
		System.out.print(studentName+" 학생이 읽은 책은: ");
		for(int i=0; i< book.size();i++)
		{
			Book e= book.get(i);
			System.out.print(e.getBookName()+" ");
		}
		System.out.println("입니다.");
	}
	
}
