package testObjects;
import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> food = new ArrayList<String> (); //dyno ARRY
		
		food.add("Pizza");
		food.add("Hamburger");
		food.add("Döner");
		food.add("Kebap");
		food.add("Mantı");
		
		food.set(0, "Ayran"); 	// Replaces value of index at given index
		food.remove(2);			// Removes the given index  
		food.clear();			// Clears The arrayList
		
		for (int i = 0; i < food.size(); i++) {
			System.out.println(food.get(i));
		}
	}

}
