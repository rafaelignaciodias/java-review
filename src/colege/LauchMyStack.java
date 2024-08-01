package colege;

public class LauchMyStack {
	public static void main(String[] args) {

		MyStack<String> myFirstStack = new MyStack<>();
		myFirstStack.addStack("Item 1");
		myFirstStack.addStack("Item 2");
		myFirstStack.addStack("Item 3");
		myFirstStack.showStack();
		System.out.println(myFirstStack.peekStack());
		myFirstStack.showStack();
		System.out.println(myFirstStack.popStack());
		myFirstStack.showStack();

		MyStack<Integer> mySecondStack = new MyStack<>();
		mySecondStack.addStack(1);
		mySecondStack.addStack(2);
		mySecondStack.addStack(3);
		mySecondStack.showStack();
		System.out.println(mySecondStack.peekStack());
		mySecondStack.showStack();
		System.out.println(mySecondStack.popStack());
		mySecondStack.showStack();

	}
}