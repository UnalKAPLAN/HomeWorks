package applicationDay1;

public class FriendlyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1=0;
		int number2=284;
		int total1=0;
		int total2=0;
		if(number1==number2 || number1<1 || number2<1) {
			System.out.println("Ayný ya da 1'den kücük sayý girdiniz \nLütfen sýfýrdan büyük ve farklý sayý giriniz");
			return;
		}
		for(int i=1;i<number1;i++) {
			if(number1%i==0) {
				total1=total1+i;
				
			}
		}
		for(int i=1;i<number2;i++) {
			if(number2%i==0) {
				total2=total2+i;	

				}

			}
		if(number1==total2 && number2==total1) {
			System.out.println("Bu sayýlar arkadas sayýdýr.");
		}else {
			System.out.println("Bu sayýlar arkadas sayý deðildir.");
			
		}
		
	}
}

