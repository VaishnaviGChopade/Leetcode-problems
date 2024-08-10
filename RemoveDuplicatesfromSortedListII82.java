

public class RemoveDuplicatesfromSortedListII82 {
    public static class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode ans=new ListNode(0);
        ListNode prev=ans;
        prev.next=head;
        
        ListNode curr=head;
        while (curr!=null){

            if(curr.next!=null && curr.val==curr.next.val){
                while(curr.next!=null && curr.val == curr.next.val){
                    curr = curr.next;
                }
                prev.next= curr.next;
            }
            else{
                prev=prev.next;
            }
            curr = curr.next;
        }
        return ans.next;
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(3);
        head.next.next.next=new ListNode(5);
       ListNode ans=deleteDuplicates(head);
       while(ans!=null){
        System.out.print(ans.val +" ");
        ans=ans.next;
       }
    }
    }
