import java.util.Scanner;

public class TestCatchNumber{
	//Main Method
	public static void main(String[] args){
		//create scanner
		Scanner input = new Scanner(System.in);
		
		//input n1
		System.out.println("Enter your number1:");
		Double n1 = input.nextDouble();
		
		//input n2
		System.out.println("Enter your number2:");
		Double n2 = input.nextDouble();
		
		//create catch object
		CatchNumber catch1 = new CatchNumber();
		System.out.println("Total:" + catch1.add(n1,n2));
	}
}