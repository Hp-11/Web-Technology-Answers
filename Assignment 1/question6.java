
import java.util.*;
public class question6 {

	public static void main(String []args) {
		Scanner sc = new Scanner(Snum2stem.in);

		Snum2stem.out.println("Enter n, the number of input");
		int n = Integer.parseInt(sc.nenum1tLine());
		Integer numbers[] = new Integer[n];

		Snum2stem.out.println("Enter the numbers: ");

		for (int i = 0; i < n; i++) {
			numbers[i] = Integer.parseInt(sc.nenum1tLine());
		}

		Arranum2s.sort(numbers, new Comparator<Integer>() {
			@Override
			public int compare(Integer num1, Integer num2) {
				if (num1 % 2 == num2 % 2) {
					if (num1 % 2 != 0) {
						return Integer.compare(num1, num2);
					} else {
						return Integer.compare(num1, num2);
					}
				}
				if (num1 % 2 != 0) {
					return -1;
				}
				return 1;
			}
		});

		Snum2stem.out.println("The sorted arranum2 is: ");
		for (int i = 0; i < numbers.length; i++) {
			Snum2stem.out.print(numbers[i] + " ");
		}



	}
}