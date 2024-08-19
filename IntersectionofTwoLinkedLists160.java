
 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
public class IntersectionofTwoLinkedLists160 {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null && headB==null){
            return null;
        }
        ListNode tempA=headA,tempB=headB;

        while(tempA!=tempB){
          if(tempA==null){
            tempA=headA;
          }
          else tempA=tempA.next;
           if(tempB==null){
            tempB=headB;
          }
          else tempB=tempB.next;
            
        }
        return tempA;

    }
    public static void main(String[] args) {
        ListNode common = new ListNode(8);
        common.next = new ListNode(4);
        common.next.next = new ListNode(5);
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = common;
        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = common;
        ListNode ans =getIntersectionNode(headA,headB);
        System.out.print(ans.val);
    }
}
