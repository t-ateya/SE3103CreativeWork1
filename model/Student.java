package model;

import java.util.ArrayList;
import java.util.Scanner;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Font;

public class Student {
	private ArrayList<Course> db = CourseDatabase.CoursesOfferred;

	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private ArrayList<Course> Enrolledcourses = new ArrayList<>();
	private double tuitionBalance;
	private int numberOfCoursesEnrolled = 0;
	private String studentInfo;

	private static int costPerCourse = 600;
	private static int id = 1000;

	public Student() {

	}

	public void getStudentCredentials() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Student First Name: ");
		this.firstName = in.nextLine();

		System.out.println("Enter Student Last Name: ");
		this.lastName = in.nextLine();

		// System.out.println("Choose a number below corresponding to your grade year");
		System.out.println("1 - Freshman\n2 -Sophomore\n3 -Junior\n4 -Senior\nEnter student class level: \n");
		this.gradeYear = in.nextInt();
		setStudentID();
	}

	private void printEnrolledCourses() {
		System.out.println("\n=====================Enrollment Information==================\n");
		System.out.println("You enrolled in: " + getNumberOfCoursesEnrolled() + " Courses");
		System.out.println("Your total tuition is:  $" + getTuitionBalance());
		for (Course c : getEnrolledcourses()) {
			c.diplayCourse();
		}
	}

	public String getStudentInfo() {
		return studentInfo;
	}

	public ArrayList<Course> getEnrolledcourses() {
		return Enrolledcourses;
	}

	public int getNumberOfCoursesEnrolled() {
		return numberOfCoursesEnrolled;
	}

	public String getStudentID() {
		return studentID;
	}

	private void setStudentID() {
		id++;
		this.studentID = gradeYear + "" + id;
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

	public void displayCourseInfo(ArrayList<Course> db) {
		for (Course c : db) {
			c.diplayCourse();
		}

	}

	public void enroll() {
		String CRN;
		System.out.println("=====================================================");
		System.out.println("\n       CHOOSE COURSE INFO TO ENROLL");
		System.out.println("=====================================================");
		displayCourseInfo(db);

		do {
			System.out.println("Enter course CRN to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			CRN = in.nextLine();
			for (Course cs : db) {

				if (cs.getCRN().contains(CRN)) {
					Enrolledcourses.add(cs);
					tuitionBalance += costPerCourse;
					numberOfCoursesEnrolled++;
				}
			}
			// this.tuitionBalance += costPerCourse;

		} while (!CRN.equalsIgnoreCase("q"));

		printEnrolledCourses();

	}

	// private balance
	private void viewBalance() {
		System.out.println("Your New Balance is: $" + this.tuitionBalance);
		// Pay Tuition

	}

	public void payTuition() {
		viewBalance();
		System.out.println("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance -= payment;
		System.out.println("Thank you for  your payment of: $" + payment);
		viewBalance();
	}

	public void printStudentInfo() {
		studentInfo = ("Name: " + firstName + " " + lastName + "\nGrade Level: " + gradeYear + "\nStudentID: "
				+ studentID + "\nBalance: $" + tuitionBalance);

		System.out.println(studentInfo);
	}

	public void printStudentRegistrationInfo() {
		System.out.println("===================Your Enrollment Information============");
		printStudentInfo();
	}

	public void render(Graphics2D g2) {
		g2.setColor(Color.red);
		g2.setFont(new Font("Courier", Font.BOLD, 20));
		g2.drawString("First Name: " + firstName + "\tLast Name: " + lastName + "\tGrade Year: " + gradeYear
				+ "\tStudent ID: " + studentID, 50, 100);
	}
}