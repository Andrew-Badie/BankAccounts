/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package coe318.lab4;

/**
 *
 * @author andre
 */
public class Account {
    public int num;
    public double ibalance;
    public String name1;

public Account(String name, int number,
double initialBalance){
    name1=name;
    num=number;
    ibalance=initialBalance;
}
 
    
  
boolean deposit(double amount){
     if(amount<=0.0){
        return false;
    }
 
    else{
        
      ibalance= ibalance+amount;
        return true;
    }
}
 boolean withdraw(double amount){
      if(amount>ibalance||amount<=0.0){
        return false;
    }
 
    else{  
      ibalance= ibalance-amount;
        return true;
    }
      
 }
   String getName(){
        return name1;
    }
 double getBalance()
 {
    return ibalance; 
 }

 int getNumber(){
     return num;
 }
 @Override
public String toString() {//DO NOT MODIFY
return "(" + getName() + ", " + getNumber() + ", " +
String.format("$%.2f", getBalance()) + ")";
}
}
