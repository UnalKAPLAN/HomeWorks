package homeWorkDay3;

public class Student extends User{
	private int studenId;
	private String firstName;
	private String lastName;
	private String[] courseTaken;
	
	public 	Student() {
		
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String[] getCourseTaken() {
		return courseTaken;
	}
	public void setCourseTaken(String[] courseTaken) {
		this.courseTaken= courseTaken;
	}
	public int getStudenId() {
		return studenId;
	}
	public void setStudenId(int studenId) {
		this.studenId = studenId;
	}
}
