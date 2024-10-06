import java.util.ArrayList;
import java.util.List;
class ListNode {
         int val;
         ListNode next;
         
         ListNode(int val) { this.val = val; }
        
     }
public class PalindromeLinkedList234 {
    public static boolean isPalindrome(ListNode head) {
        List<Integer> res=new ArrayList<>();
        while(head!=null){
            res.add(head.val);
            head=head.next;
        }
        int i=0,j=res.size()-1;
        while(i<j){
            if(res.get(i)!=res.get(j)) return false;
            i++;
            j--;
        }
    return true;

    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(2);
        head.next.next.next=new ListNode(1);
        System.out.println(isPalindrome(head));
    }
       
}
