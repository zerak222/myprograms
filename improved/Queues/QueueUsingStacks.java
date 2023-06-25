/*
Implement a First In First Out (FIFO) queue using stacks only.

The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).

Implement the UserQueue class:

void push(int X) : Pushes element X to the back of the queue.
int pop() : Removes the element from the front of the queue and returns it.
int peek() : Returns the element at the front of the queue.
boolean empty() : Returns true if the queue is empty, false otherwise.
NOTES:

You must use only standard operations of a stack, which means only push to top, peek/pop from top, size, and is empty operations are valid.
Depending on your language, the stack may not be supported natively. You may simulate a stack using a list or deque (double-ended queue) as long as you use only a stack's standard operations.


Problem Constraints
----------------------
1 <= X <= 109

At most 1000 calls will be made to push, pop, peek, and empty function.

All the calls to pop and peek are valid. i.e. pop and peek are called only when the queue is non-empty



Example : 

Input 1:

 1) UserQueue()
 2) push(20)
 3) empty()
 4) peek()
 5) pop()
 6) empty()
 7) push(30)
 8) peek()
 9) push(40)
 10) peek()
 
Output 1:

 false
 20
 20
 true
 30
 30 
 
Input 2:

 1) UserQueue()
 2) push(10)
 3) push(20)
 4) push(30)
 5) pop()
 6) pop()
 
Output 2:

 10
 20

*/

public static class UserQueue{
	static Stack<Integer>st1;
	static Stack<Integer>st2;
	 /** Initialize your data structure here. */
	UserQueue(){
		this.st1 = new Stack();
		this.st2 = new Stack();
	}
	/** Push element X to the back of queue. */
	static void push(int X){
		st1.push(X);
	}
	/** Removes the element from in front of queue and returns that element. */
	static int pop(){
		if(st2.isEmpty()){
			while(!st1.isEmpty()){
				st2.push(st1.pop());
			}
		}
		return st2.pop();
	}
	/** Get the front element of the queue. */
	static int peek(){
		if(st2.isEmpty()){
			while(!st1.isEmpty()){
				st2.push(st1.pop());
			}
		}
		return st2.peek();
	}
	/** Returns whether the queue is empty. */
	static boolean empty(){
		return st1.isEmpty() && st2.isEmpty();
	}
}