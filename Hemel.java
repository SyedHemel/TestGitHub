package practice;

public class Hemel {

	public static void main(String[] args) {
		
		Test tx = new Test();
		System.out.println(tx.getAge());

		Test t = new Test("Adam", "Heaven");
 System.out.println("He is " + t.getName() + ", lives in " + t.getLocation() +".");
   
      t.setName("Hemel");
      t.setLocation("Maryland");
      
 System.out.println("\nHe is " + t.getName() + ", lives in " + t.getLocation() +".");
 
   t.setAge(18);
  System.out.println(t.getName()+" was confused when he was "+t.getAge()+" years old.");

	}

}
