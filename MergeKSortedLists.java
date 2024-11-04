import java.util.HashMap;

public class MergeKSortedLists {

    class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = null, prev = null, tail = null;
        ListNode currentTop;
        while(lists.length > 0) {
            for (int index = 0; index < lists.length; index++) {
                currentTop = lists[index];
                if (head == null || currentTop.val < head.val) {
                    head = new ListNode(currentTop.val,null);
                    if(tail == null){
                        tail = head;
                        prev = head;
                    }

                    lists[index] = lists[index].next;
                } else if (tail.val < currentTop.val) {
                    tail.next = new ListNode(currentTop.val, null);
                    prev = tail;
                    tail = tail.next;
                    lists[index] = lists[index].next;
                } else {
                    prev.next = new ListNode(currentTop.val,tail);
                    prev = prev.next;
                    lists[index] = lists[index].next;

                }
            }
        }

        return head;
    }
}
