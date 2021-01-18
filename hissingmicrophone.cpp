#include <iostream>
using namespace std;
int main(){
  bool check=true;
  string n;
  cin>>n;
    for(int i=0;i< n.length()&& check;i++){
      if(n[i] =='s' && n[i+1]=='s'){
          cout<<"hiss";
          check=false;
      }
    }
    if(check)
        cout<<"no hiss";
}