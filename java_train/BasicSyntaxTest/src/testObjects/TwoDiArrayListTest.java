package testObjects;
import java.util.ArrayList;

public class TwoDiArrayListTest {

	public static void main(String[] args) {
		ArrayList<ArrayList<String>> groceryList	= new ArrayList<ArrayList<String>>();
		
		ArrayList<String> bakeryList 	= new ArrayList<String> (); //dyno ARRY
		bakeryList.add("Simit");
		bakeryList.add("Poğaça");
		bakeryList.add("Börek");
		
		ArrayList<String> produceList	= new ArrayList<String> (); //dyno ARRY
		produceList.add("Domates");
		produceList.add("Biber");
		produceList.add("Patlıcan");
		
		ArrayList<String> drinkList		= new ArrayList<String> (); //dyno ARRY
		drinkList.add("Rakı");
		drinkList.add("Viski");
		drinkList.add("Bira");
		drinkList.add("Ayran");
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinkList);
		
		for (int i = 0; i < groceryList.size(); i++) {
			System.out.println(groceryList.get(i));
		}

	}

}
