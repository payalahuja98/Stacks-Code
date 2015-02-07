public class LLStack<T> implements UnboundedStack<T> {
	
	private  LLNode<T> topElement;
	
	public LLStack(){
		topElement = null;
	}
	
	public void push(T incoming){
		topElement = new LLNode<T>(incoming, topElement);
		LLNode<T> newNode = new LLNode<T>(incoming);
		newNode.setNext(topElement);
		topElement = newNode;
	}
	
	public void pop() throws StackUnderflowException{
		if(!isEmpty()){
			topElement = topElement.getNext();
		}
		else{
			throw new StackUnderflowException("Pop attempt on empty stack");
		}
	}
	
	public T top() throws StackUnderflowException{
		if(!isEmpty()){
			return topElement.getData();
		}
		else{
			throw new StackUnderflowException("Top attempt on empty stack");
		}
	}
	
	public boolean isEmpty(){
		return (topElement == null);
	}

}
