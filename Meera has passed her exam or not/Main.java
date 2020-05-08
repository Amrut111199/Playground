#include<iostream>
using namespace std;
int main(void)
{
  int i,n,reg;
  cin>>n;
  int a[n];
  for(i=0;i<n;i++){
  		cin>>a[i];
  }
  cin>>reg;
  for(i=0;i<n;i++){
  	if (reg==a[i]){
      cout<<"She passed her exam";
    	break;
    }
  }
  if(reg!=a[i]){
  	cout<<"She failed";
  }
  
  // Type your code here
}