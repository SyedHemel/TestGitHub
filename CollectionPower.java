package practice;

import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class CollectionPower {

	public static void main(String[] args) {

		LinkedList<String> cars = new LinkedList<>();
		
		Map<Object, String> person1 = new TreeMap<>();
		
		person1.put("c", "123456789");
		person1.put("b", "Akkas");
		person1.put("a", "21");
		person1.put("1", "Kekarot");
		person1.put("2", "X-men");
		
		System.out.println("Tree Map entries --->");
		System.out.println();
		
		for(Map.Entry<Object, String> entry : person1.entrySet()){
			System.out.println(entry);
		}
		
		cars.add("Elantra");
		cars.add("Prius");
		cars.add("BMW");
		
		/*for(String car: cars){
			System.out.println("The item is: " + car);
		}
		
		// System.out.println("The size of the list: " + cars.size());
		
		cars.remove(0);
		
		for(String car: cars){
			System.out.println("The item after removing is: " + car);
		}
*/
	}
	
	

}
