package applicationDay1;

public class FindingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[]{3,5,7,9,12,24,43,37};
		int  numberToFind=9;
		boolean outcome=false;
		for(int number:numbers) {
			if(number==numberToFind) {
				outcome=true;
				break;
			}
			
		}
		if(outcome) {
			System.out.println("Aradýðýnýz sayý bulunudu ve aradýðýnýz sayý : "+ numberToFind);
			
		}else {
			System.out.println("Aradýðýnýz sayý bulunamadý");
			
		}
	}

}
