//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function Template for C++

class Solution {
  public:
    int isItPossible(string S, string T, int M, int N) {
        // code here
        string st1 = "";
        string st2 = "";
        for(int i = 0 ; i < M ; i++)
            if(S[i]!='#')
                st1 += S[i];
        for(int i = 0 ; i < N ; i++)
            if(T[i]!='#')
                st2 += T[i];
        
        if(st1 == st2)
            return 1;
        return 0;
    }
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        string S, T;
        cin >> S >> T;
        int M = S.length(), N = T.length();
        Solution ob;
        cout << ob.isItPossible(S, T, M, N);
        cout << "\n";
    }
}
// } Driver Code Ends