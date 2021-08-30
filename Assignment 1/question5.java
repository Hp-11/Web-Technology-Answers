
import java.util.*;
public class question5 {

	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your input :");
		String str = sc.nextLine();

		char []charArray = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			if (i == 0 && charArray[i] != ' ' || (charArray[i] != ' ' && charArray[i - 1] == ' ')) {
				if (charArray[i] >= 'a' && charArray[i] <= 'z') {
					charArray[i] = (char)(charArray[i] - 'a' + 'A');
				}
			}
		}
		String modifiedString = new String(charArray);
		System.out.println("The modifed string is: " + modifiedString);
	}
}