import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		System.out.println("String bir ifade giriniz ");
		Scanner in = new Scanner(System.in);
		String inputString = in.nextLine();
		String reverseString="";
		
		int lenght = inputString.length();
		
		for(int i = lenght - 1;i >= 0;i--) {
			reverseString = reverseString + inputString.charAt(i);
		}
		if(inputString.equals(reverseString)) {
			System.out.println("Girilen kelime palindromdur.");
		}
		else {
			System.out.println("Girilen kelime palindrom deðildir.");
		}
	}

}
