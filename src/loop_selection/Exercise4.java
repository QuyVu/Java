package loop_selection;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your string: ");
		String tmp = new String();
		tmp = sc.nextLine();
		tmp+='a';
		boolean isResult = false;
		char[] ch = new char[tmp.length()];
		for (int i = 0; i < tmp.length() - 1; i++) {
			if (tmp.charAt(i) != tmp.charAt(i + 1)) {
				ch[i] = tmp.charAt(i);
				System.out.print(ch[i]);
				isResult = true;
			} else {
				if (isResult) {
					ch[i] = tmp.charAt(i);
					System.out.print(ch[i]);
					break;
				} else
					continue;
			}
		}
		sc.close();
	}
}
