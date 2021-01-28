package array;

import java.util.ArrayList;

public class Student {
	private int studentID;
	private String studentName;
	
	public Student(int studentID,String studentName)
	{
		this.studentID=studentID;
		this.studentName=studentName;
	}
	
	ArrayList<Subject> subject = new ArrayList<Subject>();
	
	public void addSubject(String subjectName,int score)
	{
		Subject sub= new Subject(subjectName,score);
		subject.add(sub);
	}
	public void showStudentInfo()
	{
		int total=0;
		/*for(Subject e : subject)
		{
			total+=e.getScore();
			System.out.println(studentName+"�л��� "+e.getSubjectName()+" ������ ������"+ e.getScore()+"�� �Դϴ�.");
		}*/
		for(int i=0; i< subject.size();i++)
		{
			Subject e= subject.get(i);
			total+=e.getScore();
			System.out.println(studentName+"�л��� "+e.getSubjectName()+" ������ ������"+ e.getScore()+"�� �Դϴ�.");
		}
		System.out.println(studentName+"�л��� ������ "+total+"�� �Դϴ�.");
	}
}
