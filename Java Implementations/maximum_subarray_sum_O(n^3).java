
public class Array {
 
	public static int doSum(int[] a, int i, int j) {
		int sum = 0; 
		for(int k = i; k<=j; k++)
			sum += a[k]; 
		return sum; 
	}
	
	public static int maximumSum(int[]a) {
		int max = 0; 
		
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a.length; j++) {
				if(doSum(a, i, j)>max)
					max = doSum(a, i, j); 
			}
		}
		return max; 
	}
	
	public static void main(String[]args) {
		int[] a = {1, -3, 5, 2, 1, -3, 1000, -18, 1, 2, 4}; 
		System.out.println(maximumSum(a)); 
	}
}
