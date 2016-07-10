
public class SumOfThousandthExponent {
	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		long sum = 0;
		
		int[] num = new int[400];
		
		num[num.length-1] = 2;
		for (int i = 0; i < num.length-1; i++) {
			num[i] = 0;
		}
		
		for (int j = 2; j <= 1000; j++) {
			int carry = 0;
			for (int i = num.length-1; i >= 0; i--) {
				
				int temp = num[i] * 2;
				num[i] = (temp % 10) + carry;
				carry = temp/10;
			}
			
		}
		
//		for (int i = 0; i < num.length; i++) {
//			System.out.print(num[i] + " ");
//		}
		
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		
		System.out.println("\n" + sum);
		
		long endTime = System.currentTimeMillis();
		System.out.println("Executed in " + (endTime - startTime) + " ms.");
		
	}
}
