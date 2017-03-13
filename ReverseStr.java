package practice;

import java.util.Scanner;

public class ReverseStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		
		String line = sc.nextLine();
		System.out.println("Your string is: " + line);
		
		String rev = reverseIt(line);
		System.out.println("The reverse of the string is: " + rev);

	}
	
	public static String reverseIt(String str){
		String reverse = "";
		for(int i=str.length()-1; i>=0; i--){
			char Chr = str.charAt(i);
			reverse = reverse + Chr;
		}
		
		return reverse;
	}

}
