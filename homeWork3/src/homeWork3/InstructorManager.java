package homeWork3;

public class InstructorManager {
	
	public void addCourse(Instructor instructor, String newCourse) {
		System.out.println(instructor.instructorName + " adl� e�itmen " + newCourse + " adl� bir e�itim olu�turdu.");
	}
	
	public void addHomework(Instructor instructor) {
		System.out.println(instructor.instructorName + "yeni �devler ekledi.");
	}
}
