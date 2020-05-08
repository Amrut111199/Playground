#include<iostream>
using namespace std;
int main(){
  int i,start,end,j,sum;
  cin>>start>>end;
  for(i=start;i<=end;i++){
    sum=0;
  		for(j=1;j<i;j++){
       		if(i%j==0){
              	sum+=j;//1 2           	
            }           
        }
    if(sum==i)
            cout<<i<<" ";
              
  } 
}