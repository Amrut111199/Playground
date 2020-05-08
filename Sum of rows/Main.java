#include<iostream>
using namespace std;
int main()
{
  int rows,cols,i,j;
  cin>>rows>>cols;
  int a[rows][cols];
  for(i=0;i<rows;i++){
  	for(j=0;j<cols;j++){
    	cin>>a[i][j];
    }
  }
   for(i=0;i<rows;i++){
    int  sum=0;
  	for(j=0;j<cols;j++){
    	sum+=a[i][j];
    }
     cout<<sum<<"\n";
  }
  //Type your code here.
}