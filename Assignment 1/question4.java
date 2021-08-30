
import java.util.*;
public class question4 {

	static boolean checkAnagram(String str1, String str2) {
		int []n1 = new int[256];
		int []n2 = new int[256];

		if (str1.length() != str2.length()) {
			return false;
		}

		for (int i = 0; i < str1.length(); i++) {
			char ch1 = str1.charAt(i);
			char ch2 = str2.charAt(i);
			n1[ch1]++;
			n2[ch2]++;
		}

		for (int i = 0; i < 256; i++) {
			if (n1[i] != n2[i])
				return false;
		}
		return true;
	}
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st string:");
		String str1 = sc.nextLine();

		System.out.println("Enter 2nd string:");
		String str2 = sc.nextLine();

		boolean isAnagram = checkAnagram(str1, str2);
		if (isAnagram == true) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}




	}
}