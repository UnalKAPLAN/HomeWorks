package methodOverloading;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FourOperations fourOperations = new FourOperations();
		
		System.out.println(fourOperations.add(5,7));
		System.out.println(fourOperations.add(5,7,8));

}
}