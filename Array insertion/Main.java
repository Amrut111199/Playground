#include<iostream>
using namespace std;
int main(void)
{
  int n,i,a[20],val,pos,k=1,j;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  cout<<"Enter the elements in the array\n";
  for(i=0;i<n;i++){
  	cin>>a[i];
  }
  cout<<"Enter the location where you wish to insert an element\n";
  cin>>pos;
  if(pos>n)
    cout<<"Invalid Input\n";
  else{
  cout<<"Enter the value to insert\n";
  cin>>val;

  cout<<"Array after insertion is\n";
   
 for (i = n; i >= pos; i--) 
        a[i] = a[i - 1]; 
  
    // insert x at pos 
    a[pos - 1] = val; 
  
    // print the updated array 
    for (i = 0; i <=n; i++) 
        cout<<a[i]<<"\n"; 

  
    return 0; 
  }
  //Type your code here.
}
