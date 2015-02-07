import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class OddOrEven{
	static LLStack<Integer> odd = new LLStack<Integer>();
	static LLStack<Integer> even = new LLStack<Integer>();
	public static void main(String[] args) throws FileNotFoundException, StackUnderflowException{
		FileReader file = new FileReader("c:/OddEven.txt"); //input taken from file
		Scanner input = new Scanner(file);
		while(input.hasNext()){
			int incoming = input.nextInt();
			if(incoming % 2 != 0){
				odd.push(incoming);
			}
			else{
				even.push(incoming);
			}
		}
		getSum();
	}
	public static void getSum() throws StackUnderflowException{
		int oddSum = 0;
		int evenSum = 0;
		int totalSum = 0;
		
		while(!(odd.isEmpty())){
			oddSum += odd.top();
			odd.pop();
		}
		while(!(even.isEmpty())){
			evenSum += even.top();
			even.pop();
		}
		totalSum = oddSum + evenSum;
		System.out.println("Odd Sum: " + oddSum + "\n" + "Even Sum: " + evenSum + "\n" + "Total Sum: " + totalSum);
	}
}
