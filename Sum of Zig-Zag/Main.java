#include<iostream>
using namespace std;
int sum(int rows,int cols,int**a){
  int i,j,sum=0;
  for(i=0;i<rows;i++){
    
  	for(j=0;j<cols;j++){
    	if(i==0 ){
        
        	sum+=a[i][j];
       //  cout<<"ai "<<a[i][j]<<' '<<sum<<'\n';
        }
      else if(i==rows-1){
      	sum+=a[i][j];
     //   cout<<"ai "<<a[i][j]<<' '<<sum<<'\n';
      }
     else if(i+j==rows-1){
        sum+=a[i][j];
    //  cout<<"ai "<<a[i][j]<<' '<<sum<<'\n';
     }
    }
  }
  cout<<"Sum of Zig-Zag pattern is "<<sum;
	
}
int main()
{ int sum(int,int,int**);
  int i,rows,j,cols;
  cin>>rows>>cols;
  int **a;
 a=new int*[rows];
  for(i=0;i<rows;i++)

      a[i]=new int[j];
 for(i=0;i<rows;i++){
 	for(j=0;j<cols;j++){
    	cin>>a[i][j];
    }
 }
  
  sum(rows,cols,a);

  //Type your code here.
}