/**
* Author:	Lochlann O Neill
* Class:	S2D-A
* Date:		03/11/2019
*/

/**
 * ADT MyStack: Private Part<br>
 * . The class implements all the operations available in MyStack<br>
 */
public class MyDynamicStack implements MyStack {

	// --------------------------------------------------
	// Attributes
	// --------------------------------------------------
	private MyNode head;

	// -------------------------------------------------------------------
	// Basic Operation --> Check if MyStack is empty: myCreateEmpty
	// -------------------------------------------------------------------
	// public myStack myCreateEmpty(){}
	public MyDynamicStack() {
		this.head = null;
	}

	// -------------------------------------------------------------------
	// Basic Operation --> Check if MyStack is empty: isEmpty
	// -------------------------------------------------------------------
	public boolean isEmpty() {
		boolean res = true;
		int scenario;

		if (head == null) {
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
	// Basic Operation (Partial) --> Get first element from the top of MyStack and
	// removes it: pop
	// -------------------------------------------------------------------
	public int pop() {
		int res = -1;

		if (this.isEmpty()) {
			System.out.println("The stack is currently empty, no more values can be removed from it");
		} else {
			MyNode tail = new MyNode(head.getInfo(), head.getNext()); // values of previous node used as arguments, points to current node
			this.head = head.getNext();
			res = tail.getInfo();
		}

		return res;
	}

	// -------------------------------------------------------------------
	// Basic Operation (Partial) --> Add element to the top of MyStack: push
	// -------------------------------------------------------------------
	public void push(int element) {
		if (this.isEmpty()) {
			MyNode currentNode = new MyNode(element, null);
			this.head = currentNode; // current head node will now become the tail node, head allows to link future
								// nodes
		} else {
			MyNode currentNode = new MyNode(element, head);
			this.head = currentNode;
		}
	}

	// -------------------------------------------------------------------
	// Basic Operation (Partial) --> prints all the elements from MyStack: print
	// -------------------------------------------------------------------
	public void print() {
		if (this.isEmpty()) {
			System.out.println(" The stack is currently empty");
		} else {
			MyNode currentNode = new MyNode(this.head.getInfo(), this.head.getNext());
			String stack = "";

			while (currentNode != null) {
				stack += (currentNode.getInfo() + " ");
				currentNode = currentNode.getNext();
			}

			System.out.print(stack);
		}
	}

}
