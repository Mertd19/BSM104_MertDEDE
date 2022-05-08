
public class validPalindrome {
	
	public static boolean validPalindrome(String str) {
		if(str.length() !=  0) {
			int i = 0, j = str.length() - 1;
			while(i < j) {
				if (str.charAt(i) != str.charAt(j)) {
					return false;
					}
				i++;
				j--;
				}
			return true;
		}
		return false;
	}
	
	public static void main(String[] args)
    {
		String input = "abccba";
		String str = input.replaceAll("[^a-zA-Z]+","");
		
		str = str.toLowerCase();
		
		if(input.length() == str.length()) {
			if(validPalindrome(str)) {
				System.out.println(str +" Palindromdur. ");
			}
			else {
				System.out.println(str +" Palindrom deðildir. ");
			}
		}
		else {
			System.out.println(input + " alfabedeki harflerden oluþmuyor !");
		}
    }

}
