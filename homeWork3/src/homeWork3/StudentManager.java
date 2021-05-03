package homeWork3;

public class StudentManager {
	public void addComment(Student student ){
		System.out.println(student.studentName + ", ödeve yeni bir yorum ekledi.");
	}
	
	public void listTakenCourses(Student student ) {
		System.out.println(student.studentName + " adlı öğrencinin kursları " + student.takenCourses + " kurslarıdır.");
	}
}
