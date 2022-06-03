import java.util.*;
import java.util.function.*;

public class MathTutor {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		givesProblems(console, 4, "+", (x,y) -> x + y);

	}
	
	public static void givesProblems(Scanner console,int numProblems,String text,IntBinaryOperator operator) {
		
		Random r = new Random();
		int dogruCevap = 0;
		for(int i = 0 ;i<numProblems;i++) {
			int sayi1 = r.nextInt(12);
			int sayi2 = r.nextInt(12);
			System.out.println(sayi1 + " " + text + " " + sayi2 + " = ");
			
			int cevap = operator.applyAsInt(sayi1, sayi2);
			int kcevap = console.nextInt();
			
			if(cevap == kcevap) {
				System.out.println("Doðru");
				dogruCevap++;
			}
			
			else {
				System.out.println("Yanlýþ . Cevap = "+cevap);
			}
		}
		System.out.println(numProblems +  " Soruda Doðru Sayýsý : " + dogruCevap);
	}

}
