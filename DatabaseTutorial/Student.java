package studentDatabase;
import java.util.Scanner;
public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private String courses = " ";
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id= 10000;
	
	
	
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.println("1 - Freshman\n2 - for Sophmore\n3 - Junior\n4 - Senior\nEnter student class level:");
		this.gradeYear = in.nextInt();
		
		setStudentId();
		
		
		
	}
	//generate an id
	private void setStudentId() {
		//Grade Level + ID
		id++;
	this.studentId = gradeYear + " " + id;
	}
	//enroll courses
	public void enroll () {
		//Get inside a loop, user hits 0
		do {
		System.out.print("Enter course to enroll(Q to quit): ");
		Scanner in = new Scanner (System.in);
		String course = in.nextLine();
		if (!course.equals("Q")) {
			courses = courses + "\n " + course;
			tuitionBalance =  tuitionBalance + costOfCourse;
		}
		else {
		
			break;
		}
	} while (1 != 0);
		
	
	
	//view balance and pay tuition
	

}
	public void viewBalance() {
		System.out.println("Your Balance is: £" + tuitionBalance);
	}
	//pay Tuition
	public void payTuition(){
		viewBalance();
		System.out.print("Enter your payment: £");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println ("Thank you for your payment of £" + payment);
		viewBalance();
	}
	
	//Show status
	public String toString() {
		return "Name" + firstName + " " + lastName + 
				"\nGrade Level:"+ gradeYear +
				"\nStudent ID:" + studentId +
				"\nCourses Enrolled:" + courses +
				"\nBalance: £" + tuitionBalance; 
	}
}
