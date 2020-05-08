#include<iostream>
using namespace std;
int main()
{
  float mileage;
  float petrol,distance;
  cin>>mileage>>petrol>>distance;
  if(mileage<distance/petrol)
    cout<<"Cannot reach";
  else
    cout<<"Can reach";
  //Type your code here.
}