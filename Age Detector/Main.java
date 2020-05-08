#include<iostream>
using namespace std;
int main(void){
  int birth,current;
  cin>>birth>>current;
  if (birth>current)
  cout<<(current+2000)-(birth+1900);
  else
     cout<<(current)-(birth);
  //Type your code here.
}