package applicationDay1;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 28;
		int total =0;
		if (number<1) {
			System.out.println("L�tfen pozitif bir say� giriniz");
			return;
		}
		for(int i = 1;i<28;i++) {
			if(number%i==0) {
				total=total+i;
				
			}
		}
		if(total==number) {
			System.out.println("M�kemmel Say�d�r");
		}else {
			System.out.println("M�kemmel say� de�ildir");
		}
	}	

}
