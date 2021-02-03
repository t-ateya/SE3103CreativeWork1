package model;

import java.util.ArrayList;

public class CourseDatabase {
	

	public static final ArrayList<Course>CoursesOfferred = new ArrayList<>();
	

	static{
		CoursesOfferred.add(new Course(
			"History 101", "1234", "None", Course.getClassroomSession()));

		CoursesOfferred.add(new Course(
				"Mathemactics 101", "43216", Course.getOnlineSession(), "None"));
		
		CoursesOfferred.add(new Course(
				"English 101", "23455","None", Course.getClassroomSession()));
		CoursesOfferred.add(new Course(
					"English 101", "23455", Course.getOnlineSession(), Course.getClassroomSession()));
		CoursesOfferred.add(new Course(
						"Chemistry 101", "67893",Course.getOnlineSession(), Course.getClassroomSession()));
		
		CoursesOfferred.add(new Course(
							"Computer Science 101", "44780", Course.getOnlineSession(), "None"));
	}

	public ArrayList<Course> getOfferredCourses() {
		return CoursesOfferred;
	}

	
	

	
	
}
