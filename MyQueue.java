
public class MyQueue {
	int size,head,tail;
	int[] queueArray;
	
	public MyQueue(int size){
		queueArray=new int[size];
		head=0;
		tail=0;
		this.size=0;
	}
	
	public void enQueue(int i){
		if (size==queueArray.length){
			System.out.println("Queue is full!");
		}else{
			queueArray[tail]=i;
			tail++;
			size++;
		}
	}
	
	public void deQueue(){
		if (size==0){
			System.out.println("Queue is empty!");
		}else{
			int a=queueArray[head];
			head++;
			size--;
			System.out.println(a);
		}
		
	}
	
	public void peek(){
		if (size==0){
			System.out.println("Queue is empty!");
		}else{
			System.out.println(queueArray[queueArray.length-size]);
		}
	}
	
	
	public static void main(String[] args){
		MyQueue q=new MyQueue(5);
		q.enQueue(3);
		q.enQueue(5);
		q.enQueue(10);
		q.enQueue(7);
		q.enQueue(0);
		//q.enQueue(1);
		
		q.peek();
		q.deQueue();
		q.peek();
		q.deQueue();
		q.peek();
		q.deQueue();
		q.peek();
		q.deQueue();
		q.peek();
		q.deQueue();
		q.peek();
		q.deQueue();
		q.peek();
		
	}
}
