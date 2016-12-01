
public class Problem10 {

	public static void main(String[] args) {
		long sum  = 0;
		for(long i = 2; i < 2_000_000; i++){
			if(isPrime(i)){
				sum +=i;
			}
		}

		System.out.println(sum);

	}

	private static boolean isPrime(long num){
		if(num <2){
			return false;
		}
		else if(num == 2){
			return true;
		}
		for(int i =2; i <= Math.sqrt(num); i++){
			if(num % i == 0){
				return false;
			}
		}
		return true;
	}

}
