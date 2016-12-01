
public class Problem9 {

	public static void main(String[] args) {
		
		System.out.println(specPyth(1000));
	}
	
	public static int specPyth(int num)
	{
	    for (int a = 1; a < num; a++)
	        for (int b = 2; b < a; b++)
	            {
	                if (a*a +b*b == (num-a-b)*(num-a-b))
	                    return a*b*(num-a-b); //ans = 31875000 
	            }

	    return -1;
	}

}
