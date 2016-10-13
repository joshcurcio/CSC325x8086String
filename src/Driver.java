import java.util.Scanner;


public class Driver {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String source = "";
		while (source.equals(""))
	    {
			System.out.println("Enter a string: ");
			source = input.nextLine().toString();
	    }
		source += "$";
		
		String8086 testString = new String8086(source);
		testString.populateCharArray();
		testString.printCharArray();
	}
}
