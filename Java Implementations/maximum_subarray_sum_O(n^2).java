
public class Array {
 
	public static int doSum(int[] a, int i, int j) {
		int sum = 0; 
		for(int k = i; k<=j; k++)
			sum += a[k]; 
		return sum; 
	}
	
	public static int maximumSum(int[]a) {
		int max = 0; 
		
		int[] prefix = new int[a.length + 1]; 
		prefix[0] = 0; 
		
		for(int i = 1; i<a.length+1; i++)
			prefix[i] = prefix[i-1] + a[i-1];
		
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a.length; j++) {
				if(prefix[j] - prefix[i]>max)
					max = prefix[j]-prefix[i]; 
			}
		}
		return max; 
	}
	
	public static void main(String[]args) {
		int[] a = {1, -3, 5, 2, 1, -3, 1000, -18, 1, 2, 4}; 
		System.out.println(maximumSum(a)); 
	}
}
