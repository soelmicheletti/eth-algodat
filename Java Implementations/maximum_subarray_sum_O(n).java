
public class Array {
 
	public static int maximumSum(int[] a) {
		int max = 0; 
		int randmax = 0; 
		
		for(int i = 0; i<a.length; i++) {
			randmax += a[i]; 
			if(randmax > max)
				max = randmax; 
			if(randmax <0)
				randmax = 0; 
		}
		return max; 
	}
		
	
	
	public static void main(String[]args) {
		int[] a = {1, -3, 5, 2, 1, -3, 1000, -18, 1, 2, 4}; 
		System.out.println(maximumSum(a)); 
	}
}
