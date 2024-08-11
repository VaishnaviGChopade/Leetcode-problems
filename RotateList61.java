public class RotateList61 {
 
  public static  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


    public static ListNode rotateRight(ListNode head, int k) {
        ListNode curr=head;
        ListNode pre=null;
        if(head==null || head.next == null){
            return head;
        }
        int length=0;
         while(curr!=null){
          length++;
            curr=curr.next;
            
        }
        k=k%length;
        curr=head;
        for(int i=0;i<k;i++){
            curr=head;
        while(curr.next!=null){
            pre=curr;
            curr=curr.next;
            
        }
        pre.next=null;
        curr.next=head;
        head=curr;
        
        }
    return head;
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
         head.next=new ListNode(2);
         head.next.next=new ListNode(3);
         head.next.next.next=new ListNode(4);
         head.next.next.next.next=new ListNode(5);
         ListNode res=rotateRight(head,2);
        while(res!=null){
            System.out.print(res.val+" ");
            res=res.next;
        }
    }
}

