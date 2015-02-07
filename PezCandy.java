import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class PezCandy{
	static int numElements = 0;
	static int tempNum = 0;
	public static void main(String[] args) throws FileNotFoundException, StackUnderflowException{
		LLStack<String> pez = new LLStack<String>();
		LLStack<String> temp = new LLStack<String>();
		FileReader file = new FileReader("c:/Pez.txt");
		Scanner input = new Scanner(file);
		while(input.hasNext()){				
			pez.push(input.nextLine());			//BLUE RED YELLOW GREEN
			numElements++;						//numElements = 4
		}
		System.out.println(numElements);
		//printValues(pez);
		//System.out.println("x");
		int count = 0;
		while(count < numElements - 1){				//while(3 < 4)	
			if(!(pez.top().equals("YELLOW"))){	//pez.top() = GREEN
				temp.push(pez.top());			//temp.push(GREEN)	
				tempNum++;
			}
			count++;							//count = 4
			pez.pop();
		}
		System.out.println(count);
		System.out.println(tempNum);
		//System.out.println("x");
		printValues(temp);						//GREEN RED BLUE
	}
	private static void printValues(LLStack<String> toPrint) throws StackUnderflowException{
		int count = 0;
		while(count < tempNum){					//GREEN RED BLUE
			System.out.println(toPrint.top());	//GREEN
			toPrint.pop();						//RED BLUE
			toPrint.pop();
			count++;
		}
		System.out.println(count);
	}
}
