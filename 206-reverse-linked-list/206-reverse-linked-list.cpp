/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        vector<int>v;
        ListNode* temp=head;
        while(temp!=NULL){
            v.push_back(temp->val);
            temp=temp->next;
        }
        reverse(v.begin(),v.end());
        ListNode* root=NULL;
        ListNode* temp1=NULL;
        for(int i=0;i<v.size();i++)
        {
            if(root==NULL)
            {
                root=temp1=new ListNode(v[i]);
            }
            else
            {
                temp1->next=new ListNode(v[i]);
                temp1=temp1->next;
            }
        }
        return root;
    }
};