#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int a[n][n],i,j,row,col,diag=0,flag=0;
  for(i=0;i<n;i++){
    
  	for(j=0;j<n;j++){
    		cin>>a[i][j];
    	}
  }
  for(i=0;i<n;i++){
  	for(j=0;j<n;j++){
      if(i==j)
    		diag+=a[i][j];
    	}
  }
  for(i=0;i<n;i++){
    row=0;
  	for(j=0;j<n;j++){
    		row+=a[i][j];
    	}
    if (diag== row)
         flag = 1;
      else {
         flag = 0;
         break;
      }
  }
 for(i=0;i<n;i++){
    col=0;
  	for(j=0;j<n;j++){
    		col+=a[j][i];
    	}
   if (diag== row)
         flag = 1;
      else {
         flag = 0;
         break;
      }
   
  }
  
  
if(flag==1 )
  cout<<"Yes\n";
 else
   cout<<"No\n";
  
  //Type your code here.
}