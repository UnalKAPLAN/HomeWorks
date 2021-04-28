package applicationDay1;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 28;
		int total =0;
		if (number<1) {
			System.out.println("Lütfen pozitif bir sayý giriniz");
			return;
		}
		for(int i = 1;i<28;i++) {
			if(number%i==0) {
				total=total+i;
				
			}
		}
		if(total==number) {
			System.out.println("Mükemmel Sayýdýr");
		}else {
			System.out.println("Mükemmel sayý deðildir");
		}
	}	

}
