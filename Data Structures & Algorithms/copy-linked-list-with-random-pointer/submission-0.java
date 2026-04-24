/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        //what are we actually doing,
        // storing things directly in a map -> first itiration
        // second itiration storing all connections;
        Map<Node,Node> dataHub = new HashMap<>();
        Node curr = head;
        while (curr != null){
            dataHub.put(curr , new Node(curr.val));
            curr = curr.next;
        }

        // now assign pointers;
        curr = head ;// reset done
        while (curr != null){
            //assign next
            Node copy = dataHub.get(curr);
            copy.next = dataHub.get(curr.next);
            copy.random = dataHub.get(curr.random);
            curr = curr.next;
        }

        return dataHub.get(head);

    }
}
