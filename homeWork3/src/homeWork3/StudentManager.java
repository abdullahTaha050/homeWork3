package homeWork3;

public class StudentManager {
	public void addComment(Student student ){
		System.out.println(student.studentName + ", �deve yeni bir yorum ekledi.");
	}
	
	public void listTakenCourses(Student student ) {
		System.out.println(student.studentName + " adl� ��rencinin kurslar� " + student.takenCourses + " kurslar�d�r.");
	}
}
