package com.java.class28;
class Deposit{
    void deposit(int balance, int deposit){
        System.out.println("Your balance is "+balance);
        System.out.println("You want to get "+deposit);
        System.out.println("Your current balance - "+(balance+deposit));
    }
}
class Loan extends Deposit{

    void div (int money, int month){

        System.out.println("Monthly pay - "+money/month);
    }
    void inADay(int money, int days){
        System.out.println("Daily pay - "+money/days);
    }

}
class WithoutPercent extends Loan{
    void percent(int money, int percent){
        System.out.println("Tax - "+(((money/100)*percent)+money));
    }
}
public class InheritanceTask {
    public static void main(String[] args) {
        Loan obj1 = new Loan();
        obj1.deposit(15000,1500);
        obj1.div(1500,12);
        obj1.inADay(1500,365);
        System.out.println();
        WithoutPercent obj2 = new WithoutPercent();
        obj2.percent(1500,10);
    }


}
