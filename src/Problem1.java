import java.util.HashSet;
import java.util.Set;

public class Problem1 {

	public static void main(String[] args) {
		Set<Integer> multiplesSet = multiplesOf(1000);
		System.out.println(sumOfMultiples(multiplesSet));
	}

	private static Set<Integer> multiplesOf(int number){

		Set<Integer> multiplesOf = new HashSet<Integer>();
		for(int i = 0; i < number; i++){

			if(i % 5 == 0 || i % 3 ==0){
				multiplesOf.add(i);
			}	
		}
		return multiplesOf;
	}

	private static int sumOfMultiples(Set<Integer> multiplesSet){
		int sum = 0;
		for(Integer num : multiplesSet){
			sum += num;
		}
		return sum;

	}

}
