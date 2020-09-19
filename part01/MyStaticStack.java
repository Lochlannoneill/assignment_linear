/**
* Author:	Lochlann O Neill
* Class:	S2D-A
* Date:		03/11/2019
*/

/**
 * ADT MyStack: Private Part<br>
 * . The class implements all the operations available in MyStack<br>
 */

public class MyStaticStack implements MyStack {

	// --------------------------------------------------
	// Attributes
	// --------------------------------------------------
	private int numItems;
	private int maxItems;
	private int items[];

	// -------------------------------------------------------------------
	// Basic Operation --> Check if myStack is empty: myCreateEmpty
	// -------------------------------------------------------------------
	// public myStack myCreateEmpty(){}
	public MyStaticStack(int m) {
		this.numItems = 0;
		this.maxItems = m;
		this.items = new int[m];
	}

	// -------------------------------------------------------------------
	// Basic Operation --> Check if MyStack is empty: isEmpty
	// -------------------------------------------------------------------
	public boolean isEmpty() {
		boolean res = true;
		int scenario;

		if (numItems == 0) {
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
	// Basic Operation (Partial) --> Get and remove first element from top of
	// MyStack: pop
	// -------------------------------------------------------------------
	public int pop() {
		int res = -1;

		if (this.isEmpty()) {
			System.out.println("The stack is currently empty, no more values can be removed from it");
		} else {
			res = items[numItems - 1];
			//items[numItems - 1] = 0;
			numItems--;
		}

		return res;
	}

	// -------------------------------------------------------------------
	// Basic Operation (Partial) --> Add element to the top of MyStack: push
	// -------------------------------------------------------------------
	public void push(int element) {
		if (numItems == maxItems) {
			System.out.println("The stack is currently full, no more values can be added to it");
		} else {
			items[numItems] = element;
			numItems++;
		}
	}

	// -------------------------------------------------------------------
	// Basic Operation (Partial) --> prints all the elements from MyStack: print
	// -------------------------------------------------------------------
	public void print() {
		if (this.isEmpty()) {
			System.out.println("The stack is currently empty");
		} else {
			for (int i = numItems - 1; i >= 0; i--) {
				System.out.print(items[i] + " ");
			}
		}
	}

}
