package homeWorksDay2;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course course1 = new Course(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)","2 ay s�recek Yaz�l�m Geli�tirici Yeti�tirme Kamp�m�z�n takip, d�k�man ve duyurular�n� buradan yapaca��z.","Engin Demirog","0");
		Course course2 = new Course(2,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)","2 ay s�recek Yaz�l�m Geli�tirici Yeti�tirme Kamp�m�z�n takip, d�k�man ve duyurular�n� buradan yapaca��z.","Engin Demirog","32");
		Course course3 = new Course(3,"PROGLAMLAMAYA G�R�� KURSU","2 ay s�recek Yaz�l�m Geli�tirici Yeti�tirme Kamp�m�z�n i�in haz�rl�k.","Engin Demirog","100");
		
		Course[] courses = {course1,course2,course3};
		
		for(Course course:courses) {
			
			System.out.println(course.name );	
				
			}
			
		Day day1=new Day(1,"Ders Program�","G�n Sonu Kay�t","�dev","De�erlendirme");
		Day day2=new Day(2,"Ders Program�","G�n Sonu Kay�t","�dev","De�erlendirme");
		
		Day[] days= {day1,day2};
		
		for(Day day:days) {
			System.out.println(day.days + ". G�n "+ day.timetable);
		}
		
		DayManager dayManager = new DayManager();
		dayManager.enquiry(day1);
	}

}
