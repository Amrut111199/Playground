#include <bits/stdc++.h> 
#include<iostream>
using namespace std; 
  
// Function to reverse a string 
void reverse(string str) 
{ 
   for (int i=str.length()-1; i>=0; i--) 
      cout << str[i];  
} 
  
// Driver code 
int main(void) 
{ 
    std::string name;

  
  std::getline (std::cin,name);
    reverse(name); 
    return (0); 
}