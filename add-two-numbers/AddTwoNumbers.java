/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode currentNode = result;
        boolean up = false;
    
        while (l1 != null || l2 != null) {
            ListNode node = new ListNode(0);

            if (l1 != null) {
                node.val += l1.val;
            }
            
            if (l2 != null) {
                node.val += l2.val;
            }
            
            if (up) {
                node.val += 1;
                up = false;
            }
            
            if (node.val > 9) {
                up = true;
                node.val = node.val % 10;
            }
            
            currentNode.next = node;
            currentNode = currentNode.next;
            
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }

        }
        
        if (up) {
            currentNode.next = new ListNode(1);
        }
        
        return result.next;
    }
}
