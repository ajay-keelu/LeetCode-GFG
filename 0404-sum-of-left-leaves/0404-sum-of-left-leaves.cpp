/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int sumOfLeftLeaves(TreeNode* root) {
        if(root==NULL)
            return 0;
        int sum=0;
        tra(root,sum,false);
        return sum;
    }
    void tra(TreeNode *r, int &sum, bool b){
        if(r!=NULL){
            if(r->left==NULL && r->right==NULL && b)
                sum+=r->val;
            if(r->left!=NULL)
            tra(r->left,sum,true);
            if(r->right!=NULL)
            tra(r->right,sum,false);
        }
        return ;
    }
};