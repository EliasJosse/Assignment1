package vecka1;

public class MessageQueue {
	private Message[] elements;
	private int count;
	private int head;
	private int tail;
	
	public MessageQueue(int capacity){
		elements = new Message[capacity];
		count = 0;
		head = 0;
		tail = 0;
	}
	public Message remove(){
		Message r = elements[head];
		head = (head+1) % elements.length;
		count--;
		return r;
	}
	public void add(Message aMessage)
	{
		if((tail + 1) % elements.length == head){
			MessageQueue newQueue = new MessageQueue(elements.length*2);
			int lim = this.count; 
			for(int i=0;i<lim;i++){
				newQueue.add(this.remove());
			}
			this.elements = newQueue.elements;
			this.count = newQueue.count;
			this.head = newQueue.head;
			this.tail = newQueue.tail;
		}
		elements[tail] = aMessage;
		tail = (tail + 1) % elements.length;
		count++;
	}
	
	public int size()
	{
		return count;
	}
	
	public boolean isFull()
	{
		return count == elements.length;
	}
	
	public Message peek()
	{
		return elements[head];
	}
	
	public void printQ(){
		while(tail != head){
			System.out.println(elements[head].toInt());	
			
			this.remove();
		}
	}
	

	public static void main(String[] args) {
		
		MessageQueue q = new MessageQueue(3);
		Message a = new Message();
		Message b = new Message();
		Message c = new Message();
		
		q.add(a);
		q.add(b);
		q.add(c);
	
	}
	
	

	
}
