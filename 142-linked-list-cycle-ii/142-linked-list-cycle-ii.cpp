/*
 *
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 *
 */
class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
         if(head == NULL || head->next == NULL)
            return NULL;
        ListNode* pt1 = head;
        ListNode* pt2 = head;
        ListNode* temp = head;
        while(true)
        {
            pt1=pt1->next;
            pt2=pt2->next->next;
            if(pt1==pt2)
               break;
            if(pt2==NULL||pt2->next==NULL)
                return NULL;         
            
        }
        while(true)
        {
            if(temp == pt1)
                return temp;
            temp = temp->next;
            pt1 = pt1->next;
        }
        return NULL;
    }
};