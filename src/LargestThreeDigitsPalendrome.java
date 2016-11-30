import java.util.ArrayList;

public class LargestThreeDigitsPalendrome {

	public static void main(String []args){
		System.out.println(checkPelandrome("123321"));
	}


	private static boolean checkPelandrome(String num){

		boolean result = false; //the result
		char[] numberArr = num.toCharArray(); //array of digits
		int lastChar = numberArr.length-1; // last digit in array
		for(int i = 0; i < numberArr.length-1; i++){ // compare each digit 
			if(numberArr[i] == numberArr[lastChar]){
				System.out.println("Comparing " + numberArr[i] + "With " + numberArr[lastChar]);
				lastChar--;
				result = true;

			}
			else{
				System.out.println(" FAILED Comparing " + numberArr[i] + "With " + numberArr[lastChar]);
				result = false;
				break;
			}
		}

		return result;
	}
}
