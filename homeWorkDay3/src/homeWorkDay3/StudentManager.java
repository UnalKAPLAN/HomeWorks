package homeWorkDay3;

public class StudentManager extends UserManager{
	
	
	@Override
	public void addUser(User user) {
		System.out.println(user.getEmail() +"mail adresli kullanıcı başarıyla eklendi.");
	}
	@Override
	public void deleteUser(User user) {
		System.out.println(user.getEmail() +"mail adresli kullanıcı başarıyla silindi.");
	}
	@Override
	public void updateUser(User user) {
		System.out.println(user.getEmail() +"mail adresli kullanıcı başarıyla güncellendi.");
	}
	@Override
	public void showUsers(User[] users) {
		System.out.println("            Öğrenci Listesi           ");
		for(User user: users) {
			System.out.println("Kullanıcı Id: "+user.getId());
			System.out.println("Kullanıcı Email: "+user.getEmail());
			System.out.println("-----------------");
		}
	}

	public void addCourse(String courseName) {
		System.out.println(courseName+" isimli kurs basariyla eklendi.");
	}
	
	public void deleteCourse(String courseName) {
		System.out.println(courseName+" isimli kurs basariyla silindi.");
	}
	
	public void showCourse(Student student) {
		System.out.println("          "+student.getFirstName()+" "+student.getLastName()+" Öğrencisinin Aldığı Dersler        ");
		for(String course:student.getCourseTaken()) {
			System.out.println("- "+course);
		}
	}
}
