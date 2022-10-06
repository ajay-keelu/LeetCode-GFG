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
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        vector<int>v;
        ListNode* temp1 =list1;
        ListNode* temp2 =list2;
        while(temp1!=NULL){
            v.push_back(temp1->val);
            temp1=temp1->next;
        }
        while(temp2!=NULL){
            v.push_back(temp2->val);
            temp2=temp2->next;
        }
        sort(v.begin(),v.end());
        ListNode* root=NULL;
        ListNode* temp=NULL;
        for(int i=0;i<v.size();i++){
            if(root==NULL){
                root=temp=new ListNode(v[i]);
            }
            else{
                temp->next=new ListNode(v[i]);
                temp=temp->next;
            }
        }
        return root;
    }
};