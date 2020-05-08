#include<iostream>
using namespace std;
int main(){

		int i,j,n;
  		cin>>n;
  		for(i=1;i<=2*n;i++){
        	for(j=1;j<=i;j++){
            	if(i<=n){
                  if(j==1)
                 	 cout<<i;  
                  else
                    cout<<"*"<<i;
                }
              else{
                if(j==1)
                  cout<<(2*n+1-i);
                else if (i+j>2*n+1)
                  cout<<" ";
                else 
                  cout<<"*"<<(2*n+1-i);
              }
            }
          cout<<"\n";
        }
}