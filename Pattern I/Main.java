#include<iostream>
using namespace std;
int main(){

		int i,j,n,k;
  		cin>>n;
  		for(i=1;i<=8;i++){
        	for(j=1;j<=i;j++){
            	if(i<=4){                 
                   cout<<n-1+i;
                	k=n-1+i;
                }
              else{
              
                 if (i+j>9)
                  cout<<" ";
                else 
                  cout<<k+1;
              }
            }
          cout<<"\n";
          k-=1;
        }
}