/*
Problem Description
You are given a linked list A
Each node in the linked list contains two pointers: a next pointer and a random pointer
The next pointer points to the next node in the list
The random pointer can point to any node in the list, or it can be NULL
Your task is to create a deep copy of the linked list A
The copied list should be a completely separate linked list from the original list, but with the same node values and random pointer connections as the original list
You should create a new linked list B, where each node in B has the same value as the corresponding node in A
The next and random pointers of each node in B should point to the corresponding nodes in B (rather than A)


Problem Constraints
0 <= |A| <= 106



Input Format
The first argument of input contains a pointer to the head of linked list A.



Output Format
Return a pointer to the head of the required linked list.



Example Input
Given list
   1 -> 2 -> 3
with random pointers going from
  1 -> 3
  2 -> 1
  3 -> 1
  


Example Output
   1 -> 2 -> 3
with random pointers going from
  1 -> 3
  2 -> 1
  3 -> 1
  

*/
/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    HashMap<RandomListNode,RandomListNode> map = new HashMap();
    public RandomListNode copyRandomList(RandomListNode head) {
		if(head==null){
			return head;
		}
		RandomListNode ans = new RandomListNode(-1);
		RandomListNode temp1 = head;
		while(temp1!=null){
			RandomListNode ansNode = new RandomListNode(temp.label);
			map.put(temp1,ansNode);
			temp1=temp1.next;
		}
		RandomListNode temp2 = head;
		ans.next = map.get(temp2);
		while(temp2!=null){
			RandomListNode cTemp = map.get(temp2);
			cTemp.next = map.get(temp2.next);
			cTemp.random = map.get(temp2.random);
			temp2=temp2.next;
		}
		return ans.next;
	}
}