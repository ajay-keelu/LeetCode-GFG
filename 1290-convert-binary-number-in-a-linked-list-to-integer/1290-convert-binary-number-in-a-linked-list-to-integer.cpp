/**[]
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
    int getDecimalValue(ListNode* head) {
        vector<int>v;
        while(head!=NULL){
        int a=head->val;
            v.push_back(a);
        head=head->next;
        }
        int sm=0;
        reverse(v.begin(),v.end());
        for(int i=0;i<v.size();i++){
                sm=sm+(v[i]*pow(2,i));
                
        }
        return sm;
    }
};