/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reorderList(ListNode A) {
        ListNode fast = A;
        ListNode slow = A;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode t1 = A;
        ListNode t2 = slow.next;
        slow.next = null;     // break into two LL 
        t2=reversedList(t2);

        ListNode ans = mergeTwoLL(t1,t2);
        
        return ans;
    }

    public ListNode mergeTwoLL(ListNode A,ListNode B){
        ListNode t1 = A;
        ListNode t2 = B;
        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;
        while(t1!=null && t2!= null){
            temp.next = t1 ; // link temp to t1     (step 1)
            temp = temp.next; // move temp to t1    (step 2)
            t1 = t1.next; // move t1 to right as we have linked t1 to temp  (step 3)
            // move to t2 
            temp.next = t2; // link t2 to temp    (step 1)
            temp = t2;     // move temp to t2     (step 2)
            t2 = t2.next;  // move t2 to right as we have linked t2 to temp  (step 3)
        }
        if(t1!=null){
            temp.next = t1;
        }
        if(t2!=null){
            temp.next = t2;
        }
        return dummyNode.next;
    }

    public ListNode reversedList(ListNode A){
        if(A==null){
            return A;
        }
        ListNode prev = null;
        ListNode curr = A;
        while(A!=null){
            A = A.next;
            curr.next = prev;
            prev = curr;
            curr = A;
        }
        return prev;
    }
    public void print(ListNode A) {
        ListNode temp = A;
        while(temp!=null){
            System.out.print(temp.val);
            if(temp.next==null){
                System.out.print(" ");
                break;
            }else{
                System.out.print(" ");
            }
            temp=temp.next;
        }
        System.out.println();
    }
}
