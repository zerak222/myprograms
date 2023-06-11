/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode dummy = new ListNode(-1);
        ListNode t1 = A;
        ListNode t2 = B;
        ListNode temp = dummy; // temp is the tail of the merged linked list
        while(t1 != null && t2 != null) {
            if(t1.val<t2.val) {
                temp.next = t1; // link temp to t1 
                // move t1 to right
                temp = t1; // initialise temp with t1 as we are moving t1 to right
                t1 = t1.next;
            } else {
                temp.next = t2; // link temp to t2
                // move t2 to right
                temp = t2;// initialise temp with t2 as we are moving t2 to right
                t2 = t2.next;
            }
        }
        // handle remaining elements
        
        if(t1!=null){
            temp.next = t1;  // just link the remaining elements of t2 to temp
        }
        if(t2!=null){
            temp.next = t2; // just link the remaining elements of t2 to temp
        }
        return dummy.next;
    }
}
