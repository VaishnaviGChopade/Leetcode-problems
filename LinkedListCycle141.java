
class ListNode {
         int val;
         ListNode next;
         ListNode(int x) {
             val = x;
             next = null;
         }
     }
public class LinkedListCycle141 {
    public static boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while( fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        ListNode node=new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);
        node.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;
        boolean res=hasCycle(node);
        System.out.println(res);
    }
}