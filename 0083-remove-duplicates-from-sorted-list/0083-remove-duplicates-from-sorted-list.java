/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
     

    public ListNode deleteDuplicates(ListNode head) {
        ListNode currentNode = head;
        while(currentNode!=null && currentNode.next!=null){
            if(currentNode.val!=currentNode.next.val){
                currentNode=currentNode.next;
            }else{
                currentNode.next= currentNode.next.next;
            }
        }
        return head;
    }
}