import java.util.ArrayList;
import java.util.Collections;

public class Problem4 {

	public static void main(String[] args)
	{
		ArrayList<Integer> answers = new ArrayList<Integer>();

		int number1 = 999;
		int number2 = 999;
		int product = 0;
		while(number1>100){


			product = number1*number2;
			if(checkForPalindrome(product)){
				answers.add(product);
			}

			if(number2==100){
				number1--;
				number2 = number1;
			}
			else{
				number2--;
			}

		}
		
		Collections.sort(answers);
		System.out.print("[ ");
		for(int i =0; i < answers.size(); i++){
			System.out.print(answers.get(i) + " , " );
		}
		System.out.print(" ]\n");
		int answer = answers.get(answers.size()-1);
		System.out.println("Biggest : " +answer);
	}


	public static boolean checkForPalindrome(int number){
		String numString = Integer.toString(number); //get the string representation of the number
		boolean retVal = true; //initially the return val is false
		int firstIndex = 0; // start index is the first char from the string, initially
		int secondIndex = numString.length()-1; // end index is the last char from string , initially
		while(firstIndex < secondIndex){ //loop until the middle is reached
			if(numString.charAt(firstIndex)!= numString.charAt(secondIndex)){
				retVal = false; //return val is false now
				break; // if the digits representing each index do not match, exit the loop
			}
			//otherwise set the return val to be true and check the next pair of digits
			firstIndex++; //get the next digit from left to right
			secondIndex--; // get the next digit from right to left
		}

		return retVal;
	}
}
