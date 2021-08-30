

import java.util.*;
public class question1 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string input: ");
		String str1 = sc.nextLine();
		System.out.print("Enter the substring to be counted: ");
		String str2 = sc.nextLine();

		int ans = 0;
		int [] freq = new int[26];
		int [] freqString = new int[26];

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();


		for (int i = 0; i < str2.length(); i++) {
			freq[str2.charAt(i) - 'a']++;
			freqString[str1.charAt(i) - 'a']++;
		}
		int j = 0;

		for (int i = str2.length(); i <= str1.length(); i++) {
			boolean flag = false;
			for (int k = 0; k < 26; k++) {
				if (freq[k] != freqString[k]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println(i);
				ans++;
			}
			if (i < str1.length()) {
				freqString[str1.charAt(i) - 'a']++;
				freqString[str1.charAt(j) - 'a']--;
				j++;
			}
		}
		System.out.println("The count of substrings is: " + ans);
	}
}