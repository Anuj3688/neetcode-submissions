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
    public void reorderList(ListNode head) {
        // here the solve is simple add all elements in stack
        // now remove first then remove last keep joining
        // all at the end you get the result
        ArrayList<ListNode> list = new ArrayList<>();
        ListNode curr = head;
        while (curr!=null){
            list.add(curr);
            curr = curr.next;
        }
        int i = 0;
        int j = list.size() - 1;
        System.out.println(j);
        while (i<j){
            list.get(i).next = list.get(j);
            i++;
            if (i == j){
                break;
            }
            list.get(j).next = list.get(i);
            j--;
        }
        list.get(i).next = null;
    }
}
