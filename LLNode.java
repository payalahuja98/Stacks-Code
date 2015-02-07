public class LLNode<T> {
	
	private T data;
	private LLNode<T> next;
	
	public LLNode(T data){
		this(data,null);
	}
	
	public LLNode(T data, LLNode<T> next){
		this.data = data;
		this.next = next;
	}
	
	public void setData(T data){
		this.data = data;
	}
	
	public void setNext(LLNode<T> next){
		this.next = next;
	}
	
	public T getData(){
		return this.data;
	}
	
	public LLNode<T> getNext(){
		return this.next;
	}
	
}
