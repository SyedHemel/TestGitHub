package practice;

public class Test {
	
	private int ssn;
	private int age;
	private String name;
	private String location;
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public Test(){}
	
	public Test(String name, String location){
		this.name = name;
		this.location = location;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
		String validLocation = location.toLowerCase();
		if(validLocation.equals("maryland") || validLocation.equals("ny") || validLocation.equals("heaven"))
		{
			this.location = location;
		}
		else
		{
			this.location = "Unknown";
		}
	}

}
