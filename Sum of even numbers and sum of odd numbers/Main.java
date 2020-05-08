#include<iostream>
using namespace std;
int main(void)
{
  int n,odd=0,even=0,i;
  cin>>n;
  int a[n+1];
  for(i=0;i<=n;i++){
    if(i==0)
      a[0]=n;
  	
    else{
      cin>>a[i];
      if(a[i]%2==0)
        even+=a[i];
      else
        odd+=a[i];
    
        
    }
   
  }
  cout<<"The sum of the even numbers in the array is "<<even<<"\nThe sum of the odd numbers in the array is "<<odd;

  //Type your code here.
}