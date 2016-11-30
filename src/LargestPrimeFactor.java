import java.util.ArrayList;
import java.util.List;

public class LargestPrimeFactor {

	public static void main(String[] args) {
		long beginTime = System.currentTimeMillis();
		long number = 600851475143L;
		List<Long> factors = new ArrayList<>();
		long counter = 2;
		while(!(number < counter)){

			if((number % counter) == 0){
				number = number / counter;
				factors.add(counter);

			}
			counter++;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken to complete : " + (endTime - beginTime) + "ms");
		System.out.println(factors);
	}

}
