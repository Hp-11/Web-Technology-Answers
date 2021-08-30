
import java.util.*;
public class question2 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);


		System.out.println("Enter the para: ");
		String para = sc.nextLine();
		String [] paraletter = para.split(" ");


		System.out.println("Enter the words to convert into *** format: ");
		String word = sc.nextLine();
		String []words = word.split(" ");
		HashSet<String>wordHash = new HashSet<String>();

		for (String str : words) {
			wordHash.add(str);
		}
		List<StringBuilder> newpara = new ArrayList<StringBuilder>();
		for (String str : paraletter) {
			StringBuilder string = new StringBuilder(str);
			if (wordHash.contains(str)) {
				for (int i = 1; i < str.length(); i++) {
					string.setCharAt(i, '*');
				}
			}
			newpara.add(string);
		}
		System.out.println("The updated para is: ");
		for (StringBuilder str : newpara) {
			System.out.print(str + " ");
		}


	}
}