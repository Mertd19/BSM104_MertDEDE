
import java.util.*; 
public class SortExample {

	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<String>();
		words.add("kalem");
		words.add("bilgisayar");
		words.add("bart�n");
		words.add("kitap");
		
		System.out.println("S�ralamadan �nce :" + words);
		System.out.println(words.get(0));
		// a'dan z'ye s�ralama
		Collections.sort(words);
		System.out.println("S�raland�ktan sonra :" + words);
		
	}

}
