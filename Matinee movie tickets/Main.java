#include<iostream>
using namespace std;
int main()
{
  int age;
  float time;
  cin>>age>>time;
  if(time<12.00 and age>13)
    cout<<"$8.00";
  else if(time>=12.00 and age>13)
    cout<<"$5.00";
  else if(time<12.00 and age<=13)
    cout<<"$4.00";
  else if(time>=12.00 and age<=13)
    cout<<"$2.00";
  
    
  
  //Type your code here.
}