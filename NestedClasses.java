package practice;

public class NestedClasses {
	
	static String x="Hi";
	String y ="Bye";
	static int i=2;
	int j=3;
	
	static void m1(){System.out.println("Hi");}
	
	void m2(){System.out.println("Bye");}

	public static void main(String[] args) {
		
		NestedClasses.T1 t1 = new NestedClasses.T1();
		NestedClasses.T2 t2 = new NestedClasses().new T2();
		
		t1.printT1();
		
		t2.printT2();
		
	}
	
	public static class T1 {
		
		void printT1(){System.out.println("Say " + x);
		m1();
	        }		
	}
	
	public class T2 {
		static final int z=6;
		void printT2(){System.out.println("Don's say " + y + ", say " + x);
		m1();
		m2();}
	}

}
