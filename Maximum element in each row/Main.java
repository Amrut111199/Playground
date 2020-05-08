#include<iostream>
using namespace std;
int main()
{
  int rows,cols,i,j,max=0;
  cin>>rows>>cols;
  int a[rows][cols];
  for(i=0;i<rows;i++){
  	for(j=0;j<cols;j++){
    		cin>>a[i][j];
    }
  }
  for(i=0;i<rows;i++){
    max=0;
  	for(j=0;j<cols;j++){
    		if(a[i][j]>max)
              max=a[i][j];
    }
    cout<<max<<"\n";
  }
  
  //Type your code here.
}