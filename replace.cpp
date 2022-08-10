#include<bits/stdc++.h>
using namespace std;
string replace(string s){
    for(int i = 0; i < s.size(); ++i){
        if(s[i] == ' '){
            s[i] = '_';
        }
    }
    return s;
}
int main(){
    cout<<replace("Prajwal Urkude 90 ");
    return 0;
}