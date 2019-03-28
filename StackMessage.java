class Message{
	
	int info;
	
	public Message(){
		
		info = 1;
		
	}
	
}

public class StackMessage {
	
	private Message[] element;
	private int length;
	
	public StackMessage(int x){
		
		element = new Message[x];
		length = x;
		
	}
	
	public Message Pop(){
		
		Message toPop = element[0];
		
		for(int i = 0; i < this.length - 1; i++){
			
			this.element[i] = this.element[i+1];
			
		}
		
		this.element[this.length - 1] = null;
		
		return toPop;
		
	}
	
	public void Push(Message x){
		
		for(int i = 0; i < this.length - 1; i++){
			
			this.element[this.length - 1 - i] = this.element[this.length - 2 - i];
			
		}
		
		this.element[0] = x;
		
	}
	
	public Message[] Pop(int n){
		
		Message[] popedElements = new Message[n];
		
		for(int i = 0; i < n; i++){
			
			popedElements[n - 1 - i] = this.Pop();
			
		}
		
		return popedElements;
		
	}
	
	public void Push(int n, Message[] x){
		
		for(int i = 0; i < n; i++){
		
			this.Push(x[i]);
			
		}
		
	}
	
	public int size(){
		
		int n = 0;
		
		for(int i = 0; i < this.length; i++){
			
			if(this.element[i] != null){
				
				n++;
				
			}
			
		}

		return n;
		
	}

}
