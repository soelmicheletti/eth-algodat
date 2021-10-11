
public class Array {
 
	public static int maximumSum(int[] a) {
		return maximumSum(a, 0, a.length - 1); 
	}
	
	public static int maximumSum(int[]a, int left, int right) {
		if(right - left == 0)
			return a[left]; 
		else {
		int f = maximumSum(a, left, (left + right) / 2); 
		int s = maximumSum(a, (left + right) / 2 + 1, right); 
		int t1 =  prefix(a, (left + right)/2 + 1, right);
		int t2 = suffix(a, left, (left + right)/2); 
		return Math.max(Math.max(f, s), t1 + t2); 
		}
	}
	
	public static int prefix(int[] a, int left, int right) {
		if(left == right)
			return 0; 
		int[] p = new int[right - left + 1]; 
		p[0] = a[left++]; 
		for(int i = 1; i<p.length; i++) {
			p[i] = p[i-1] + a[left++]; 
		}
		int max = 0; 
		for(int i = 0; i<p.length; i++) {
			if(p[i]>max)
				max = p[i]; 
		}
		return max; 
	}
	
	public static int suffix(int[] a, int left, int right) {
		if(left == right)
			return 0; 
		
		int[] s = new int[right - left + 1]; 
		s[s.length - 1] = a[right--]; 
		for(int i = s.length -2; i>= 0; i--) {
			s[i] = s[i+1] + a[right--]; 
		}
		int max = 0; 
		for(int i = 0; i<s.length; i++) {
			if(s[i]>max)
				max = s[i]; 
		}
		return max; 
	}
	
	
	public static void main(String[]args) {
		int[] a = {1, -3, 5, 2, 1, -3, 1000, -18, 1, 2, 4}; 
		System.out.println(maximumSum(a)); 
	}
}
