package practice;

import java.util.ArrayList;

public class GenericsTest {
	
	private String name;
	private int id;

	public static void main(String[] args) {

  ArrayList<Integer> items = new ArrayList<>();
  
    items.add(1);
    items.add(2);
    items.add(3);
   // items.add("hemel");
    items.add(4);
    items.add(5);
    
    printDoubled(items);
    
    GenDemo<Float> gf = new GenDemo<Float>(124f);
    gf.showIt();
    System.out.println(gf.getG());

	}

	private static void printDoubled(ArrayList<Integer> n) {
		for(int i : n){
			System.out.println( i*2);
		}
		
	}

}

class GenDemo <G> {
	G g;
	
	GenDemo(G g){this.g=g;}
	
	public G getG(){return g;}
	
	public void showIt(){
		System.out.println("Type is: "+ g.getClass().getName());
	}
	
}
