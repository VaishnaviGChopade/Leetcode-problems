class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
        //  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
public class ReverseLinkedList206 {
    public static ListNode reverseList(ListNode head) {
        ListNode pre=null;
        ListNode next;
        ListNode curr=head;
        while(curr!=null){
         next=curr.next;
         curr.next=pre;
         pre=curr;
         curr=next;
            
        }
        return pre;
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        ListNode ans=reverseList(head);
        while(ans!=null){
            System.out.print(ans.val+" ");
            ans=ans.next;
        }
    }
}
