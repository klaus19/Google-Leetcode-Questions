
public class ReverseLinkedlist{
    int val;
    ReverseLinkedlist next;
    ReverseLinkedlist(int x){val=x;}
}
 class Solution {

    public ReverseLinkedlist reversel(ReverseLinkedlist head){

        ReverseLinkedlist prev = null;

        while (head!=null){
            ReverseLinkedlist next = head.next;
            head.next = prev;
            prev = head;
            head = next;

        }
         return prev;
    }

}
