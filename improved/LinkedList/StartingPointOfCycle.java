/*
	Given a Node of a linked list , if the linked list has cycle , find the starting point of the cycle
*/

public Node startingPoint(Node head){
		Node slow = head;
		Node fast = head;
		boolean hasCycle = false;
		while(fast!=null && fast.next!=null){
				slow = slow.next;
				fast = fast.next.next;
				if(slow==fast){
					hasCycle = true;
					break;
				}
		}
		if(hasCycle == false){
				return null;
		}
		Node s1 = head,s2 = slow;
		while(s1!=s2){
				s1 = s1.next;
				s2 = s2.next;
		}
		return s1;
}