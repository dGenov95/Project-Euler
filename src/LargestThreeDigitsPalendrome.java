import java.util.ArrayList;

public class LargestThreeDigitsPalendrome {

	public static void main(String []args){
		System.out.println(checkPelandrome("123456654321"));
	}


	private static boolean checkPelandrome(String num){

		boolean result = false;
		char[] numberArr = num.toCharArray();
		for(int i = 0; i < numberArr.length-1; i++){
			for(int j = numberArr.length-1; j > i; j--){
				if(numberArr[i] == numberArr[j]){
					System.out.println("Comparing " + numberArr[i] + "With " + numberArr[j]);
					result = true;
					continue;
				}
				result = false;
			
			}
		}
		return result;
	}
}
