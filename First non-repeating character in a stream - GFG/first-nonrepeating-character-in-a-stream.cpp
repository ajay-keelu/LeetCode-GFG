//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution {
	public:
		string FirstNonRepeating(string A){
		    // Code here
		    queue<char>q;
		    vector<int>fr(26);
		    for(int i = 0 ; i < A.size() ; i++){
		        q.push(A[i]);
		        fr[A[i]-'a']++;
		        while(!q.empty() && fr[q.front()-'a'] > 1)
		            q.pop();
		        if(q.empty())
		            A[i] = '#';
		        else
		            A[i] = q.front();
		    }
		    return A;
		}

};

//{ Driver Code Starts.
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		string A;
		cin >> A;
		Solution obj;
		string ans = obj.FirstNonRepeating(A);
		cout << ans << "\n";
	}
	return 0;
}
// } Driver Code Ends