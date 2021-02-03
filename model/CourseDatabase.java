package model;

import java.util.ArrayList;

public class CourseDatabase {

	public static final ArrayList<Course> CoursesOfferred = new ArrayList<>();

	static {
		CoursesOfferred.add(new Course("History 101", "1234", "CLASSROOM"));
		CoursesOfferred.add(new Course("Mathemactics 101", "43216", "ONLINE"));
		CoursesOfferred.add(new Course("English 101", "23455", "CLASSROOM"));
		CoursesOfferred.add(new Course("English 101", "23455", "ONLINE"));
		CoursesOfferred.add(new Course("Chemistry 101", "67893", "CLASSROOM"));
		CoursesOfferred.add(new Course("Chemistry 101", "67894", "ONLINE"));
		CoursesOfferred.add(new Course("Computer Science 101", "44780", "CLASSROOM"));
		CoursesOfferred.add(new Course("Computer Science 101", "44781", "ONLINE"));
	}

	public  ArrayList<Course> getOfferredCourses() {
		return CoursesOfferred;
	}

}
