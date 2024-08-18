public class NthNodeFromEnd {
    public ListNode createLL(int[] ints) {
        ListNode head = new ListNode(ints[0],null);
        ListNode temp = head;
        for(int index  = 1; index < ints.length; index++){
            temp.next = new ListNode(ints[index], null);
            temp = temp.next;
        }
        return head;
    }

    public class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        if(count == n){
            head = head.next;
            return head;
        }
        temp = head;
        for(int index  = 1; index < count - n; index++){
            temp = temp.next;
        }
        temp.next = temp.next == null ? null : temp.next.next;
        return head;
    }
}
