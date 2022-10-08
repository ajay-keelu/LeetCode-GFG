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
    ListNode* removeElements(ListNode* head, int val) {
        if(head == NULL)
            return NULL;
        vector<int>v ;//= new ArrayList<>();
        ListNode* temp = head;
        while(temp!=NULL)
        {
            if(temp->val!=val)
                v.push_back(temp->val);
            temp = temp->next;
        }
        ListNode* root=NULL;
        temp = NULL;
        for(int i=0;i<v.size();i++)
        {
            if(root == NULL)
                root = temp = new ListNode(v[i]);
            else{
                temp->next = new ListNode(v[i]);
                    temp = temp->next;
            }
        }
        return root;
    }
};