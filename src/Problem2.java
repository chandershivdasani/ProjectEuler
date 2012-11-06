import java.math.BigInteger;

/**
 * http://projecteuler.net/problem=2
 * 
 * @author chandershivdasani
 * 
 */
public class Problem2 {

	public static BigInteger computeEvenVal(int num) {
		if (num == 0 || num == 1)
			return BigInteger.valueOf(num);

		BigInteger fib1 = BigInteger.valueOf(0); 
		BigInteger fib2 = BigInteger.valueOf(1);
		BigInteger fib3 = BigInteger.valueOf(0);
		BigInteger sum =  BigInteger.valueOf(0);
		for (long i = 3; ;i++) {
			fib3 = fib1.add(fib2);
			
			if(fib3.compareTo(BigInteger.valueOf(num)) >= 0)
				break;
			/*
			 * If the fibonacci number is even, add it to our sum
			 */
			if (fib3.mod(BigInteger.valueOf(2)) == BigInteger.ZERO)
				sum = sum.add(fib3);

			fib1 = fib2;
			fib2 = fib3;
		}
		System.out.println("Fib number: " + fib3);
		return sum;
	}

	public static void main(String[] args) {
		int number = 4000000;
		System.out.println("Even numbered sum: " + computeEvenVal(number));
		
	}
}
