package studentDatabase;

import java.util.Scanner;

public class Database1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Ask the user how many students do you want to add
	System.out.print("Enter number of new students to enroll:");
	Scanner in = new Scanner(System.in);
	int numbOfStudents = in.nextInt();
	Student[]students = new Student [numbOfStudents];
	
	//create a number of students
	for (int n = 0; n < numbOfStudents; n++) {
		students[n]= new Student(); 
		students[n].enroll();
		students[n].payTuition();
		System.out.println(students[n].toString());
		
	}
	
	}

}
