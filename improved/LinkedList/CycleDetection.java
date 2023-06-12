/*
	Given head of the linked list, check for cycle detection
	Floyd's Cycle Detection Algorithm
*/

public boolean hasCycle(Node head){
		Node slow = head;
		Node fast = head;
		boolean hasCycle = false;
		while(fast!=null && fast.next!=null){
				slow = slow.next;
				fast = fast.next.next;
				if(slow == fast){
						hasCycle = true;
						break;
				}
		}
		return hasCycle;
}