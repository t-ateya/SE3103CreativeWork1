package test;

import model.Session;

public class StudentDatabaseAppTest {
	
	public static void main(String[] args){
		
		for (var s: Session.CourseSession.values()){
			System.out.println(s);
		}

		System.out.println(Session.CourseSession.FALL);
	}
	
}
