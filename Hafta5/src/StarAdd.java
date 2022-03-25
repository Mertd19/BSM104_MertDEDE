import java.util.*;

public class StarAdd {

	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<String>();
		words.add("kalem");
		words.add("bilgisayar");
		words.add("bartýn");
		words.add("kitap");
		
		System.out.println("Döngü öncesi : "+ words);
		System.out.println("Liste uzunluðu :" + words.size());
		
		for (int index = 0; index < words.size(); index+=2) {
			words.add(index , "*");
		}
		
		System.out.println("Döngü Sonrasý : "+ words);
		System.out.println("Liste uzunluðu :" + words.size());
		
		
		for (int index = 0; index < words.size(); index++) {
			words.remove(index);
		}
		/*
		for (int index = words.size()-2; index >= 0; index-=2) {
			words.remove(index);
		}
		*/
		System.out.println("Döngü Sonrasý : "+ words);
		System.out.println("Silme liste uzunluðu :" + words.size());
		
	}

}
