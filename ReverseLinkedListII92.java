    
   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class ReverseLinkedListII92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
         if (head == null || left == right) {
            return head;
        }
        ListNode ans=new ListNode(0);
        ans.next=head;
        ListNode curr=head;
        ListNode prev=ans;
        for(int i=1;i<left;i++){
            prev=prev.next;
            curr=curr.next;
        }
       
        ListNode c=curr;
        ListNode pre=null;
        for(int i=0;i<=right-left;i++){
            ListNode next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;

        }
        prev.next=pre;
        c.next=curr;
        return ans.next;


    }
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        ReverseLinkedListII92 solution = new ReverseLinkedListII92();
        ListNode result = solution.reverseBetween(head, 2, 4);
        
        System.out.println("List after reversing between positions 2 and 4:");
        printList(result);
    }
}

