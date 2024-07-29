
   
 
   
 
public class MergeTwoSortedList21 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head=new ListNode(0);
        ListNode current=head;
        
        // ListNode ptr1=list1,ptr2=list2;
        while(list1!=null && list2!=null){
        if(list1.val<=list2.val){
           current.next=list1;
           
           list1=list1.next;
        }
        else{
            current.next=list2;
            list2=list2.next;
        }
        current=current.next;
        }
        if(list1!=null){
            current.next=list1;
        }
        if(list2!=null){
            current.next=list2;
        }
    return head.next;
    }
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
    
        ListNode resultlist = mergeTwoLists(list1, list2);
    
        while (resultlist != null) {
            System.out.print(resultlist.val + " ");
            resultlist = resultlist.next;
        }
    }
}


