#include<iostream>
int main(void)
{
  int n,i,max=0;
  std::cin>>n;
  int arr[n];
  for(i=0;i<n;i++){
  	std::cin>>arr[i];	
  }
  for(i=0;i<n;i++){
  	if(arr[i]>max)
      max=arr[i];
  }
  std::cout<<max;
  // Type your code here
}