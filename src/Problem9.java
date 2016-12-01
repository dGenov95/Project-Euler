
public class Problem9 {

	public static void main(String[] args) {
		
	}
	
	private static boolean isPythagorean(int a, int b, int c){
		if(a <b && b < c){

			if(Math.pow(a, 2)+Math.pow(b, 2) == Math.pow(c, 2)){
				return true;
			}
		}
		return false;
	}

}
