import java.util.*;
import java.io.*;

public class WordCount {

	public static void main(String[] args) throws FileNotFoundException {
		
		countWords();

	}
	
	public static void countWords() throws FileNotFoundException {
		Scanner input = new Scanner(new File("text.txt"));
		
		Set<String> words = new HashSet<String>();
		
		while(input.hasNext()) {
			String word = input.next().toLowerCase();
			words.add(word);
		}
		System.out.println("Kelimeler " + words);
		System.out.println("Kelime Say�s� " + words.size());
		
	}
}
