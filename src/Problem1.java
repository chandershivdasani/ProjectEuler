/**
 * Problem 1: 
 * http://projecteuler.net/problem=1
 * 
 * Its solved in two ways, one using the conventional brute force method and another using 
 * the efficient solution mentioned on project euler
 * 
 * @author chanders
 *
 */
public class Problem1 {
	/**
	 * Computes the sum of all the numbers divisible by n
	 * e.g 
	 * Sum of all the numbers < 20 that are divisible by 3
	 * = 3 +6 + 9 + 12 + ... 18
	 * = 3(1 + 2 + 3 + .. 6)
	 */
	public static int computeSumDivisibleBy(int target, int n) {
		int p = target/n;
		System.out.println(p);
		
		return n * (p * (p + 1)/2);
	}
	
	public static void main(String[] args) {
		int sum=0;
		int target = 999;
		long start = System.nanoTime();
		
		//Compute using brute force
		for(int i =0; i <= target; i++) {

			if((i%3 == 0 || i%5 ==0)) {
				sum = sum + i;
			}
		}
		System.out.println("Brute Force Time(ns): " + (System.nanoTime() - start));
		System.out.println("Brute Force Sum: " + sum);
		
		start = System.nanoTime();
		
		/**
		 * While computing the sum, we are adding multiples of 15, twice, once through 3 and other through 5, 
		 * so we need to subtract one occurrence of such numbers
		 */
		sum = computeSumDivisibleBy(target, 3) + computeSumDivisibleBy(target, 5) - computeSumDivisibleBy(target, 15);
		
		System.out.println("Efficient Time(ns): " + (System.nanoTime() - start));
		System.out.println("Efficient sum: " + sum);
		
	}
}
