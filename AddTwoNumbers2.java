public class AddTwoNumbers2 {
    public static class ListNode {
        int val;
        ListNode next;
       
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int res=0;
        int carry=0;
        String s="";
       
         ListNode result=new ListNode(0);
     ListNode head=result;
        while(l1!=null || l2!=null){
             res=carry;
          if(l1!=null){
            res+=l1.val;
            l1=l1.next;
          }
          if(l2!=null){
            res+=l2.val;
            l2=l2.next;
          }

          carry=res/10;
          res=res%10;
          
 result.next=new ListNode(res);
 result=result.next;


         
        }
        if(carry==1){
            result.next=new ListNode(carry);
        }
    

    
return head.next;
    }

public static void main(String[] args) {
    ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        
        ListNode result = addTwoNumbers(l1, l2);
        
        System.out.print("Result: ");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
}
}
}

