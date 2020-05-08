#include<iostream>
using namespace std;
int main()
{
  int i,j,rows,cols,rowsum=0,colsum=0,rcount=0,ccount=0;
  cin>>rows>>cols;
  int a[rows][cols],rmax=0,cmax=0;
  for(i=0;i<rows;i++){
  	for(j=0;j<cols;j++){
    	cin>>a[i][j];
    }
  }
  cout<<"Sum of rows is"<<" ";
   for(i=0;i<rows;i++){
    rowsum=0;
  	for(j=0;j<cols;j++){
    	rowsum+=a[i][j];
      
    
    }
     
       cout<<rowsum<<" ";
      if(rowsum>rmax){
       rmax=rowsum;
    rcount+=1; 
     }
  }
   cout<<"\nRow "<<rcount<<" has maximum sum";
  cout<<"\nSum of columns is ";
   for(i=0;i<rows;i++){
     colsum=0;
  	for(j=0;j<cols;j++){
    	colsum+=a[j][i];

    }
     cout<<colsum<<" ";
     if(colsum>cmax){
       cmax=colsum;
     	ccount+=1; 
     }
     
  }
   cout<<"\nColumn "<<ccount<<" has maximum sum";

  //Type your code here.
}