public class RemoveNthNodeFromEndofList19 {

  public static class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }
 

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode curr=head;
        ListNode pre=dummy;
       int size=0;
        // pre.next=curr;
        while(head!=null){
              size++;
              head=head.next;
        }
        for(int i=1;i<(size-n)+1;i++){
                 pre=curr;
                 curr=curr.next;
                
        }
        pre.next=curr.next;
       
        
          return dummy.next;
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        ListNode res=removeNthFromEnd(head,2);
        while(res!=null){
            System.out.print(res.val+" ");
            res=res.next;
        }
    }
  
}

