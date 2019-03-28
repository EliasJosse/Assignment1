
public class Stack {
	
	private int[] element;
	private int length;
	
	public Stack(int x){
		
		element = new int[x];
		length = x;
		
	}
	
	public int Pop(){
		
		int toPop = element[0];
		
		for(int i = 0; i < this.length - 1; i++){
			
			this.element[i] = this.element[i+1];
			
		}
		
		this.element[this.length - 1] = 0;
		
		return toPop;
		
	}
	
	public void Push(int x){
		
		for(int i = 0; i < this.length - 1; i++){
			
			this.element[this.length - 1 - i] = this.element[this.length - 2 - i];
			
		}
		
		this.element[0] = x;
		
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
		
		Stack a = new Stack(10);		
		a.element[0] = 1;
		a.element[1] = 2;
		a.element[2] = 3;
		a.element[3] = 4;
		a.element[4] = 5;
		
		int[] b = new int[3];
		b[0] = 7;
		b[1] = 8;
		b[2] = 9;
		
		int[] c = new int[2];
		
		//a.Pop();
		//a.Pop();
		//a.Push(7);
		//a.Push(8);
		c = a.Pop(2);
		//a.Push(3, b);
		
		for(int i = 0; i < a.length; i++){
		
			System.out.println(a.element[i]);
			
		}
		
		System.out.println();
		
		for(int i = 0; i < c.length; i++){
			
			System.out.println(c[i]);
			
		}
		
	}

}
