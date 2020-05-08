#include<iostream>
using namespace std;
int main()
{
  int fshirt,fdis,fship;
  int sshirt,sdis,sship;
  int ashirt,adis,aship;
  int f,s,a;
  cin>>fshirt>>fdis>>fship>>sshirt>>sdis>>sship>>ashirt>>adis>>aship;
  f=(fshirt-fshirt*fdis/100)+fship;
  s=(sshirt-sshirt*sdis/100)+sship;
  a=(ashirt-ashirt*adis/100)+aship;
  
  cout<<"In Flipkart Rs."<<f<<"\n";
  cout<<"In Snapdeal Rs."<<s<<"\n";
  cout<<"In Amazon Rs."<<a<<"\n";
  if (f<=s && f<=a)
    cout<<"He will prefer Flipkart";
  else if (a<s && a<f)
   cout<<"He will prefer Amazon";
  else if (s<f && s<a)
    cout<<"He will prefer Snapdeal";
    
  
  //Type your code here.
}