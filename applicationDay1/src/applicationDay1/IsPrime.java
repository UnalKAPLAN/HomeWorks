package applicationDay1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=87;
		int i = (int)(Math.sqrt(number));   // say�n�n karek�k�n al�narak taranan say�lar k�k(n) olur.
		boolean isPrime=true;
		if(number<=1) {
			System.out.println("1 den b�y�k bir say� giriniz");
			return;
		}
			
		for(int k =2;k<=i;k++) {
			if(number%k ==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			System.out.println("asal");
		
			}else {
				System.out.println("asal degil");
			}
		
		
	}

}