import java.lang.management.ThreadMXBean;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Problem8 {

	public static void main(String[] args) {
		String theNumber = "731671765313306249192251196744265747423"
				+ "55349194934969835203127745063262395783180169848018694788518438586156078911294"
				+ "94954595017379583319528532088055111254069874715852386305071569329096329522744"
				+ "30435576689664895044524452316173185640309871112172238311362229893423380308135"
				+ "33627661428280644448664523874930358907296290491560440772390713810515859307960"
				+ "86670172427121883998797908792274921901699720888093776657273330010533678812202"
				+ "35421809751254540594752243525849077116705560136048395864467063244157221553975"
				+ "36978179778461740649551492908625693219784686224828397224137565705605749026140"
				+ "79729686524145351004748216637048440319989000889524345065854122758866688116427"
				+ "17147992444292823086346567481391912316282458617866458359124566529476545682848"
				+ "91288314260769004224219022671055626321111109370544217506941658960408071984038"
				+ "50962455444362981230987879927244284909188845801561660979191338754992005240636"
				+ "89912560717606058861164671094050775410022569831552000559357297257163626956188"
				+ "2670428252483600823257530420752963450";
		
		long largestProduct = 0;
		
		// starting at the 5th digit to the end of the string i.e. last digit
		for(int i = 13 ; i < theNumber.length(); i ++){
			
			// the variable to store the temporar result ( the product ) for this loop
			long temp = 1;
			
			// get the substring of the number which contains the digits from the current
			// digit to those 5 digits backwards
			String sub = theNumber.substring(i-13, i);
			
			//for each digit in the substring
			// multiply the temporary result by its integer value representation
			for(int j = 0 ; j < sub.length(); j++){
				
				 temp *= Integer.valueOf(sub.substring(j , j + 1 ));		
			}
			// check if the current temp value is greater than the largestProduct so far
			//if it is largest = temp, otherwise largest stays the same
			largestProduct = (temp > largestProduct)  ? temp : largestProduct;
		}
		System.out.println(largestProduct);
	}

}