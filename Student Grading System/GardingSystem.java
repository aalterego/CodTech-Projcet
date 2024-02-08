package codtech.task;

import java.util.*;

public class GardingSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Map<Integer,Student> students=new HashMap<>();
		while(true)
		{
			System.out.println("0. Exit");
			System.out.println("1. Add a Student");
			System.out.println("2. Update a Student");
			System.out.println("3. Delete a Student");
			System.out.println("4. Details of Student");
			
			System.out.println("Enter Your Choice : ");
			int choice=sc.nextInt();
			sc.nextLine();
			if(choice==0) break;
			System.out.println();
			if(choice==1)
			{
				System.out.println("Enter Student Name");
				String name=sc.next();
				System.out.println("Enter Student RollNo");
				int rollno=sc.nextInt();
				Student s=new Student(name,rollno);
				students.put(rollno, s);
				System.out.println("Enter the no. of Subjects for Student");
				int nsubjects=sc.nextInt();
				sc.nextLine();
				while(nsubjects-->0)
				{
					System.out.println("Enter the Subject Name");
					String sname=sc.next();
					System.out.println("Enter the marks out of 100");
					int smarks=sc.nextInt();
					s.addMarks(sname,smarks);
				}
				System.out.println("Student Added");
				System.out.println();
				
			}
			else if(choice==2)
			{
				System.out.println("Enter the rollno of the student to be updated");
				int rollno=sc.nextInt();
				sc.nextLine();
				if(students.containsKey(rollno))
				{
					Student onUpDateStudent=students.get(rollno);
					System.out.println("Enter the Subject to be Update");
					String sbj=sc.next();
					if(onUpDateStudent.getSubjectMarks().containsKey(sbj))
					{
						System.out.println("Enter the marks to be Updated");
						int newMark=sc.nextInt();
						onUpDateStudent.updateMarks(sbj, newMark);
						System.out.println("Student Marks Updated");
					}
					else {
						System.out.println("Subject for this Student no Found ");
					}
				}
				else {
					System.out.println("Student Not Found!!");
				}
			}
			
			else if(choice==3)
			{
				System.out.println("Enter the rollno of Student to be Deleted");
				int rollno=sc.nextInt();
				if(students.containsKey(rollno))
					{
					System.out.println("Student Details Deleted");
					 students.remove(rollno);
					}
				else System.out.println("Student not Found!!");
				
			}
			else if(choice==4)
			{
				System.out.println("Enter the rollno of Student ");
				int rollno=sc.nextInt();
				if(students.containsKey(rollno))
				{
					Student s=students.get(rollno);
					s.data();
				}
				else System.out.println("Student not Found!!");
			}
		}
		System.out.println();
		System.out.println("Exited");
	}

}
