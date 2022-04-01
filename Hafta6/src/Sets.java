import java.util.*;


public class Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("kalem");
		aList.add("masa");
		aList.add("bilgisayar");
		aList.add("defter");
		aList.add(3,"dolap");
		aList.add("kalem");
		aList.add("masa");
		
		System.out.println(aList);
		System.out.println(aList.size());  //Sýralý etkileþim
		
		
		Set<String> hList = new HashSet<String>();
		hList.add("kalem");
		hList.add("masa");
		hList.add("bilgisayar");
		hList.add("defter");
		hList.add("kalem");
		hList.add("masa");
		
		System.out.println(hList);
		System.out.println(hList.size()); //Rastgele etkileþim , Ýndex yok
		
		Set<String> tList = new TreeSet<String>();
		tList.add("kalem");
		tList.add("masa");
		tList.add("bilgisayar");
		tList.add("defter");
		tList.add("kalem");
		tList.add("masa");
		
		System.out.println(tList); //Çýktýda Sýralý þekilde veriyor , Ýndex yok
		System.out.println(tList.size());
		System.out.println(tList.contains("masa"));
		
		tList.clear();
		System.out.println(tList);
		tList.addAll(aList);
		System.out.println(tList);
				
		
	}

}
