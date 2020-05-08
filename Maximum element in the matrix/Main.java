#include<iostream>
using namespace std;
int main()
{
  int i,rows,j,cols,max=0;
  cin>>rows>>cols;
  int a[rows][cols];
  for(i=0;i<rows;i++){
  	for(j=0;j<cols;j++){
    	cin>>a[i][j];
    }
  }
  for(i=0;i<rows;i++){
  	for(j=0;j<cols;j++){
    	if(a[i][j]>max)
          max=a[i][j];
    }
  }
  cout<<"The maximum element is "<<max;
  //Type your code here.
}