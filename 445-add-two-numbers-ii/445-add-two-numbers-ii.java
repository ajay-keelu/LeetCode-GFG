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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer>al1 = new ArrayList<>();
        List<Integer>al2 = new ArrayList<>();
        ListNode temp = l1;
        while(temp!=null)
        {
            al1.add(temp.val);
            temp = temp.next;
        }
        temp = l2;
        while(temp!=null)
        {
            al2.add(temp.val);
            temp = temp.next;
        }
        List<Integer>al3 = new ArrayList<>();
        int i=al1.size()-1;
        int j=al2.size()-1;
        int car = 0;
        while(true)
        {
            int sum;
            if(i<0 && j<0 && car==0)
                break;
            if(i>=0 && j>=0){
                sum = (int)al1.get(i)+(int)al2.get(j)+car;
            }
            else if(i>=0 && j<0){
                sum = (int)al1.get(i)+car;
            }
            else if(j>=0 && i<0){
                sum = (int)al2.get(j)+car;
            }
            else{
                sum = car;
            }
            if(sum<=9){
                car=0;
            }
            else
            {
                car = sum/10;
                sum%=10;   
            }
            al3.add(sum);
            i--;
            j--;
        }
        ListNode root = null;
        temp = null;
        for(int k = al3.size()-1; k>=0;k--)
        {
            if(root == null)
                root = temp = new ListNode((int)al3.get(k));
            else{
                
                temp.next = new ListNode((int)al3.get(k));
                temp = temp.next;
            }
        }
        return root;
    }
}