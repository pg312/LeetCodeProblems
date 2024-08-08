package LinkedList;

public class AddingTwoNumbersusingLL {

    public class ListNode {
        public int val;
        public ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode constructLL(int num){
        ListNode head = new ListNode(num%10,null);
        ListNode currentNode = head;
        num /=10;

        while(num > 0){
            currentNode.next = new ListNode(num%10);
            num /= 10;
            currentNode = currentNode.next;

        }
        return head;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode currentNode = null, head = null;
        int carry = 0;
        while(l1 != null && l2 != null){
            int sum = (l1.val + l2.val)%10+carry;
            ListNode temp = new ListNode(sum,null);
            if(head == null){
                head = temp;
                currentNode = temp;
            }
            else{
                currentNode.next = temp;
                currentNode = currentNode.next;
            }
            carry = (l1.val+l2.val)/10;
            l1 = l1.next;
            l2 = l2.next;
        }
        if(l1 != null || l2 != null){
            l1 = l1 == null ? l2 : l1;
            attachRemainingNodes(l1,currentNode,carry);
        }
        return head;
    }

    private void attachRemainingNodes(ListNode l1, ListNode currentNode, int carry){
        while(l1 != null){
            int sum = (l1.val )%10+carry;
            ListNode temp = new ListNode(sum,null);
            currentNode.next = temp;
            currentNode = currentNode.next;
            carry = (l1.val)/10;
            l1 = l1.next;
        }
        if(carry ==1){
            currentNode.next = new ListNode(1,null);
        }
    }
}
