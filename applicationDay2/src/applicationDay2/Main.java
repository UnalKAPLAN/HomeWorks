package applicationDay2;

public class Main {

	public static void main(String[] args) {
		
		int total=sums(1,2);
		System.out.println(total);
		int totalSum=sums2(1,2,3);
		System.out.println(totalSum);
		
		
	

	}
	public static  int sums(int number1, int number2) {
		return number1+number2;
		}
	
	public static int sums2(int... numbers) {
		int totalSum2=0;
		for (int number:numbers) {
			totalSum2+=number;
		}
		return totalSum2;
			
			
			
			
			
	}
}
