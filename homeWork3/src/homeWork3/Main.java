package homeWork3;

public class Main {

	public static void main(String[] args) {
		
		Instructor engin = new Instructor();
		engin.id = 1;
		engin.instructorName = "Engin Demiro�";
		engin.insturctorBranch = "Web Development";
		
		Student taha = new Student();
		taha.id = 2;
		taha.studentName = "Abdullah Taha AKSAKAL";
		taha.takenCourses = "Java, c#";
		
		UserManager userManager = new UserManager();
		userManager.add(engin);
		userManager.add(taha);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse(engin, "React ile FrontEnd Geli�tirme");
		
		StudentManager studentManager = new StudentManager();
		studentManager.listTakenCourses(taha);
	}

}
