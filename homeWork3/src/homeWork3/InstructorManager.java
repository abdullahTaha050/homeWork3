package homeWork3;

public class InstructorManager {
	
	public void addCourse(Instructor instructor, String newCourse) {
		System.out.println(instructor.instructorName + " adlý eðitmen " + newCourse + " adlý bir eðitim oluþturdu.");
	}
	
	public void addHomework(Instructor instructor) {
		System.out.println(instructor.instructorName + "yeni ödevler ekledi.");
	}
}
