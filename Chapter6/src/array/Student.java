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
			System.out.println(studentName+"학생의 "+e.getSubjectName()+" 과목의 성적은"+ e.getScore()+"점 입니다.");
		}*/
		for(int i=0; i< subject.size();i++)
		{
			Subject e= subject.get(i);
			total+=e.getScore();
			System.out.println(studentName+"학생의 "+e.getSubjectName()+" 과목의 성적은"+ e.getScore()+"점 입니다.");
		}
		System.out.println(studentName+"학생의 총점은 "+total+"점 입니다.");
	}
}
