package codtech.task;

import java.util.*;

public class Student {
	private String studentName;
	private int studentRollno;
	private Map<String, Integer> subjectMarks;

	public Student(String StudentName, int studentRollno) {
		this.studentName = StudentName;
		this.studentRollno = studentRollno;
		this.subjectMarks = new HashMap<>();
	}

	public String getStudentName() {
		return studentName;
	}

	public int getStudentRollno() {
		return studentRollno;
	}

	public Map<String, Integer> getSubjectMarks() {
		return subjectMarks;
	}
	
	// Addtion of marks
	public void addMarks(String subject,int marks)
	{
		subjectMarks.put(subject, marks);
	}
	
	//Updation of marks
	public void updateMarks(String subject,int marks)
	{
		if(subjectMarks.containsKey(subject)) subjectMarks.put(subject,marks);
		else System.out.println("No Subject found ! ");
	}
	
	//Deletion if marks
	
	public void deleteMarks(String subject)
	{
		if(subjectMarks.isEmpty()) 
		{
			System.out.println("Cannot Delete Empty!!");
		}
		if(subjectMarks.containsKey(subject)) subjectMarks.remove(subject);
		else System.out.println("No Subject found ! ");
	}
	
	//caluculate percentage
	
	public double percentage()
	{
		if(subjectMarks.isEmpty()) 
		{
			System.out.println("Cannot calculate percentage no Subjcets and no marks in the record");
		}
		int totalMarks=0;
		for(int marks:subjectMarks.values()) totalMarks+=marks;
		return (double) (totalMarks)/subjectMarks.size();
	}
	
	//calculate the grade 
	public String grade()
	{
		double percentage=percentage();
		if(percentage>=90) return "A";
		else if(percentage>=80) return "B";
		else if(percentage>=70) return "C";
		else if(percentage>=35) return "D";
		else return "F";
	}
	
	//Display student data
	
	public void data()
	{
		System.out.println("Name of The Student "+studentName);
		System.out.println("RollNumber of The Student "+studentRollno);
		System.out.println("Subject Wise Marks of The Student ");
		 for (Map.Entry<String, Integer> entry : subjectMarks.entrySet())
			 System.out.println(entry.getKey() + ": " + entry.getValue());
	     System.out.println("Percentage of "+studentName+" : "+percentage());   
	     System.out.println("Grade of "+studentName+" : "+grade());   
	}

}
