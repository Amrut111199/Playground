#include<iostream>
using namespace std;
int** create(int rows,int cols){
	int **arr,i,j;
  arr=new int*[rows];
  for(i=0;i<rows;i++){
  	for(j=0;j<cols;j++){
    	arr[i]=new int[cols];
      
    }
  }

  return arr;
}
int** get(int**mat,int rows,int cols){
  	int i,j;
	for(i=0;i<rows;i++){
  	for(j=0;j<cols;j++){
    	cin>>mat[i][j];    
    }
  }
 
  return mat;
}
void add(int** Create,int** c,int** d,int rows,int cols){
	int i,j;
  for(i=0;i<rows;i++){
  	for(j=0;j<cols;j++){
    	cout<<c[i][j]+d[i][j]<<' ';
    }
    cout<<"\n";
  }
}
int main()
{ int i,j;
  int **create(int,int);
  int** get(int**,int,int);
  void add(int**,int**,int**,int,int);
  int rows,cols;
  cin>>rows>>cols;
  int** a=create(rows,cols);
  int** b=create(rows,cols);
  int** c=get(a,rows,cols);
  int** d=get(b,rows,cols);
  add(a,c,d,rows,cols);
  

  //Type your code here.
}