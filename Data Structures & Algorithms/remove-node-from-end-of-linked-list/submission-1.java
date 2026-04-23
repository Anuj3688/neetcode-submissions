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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //Brute force solve
         // first loop node to get size
         // second loop 
         ListNode curr = head;
         List<ListNode> arr = new ArrayList<>();
         while (curr!= null){
            arr.add(curr);
            curr = curr.next;
         }

         // removing head
        if (n == arr.size()) {
            return head.next;
        }
         System.out.println(arr.size() - n - 1);
         arr.get(arr.size() - n - 1).next = arr.get(arr.size()-n).next;

         return head;

    }
}
