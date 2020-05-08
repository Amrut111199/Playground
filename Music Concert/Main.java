#include<iostream>
using namespace std;
int main(void){
  int n,i,*t,odd=0,even=0;
  cin>>n;
t=(int*)malloc(n*sizeof(int));
  for (i = 0; i < n; ++i) { 
            cin>>t[i]; 
    if(t[i]%2==0)
      even+=1;
    if(t[i]%2!=0)
      odd+=1;
        } 
  
  
	cout<<odd<<"\n";
	cout<<even;
  // Type your code here
  return 0;
}
