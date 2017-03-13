package practice;

public class GenericClass_Study <T> {

	T ob;
	
	GenericClass_Study(T ob){
		this.ob = ob;
	}
	
	public void show(){
		System.out.println("The type of ob: " + ob.getClass().getName());
	}
	
	public T getOb(){
		return ob;
	}
	
	public static void main(String[] args) {
		
		GenericClass_Study<String> g1 = new GenericClass_Study<String>("Hem");
		g1.show();
		System.out.println(g1.getOb());
		
		GenericClass_Study<Integer> g2 = new GenericClass_Study<Integer>(10);
		g2.show();
		System.out.println(g2.getOb());
		
		GenericClass_Study<Double> g3 = new GenericClass_Study<Double>(10.5);
		g3.show();
		System.out.println(g3.getOb());
		
		GenericClass_Study<Object> g4 = new GenericClass_Study<Object>(2);
		g4.show();
		System.out.println(g4.getOb());

	}

}


class TestGen <T extends Number & Runnable> {
	public void say(){
		System.out.println("Here we can pass Number or Runnable types, and any type that are child classes of Number or implementation classes of Runnable.");
		/** But <T extends Runnable & Number> is not valid, because as Runnable is
		 * an interface and we have to take class first followed by interface next.
		*/
	
	}
}

class GenExm <T extends Number & Runnable & Comparable, U extends Thread, V> {
	public void doIt(){
		System.out.println("Number is a class, but Runnable and Comparable are interfaces.");
		
		/** But <T extends Number & Thread> is not possible, because we can't
		 * extend more than one class simultaneously.
		 */
	}
}
