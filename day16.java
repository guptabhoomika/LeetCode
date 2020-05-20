/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null)
        {
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenF = even;
        while(true)
        {
              if(odd==null || even == null || even.next == null)
        {
            odd.next = evenF;
            break;
        }
        odd.next = even.next;
        odd = even.next;
        if (odd.next == null)  
        {  
            even.next = null;  
            odd.next = evenF;  
            break;  
        } 
        
          // Connecting even nodes  
        even.next = odd.next;  
        even = odd.next;
            
        }
        
  
        return head;
        
    }
}