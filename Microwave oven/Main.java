#include<iostream>
using namespace std;
int main()
{
   float t,i;
  cin>>i>>t;
   if(i==2){
    t=t+.5*t;
  	cout<<t;
   }
   else if(i==3){
    t=2*t;
  	cout<<t;
   }
   if(i>3)
    cout<<"Number of items is more";
  //Type your code here.
}