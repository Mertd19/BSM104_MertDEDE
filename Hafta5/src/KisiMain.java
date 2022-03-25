import java.util.ArrayList;

public class KisiMain {

	public static void main(String[] args) {
		
		ArrayList<Kisi> kList = new ArrayList<Kisi>();
		
		kList.add(new Kisi("Ahmet",24));
		kList.add(new Kisi("Kaya",24));
		kList.add(new Kisi("Hayri",24));
		
		kList.forEach(birey ->{
			System.out.println("�sim : " + birey.getIsim() + " , Ya� : "+ birey.getYas());
		});
		
		System.out.println();
		
		for(Kisi birey:kList) {
			System.out.println("�sim : " + birey.getIsim() + " , Ya� : "+ birey.getYas());
		}
	}

}
