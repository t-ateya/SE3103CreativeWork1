package test;

import model.CourseDatabase;

public class StudentDatabaseAppTest {
	private static CourseDatabase data;

	public static void main(String[] args) {

		for (var d : data.getDatabase()) {
			System.out.println(d.toString());
		}
		
		
	}
	
}
