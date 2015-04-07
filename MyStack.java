
public class MyStack {
	int top;
	int[] stackArray;
	public MyStack(int size){
		stackArray=new int[size];
		top=-1;
	}
	
	public boolean isEmpty(){
		return top==-1;
	}
	
	public boolean isFull(){
		return top==stackArray.length-1;
	}
	
	public void push(int i){
		top++;
		stackArray[top]=i;
	}
	
	public int pop(){
		if (isEmpty()){
			System.out.println("Stack is empty");
			return -1;
		}else{
			top--;
			return stackArray[top+1];
		}
	}
	
	public int peek(){
		if (isEmpty()){
			System.out.println("Stack is empty");
			return -1;
		}else{
			return stackArray[top];
		}
	}
	
	public static void main(String[] args){
		MyStack s=new MyStack(5);
		System.out.println(s.isEmpty());
		s.push(4);
		s.push(3);
		s.push(10);
		s.push(0);
		s.push(6);
		System.out.println(s.isFull());
		
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.peek());
		
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		System.out.println(s.isEmpty()+" "+s.peek());
	}
	
}
