package applicationsDay3;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager= new CustomerManager();
		CustomerManager customerManager2= new CustomerManager();
		customerManager=customerManager2;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		int sayi1=10;
		int sayi2=10;
		sayi2=sayi1;
		sayi2=30;
		System.out.println(sayi1);
		
		
	}
}