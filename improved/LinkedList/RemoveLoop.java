/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode solve(ListNode A) {
        ListNode slow = A;
        ListNode fast = A;
        boolean hasCycle = false;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                hasCycle = true;
                break;
            }
        }
        ListNode s1 = A,s2=slow;
        while(s1.next!=s2.next){
            s1=s1.next;
            s2=s2.next;
        }
        s2.next = null;// break the cycle
        return A;
    }
}
