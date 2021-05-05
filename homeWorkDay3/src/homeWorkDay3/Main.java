package homeWorkDay3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setInstructorId(1);
		instructor1.setEmail("insturtor1@example.com");
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demirog");
		String[] courseAdded = {"Programlamaya GiriþÝçin Temel Kurs","Java+React","C#+Angular"};
		instructor1.setCourseAdded(courseAdded);
		
		Student student1 = new Student();
		student1.setId(2);
		student1.setStudenId(1);
		student1.setEmail("student1@example.com");
		student1.setFirstName("Ünal");
		student1.setLastName("Kaplan");
		String[] courseTaken = {"Programlamaya Giriþ Ýçin Temel Kurs","Java+React"};
		student1.setCourseTaken(courseTaken);
		
		
		User user1 = new User();
		User user2= new User();
		User user3= new User();
		user1=instructor1;
		user2=student1;
		user3.setId(3);
		
		
		
		
		
		
		System.out.println(user1.email);
		System.out.println(user2.email);
		
		StudentManager studentManager = new StudentManager();
		Student[] students = {student1};
		studentManager.showUsers(students);
		studentManager.showCourse(student1);
		
		
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.addLesson("Python");
		
		instructorManager.showLessons(instructor1);
		User[] users = {instructor1};
		instructorManager.showUsers(users);
		
		
	}

}
