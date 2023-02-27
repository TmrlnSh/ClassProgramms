package com.java.homeworks.HW24;
class Bank{
    static String bankName="Optima Bank";
    static int personalId=23432541;
    double balance;
    int action;
    Bank(double balance, int action){
        this.balance=balance;
        this.action=action;
    }
    static void getInfo(){
        System.out.println(bankName);
        System.out.println(personalId);
    }
    void withdraw(){
        balance-=action;
        System.out.println(balance);
    }
    void deposit(){
        balance+=action;
        System.out.println(balance);
    }
}
public class BankMainClass {
    public static void main(String[] args) {
        Bank obj1 = new Bank(15000,450);
        obj1.withdraw();
        Bank obj2=new Bank(obj1.balance,650);
        obj2.deposit();
        Bank.getInfo();
    }
}
