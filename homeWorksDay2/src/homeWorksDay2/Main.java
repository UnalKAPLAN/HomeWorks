package homeWorksDay2;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course course1 = new Course(1,"Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)","2 ay sürecek Yazýlým Geliþtirici Yetiþtirme Kampýmýzýn takip, döküman ve duyurularýný buradan yapacaðýz.","Engin Demirog","0");
		Course course2 = new Course(2,"Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)","2 ay sürecek Yazýlým Geliþtirici Yetiþtirme Kampýmýzýn takip, döküman ve duyurularýný buradan yapacaðýz.","Engin Demirog","32");
		Course course3 = new Course(3,"PROGLAMLAMAYA GÝRÝÞ KURSU","2 ay sürecek Yazýlým Geliþtirici Yetiþtirme Kampýmýzýn için hazýrlýk.","Engin Demirog","100");
		
		Course[] courses = {course1,course2,course3};
		
		for(Course course:courses) {
			
			System.out.println(course.name );	
				
			}
			
		Day day1=new Day(1,"Ders Programý","Gün Sonu Kayýt","Ödev","Deðerlendirme");
		Day day2=new Day(2,"Ders Programý","Gün Sonu Kayýt","Ödev","Deðerlendirme");
		
		Day[] days= {day1,day2};
		
		for(Day day:days) {
			System.out.println(day.days + ". Gün "+ day.timetable);
		}
		
		DayManager dayManager = new DayManager();
		dayManager.enquiry(day1);
	}

}
