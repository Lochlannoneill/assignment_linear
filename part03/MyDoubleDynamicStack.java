/**
* Author:	Lochlann O Neill
* Class:	S2D-A
* Date:		03/11/2019
*/

/**
 * ADT MyStack: Private Part<br>
 * . The class implements all the operations available in MyStack<br>
 */
public class MyDoubleDynamicStack<T> implements MyStack<T> {
	// --------------------------------------------------
	// Attributes
	// --------------------------------------------------
	private MyDoubleLinkedNode<T> head;
	private MyDoubleLinkedNode<T> tail;

	// -------------------------------------------------------------------
	// Basic Operation --> Check if myStack is empty: myCreateEmpty
	// -------------------------------------------------------------------
	// public myStack myCreateEmpty(){}
	public MyDoubleDynamicStack() {
		this.head = null;
		this.tail = null;
	}

	// -------------------------------------------------------------------
	// Basic Operation --> Check if myStack is empty: isEmpty
	// -------------------------------------------------------------------
	public boolean isEmpty() {
		boolean res = true;
		int scenario;

		if (head == null || tail == null) {
			scenario = 0;
		} else {
			scenario = 1;
		}

		switch (scenario) {
		case 0: {
			res = true;
			break;
		}
		case 1: {
			res = false;
			break;
		}
		}

		return res;
	}

	// -------------------------------------------------------------------
	// Basic Operation (Partial) --> Get first element from front of MyStack: first
	// -------------------------------------------------------------------
	public T first() {
		// -----------------------------
		// Output Variable --> InitialValue
		// -----------------------------
		T res = null;

		if (isEmpty()) {
			System.out.println("The stack is currently empty");
		} else {
			res = head.getInfo();
		}

		return res;
	}

	// -------------------------------------------------------------------
	// Basic Operation --> Add element to back of MyStack: addByFirst
	// -------------------------------------------------------------------
	public void addByFirst(T element) {
		if (isEmpty()) {
			head = new MyDoubleLinkedNode<T>(null, element, null);
			tail = head; // if there is only one value in the stack, it is both the head and tail
		} else {
			MyDoubleLinkedNode<T> currentNode = new MyDoubleLinkedNode<T>(null, element, head);
			head.setLeft(currentNode);
			head = currentNode;
		}

	}

	// -------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyStack:
	// removeByFirst
	// -------------------------------------------------------------------
	public void removeByFirst() {
		if (isEmpty()) {
			System.out.println("The stack is currently empty");
		} else {
			if (head == tail) { // if there is only one item in the stack, head and tail are the same
				head = null;
				// tail = head;
				tail = null;
			} else {
				//placeholder - find out how to remove the item
				//MyDoubleLinkedNode<T> currentNode = new MyDoubleLinkedNode<T>(null, element, head);
				//currentNode.setRight(null);
			}
		}
	}

	// -------------------------------------------------------------------
	// Basic Operation (Partial) --> Get first element from front of MyStack: last
	// -------------------------------------------------------------------
	public T last() {
		// -----------------------------
		// Output Variable --> InitialValue
		// -----------------------------
		T res = null;

		if (isEmpty()) {
			System.out.println("The stack is currently empty");
		} else {
			res = tail.getInfo(); //opposite to first, use tail instead of head
		}

		return res;
	}

	// -------------------------------------------------------------------
	// Basic Operation --> Add element to back of MyStack: addByLast
	// -------------------------------------------------------------------
	public void addByLast(T element) {
		if (isEmpty()) {
			head = new MyDoubleLinkedNode<T>(null, element, null);
			tail = head; // if there is only one value in the stack, it is both the head and tail
		} else {
			MyDoubleLinkedNode<T> currentNode = new MyDoubleLinkedNode<T>(head, element, null);
			tail.setRight(currentNode);
			tail = currentNode;
		}
	}

	// -------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyStack:
	// removeByFirst
	// -------------------------------------------------------------------
	public void removeByLast() {
		if (isEmpty()) {
			System.out.println("The stack is currently empty");
		} else {
			if (head == tail) { // if there is only one item in the stack, head and tail are the same
				head = null;
				// tail = head;
				tail = null;
			} else {
				//placeholder - find out how to remove the item
				//MyDoubleLinkedNode<T> currentNode = new MyDoubleLinkedNode<T>(head, element, null);
				//currentNode.setLeft(null);
			}
		}
	}

}
