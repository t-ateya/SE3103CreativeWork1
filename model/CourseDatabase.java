package model;

import java.util.ArrayList;

public class CourseDatabase {
	public static final ArrayList<Course>offerredCourses = new ArrayList<>();
	

	static{
		offerredCourses.add(new Course(
			"History 101", "1234"));

		offerredCourses.add(new Course(
				"Mathemactics 101", "43216"));
		
		offerredCourses.add(new Course(
				"English 101", "23455"));
		offerredCourses.add(new Course(
					"English 101", "23455"));
		offerredCourses.add(new Course(
						"Chemistry 101", "67893"));
		
		offerredCourses.add(new Course(
							"Computer Science 101", "44780"));
	}

	public static ArrayList<Course> getOfferredCourses() {
		return offerredCourses;
	}
	
}
