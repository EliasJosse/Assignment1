
public class Stack {
	
	private int[] element;
	private int length;
	private int pointer;
	
	public Stack(int x){
		
		element = new int[x];
		length = x;
		pointer = -1;
		
	}
	
	public int Pop(){
		
		if(pointer == -1){
			
			throw new IllegalArgumentException();
			
		}
		
		int toPop = element[pointer];
		
		pointer--;
		
		return toPop;
		
	}
	
	public void Push(int x){
		
		if(pointer == length - 1){
			
			throw new IllegalArgumentException();
			
		}
		
		element[pointer + 1] = x;
		
		pointer++;
		
	}
	
	public int[] Pop(int n){
		
		int[] popedElements = new int[n];
		
		for(int i = 0; i < n; i++){
			
			popedElements[n - 1 - i] = this.Pop();
			
		}
		
		return popedElements;
		
	}
	
	public void Push(int n, int[] x){
		
		for(int i = 0; i < n; i++){
		
			this.Push(x[i]);
			
		}
		
	}
	
	public static void main(String[] args){
		
	}

}
