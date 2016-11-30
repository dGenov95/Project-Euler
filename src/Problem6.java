
public class Problem6 {

	public static void main(String[] args) {
		int difference = squareOfSum(100)-sumOfSquares(100);
		System.out.println(difference);
	}
	
	private static int sumOfSquares(int number){
		int sum = 0;
		for(int i = 0; i <= number ; i++){
			sum = sum + (i*i);
		}
		return sum;
	}
	
	private static int squareOfSum(int number){
		int sum = 0;
		for(int i = 0; i <= number; i++){
			sum += i;
		}
		return sum*sum;
	}
}
