//example taken from "Object-Oriented Data Structures using Java, Third Edition" (Dale,Joyce,Weems)
//tests if expression sent from BalancedApp is well-formed
//is well-formed if each open symbol - (,[,{ - has a corresponding close symbol - ),],}.
public class Balanced{
	private String openSet;
	private String closedSet;

	public Balanced(String o, String c){
		openSet = o;
		closedSet = c;

		System.out.println("OPENSET: " + openSet);
		System.out.println("CLOSEDSET: " + closedSet);
	}
	
	public int test(String expression) throws StackUnderflowException{		
		UnboundedStack symbols = new LLStack();	
		int stillBalanced = 0;		
		boolean preMEnd = false;
		int currIndex = 0;
		char currChar;
		int count = 0;
		boolean check = false;
		int openSetCount = 0;
		int closedSetCount = 0;
		while(stillBalanced == 0 && count < expression.length()){		
			currChar = expression.charAt(currIndex);		
		  if(!(currChar >= 97) || !(currChar <= 122)){
			if(openSet.indexOf(currChar) != -1){			
				symbols.push(currChar);						
				stillBalanced = 0;
				openSetCount++;
			}
			else{
			  if(!(symbols.isEmpty())){
				if(closedSet.indexOf(currChar) != -1){			
						currChar = flip(currChar);
						if(symbols.top().equals(currChar)){
							stillBalanced = 0;
						}
						else{
							stillBalanced = 1;
							return stillBalanced;
						}

						closedSetCount++;
						
						symbols.pop();
						symbols.pop();
						check = true;
				}
			  }
			}
		  }
			currIndex++;								
			count++;
				
		}
		
			if(check == false || openSetCount != closedSetCount){
				stillBalanced = 2;
			}
		
		return stillBalanced;
	}
	private static char flip(char test){
		if(test == '}'){
			return '{';
		}
		else{
			if(test == ')'){
				return '(';
			}
			else{
				return '[';
			}
		}
	}
}
