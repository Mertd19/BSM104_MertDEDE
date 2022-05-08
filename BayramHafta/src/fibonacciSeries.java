import java.util.*;
public class fibonacciSeries {

	public static void main(String[] args) {
		System.out.println(fibonacciSeries(5));
	}
	
	public static ArrayList<ArrayList<Integer>> fibonacciSeries(int numOfRows){
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		
		for(int i = 0; i < numOfRows;i++) {
			list.add(new ArrayList<Integer>());
		}
		list.get(0).add(1);
		list.get(1).add(1);
		for(int i = 2 ; i < numOfRows ; i++) {
			for(int j = 0; j <= 1 ; j++) {
				if(i == 2 || j == 0) {
					list.get(i).add(1);
					}
				else {
					list.get(i).remove(0);
					int one = list.get(i-1).get(1);
					int two = list.get(i-1).get(j-1) + list.get(i-1).get(j);
					list.get(i).add(0,one);
					list.get(i).add(1,two);
				}	
			}
		}
		return list;
	}

}
