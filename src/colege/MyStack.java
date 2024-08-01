package colege;

import java.util.Stack;

public class MyStack<T> {

	public Stack<T> myStack = new Stack<>();

	public void addStack(T data) {
		myStack.add(data);
	}

	public void showStack() {
		System.out.println(myStack);
	}

	public T peekStack() {
		return myStack.peek();
	}
	
	public T popStack() {
		return myStack.pop();
	}
}