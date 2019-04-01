class Message{
	
	int info;
	
	public Message(){
		
		info = 1;
		
	}
	
}

public class StackMessage {
	
	private Message[] element;
	private int length;
	int pointer;
	
	// @invariance -1 <= pointer <= length-1
	// @invariance length >= 1
	//	
	
	
	
	
	public StackMessage(int x){
		
		element = new Message[x];
		length = x;
		pointer = -1;
		
	}
	
	
	public Message Pop(){
		assert pointer < 0:"Stack is empty";
		
		Message toPop = element[pointer];
		
		pointer--;
		
		assert toPop == null;
		return toPop;
		
	}
	
	public void Push(Message x){
	
		assert pointer == length - 1:"Stack is full";
		
		element[pointer + 1] = x;
		
		pointer++;
		assert pointer == length - 1;
	}
	
	public Message[] Pop(int n){
		assert n <= pointer + 1:"Not enough messages";
		
		Message[] popedElements = new Message[n];
		
		for(int i = 0; i < n; i++){
			
			popedElements[n - 1 - i] = this.Pop();
			
		}
		assert pointer + 1 <= length - n; 
		return popedElements;
		
	}
	
	public void Push(int n, Message[] x){
		
		assert pointer + 1 <= length - n:"Not enough space";
		
		for(int i = 0; i < n; i++){
		
			this.Push(x[i]);
			
		}
		assert pointer + 1 >= n;
		
	}
	
	public int size(){
		
		assert pointer + 1 >= 0 && pointer + 1 <= length;
		return pointer + 1;
	}

}
