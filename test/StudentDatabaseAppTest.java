package test;

import java.util.ArrayList;

import model.Course;

import model.Student;

public class StudentDatabaseAppTest {
	public static void main(String[] args) {
		/*
		for (var d : data.getOfferredCourses()) {
			System.out.println(d.printCourseInfo());
			
		} */

		//Student student  = new Student();
		//Course course = new Course();
		//ArrayList<Course> db = student.getEnrolledcourses();
		
		/*
		System.out.println("===============Enrolled Courses=============");
		for (var c: db){
			c.diplayCourse();
		}
		*/
		/*
		student.getStudentCredentials();
		course.diplayCourse();
		student.enroll();
		student.payTuition();
		student.printStudentRegistrationInfo();
		*/


		
		
		
		//student.printStudentInfo();
		//assert (student.getStudentID().equals("11001"));
		//student.enroll();
		
		//ArrayList<Course> db = CourseDatabase.CoursesOfferred;
		//Course c1 = db.get(0);
		//c1.diplayCourse();

		/*for (Course c : db){
			c.diplayCourse();
		} */


		Student s = new Student();
		s.enrollEncourse("1234");
		s.enrollEncourse("43216");
		s.printEnrolledCourses();
	
	}


	
}
