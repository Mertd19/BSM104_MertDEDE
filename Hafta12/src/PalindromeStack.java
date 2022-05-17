import java.util.Scanner;
import java.util.Stack;

public class PalindromeStack {

	public static void main(String[] args) {
		
		System.out.println("String bir ifade giriniz ");
		Scanner in = new Scanner(System.in);
		String inputString = in.nextLine();
		
		Stack stack = new Stack();
		
		for (int i = 0;i<inputString.length();i++) {
			stack.push(inputString.charAt(i));
		}
		String reverseString="";
		while(!stack.isEmpty()) {
			reverseString = reverseString + stack.pop();
		}
		if(inputString.equals(reverseString)) {
			System.out.println("Girilen kelime palindromdur.");
		}
		else {
			System.out.println("Girilen kelime palindrom de�ildir.");
		}
	}

}
