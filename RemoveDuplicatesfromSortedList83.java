public class RemoveDuplicatesfromSortedList83 {
    
    public static class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
     
         }
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode start=head;
         ListNode res=head;
      
        while(start!=null && start.next!=null){
       
     if (start.val == start.next.val) { 
                start.next = start.next.next;
            } else {
                res = start; 
                start = start.next; 
            }
    
        
        }
        return head;
        
        
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(1);
        head.next.next=new ListNode(2);
        head.next.next.next=new ListNode(3);
        head.next.next.next.next=new ListNode(3);
        ListNode res=deleteDuplicates(head);
        while(head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }
    }
}
