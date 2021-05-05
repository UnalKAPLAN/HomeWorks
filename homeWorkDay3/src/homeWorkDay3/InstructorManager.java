package homeWorkDay3;

public class InstructorManager extends UserManager {
	
	@Override
	public void addUser(User user) {
		System.out.println(user.getEmail() +"mail adresli kullan�c� ba�ar�yla eklendi.");
	}
	@Override
	public void deleteUser(User user) {
		System.out.println(user.getEmail() +"mail adresli kullan�c� ba�ar�yla silindi.");
	}
	@Override
	public void updateUser(User user) {
		System.out.println(user.getEmail() +"mail adresli kullan�c� ba�ar�yla g�ncellendi.");
	}
	@Override
	public void showUsers(User[] users) {
		System.out.println("             Kullan�c� Listesi           ");
		for(User user: users) {
			System.out.println("Kullan�c� Id: "+user.getId());
			System.out.println("Kullan�c� Email: "+user.getEmail());
			System.out.println("-----------------");
		}
	}

	
	
	public void addLesson(String lessonName) {
		System.out.println(lessonName+" isimli kurs basariyla eklendi.");
	}
	
	public void updateLesson(String lessonName) {
		System.out.println(lessonName+" isimli kurs basariyla g�ncellendi.");
	}
	
	public void deleteLesson(String lessonName) {
		System.out.println(lessonName+" isimli kurs basariyla silindi.");
	}
	
	public void showLessons(Instructor instructor) {
		System.out.println("            "+instructor.getFirstName()+" "+instructor.getLastName()+" E�itmeninin Verdi�i Dersler          ");
		for(String lesson:instructor.getCourseAdded()) {
			System.out.println("- "+lesson);
		}
	}
}
