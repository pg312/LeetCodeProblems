public class SwapNodesInPairs {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode swapPairs(ListNode head) {
        ListNode node1 = head, node1Prev = null;
        ListNode node2 = head != null ? head.next : null;
        head = node2 != null ? node2 : head;
        while(node1 != null && node2 != null){
            node1.next = node2.next;
            node2.next = node1;
            if(node1Prev != null)
                node1Prev.next = node2;

            node1Prev = node1;
            node1 = node1.next;
            node2 = node1 != null ? node1.next : null;
        }
        return head;

    }
}
