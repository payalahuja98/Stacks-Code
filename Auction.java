import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class Auction{
	public static void main(String[] args) throws FileNotFoundException, StackUnderflowException{
		FileReader file = new FileReader("c:/Bidders.txt"); //input taken from file Bidders
		Scanner input = new Scanner(file);
		int currBid = 1;
		LLStack<Integer> highBid = new LLStack<Integer>();
		LLStack<Integer> maxBid = new LLStack<Integer>();
		//LLStack<String> bidder = new LLStack<String>();
		highBid.push(1);
		maxBid.push(1);
		int incoming = 0;
		boolean firstTime = true;
		
		while(input.hasNextInt()){
		 incoming = input.nextInt();
		 if(incoming > currBid){
			if(firstTime){
				if(incoming > highBid.top() && incoming < maxBid.top()){
					highBid.push(incoming);
				}
				firstTime = false;
			}
			else{
		    //incoming = input.nextInt();
				/*String name = input.nextLine();
				bidder.push(name);*/
				if(incoming > maxBid.top()){
					highBid.push(maxBid.top());
					maxBid.push(incoming);
				}
				if(incoming > highBid.top()){
					//highBid.push(incoming);
				}
				currBid = incoming;
			}
		 }
		}
		//printValues(bidder,highBid);
		printValues(highBid);
	}
	public static void printValues(LLStack<Integer> amts) throws StackUnderflowException{
		while(!(amts.isEmpty())){
			//System.out.println(names.top() + "     " + amts.top());
			System.out.println(amts.top());
			//names.pop();
			amts.pop();
			amts.pop();
		}
	}
}
