#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    int t; cin >> t;
    while(t--) {
        int n; cin >> n;
        int a[n];
        for(int i = 0; i < n; i++) cin >> a[i];
        sort(a, a+n, greater<int>());

        int minn = a[0] - a[1];
        int temp;
        for(int i = 0; i < n-1; i++) {
            temp = a[i] - a[i+1];
            minn = min(minn, temp);
        }
        cout << minn << "\n";        
    }
}