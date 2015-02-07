//test program for "Balanced"
import java.util.Scanner;
public class BalancedApp{
	public static void main(String[] args) throws StackUnderflowException{
		Scanner input = new Scanner(System.in);
		Balanced b = new Balanced("({[","]})"); 
		System.out.println("0 - balanced, 1 - unbalanced, 2 - premature ending");
		System.out.println("Enter expression");
		System.out.println(b.test(input.nextLine()));
	}
}

	