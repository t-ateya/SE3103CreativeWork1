package model;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = " ";
	private double tuitionBalance;
	private static int costPerCourse = 600;
	private static int id = 1000;

	public Student(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Student First Name: ");
		this.firstName = in.nextLine();

		System.out.println("Enter Student Last Name: ");
		this.lastName = in.nextLine();

		System.out.println("1 - Freshman\n2 -Sophomore\n3 -Junior\n4 -Senior\nEnter student class level: ");

		setStudentID();
	}

	

	private void setStudentID() {
		id++;
		this.studentID = gradeYear + " " + id;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	

	public int getGradeYear() {
		return gradeYear;
	}
	

	public double getTuitionBalance() {
		return tuitionBalance;
	}

	public void setTuitionBalance(double tuitionBalance) {
		this.tuitionBalance = tuitionBalance;
	}


	public void enroll(){
		do {
			System.out.println("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equalsIgnoreCase("Q")){

				this.courses = courses + "\n " +  course;
				this.tuitionBalance += costPerCourse;

			}
			

		} while ( 1 !=0);

	}

	//private balance
	private void viewBalance(){
		System.out.println("Enter your New Balance is: $" + this.tuitionBalance);

		//Pay Tuition
		
	}

	public void payTuition(){
		viewBalance();
		System.out.println("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance -= payment;
		System.out.println("Thank you for  your payment of $ " + payment);
		viewBalance();
	}

	public String showInfo(){
		  return "Name: " + firstName + " " + lastName +
					  "\nGrade Level: " + gradeYear +
					  "\nStudentID: " + studentID +
					  "\nCourses Enrolled: " + courses +
					  "\nBalance: $" + tuitionBalance;

	}

	

	




	
}
