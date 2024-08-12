
     class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
public class PartitionList86 {
    public static ListNode partition(ListNode head, int x) {
        ListNode smallstart=new ListNode(0);
        ListNode largestart=new ListNode(0);
        
        ListNode small=smallstart;
        ListNode large=largestart;
        while(head!=null){
            if(head.val<x){
                small.next=new ListNode(head.val);
                small=small.next;
            }
            else{
                 large.next=new ListNode(head.val);
                 large=large.next;
            
            }
            head=head.next;
        }
        small.next=largestart.next;
        large.next=null;

        return smallstart.next;
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(4);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(2);
        head.next.next.next.next=new ListNode(5);
        head.next.next.next.next.next=new ListNode(2);
        ListNode res=partition(head,3);
        while(res!=null){
            System.out.print(res.val+" ");
            res=res.next;
        }
    }

}
